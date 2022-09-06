import org.junit.Test;
import org.liahnu.com.client.LoginClient;

public class loginClientTest {
    @Test
    public void testClient() {
        try {
            LoginClient loginClient = new LoginClient("", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
