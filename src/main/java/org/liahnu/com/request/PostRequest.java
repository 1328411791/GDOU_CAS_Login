package org.liahnu.com.request;


import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

public abstract class PostRequest {
    private String url;
    List<NameValuePair> nvps=new ArrayList<>();

    BasicCookieStore basicCookieStore=new BasicCookieStore();

    public PostRequest(){

    }

    public PostRequest(String url){
        this.url=url;
    }

    public PostRequest(String url,List<NameValuePair> nameValuePairs){
        this.url=url;
        this.nvps=nameValuePairs;
    }


    /*
    * Post请求类
    * 需要重写doPost方法
     */

    public void postRequest()throws Exception{
        HttpClient httpClient = HttpClients.custom()
                .setDefaultCookieStore(basicCookieStore)
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setCircularRedirectsAllowed(true)
                        .build())
                .build() ;

            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");
            httpPost.addHeader("Cookie",basicCookieStore);
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            httpClient.execute(httpPost, response -> {
                doPost(httpPost, response);
                return null;
            });

    }

    public abstract void doPost(HttpPost httpPost, ClassicHttpResponse httpResponse);

    public  String getUrl() {
        return url;
    }

    public  void setUrl(String url) {
        this.url= url;
    }

    public List<NameValuePair> getNvps() {
        return nvps;
    }

    public void setNvps(List<NameValuePair> nvps) {
        this.nvps = nvps;
    }

    public BasicCookieStore getBasicCookieStore() {
        return basicCookieStore;
    }

    public void setBasicCookieStore(BasicCookieStore basicCookieStore) {
        this.basicCookieStore = basicCookieStore;
    }
}
