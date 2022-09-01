import org.junit.Test;
import org.liahnu.com.utility.CryptoAesUtil;

public class CryptoTest {

    @Test
    public void test() throws Exception {
        String content = "Yu20030405";
        String key="Mjcqxjr5OE0ndxkb";
        System.out.println(CryptoAesUtil.encrypt(content,key));
    }


}
