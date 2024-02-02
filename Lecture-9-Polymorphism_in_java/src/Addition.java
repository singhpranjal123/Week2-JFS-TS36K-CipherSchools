public class Addition {

    public int sum(int a, int b) {
        return a + b;
    }


    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();

        System.out.println("Sum of 2 and 3: " + addition.sum(2, 3));
        System.out.println("Sum of 1, 2 and 3: " + addition.sum(1, 2, 3));
        System.out.println("Sum of 2 and 3.5: " + addition.sum(2, 3.5));
    }
}
