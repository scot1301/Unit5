package unit5;

public class RadioCallinShow {

    
    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        System.out.println("3 Callers call into the show");
        phoneline.enqueue(new Caller("Monica"));
        phoneline.enqueue(new Caller("Chandler"));
        phoneline.enqueue(new Caller("Joey"));
        System.out.println("Lets take the first caller");
        System.out.println(phoneline.dequeue());
        System.out.println("add 2 more callers");
        phoneline.enqueue(new Caller("Rachel"));
        phoneline.enqueue(new Caller("Ross"));
        System.out.println("Lets take the second caller");
        System.out.println(phoneline.dequeue());
        System.out.println("Lets take the third caller");
        System.out.println(phoneline.dequeue());
        System.out.println("The next caller will be " + phoneline.peekFront());
        System.out.println("We still have " + phoneline.size() + " callers left.");
        System.out.println("Emptying the queue - take the rest of the callers");
        while(true){
            if(phoneline.isEmpty())break;
            System.out.println(phoneline.dequeue());
        }
        
    }
    
}
