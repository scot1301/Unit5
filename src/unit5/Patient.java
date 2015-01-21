package unit5;

public class Patient {
    
    private String name;
    private String condition;
    
    public Patient(String nm, String cdn) {
        name = nm;
        condition = cdn;
    }
    
    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }
    
    public boolean validate() {
        if (name== null || name== "" || condition == null || condition == "")
            return false;
        else 
            return true;
    }
    public String toString() {
        return name + " with " + condition + " condition ";
    }
}
