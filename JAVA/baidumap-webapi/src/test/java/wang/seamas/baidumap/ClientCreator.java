package wang.seamas.baidumap;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Seamas Wang
 * @description:
 * @date: Created in 11:16 2018/8/6
 */
public class ClientCreator {

    static final Setting setting;

    static {


        String content = "";
        try {
            String currentDir = System.getProperty("user.dir");
            String path = buildPath(currentDir, "src", "test", "resources", "test.json");

            List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            StringBuilder builder = new StringBuilder();
            for(String line : lines) {
                builder.append(line);
            }
            content = builder.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        Setting temp = null;
        try {
            temp = mapper.readValue(content, Setting.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setting = temp;

    }

    private static String buildPath(String ...paths) {
        return String.join(File.separator, Arrays.stream(paths).collect(Collectors.toList()));
    }



    public static BaiduApiClient Create()
    {
        return new BaiduApiClient(setting.getAk(), setting.getSk());
    }
}
