import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        ArrayList<String> b = new ArrayList<>();
        b.add("C");
        b.add("D");

        ArrayList<String> merge = mergeabs(a,b);
        System.out.println(merge);
    }
   public static ArrayList<String> mergeabs(ArrayList<String> a,ArrayList<String> b){
        ArrayList<String> res = new ArrayList<>(a);
        res.addAll(b);
        return res;
   }
}
