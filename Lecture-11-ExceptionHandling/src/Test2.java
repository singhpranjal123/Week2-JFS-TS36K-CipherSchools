import java.util.Scanner;

public class Test2 {
    int n1, n2,result;
    Scanner sc= new Scanner(System.in);
    void calculate() {
        try {
            System.out.println("Enter first number");
            n1= sc. nextInt();
            System.out.println("Enter 2nd number");
            n2= sc. nextInt();

            result=n1/n2;
        }
        catch(Exception e) {
            System.out.println("Exception Found");

        }
        System.out.println("The Division is "+result);


    }

    public static void main(String[] args) {
        Test2 obj= new Test2();
        obj.calculate();
//

    }
}
