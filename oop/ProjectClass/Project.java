public class Project{
    private String name;
    private String description;
    
    public Project() {
        System.out.println("Default constructor");
    }
    
    public Project(String name) {
        System.out.println("name is "+ name);
    }
    
    public Project(String name, String description) {
        System.out.println("name is "+name);
        System.out.println("description is "+ description);
    }

    //getter 
    public String getName() {
        return name;
    }
    public String getDesc(){
        return description;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String desc){
        description = desc;
    }

    public void elevatorPitch() {
        System.out.println(name + ":" + description);
    }
    
}