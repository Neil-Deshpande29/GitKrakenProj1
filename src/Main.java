
public class Main {



    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];
        for(int i=0; i<1000; i++)
        {
            threads[i] = new Thread();
        }
    }
}