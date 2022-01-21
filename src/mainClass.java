import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mainClass {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("hh:mm a DD/MM/YYYY");
        Date date = new Date();
        System.out.println(format.format(date));

    }
}
