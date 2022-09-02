package org.liahnu.com.request;


import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.client5.http.impl.cookie.BasicClientCookie;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.liahnu.com.utility.CryptoAesUtil;

import java.util.List;

public class LoginRequest extends PostRequest {

    private static final String url = "http://authserver.gdou.edu.cn/authserver/login";

    private String username;
    private String password;

    private String password_aes;
    private static String captcha="";
    private static String rememberMe="true";
    private static String _eventId="submit";
    private static String cllt="userNameLogin";
    private static String dllt="generalLogin";
    private static String lt="";
    private String execution;

    private String pwdEncryptSalt;

    public LoginRequest(){
        super(url);
    }

    public LoginRequest(String username,String password){
        super(url);
        this.username=username;
        this.password=password;
        setFirstLoginRequest();
        try {
            this.password_aes= CryptoAesUtil.encrypt(password,this.pwdEncryptSalt);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setPara();
    }

    private void setFirstLoginRequest(){
        try {
            FirstLoginRequest firstLoginRequest = new FirstLoginRequest();
            firstLoginRequest.getRequest();
            setExecution(firstLoginRequest);
            setCookies(firstLoginRequest);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void setExecution(FirstLoginRequest firstLoginRequest) {
        this.execution = firstLoginRequest.getExecution();
        this.pwdEncryptSalt=firstLoginRequest.getPwdEncryptSalt();
    }
    private void setCookies(FirstLoginRequest firstLoginRequest) {
        try {
            firstLoginRequest.getRequest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.basicCookieStore=firstLoginRequest.getBasicCookieStore();
    }



    private void setPara(){
        nvps.add(new BasicNameValuePair("username",username));
        nvps.add(new BasicNameValuePair("password",password_aes));
        nvps.add(new BasicNameValuePair("captcha",captcha));
        nvps.add(new BasicNameValuePair("rememberMe",rememberMe));
        nvps.add(new BasicNameValuePair("_eventId",_eventId));
        nvps.add(new BasicNameValuePair("cllt",cllt));
        nvps.add(new BasicNameValuePair("dllt",dllt));
        nvps.add(new BasicNameValuePair("lt",lt));
        nvps.add(new BasicNameValuePair("execution",execution));
    }

    @Override
    public void doPost(HttpPost httpPost, ClassicHttpResponse httpResponse) {
        List<Cookie> cookies=basicCookieStore.getCookies();
        System.out.println(cookies);
    }
}
