public class q7 {
    public static void main(String[] args) {
        Thread t1;
        t1 = Thread.currentThread();
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("main : "+ i);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException ignored) {
                }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 11; i < 20; i++) {
                    System.out.println("            T1 : " +i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {

                }
                }

            }
        });
        t1.start();
        t2.start();
    }
}
