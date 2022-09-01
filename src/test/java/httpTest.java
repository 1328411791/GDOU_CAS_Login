import org.junit.Test;
import org.liahnu.com.request.PostRequest;
import org.liahnu.com.utility.CryptoAesUtil;

public class httpTest {

    @Test
    public void testHttp() throws Exception {
        String url = "http://www.baidu.com";
        PostRequest postRequest=new PostRequest(url);
        postRequest.postRequest();
    }

}
