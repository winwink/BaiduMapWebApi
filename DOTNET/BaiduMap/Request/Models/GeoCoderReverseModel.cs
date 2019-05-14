using System;
using System.Collections.Generic;
using System.Text;
using BaiduMap.Attributes;
using BaiduMap.Response.Models;

namespace BaiduMap.Request.Models
{
    public class GeoCoderReverseModel : BaiduModel
    {
        [Required]
        public string Location { get; set; }

        /// <summary>
        /// 坐标系
        /// </summary>
        /// <remarks>bd09ll（百度经纬度坐标）、bd09mc（百度米制坐标）、gcj02ll（国测局经纬度坐标，仅限中国）、wgs84ll（ GPS经纬度）</remarks>
        public string Coordtype { get; set; } = "wgs84ll";
        public string Ret_Coordtype { get; set; }

        /// <summary>
        /// 最新的行政区划
        /// </summary>
        /// <remarks>老版本行政区划数据已不再维护，为确保您的行政区划数据正确，请务必将latest_admin设置为1</remarks>
        public string Latest_Admin { get; set; } = "1";
    }
}
