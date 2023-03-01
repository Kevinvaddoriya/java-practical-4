import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] name = {"Jay","Man","jemin","jenis","jayesh","Meet","Vivek","java","utsav","kevin"};
        String[] name = new String[10];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0)== 'J' || name[i].charAt(0)=='j'){
                System.out.println(name[i]);
            }
        }
    }
}
