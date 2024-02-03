public class Test1 {
    int arg=5;

    Test1(){
        System.out.println("I am Default constructor !");
    }

    Test1(int arg){
        this();
        this.arg=arg;
    }
        public static void main(String[] args) {

            int arg=10;
            Test1 onj= new Test1(arg);
            System.out.println(onj.arg);

    }
}