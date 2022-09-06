import org.junit.Test;
import org.liahnu.com.utility.CryptoAesUtil;

public class CryptoTest {

    @Test
    public void test() throws Exception {
        String content = "";
        String key = "";
        System.out.println(CryptoAesUtil.encrypt(content, key));
    }


}
