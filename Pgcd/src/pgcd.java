public class pgcd {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("2 arguments attendus : <a> <b>");
            System.exit(1);
        }
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        pgcd gcd = new pgcd(a, b);
        int divisor = gcd.computeGcd();
        System.out.println(divisor);
        assert a % divisor ==0;
        assert b % divisor ==0;

    }

    private int a;
    private int b;

    public pgcd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int computeGcd() {
        return computeGcd(a, b);
    }

    private static int computeGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return computeGcd(b, a % b);
    }

}
