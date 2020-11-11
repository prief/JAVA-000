
public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        long start=System.currentTimeMillis();

        Thread t= new Thread(() -> Result.result=sum());
        t.start();

        t.join();
        System.out.println("Result.result:"+ Result.result);

        System.out.println( (System.currentTimeMillis()-start) + " ms");
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    static class Result{
        static int result;
    }

}