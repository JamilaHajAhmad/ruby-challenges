public class fibonacci {
    int fibonacciSequence(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
    }

    public static void main(String[] args) {
        fibonacci obj = new fibonacci();
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + obj.fibonacciSequence(n));
    }
}



