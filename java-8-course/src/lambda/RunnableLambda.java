package lambda;

public class RunnableLambda {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hello World from thread " + Thread.currentThread().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //with lambda

        Runnable runnableLambda = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello world from thread "+Thread.currentThread().getName());
            }
        };
        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();


    }
}
