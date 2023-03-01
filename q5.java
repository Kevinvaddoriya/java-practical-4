import java.io.IOException;
import java.time.LocalDateTime;

public class q5 {
    public static void main(String[] args) throws InterruptedException, IOException {


        for ( ; ;) {
            LocalDateTime lc = LocalDateTime.now();
            String t = lc.toString().substring(11,19);
            System.out.println(t);
            try {
                Thread.sleep(1000);
            }catch (Exception ignored){}
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }
}
