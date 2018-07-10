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

        public BaiduClient(string ak) 
        {
            this.Ak = ak;
        }

        public BaiduClient(string ak, string sk) : this(ak)
        {
            this.Sk = sk;
        }

        /// <summary>
        /// 执行查询接口，根据构造函数sk值的不同，调用不同验证方式的接口
        /// 如果sk为空，调用 ak验证方法
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

        private T AkExeucte<T, S>(BaiduRequest<T, S> request)
            where T : BaiduResponse
            where S : BaiduModel
        {
            // TODO: 没有ak的应用
            return default(T);
        }

        private T SNExecute<T, S>(BaiduRequest<T, S> request)
            where T : BaiduResponse
            where S : BaiduModel
        {
            var dictionary = request.GetParameters();
            var sn = AKSNCaculator.CaculateAKSN(Ak, Sk, request.Address, dictionary);
            dictionary.Add("sn", sn);
            var queryString = UrlUtil.BuildQuery(dictionary);
            var url = request.Host + request.Address + "?" + queryString;
            var client = new HttpClient();
            var result = client.GetStringAsync(url).Result;
            return JsonConvert.DeserializeObject<T>(result);
        }
    }
}
