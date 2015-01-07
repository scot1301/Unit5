package Unit5;
import java.util.ArrayList;
public class Unit5 {

    static ArrayList al = new ArrayList();
    public static void main(String[] args) {
       al.add("Ontop");
       al.add(0, "Best");
       al.add("Bubbles");
       al.add("Strawberry");
       al.add(1, "Ostritch");
       al.add("<3");
       show();
    }
    
    public static void show(){
        for(int x=0; x<al.size(); x++){
            String letter = String.valueOf(al.get(x));
            System.out.println("Location " + x + " -> " + letter);
        }
    }
}
