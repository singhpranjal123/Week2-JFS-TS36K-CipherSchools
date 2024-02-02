import java.util.Scanner;

abstract class Doctor{
    abstract void treatPatient();
}
class Physician extends Doctor{
    void treatPatient(){
        System.out.println("Hi!, I am Physician\n Treat Patients using Medicines..");
    }
}
class Surgeon extends Doctor{
    void treatPatient(){
        System.out.println("Hi!, I am Surgeon\n Treat Patients using Surgery..");
    }
}
class Dentist extends Doctor{
    void treatPatient() {
        System.out.println("Hi!, I am Dentist\n Treat Patients Teeth..");
    }
}
public class Program {
    public static void main(String[] args) {
        System.out.println("Hi! I am Lucy! Receptioninst at Max Care");
        System.out.println("Who you are looking for ? ");

        System.out.println("Press\n 1. Physician\n 2. Surgeon \n 3. Dentist");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Doctor doc = null;


        switch (choice) {
            case 1:
                doc = new Physician();
                break;

            case 2:
                doc = new Surgeon();
                break;

            case 3:
                doc = new Dentist();
                break;

            case 4:
                System.out.println("A oh! Invalid Choice");
                break;
        }
        if (choice < 0 || choice > 3) {
            System.exit(0);
        } else {
            doc.treatPatient();
        }
    }
}
