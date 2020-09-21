import java.net.SocketOption;
import java.util.Scanner;

public class Rally {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            int days = m/n;
            int modulo = m%n;
            int day = m==n? 0:modulo/(m-n);
        System.out.println(days + day);
    }
}
