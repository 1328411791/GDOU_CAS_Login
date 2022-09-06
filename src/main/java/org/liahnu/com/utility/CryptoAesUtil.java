package org.liahnu.com.utility;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.Base64;

@SuppressWarnings("ALL")
public class CryptoAesUtil {
    private static final byte[] SIV = new byte[16];
    private static final String ALGORITHMS = "AES/CBC/PKCS7Padding";

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private static String  randString64(){
        //生成随机64位字符串
        String str = "ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678";
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < 64; i++) {
            char ch = str.charAt((int) (Math.random() * str.length()));
            sb.append(ch);
        }
        return sb.toString();
    }


    public static String encrypt(String content, String encryptKey) throws Exception {
        KeyGenerator.getInstance("AES").init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMS);
        String data=randString64()+content;
        // 加密向量
        IvParameterSpec iv = new IvParameterSpec(SIV);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"), iv);
        byte[] b = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        // 采用base64算法进行转码,避免出现中文乱码
        return Base64.getEncoder().encodeToString(b);
    }
}
