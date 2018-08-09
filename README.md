# BaiduMapWebApi

## .NET STANDARD版

### 0.9.0版本

已实现地点检索、地理编码、地点输入提示、普通IP定位、坐标转换接口和路线规划接口


### 测试方法
请在测试项目下添加 test.json 文件，并配置成拷贝到输出目录, ClientCreator 会读取配置文件, test.json 文件结构如下, ak和sk请自行填入

{
  "ak": "",
  "sk": ""
}

接口根据构造client时传入的sk，自动选择调用方式

如果sk不为空，采用sn验证

如果sk为空，采用ip白名单验证

用户在百度控制台创建应用时，选择对应的验证方式

<strong>注意:
单元测试仅使用了必须的字段，未对所有字段进行测试，可能会存在拼写错误，欢迎提issue和pull request
</strong>

### 使用

基于 NET Standard 2.0 开发，依赖于 Newtonsoft.Json（当前版本11.0.2）　

####　安装Nuget包
Install-Package Seamas.BaiduMap

#### 使用方法
接口调用方法参见测试用例

## JAVA版
同步实现.NET版本

### wang.seamas.reflect依赖
为了保持接口简洁与.NET版本一致，

&lt;T extends BaiduResponse> T execute(IBaiduRequest&lt;T> request), 

获取类型T，依赖于一个获取泛型类型的包

&lt;dependency>

    <groupId>wang.seamas</groupId>
    <artifactId>reflect</artifactId>
    <version>1.0-SNAPSHOT</version>

&lt;/dependency>

该包没有发布到maven中央仓库，项目地址为　https://github.com/Seamas/java-common.git  下载后执行　

mvn install


如果不想依赖此包，请将　BaiduApiClient　类中的　execute 方法签名改为

&lt;T extends BaiduResponse> T execute(IBaiduRequest&lt;T> request, Class&lt;T> clazz)

并删除方法体中的这行代码

Class&lt;T> clazz = (Class&lt;T>)ClassTreeUtil.findGenericParameterType(request.getClass(), IBaiduRequest.class, 0);