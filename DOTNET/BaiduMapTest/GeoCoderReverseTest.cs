using System;
using System.Collections.Generic;
using System.Text;
using BaiduMap.Request;
using BaiduMap.Request.Models;
using BaiduMap.Response.Models;
using Shouldly;
using Xunit;

namespace BaiduMapTest
{
    public class GeoCoderReverseTest
    {
        [Fact]
        public void Test()
        {
            var baiduClient = ClientCreator.Create();
            var model = new GeoCoderReverseModel()
            {
                Location = "39.915,116.404"
            };
            var req = new GeoCoderReverseRequest(model);
            var resp = baiduClient.Execute(req);
            resp.Status.ShouldBe(0);
        }
    }
}
