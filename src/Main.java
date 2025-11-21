
public class Main {

    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];
        for(int i=0; i<1000; i++)
        {
            threads[i] = new Thread(()->
            {
                long count = 0;
                for(int n =1; n<=1000000; n++)
                    count +=n;
                System.out.println(count);
            });
            threads[i].start();
        }
    }
}