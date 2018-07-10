using System;
using BaiduMap.Request.Models;
using BaiduMap.Util;
using Xunit;

namespace BaiduMapTest
{
    public class DictionaryUtilTest
    {
        [Fact]
        public void GetDictionary()
        {
            var model = new PlaceRegionModel
            {
                Query = "测试",
                Region = "杭州"
            };
            var dic = DictionaryUtil.GetDictionary(model);
        }
    }
}
