public class q1 {
    public static void div(int a ,int b){
        try {
            int result = a/b;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("do not devide by zero");
        }
        finally {
            System.out.println("Finally is executed..");

        }
    }

    public static void main(String[] args) {
        div(5,0);
    }
}
