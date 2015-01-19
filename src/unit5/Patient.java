package unit5;

public class Patient {
    
    private String name;
    private int condition;
    
    public Patient(String nm, int cdn) {
        name = nm;
        condition = cdn;
    }
    
    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }
    
    public boolean validate(){
        if (name== null || name== "")
            return false;
        else 
            return true;
    }
}
