using System;
using System.Collections.Generic;
using System.Text;
using BaiduMap.Request.Models;
using BaiduMap.Response;
using BaiduMap.Response.Models;

namespace BaiduMap.Request
{
    public class GeoCoderReverseRequest: BaiduRequest<GeoCoderReverseResponse,GeoCoderReverseModel>
    {
        public GeoCoderReverseRequest(GeoCoderReverseModel model) : base(model)
        {
            this.Address = "/geocoder/v2/";
        }
    }
}
