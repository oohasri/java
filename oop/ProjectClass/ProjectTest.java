public class ProjectTest{
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("First project");
        Project p3 = new Project("CommonEntrance", "First project");
        Project p4 = new Project("Hypermenu", "Built on python");
        p1.setName("Focus game");
        p1.setDesc("Built on MEAN");
        String p1name = p1.getName();
        String p1desc = p1.getDesc();
        p1.elevatorPitch();
    }
}