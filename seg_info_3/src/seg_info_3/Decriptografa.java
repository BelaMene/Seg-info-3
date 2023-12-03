package seg_info_3;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Decriptografa {
    private SecretKey secretKey;

    public Decriptografa(String keyString) throws NoSuchAlgorithmException {
        byte[] key = keyString.getBytes();
        key = Arrays.copyOf(key, 8);
        secretKey = new SecretKeySpec(key, "DES");
    }
    
    

    public byte[] encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data.getBytes());
    }
    
    

    public String decrypt(byte[] data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(data));
    }
}
