import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    int n1, n2,result;
    Scanner sc= new Scanner(System.in);
    void calculate() {
        try {
            System.out.println("Enter first number");
            n1= sc. nextInt();
            System.out.println("Enter 2nd number");
            n2= sc. nextInt();
            if(n2==0){
                throw new ArithmeticException();
            }
            result=n1/n2;
        }
        catch(InputMismatchException ime) {
            System.out.println("IME Detected");
        }
        catch(ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch(Exception e) {
            System.out.println("Ouch! Exception Found"+e.getMessage());
            e.printStackTrace();

        }
        finally {
            System.out.println("The Division is "+result);
        }


    }

    public static void main(String[] args) {
        Test1 obj= new Test1();
        obj.calculate();
//

    }
}
