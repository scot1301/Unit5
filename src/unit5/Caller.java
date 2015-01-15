package unit5;


public class Caller {
    private String name;
    private int id;
    static int nextid=0;
    
    public Caller(String nm){
        name=nm;
        nextid++;
        id = nextid;
    }
    public String toString(){
        return "Name: " + name + "\tId: " + id;
    }
           
}
