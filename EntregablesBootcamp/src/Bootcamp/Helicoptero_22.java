package Bootcamp;

public class Helicoptero_22 extends Volador implements Aterrizable{

	public Helicoptero_22(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Aterrizar() {
		System.out.println("Helicótero aterriza");
	}

}
