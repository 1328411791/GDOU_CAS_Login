package org.liahnu.com.utility;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.Base64;

public class CryptoAesUtil {
    private static final byte[] SIV = new byte[16];
    private static final String ALGORITHMS = "AES/CBC/PKCS7Padding";

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static String  randString64(){
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
