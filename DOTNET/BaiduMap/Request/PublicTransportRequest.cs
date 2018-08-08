using BaiduMap.Request.Models;
using BaiduMap.Response;
using System;
using System.Collections.Generic;
using System.Text;

namespace BaiduMap.Request
{
    public class PublicTransportRequest : BaiduRequest<PublicTransportResponse, PublicTransportModel>
    {
        public PublicTransportRequest(PublicTransportModel model) : base(model)
        {
            this.Address = "/direction/v2/transit";
        }
    }
}
