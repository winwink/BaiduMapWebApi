using BaiduMap.Util;
using System;
using System.Collections.Generic;
using System.Text;

namespace BaiduMapTest
{
    public static class ClientCreator
    {
        private static readonly string ak = "";
        private static readonly string sk = "";

        public static BaiduClient Create()
        {
            return new BaiduClient(ak, sk);
        }
    }
}
