package unit5;

public class TireSales {
    
    public static void main(String[]args){
        ArrayStack pole = new ArrayStack();
        Tire t;
        System.out.println("Adding 10 tires to the stack");
        for (int x=1; x<=10;x++){
            t=new Tire("Goodyear");
            pole.push(t);
        }
        System.out.println("Selling 4 tires to customer A");
        for(int x=1;x<=4;x++){
            t = (Tire)pole.pop();
            System.out.println(t);
        }
        System.out.println("Adding 2 new tires to the stack");
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        System.out.println("\nSell another 4 tires to customer B");
        for(int x=1;x<=4;x++)
        {
            t = (Tire)pole.pop();
            System.out.println(t);
        }
        t = (Tire)pole.peekTop();
        System.out.println("Next tire to sell is " + t);
        System.out.println("Tire in stock now = " +pole.size());
    }
}
