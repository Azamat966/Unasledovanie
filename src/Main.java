public class Main {
    public static void main(String[] args) {
        Programerr programerr = new Programerr();
        programerr.setName("Azamat");
        programerr.setDesignation("the code");
        programerr.setCompanyName("IT");
        System.out.println(programerr);


        programerr.eat();
        programerr.coding();
        programerr.learn();
        programerr.walk();

        Dancer dancer = new Dancer();
        dancer.setName("Nuriza");
        dancer.setDesignation("Tansor");
        dancer.setGroupName("Balabakcha");
        System.out.println(dancer);


        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();

        Singer singer = new Singer();
        singer.setName("Meriim");
        singer.setDesignation("Yrchy");
        singer.setBandName("Zte");
        System.out.println(singer);

        singer.eat();
        singer.learn();
        singer.walk();
        singer.SingingPlaygitar();


    }
}