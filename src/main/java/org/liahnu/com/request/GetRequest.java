package org.liahnu.com.request;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

public abstract class GetRequest {
    private String url;
    List<NameValuePair> nvps=new ArrayList<>();

    BasicCookieStore basicCookieStore=new BasicCookieStore();

    public GetRequest(){

    }

    public GetRequest(String url){
        this.url=url;
    }

    public GetRequest(String url,List<NameValuePair> nameValuePairs){
        this.url=url;
        this.nvps=nameValuePairs;
    }



    public void getRequest()throws Exception{
        try (CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultCookieStore(basicCookieStore)
                .build()) {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");
            httpGet.addHeader("Cookie",basicCookieStore);
            httpGet.setEntity(new UrlEncodedFormEntity(nvps));
            httpClient.execute(httpGet, response -> {
                doGet(httpGet, response);
                return null;
            });
        }
    }

    protected abstract void doGet(HttpGet httpPost, ClassicHttpResponse httpResponse);

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

    public void setAuth(Cookie cookie) {
        basicCookieStore.addCookie(cookie);
    }

    public BasicCookieStore getBasicCookieStore() {
        return basicCookieStore;
    }

    public void setBasicCookieStore(BasicCookieStore basicCookieStore) {
        this.basicCookieStore = basicCookieStore;
    }
}
