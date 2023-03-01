import java.util.Scanner;

class MyEx extends RuntimeException{
    String ch;
    MyEx(String msg){
        ch = msg;
    }

    @Override
    public String toString() {
        return "You can not use " + ch;
    }
}

class q3{
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        try {
            CheckName(name);
        } catch (MyEx e){
            System.out.println("Exception : " +e);
        }

    }
    public static void CheckName(String name){
        if (name.indexOf('@') >= 0 || name.indexOf('*') >= 0 || name.indexOf('?') >= 0 ){
            throw new MyEx("@ , ? , *");
        }
        else {
            System.out.println(name);
        }
    }
}