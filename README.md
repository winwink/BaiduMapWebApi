# BaiduMapWebApi

## .NET STANDARD版

### 0.8.0版本

已实现地点检索、地点输入提示、普通IP定位、坐标转换接口

### 接口调用方法参见测试用例

### 测试用例
请在 <span>BaiduMapTest/ClientCreator.cs</span>
填入自己申请的appkey 和 secretkey
<br>
private static readonly string ak = "";
<br>
private static readonly string sk = "";

如果sk为空，不采用sn验证，而采用ip白名单验证

## JAVA版
同步实现.NET版本

### wang.seamas.reflect依赖
为了保持接口简洁与.NET版本一致，

<T extends BaiduResponse> T execute(IBaiduRequest<T> request), 

获取类型T，依赖于一个获取泛型类型的包
<dependency>
    <groupId>wang.seamas</groupId>
    <artifactId>reflect</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

该包没有发布到maven中央仓库，项目地址为　https://github.com/Seamas/java-common.git，
下载后执行　mvn install


如果不想依赖此包，请将　BaiduApiClient　类中的　execute 方法签名改为

<T extends BaiduResponse> T execute(IBaiduRequest<T> request, Class<T> clazz)

并删除方法体中的这行代码
Class<T> clazz = (Class<T>)ClassTreeUtil.findGenericParameterType(request.getClass(), IBaiduRequest.class, 0);