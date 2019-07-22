import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author mengxiangtao
 * @date 29/4/2019 下午1:55
 */
public class test {
    public static final String stringFomate="%s-%s-%s";
    public static void main(String[] args) {
    stringTest("aaa","bbb","ccc");
    }

    public static void stringTest(String aaa,String bbb,String ccc){
        String format = String.format(stringFomate, aaa, bbb, ccc);
        System.out.println(format);

        String ss="{\"bsType\":\"app-mall-setMusicLevel\",\"creTime\":1563386805673,\"data\":{\"firstSetMusicLevel\":true,\"instrumentType\":1,\"studentId\":1442312,\"studentType\":1},\"expTime\":0,\"from\":\"mini\",\"svName\":\"ratel-api\"}";
    }
}
