import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密类（封装jdk自带的md5加密方法）
 *
 * @author fengshuonan
 * @date 2016年12月2日 下午4:14:22
 */
public class MD5Util {
    private static final String CRM_H5_MD5_SALT = "8613985ec49eb8f757ae6439e879bb2a%d";


    public static String encrypt(String source) {
        return encodeMd5(source.getBytes());
    }

    private static String encodeMd5(byte[] source) {
        try {
            return encodeHex(MessageDigest.getInstance("MD5").digest(source));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private static String encodeHex(byte[] bytes) {
        StringBuffer buffer = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            if (((int) bytes[i] & 0xff) < 0x10) {
                buffer.append("0");
            }
            buffer.append(Long.toString((int) bytes[i] & 0xff, 16));
        }
        return buffer.toString();
    }

   /* public static void main(String[] args) {
       int studentId=882391;
        String format = String.format(CRM_H5_MD5_SALT, studentId);
        String sign = MD5Util.encrypt(format);

        //String sign1 = MD5Util.encrypt("87443");

        System.out.println(format);
        System.out.println(sign);
        //System.out.println(sign1);
    }*/


    /**
     * 对用户Uid进行解密
     */
    public static int decipheringUserId(String uid,String sign){

       int studentId;
        //String subSequence = (String) uid.subSequence(5, uid.length()-5);
        studentId=Integer.parseInt(uid);
        String studentIdSign = MD5Util.encrypt(String.format(CRM_H5_MD5_SALT, uid));
        if (studentIdSign.equals(sign)){
            return studentId;
        }
        return 0;
    }

    public static void main(String[] args) {
        int userId = decipheringUserId("882391", "f3f0932a078c12ac7f7bb56b8864a603");
        System.out.println(userId);
    }
}
