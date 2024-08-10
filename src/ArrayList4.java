import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<String> com = new ArrayList<>();
        com.add("Gold");
        com.add("Silver");

        ArrayList<String> com2 = new ArrayList<>();
        com2.add("Gold");
        com2.add("Bronze");

        ArrayList<String> result = comparecoms(com, com2);
        System.out.println(result);
    }

    public static ArrayList<String> comparecoms(ArrayList<String> com, ArrayList<String> com2) {
        ArrayList<String> result = new ArrayList<>();

        int minSize = Math.min(com.size(), com2.size());

        for (int i = 0; i < minSize; i++) {
            if (com.get(i).equals(com2.get(i))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result;
    }
}
