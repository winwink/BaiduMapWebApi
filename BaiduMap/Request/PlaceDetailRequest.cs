using BaiduMap.Request.Models;
using BaiduMap.Response;
using System;
using System.Collections.Generic;
using System.Text;

namespace BaiduMap.Request
{
    public class PlaceDetailRequest : BaiduRequest<PlaceDetailResponse, PlaceDetailModel>
    {
        public PlaceDetailRequest(PlaceDetailModel model) : base(model)
        {
            this.Address = "/place/v2/detail";
        }
    }
}
