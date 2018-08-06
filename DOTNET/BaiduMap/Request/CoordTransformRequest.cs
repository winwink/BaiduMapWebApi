using System;
using BaiduMap.Request.Models;
using BaiduMap.Response;

namespace BaiduMap.Request
{
    public class CoordTransformRequest : BaiduRequest<CoordTransformResponse, CoordTransfModel>
    {
        public CoordTransformRequest(CoordTransfModel model) : base(model)
        {
            this.Address = "/geoconv/v1/";
        }
    }
}
