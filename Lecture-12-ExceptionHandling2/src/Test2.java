public class Test2 {
    int getNextNo(int n) {
        try {
            if(n==5) return n+1;

        }
        finally {
            System.out.println("This is important code");
        }
        return n-1;

    }
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println(obj.getNextNo(5));
    }}
