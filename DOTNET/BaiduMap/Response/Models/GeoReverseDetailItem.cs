using System;
using System.Collections.Generic;
using System.Text;

namespace BaiduMap.Response.Models
{
    public class GeoReverseDetailItem
    {
        /// <summary>
        /// 经纬度坐标
        /// </summary>
        public Location Location { get; set; }
        /// <summary>
        /// 结构化地址信息
        /// </summary>
        public string Formatted_Address { get; set; }
        /// <summary>
        /// 坐标所在商圈信息，如 "人民大学,中关村,苏州街"。最多返回3个。
        /// </summary>
        public string Business { get; set; }
        /// <summary>
        /// 详细地址信息
        /// </summary>
        public AddressComponent AddressComponent { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public List<string> Pois { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public List<string> Roads { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public List<PoiRegionsItem> PoiRegions { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public string Sematic_Description { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public int CityCode { get; set; }
    }

    /// <summary>
    /// 地址详细信息
    /// </summary>
    public class AddressComponent
    {
        /// <summary>
        /// 国家
        /// </summary>
        public string Country { get; set; }
        /// <summary>
        /// 国家编码
        /// </summary>
        public int Country_Code { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public string Country_Code_Iso { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public string Country_Code_Iso2 { get; set; }
        /// <summary>
        /// 省份
        /// </summary>
        public string Province { get; set; }
        /// <summary>
        /// 城市
        /// </summary>
        public string City { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public int City_Level { get; set; }
        /// <summary>
        /// 区县名
        /// </summary>
        public string District { get; set; }
        /// <summary>
        /// 乡镇名
        /// </summary>
        public string Town { get; set; }
        /// <summary>
        /// 行政区划代码
        /// </summary>
        public string Adcode { get; set; }
        /// <summary>
        /// 街道名（行政区划中的街道层级）
        /// </summary>
        public string Street { get; set; }
        /// <summary>
        /// 街道门牌号
        /// </summary>
        public string Street_Number { get; set; }
        /// <summary>
        /// 相对当前坐标点的方向，当有门牌号的时候返回数据
        /// </summary>
        public string Direction { get; set; }
        /// <summary>
        /// 相对当前坐标点的距离，当有门牌号的时候返回数据
        /// </summary>
        public string Distance { get; set; }
    }

    public class PoiRegionsItem
    {
        /// <summary>
        /// 请求中的坐标与所归属区域面的相对位置关系
        /// </summary>
        public string Direction_Desc { get; set; }
        /// <summary>
        /// 归属区域面名称
        /// </summary>
        public string Name { get; set; }
        /// <summary>
        /// 归属区域面类型
        /// </summary>
        public string Tag { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public string Uid { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public string Distance { get; set; }
    }
}
