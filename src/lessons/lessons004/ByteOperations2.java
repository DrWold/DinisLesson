package lessons.lessons004;

public class ByteOperations2 {

    public static void main(String[] args) {
        int secretNumber = 65;
        int key = 47;

        int encryptedData = secretNumber ^ key;
        System.out.println("Encrypted : " +  encryptedData);

        int decryptData = encryptedData ^ key;
        System.out.println("Decrypted : " +  decryptData);
    }
}
