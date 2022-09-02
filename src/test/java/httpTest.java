import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.liahnu.com.request.FirstLoginRequest;
import org.liahnu.com.request.LoginRequest;
import org.liahnu.com.request.PostRequest;
import org.liahnu.com.utility.CryptoAesUtil;

public class httpTest {

    @Test
    public void testLoginHttp() throws Exception {
        LoginRequest loginRequest=new LoginRequest("202144011308","Yu20030405");
        loginRequest.postRequest();
    }

    @Test
    public void testJHttp() throws Exception {
        FirstLoginRequest firstLoginRequest=new FirstLoginRequest();
        firstLoginRequest.getRequest();
        System.out.println(CryptoAesUtil.encrypt("Yu20030405",firstLoginRequest.getPwdEncryptSalt()));
        System.out.println(firstLoginRequest.getJSESSIONID());
        System.out.println(firstLoginRequest.getExecution());


    }

}
