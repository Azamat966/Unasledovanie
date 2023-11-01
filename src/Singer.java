public class Singer extends Person {

    private String BandName;
    public Singer() {

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        BandName = bandName;
    }

    public Singer(String bandName) {
        BandName = bandName;
    }

    public String getBandName() {

        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }
    public void eat() {
        System.out.println("Eats Kalbasa");
   }
   public void learn(){
       System.out.println("Yrchy");
   }
   public void walk(){
       System.out.println();
   }
   public void SingingPlaygitar(){
       System.out.println("yrchy");
   }

    @Override
    public String toString() {
        return "Singer\n" +
                "______________\n"+
                "BandName " + BandName +"\n"+
                super.toString();
    }
}
