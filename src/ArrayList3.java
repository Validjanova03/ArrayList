import java.util.ArrayList;

public class ArrayList3 {

    public static void reverseList(ArrayList<String> h) {

    }

    public static void main(String[] args) {

        ArrayList<String> h = new ArrayList<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("E");

        System.out.println("\n" + "Dastlabki ArrayList: " + h);


        reverseList(h);


        System.out.println("Teskari tartibdagi ArrayList: " + h);
    }
}



