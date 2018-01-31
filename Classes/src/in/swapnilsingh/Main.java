package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();

        System.out.println(porsche.getModel());
        porsche.setModel("Holden");
        System.out.println(porsche.getModel());
    }
}
