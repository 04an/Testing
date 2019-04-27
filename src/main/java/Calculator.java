

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int minus(int a, int b) {
        return a - b;
    }

    public int mnozenie(int a, int b) {
        return a * b;
    }

    public Double dzielenie(Double a, Double b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }

    public double divedeFinal( double a, double b){
        if (b ==0){
            throw new IllegalArgumentException("Mianownik nie moze byc zerem");
        }
        return a/b;

    }

    public boolean liczba(int a) {
        boolean liczba = true;
        if (a % 2 != 0) {
            liczba = false;
        }
        return liczba;
    }
}