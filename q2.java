import java.util.regex.Pattern;

class MyExecption extends Exception{
    public MyExecption(String msg){
        super(msg);
    }
}

public class q2{
    public static void valid(String num) throws MyExecption{
        String rg = "^[0-9]{10}$";
        if (Pattern.matches(rg,num)){
            System.out.println("Mobile Number Valid");
        }
        else {
            throw new MyExecption("invalid number");
        }
    }
    public static void main(String[] args) throws MyExecption {
        valid("3425345435");
    }
}
