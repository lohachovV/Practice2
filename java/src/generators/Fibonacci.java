package generators;

public class Fibonacci {
    private int numbersOfDigits;
    private int[] fibonacciArr = new int[getNumbersOfDigits()];

    public Fibonacci (int numbersOfDigits){
        this.numbersOfDigits = numbersOfDigits;
        for (int i = 0; i <= getNumbersOfDigits(); i++) {
            if (i > 0){
                fibonacciArr [i] = fibonacciArr [( i - 1)] + fibonacciArr [i];
            } else {
                int firstNumb = 1;
                fibonacciArr [i] = firstNumb;
            }
            System.out.println(fibonacciArr [i]);
        }

    }



    public int getNumbersOfDigits() {
        return numbersOfDigits;
    }

    public void setNumbersOfDigits(int numbersOfDigits) {
        this.numbersOfDigits = numbersOfDigits;
    }

    public int[] getFibonacciArr() {
        return fibonacciArr;
    }

}
