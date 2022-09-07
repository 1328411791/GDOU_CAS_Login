package org.liahnu.com.request;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.cookie.Cookie;
import org.apache.hc.core5.http.ClassicHttpResponse;

import java.util.List;
import java.util.Objects;

public class GetStudentHealth extends GetRequest {

    private static final String url = "http://ehall.gdou.edu.cn/xsfw/sys/xsyqxxsjapp/*default/index.do";
    private Cookie _WEU;

    public GetStudentHealth() {
        super(url);
    }


    @Override
    protected void doGet(HttpGet httpPost, ClassicHttpResponse httpResponse) {
        List<Cookie> cookies = basicCookieStore.getCookies();
        for (Cookie cookie : cookies) {
            if (Objects.equals(cookie.getName(), "_WEU")) {
                _WEU = cookie;
            }
        }
    }

    public Cookie get_WEU() {
        return _WEU;
    }

    public void set_WEU(Cookie _WEU) {
        this._WEU = _WEU;
    }

    public void setCookie(Cookie cookie) {
        basicCookieStore.addCookie(cookie);
    }
}
