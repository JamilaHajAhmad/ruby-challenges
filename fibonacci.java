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

/*
    1. fibonacciSequence method takes the parameter n of type int and 
    performs recursion to return the fibonacci number at the position n

    2. An object of fibonacci class was created to call the method
 */



