public class Dancer extends Person {
    private String groupName;
    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void eat() {
        System.out.println("Eats Kalbasa");
}
    public void learn(){
        System.out.println("tekst pesni");
    }
    public void walk(){
        System.out.println();
    }
    public void dancing(){
        System.out.println("Yrdayt");
    }


    @Override
    public String toString() {
        return "Dancer\n" +
                "______________\n"+
                "groupName " + groupName + "\n" +
                super.toString();
    }
}
