public class LucasNumber{
    private final int N;

    public LucasNumber(int n){
        this.N = n;
    }

    public int Lucas(int n) {
        if (n == 0)
            return 2;
        else if (n == 1)
            return 1;
        else
            return Lucas(n-1) + Lucas(n-2);
    }

    public int SumofSquares(){
        int sum = 0;
        System.out.println("Сума квадратів: ");
        for(int i = 0; i < N; i++) {
            int lucas = Lucas(i);
            for(int j = 0; j < 1; j++)
            {
                System.out.println(lucas + "^2 = " + (lucas*lucas));
            }
            sum += lucas * lucas;
        }
        System.out.println();
        return sum;
    }
}
