
public class Main {

    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];
        long[] sums  = new long[1000];
        for(int i=0; i<1000; i++)
        {
            final int index = i;
            threads[i] = new Thread(()->
            {
                for(int n =1; n<=1000000; n++)
                    sums[index] +=n;
                System.out.println(sums[index]);
            });
            threads[i].start();
        }
    }
}