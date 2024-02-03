class A {
    public void methodA() {
        System.out.println("Method of Class A");
    }
}

// B is a derived class of A
class B extends A {
    public void methodB() {
        System.out.println("Method of Class B");
    }
}

// C is a derived class of B
class C extends B {
    public void methodC() {
        System.out.println("Method of Class C");
    }
}

// Driver class
public class Test4 {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}