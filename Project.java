/**
 * ProjectClass
 */
public class Project {
    private String Name;
    private String Description;

    public Project(){};
    public Project (String name){
         Name = name;
    };
    public Project(String name, String description){
        Name = name;
        Description = description;
    }
    public void setName(String name){Name = name;};
    public void setDescription(String description){Description = description;};
    public String elevatorPitch(){return Name + ": "+ Description;};

    public String returnName(){ return Name;};
    public String returnDescription(){return Description;};
}