using BaiduMap.Request;
using BaiduMap.Response;
using System.Net.Http;
using Newtonsoft.Json;
using BaiduMap.Request.Models;

namespace BaiduMap.Util
{
    public class BaiduClient
    {
        public string Ak { get; set; }
        public string Sk { get; set; }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="ak">appKey</param>
        public BaiduClient(string ak) 
        {
            this.Ak = ak;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="ak">appKey</param>
        /// <param name="sk">secretKey</param>
        public BaiduClient(string ak, string sk) : this(ak)
        {
            this.Sk = sk;
        }

        /// <summary>
        /// 执行查询接口，根据构造函数sk值的不同，调用不同验证方式的接口
        /// 如果sk为空，调用 ip白名单验证
        /// 否则调用sn验证方法
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <typeparam name="S"></typeparam>
        /// <param name="request"></param>
        /// <returns></returns>
        public T Execute<T, S>(BaiduRequest<T, S> request)
            where T : BaiduResponse
            where S : BaiduModel
        {
            return string.IsNullOrWhiteSpace(Sk) ? AkExeucte(request) : SNExecute(request);
        }

        /// <summary>
        /// IP白名单方式
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <typeparam name="S"></typeparam>
        /// <param name="request"></param>
        /// <returns></returns>
        private T AkExeucte<T, S>(BaiduRequest<T, S> request)
            where T : BaiduResponse
            where S : BaiduModel
        {
            var dictionary = request.GetParameters();
            dictionary.Add("ak", Ak);
            var queryString = UrlUtil.BuildQuery(dictionary);

            return GetRequest<T>(request.Host, request.Address, queryString);
        }

        /// <summary>
        /// SN验证方式
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <typeparam name="S"></typeparam>
        /// <param name="request"></param>
        /// <returns></returns>
        private T SNExecute<T, S>(BaiduRequest<T, S> request)
            where T : BaiduResponse
            where S : BaiduModel
        {
            var dictionary = request.GetParameters();
            var sn = AKSNCaculator.CaculateAKSN(Ak, Sk, request.Address, dictionary);
            dictionary.Add("sn", sn);
            var queryString = UrlUtil.BuildQuery(dictionary);

            return GetRequest<T>(request.Host, request.Address, queryString);
        }

        /// <summary>
        /// 采用Get方式发送请求
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="host"></param>
        /// <param name="address"></param>
        /// <param name="queryString"></param>
        /// <returns></returns>
        private static T GetRequest<T>(string host, string address, string queryString)
            where T : BaiduResponse
        {
            var url = host + address + "?" + queryString;
            var client = new HttpClient();
            var result = client.GetStringAsync(url).Result;
            return JsonConvert.DeserializeObject<T>(result);
        }
    }
}
