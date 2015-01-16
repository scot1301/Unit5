package unit5;

public class Patient {
    
    private String name;
    private String condition;
    
    public String toString() {
        return "Name: " + name + "\nCondition: " + condition + "\n=================\n";
    }
    
    public Patient(String name, String description) {
        this.name = name;
        this.condition = condition;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    public boolean validate(){
        if (name == null || condition == null || name.equals("") || condition.equals(""))
            return false;
        else 
            return true;
    }
}
