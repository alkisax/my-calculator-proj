package gr.aueb.cf.ch3;

public class MulCalculator {
    public static void main(String[] args) {
        int num1  = 3;
        int num2 = 5;
        int result = 0;
        result = mal(num1, num2);
        System.out.println("Result: " + result);

    }
    public static int mal(int a, int b){
        return a * b;
    }
}
