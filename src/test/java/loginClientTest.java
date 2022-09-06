import org.junit.Test;
import org.liahnu.com.client.LoginClient;

public class loginClientTest {
    @Test
    public void testClient() {
        try {
            LoginClient loginClient = new LoginClient("202144011308", "Yu20030405");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
