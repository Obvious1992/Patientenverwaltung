import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Month;
import java.util.HashMap;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Main {

	public static void main(String[] args) throws Exception {

		try {
			
			String text = ceasarencrypt("Lehrveranstaltung", 3);
			//System.out.println(text);
			//System.out.println(ceasarencrypt(text, -3));

			
			Patient p = new Patient("Hans", "Meier", new Adresse("Seestr", "4", "00000", "Köln"), "test", null);
			Person person = new Person("Hans", "Meier", new Adresse("Seestr", "4", "00000", "Köln"));
			
				SecretKey k = generateKey(128);
				IvParameterSpec iv = generateIV();
				
				AESencrypt("AES/CBC/PKCS5Padding", p, k, iv);
				SealedObject per = AESencrypt("AES/CBC/PKCS5Padding", person, k, iv);
	
				
				Person entschluesseltePerson = (Person)AESdecrypt("AES/CBC/PKCS5Padding", per,k, iv);
				
				System.out.println(entschluesseltePerson.getNachname());


		}catch(Exception e) {
			System.out.println(e.getMessage());

		}
	
	}
	//AES
	
	public static SecretKey generateKey(int n) throws NoSuchAlgorithmException{
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(n);
		return keyGenerator.generateKey();	
	}
	
	public static IvParameterSpec generateIV() {
		byte[] iv = new byte [16];
		new SecureRandom().nextBytes(iv);
		return new IvParameterSpec(iv);
	}
	
	public static SealedObject AESencrypt(String algorithm, Serializable object, SecretKey key, IvParameterSpec iv) 
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, 
			InvalidAlgorithmParameterException, IllegalBlockSizeException, IOException {
		
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.ENCRYPT_MODE, key, iv);
		return new SealedObject(object, cipher);
		
	}
	
	
	public static Serializable AESdecrypt(String algorithm, SealedObject sealedObject, SecretKey key, IvParameterSpec iv) 
			throws NoSuchPaddingException,
		    NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException,
		    ClassNotFoundException, BadPaddingException, IllegalBlockSizeException,
		    IOException {
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.DECRYPT_MODE, key, iv);
		
		return (Serializable)sealedObject.getObject(cipher);
	}
	
	
	
	// Ceasar
	public static String ceasarencrypt(String text, int offset) {
		StringBuffer encryptedText = new StringBuffer();
		
		for(int i = 0; i< text.length() ; i++) {
			char aktuelleszeichen = text.charAt(i);
			if(aktuelleszeichen > 96 && aktuelleszeichen < 123)
			{
				aktuelleszeichen += offset;
				encryptedText.append(aktuelleszeichen);
			}
			
		}
		return encryptedText.toString();

	}

}
