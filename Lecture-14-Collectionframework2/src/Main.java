import java.util.ArrayList;
import java.util.Comparator;

public class Main {
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

        System.out.println("Texas is at "+ states.indexOf("Texas")+" index");


        //removing
        String t=states.remove(3);
        System.out.println(t);
        System.out.println("After Deletion : "+states);

        //sort the list
        states.sort(Comparator.naturalOrder()); //A-Z then a-z
        System.out.println("After Sorting : "+states);

        //contains method
        System.out.println("Is New York here? "+states.contains("newyork"));

        //check if list is empty
        System.out.println("Is list empty : "+states.isEmpty());
        states.removeAll(states);
        System.out.println("Is list empty : "+states.isEmpty());
    }
}