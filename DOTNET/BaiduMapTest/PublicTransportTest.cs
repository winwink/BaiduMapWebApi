using System;
using System.Collections.Generic;
using System.Text;
using Xunit;
using Shouldly;
using BaiduMap.Request.Models;
using BaiduMap.Request;

namespace BaiduMapTest
{
    public class PublicTransportTest
    {
        [Fact]
        public void Test()
        {
            var model = new PublicTransportModel()
            {
                Origin = "40.056878,116.30815",
                Destination = "31.222965,121.505821"
            };

            var req = new PublicTransportRequest(model);
            var client = ClientCreator.Create();
            var result = client.Execute(req);
            Console.WriteLine(result);
        }
    }
}
