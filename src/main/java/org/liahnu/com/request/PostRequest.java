package org.liahnu.com.request;


import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.entity.mime.Header;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.client5.http.classic.methods.*;

import java.util.ArrayList;
import java.util.List;

public class PostRequest {
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



    public void postRequest()throws Exception{
        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultCookieStore(basicCookieStore)
                .build();

        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new UrlEncodedFormEntity(nvps));
        httpClient.execute(httpPost,response->{
            System.out.println(response.getCode());
            return  null;
        });
    }

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
