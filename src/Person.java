public class Person  {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void eat (){
        System.out.println("Eats Kalbasa");
    }
    public void learn(){
        System.out.println();
    }
    public void walk(){
        System.out.println();

    }
    public void coding(){

    }
    public void dancing(){

    }
    public void SingingPlaygitar(){

    }
    @Override
    public String toString() {
        return
                "name " + name + "\n" +
                "designation " + designation + "\n" ;
    }

}
