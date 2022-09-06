package org.liahnu.com.request;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class FirstLoginRequest extends GetRequest{

    private Cookie JSESSIONID;

    private String pwdEncryptSalt;

    private String execution;

    private String html;

    private static final String url="http://authserver.gdou.edu.cn/authserver/login";

    public FirstLoginRequest() throws Exception {
        super.setUrl(url);
        getRequest();
    }



    @Override
    public void doGet(HttpGet httpPost, ClassicHttpResponse httpResponse) {
        try {
        List<Cookie> cookies=basicCookieStore.getCookies();
        HttpEntity httpEntity=httpResponse.getEntity();
        html=EntityUtils.toString(httpEntity,"UTF-8");

        getToken(html);

        for (Cookie cookie:cookies) {
            if (Objects.equals(cookie.getName(), "JSESSIONID")) {
                this.JSESSIONID = cookie;
                return;
            }
        }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private void getToken(String html) {

        Document document = Jsoup.parse(html);
        Element salt = document.getElementById("pwdEncryptSalt");
        if (salt != null) {
            this.setPwdEncryptSalt(salt.val());
        }
        Element execution = document.getElementById("execution");

        if (execution != null) {
            this.setExecution(execution.val());
        }

    }

    public Cookie getJSESSIONID() {
        return JSESSIONID;
    }

    public void setJSESSIONID(Cookie JSESSIONID) {
        this.JSESSIONID = JSESSIONID;
    }

    public String getPwdEncryptSalt() {
        return pwdEncryptSalt;
    }

    public void setPwdEncryptSalt(String pwdEncryptSalt) {
        this.pwdEncryptSalt = pwdEncryptSalt;
    }

    public String getExecution() {
        return execution;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
