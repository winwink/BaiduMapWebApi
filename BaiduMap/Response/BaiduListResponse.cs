using System;
using System.Collections.Generic;
using System.Text;

namespace BaiduMap.Response
{
    public abstract class BaiduListResponse<T>: BaiduResponse
    {
        public List<T> Results { get; set; }
        
    }
}
