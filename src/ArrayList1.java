import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList();
        color.add("Qora");
        color.add("Yashil");
        color.add("Oq");
        color.add("Qizil");
        color.add("Sariq");
        color.add("Ko'k");
        color.add("Jigar rang");

        color.set(6,"Pushti");

        System.out.println("Ranglar nomi: " + color);
        System.out.println("Ranglar soni: " + color.size());

    }
}