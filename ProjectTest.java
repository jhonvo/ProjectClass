public class ProjectTest {
    
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("PopCorn");
        Project project3 = new Project("PopCorn", "Machines for free PopCorn around the city");
        Project project4 = new Project("PopCorn", "Machines for free PopCorn around the city", 78.2);

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());


    }

}
