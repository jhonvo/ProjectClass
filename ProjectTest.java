public class ProjectTest {
    
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Project project1 = new Project();
        Project project2 = new Project("PopCorn");
        Project project3 = new Project("PopCorn", "Machines for free PopCorn around the city");
        Project project4 = new Project("PopCorn", "Machines for free PopCorn around the city", 78.2);

        // System.out.println(project1.elevatorPitch());
        // System.out.println(project2.elevatorPitch());
        // System.out.println(project3.elevatorPitch());
        // System.out.println(project4.elevatorPitch());

        project3.setCost(50.00);

        portfolio.AddToPortfolio(project1);
        portfolio.AddToPortfolio(project2);
        portfolio.AddToPortfolio(project3);
        portfolio.AddToPortfolio(project4);

        // System.out.println(portfolio.showPortfolio());
        portfolio.getPortfolio();

        portfolio.showPortfolio();
    }

}
