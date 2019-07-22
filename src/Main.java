import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        long currentTime = System.currentTimeMillis();
        long tt =  60 * 60 * 24 * 93;
        System.out.println(tt);
        long l1 = currentTime -tt;


        long l = 1556429644000L;
        boolean dayDiffFromToday = getDayDiffFromToday(l1);



    }

    /**
     * 距离当前时间93天之内的日期
     *
     * @param time
     * @return
     */
    public static boolean getDayDiffFromToday(long time) {
        //得到当前的毫秒
        long currentTime = System.currentTimeMillis();
        int day = Math.toIntExact((currentTime - time) / 1000 / 60 / 60 / 24);
        //在93天内
        if (day > 0 && day <= 93) {
            return true;
        }
        return false;
    }

}
