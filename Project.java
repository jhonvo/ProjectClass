public class Project{

    private String name;
    private String description;
    private double cost;

    public Project() {}

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    //Getters : To be able to access the atrributes from other classes.
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getCost(){
        return this.cost;
    }

    //Setters: To change the values from a different class.

    public void setName(String name){ // Does not return anything.
        this.name = name;
    }

    public void setDescription(String description){ // Does not return anything.
        this.description = description;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    // Aggregators

    public String elevatorPitch(){
        return getName() + " (" + getCost() + "): " + getDescription();
        // return String.format("%s (%02f) %s", name, cost, description);
    }


}
