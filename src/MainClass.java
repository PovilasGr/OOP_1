public class MainClass {
    public static void main (String[] args) {
        final int N = 57;
        final int K = 5;
        final int M = 4;
        int i;

        for(i = 1; i < N; i++)
        {
            if ( i % K == 0 && i % M == 0)
                System.out.println("Number " + i + " KeldonBazinga");
            else if ( i % K == 0)
                System.out.println("Number " + i + " Keldon");
            else if ( i % M == 0)
                System.out.println("Number " + i + " Bazinga");
        }
    }
}
