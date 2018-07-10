using System;
using System.Collections.Generic;

namespace BaiduMap.Response
{
    public abstract class BaiduResponse
    {
        public int Status { get; set; }
        public string Message { get; set; }
    }
}
