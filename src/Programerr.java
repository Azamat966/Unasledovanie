public class Programerr extends Person {

   private String companyName;

   public Programerr() {
   }

   public Programerr(String name, String designation, String companyName) {
      super(name, designation);
      this.companyName = companyName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }


   @Override
   public void eat() {
      System.out.println("Eats Kalbasa");
   }
public void learn(){
   System.out.println("the cod");
}
public void walk(){
   System.out.println();
}
public void coding (){
   System.out.println("Programer");
}

   @Override
   public String toString() {
      return "Programerr\n" +
              "______________\n"+
              "companyName " + companyName+"\n" + '\'' +
              super.toString();
   }
}