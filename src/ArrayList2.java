import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> son = new ArrayList<>();
        son.add(20);
        son.add(25);
        son.add(30);
        son.add(35);
        son.add(40);
        Integer top = 32;
        if(son.contains(top)){
            System.out.println(top + ": Mavjud!");
        }else{
            System.out.println(top + ": Topilmadi!");
        }
        System.out.println("Mavjud Sonlar: " + son);

        ArrayList<Integer> copy = (ArrayList<Integer>) son.clone();
        System.out.println("Nusxasi: " + copy);

    }
}
