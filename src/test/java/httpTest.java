import org.junit.Test;
import org.liahnu.com.client.LoginClient;
import org.liahnu.com.request.FirstLoginRequest;
import org.liahnu.com.request.GetStudentHealth;
import org.liahnu.com.request.LoginRequest;
import org.liahnu.com.utility.CryptoAesUtil;

public class httpTest {

    @Test
    public void testLoginHttp() throws Exception {
        LoginRequest loginRequest = new LoginRequest("", "");
        loginRequest.postRequest();
        System.out.println(loginRequest.getAuth());
    }

    @Test
    public void testJHttp() throws Exception {
        FirstLoginRequest firstLoginRequest = new FirstLoginRequest();
        firstLoginRequest.getRequest();
        System.out.println(CryptoAesUtil.encrypt("", firstLoginRequest.getPwdEncryptSalt()));
        System.out.println(firstLoginRequest.getJSESSIONID());
        System.out.println(firstLoginRequest.getExecution());

    }


    @Test
    public void HealthTest() throws Exception {
        LoginClient loginClient = new LoginClient("202144011308", "Yu20030405");
        GetStudentHealth getStudentHealth = new GetStudentHealth();
        getStudentHealth.setCookie(loginClient.getLoginRequest().getAuth());
        getStudentHealth.getRequest();
        System.out.println(loginClient.getLoginRequest().getBasicCookieStore());
        System.out.println(loginClient.getLoginRequest().getAuth());
        System.out.println(getStudentHealth.get_WEU());
    }


}
