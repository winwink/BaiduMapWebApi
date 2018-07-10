using System;
using System.Collections.Generic;
using System.Security.Cryptography;
using System.Text;
using System.Linq;

namespace BaiduMap.Util
{
    public static class AKSNCaculator
    {
        public static string CaculateAKSN(string ak, string sk, string url, IDictionary<string, string> dictionary)
        {
            if (dictionary.ContainsKey("ak"))
            {
                dictionary["ak"] = ak;
            } 
            else 
            {
                dictionary.Add("ak", ak);
            }

            if (dictionary.ContainsKey("sn"))
            {
                dictionary.Remove("sn");
            }

            var queryString = UrlUtil.BuildEncodeQuery(dictionary);
            var str = UrlUtil.Encode(url + "?" + queryString + sk);
            return EncryptUtil.MD5(str);
        }
    }
}
