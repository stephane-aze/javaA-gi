public class Main {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]); 	//Integer.parseInt fonctionnne aussi
        StringBuilder output =new StringBuilder();
        int sizeInDigits=f(n);
    int [] digits = new int [sizeInDigits];
        for (int i = 0; i < sizeInDigits; i++) {
            output.append( n % 2);
            n /= 2;
        }

        System.out.println("0b"+output);

    }
    private static int f(int n){
        int taille=(int) (Math.log(n)/Math.log(2));
        return taille+1;
    }
}

