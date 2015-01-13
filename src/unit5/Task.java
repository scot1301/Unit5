
package unit5;


public class Task {
    
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\n=================\n";
    }
    
    
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean validate(){
        if (name == null || description == null || name.equals("") || description.equals(""))
            return false;
        else 
            return true;
    }
    
    
}
