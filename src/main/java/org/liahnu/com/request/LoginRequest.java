package org.liahnu.com.request;


import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.core5.http.ClassicHttpResponse;
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
    private static String lt = "";
    private String execution = "";

    private String pwdEncryptSalt;

    private Cookie MOD_AUTH_CAS;

    public LoginRequest(){
        super(url);
    }


    //设置登录参数
    public LoginRequest(String username,String password){
        super(url);
        this.username=username;
        this.password=password;
        setFirstLoginRequest();
        try {
            this.password_aes= CryptoAesUtil.encrypt(this.password,this.pwdEncryptSalt);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setPara();
    }

    private void setFirstLoginRequest(){
        try {
            FirstLoginRequest firstLoginRequest = new FirstLoginRequest();
            this.execution = firstLoginRequest.getExecution();
            this.pwdEncryptSalt = firstLoginRequest.getPwdEncryptSalt();
            this.basicCookieStore = firstLoginRequest.getBasicCookieStore();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void setPara() {
        this.nvps.add(new BasicNameValuePair("username", username));
        this.nvps.add(new BasicNameValuePair("password", password_aes));
        this.nvps.add(new BasicNameValuePair("captcha", captcha));
        this.nvps.add(new BasicNameValuePair("rememberMe", rememberMe));
        this.nvps.add(new BasicNameValuePair("_eventId", _eventId));
        this.nvps.add(new BasicNameValuePair("cllt", cllt));
        this.nvps.add(new BasicNameValuePair("dllt", dllt));
        this.nvps.add(new BasicNameValuePair("lt", lt));
        this.nvps.add(new BasicNameValuePair("execution", execution));
    }

    @Override
    protected void doPost(HttpPost httpPost, ClassicHttpResponse httpResponse) {

        List<Cookie> cookies = basicCookieStore.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("MOD_AUTH_CAS")) {
                MOD_AUTH_CAS = cookie;
                break;
            }
        }

    }

    public Cookie getAuth() {
        return MOD_AUTH_CAS;
    }

    public void setAuth(Cookie MOD_AUTH_CAS) {
        this.MOD_AUTH_CAS = MOD_AUTH_CAS;
    }

    public String getExecution() {
        return execution;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public String getPwdEncryptSalt() {
        return pwdEncryptSalt;
    }

    public void setPwdEncryptSalt(String pwdEncryptSalt) {
        this.pwdEncryptSalt = pwdEncryptSalt;
    }
}
