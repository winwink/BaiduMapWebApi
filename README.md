# BaiduMapWebApi

## 初始0.1.0版本

当前采用sn验证方式，增加地点检索系列接口

## 测试用例
请在 <span>BaiduMapTest/ClientCreator.cs</span>
填入自己申请的appkey 和 secretkey
<br>
private static readonly string ak = "";
<br>
private static readonly string sk = "";

如果sk为空，不采用sn验证，而采用ip白名单验证(当前未实现)