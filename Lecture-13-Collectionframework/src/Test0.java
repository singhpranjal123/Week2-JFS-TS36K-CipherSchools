import java.util.ArrayList;

public class Test0 {
    public static void main(String[] args) {
        ArrayList<String> states= new ArrayList<String>();
        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("ArrayList: "+states);

        for(int i=0;i<states.size();i++) {
            System.out.println(states.get(i));
        }


        String s = states.get(2);
        System.out.println("I got "+s);
        states.set(2, "Texas");
        System.out.println("After Updation : "+states);
    }
}
