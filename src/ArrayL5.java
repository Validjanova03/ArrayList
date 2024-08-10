import java.util.ArrayList;

public class ArrayL5 {
    public static void main(String[] args) {
        ArrayList<Integer> son = new ArrayList<>();
        son.add(1);
        son.add(2);
        son.add(3);
        System.out.println("Sonlar: "+ son);

        extendSon(son,6);
        System.out.println("Sonlar 2: " + son);

    }
    public static void extendSon(ArrayList<Integer> son, int newSize){
        while(son.size()<newSize){
            son.add(0);
        }

    }
}
