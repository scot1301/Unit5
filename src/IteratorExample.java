import java.util.ArrayList;
import java.util.ListIterator;
public class IteratorExample {
    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos = 0;
    
    public static void main(String[] args) {
        list.add("s");
        list.add("e");
        list.add("x");
        li = list.listIterator();
        
        //move 1
        System.out.println("1 Move over item: "  + li.next());
        pos++;
        
        //move 2
        System.out.println("2 Move over item: "  + li.next());
        pos++;
        
        //remove
        System.out.println("3 Removed something... ");
        li.remove();
        pos++;
        
        //move 4
        System.out.println("4 Add e back in: ");
        li.add("e");
        pos++;
        
        //move 5
        System.out.println("5 Move over item: "  + li.next());
        pos++;
        
        //move back
        System.out.println("6 Move back over item: " + li.previous());
        pos--;
        
        //move 7
        System.out.println("7 Remove last item seen...");
        li.remove();
        pos++;
        
        //move 8
        System.out.println("8 Move back over item: " + li.previous());
        pos--;
        
        //move 9
        System.out.println("9 Set last thing seen to y: ");
        li.set("y");
        
        //move 10
        System.out.println("10 Add e back to the left of li");
        li.add("e");
        pos++;
        
        //move 11
        System.out.println("11 Add x back to the left of li");
        li.add("x");
        pos++;
        
        //remove 
        System.out.println("12 Try to remove something...");
        System.out.println("   - Remove declined...");
        //li.remove();
        
        //move 13
        System.out.println("13 Move over item: " + li.next());
        pos++;
        
        //move 14 
        System.out.println("14 Try to move past end of list...");
        System.out.println("   - Move declined...");
        //li.next();
        
        showList();
        
    }
     
    public static void showList(){
        for (int x=0; x<list.size(); x++){
            if (x==pos)System.out.print("*");
                System.out.print(list.get(x));
        }
        if (pos==list.size())System.out.println("*");
            System.out.println("");//print to a new line
        
        
    }
}
