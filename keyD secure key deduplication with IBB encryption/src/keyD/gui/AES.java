/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyD.gui;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.encoders.Base64;

/**
 *
 * @author DELL
 */
public class AES {
    private static final String ALGO = "AES";

	public static String encrypt(String Data, String keyWord) throws Exception {

		keyWord = keyWord.substring(0, 16);
		byte[] keyValue = keyWord.getBytes();
		System.out.println("Size : " + keyValue.length);
		Key key = new SecretKeySpec(keyValue, ALGO);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		String encryptedValue = new String(Base64.encode(Data.getBytes()));
		return encryptedValue;
	}

	public static String decrypt(String encryptedData, String keyWord)
			throws Exception {

		keyWord = keyWord.substring(0, 16);
		byte[] keyValue = keyWord.getBytes();
		Key key = new SecretKeySpec(keyValue, ALGO);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		String decryptedValue = new String(Base64.decode(encryptedData.getBytes()));
		return decryptedValue;
	}

	public static void main(String[] args) {
		String password = "mypassword";

		String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";

		try {
			String passwordEnc = AES.encrypt(password,
					keyWord);
			String passwordDec = AES.decrypt(
					passwordEnc, keyWord);
			System.out.println("Plain Text : " + password);
			System.out.println("Encrypted Text : " + passwordEnc);
			System.out.println("Decrypted Text : " + passwordDec);

		} catch (Exception e) {
			System.out
					.println("Opps,Exception In AES_EncrypterNdecrypter=>main() :");
			e.printStackTrace();
		}

	}
    
}
