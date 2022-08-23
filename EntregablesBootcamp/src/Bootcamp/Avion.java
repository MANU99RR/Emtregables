package Bootcamp;

public class Avion extends Volador implements Aterrizable{

	public Avion(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Aterrizar() {
		System.out.println("Avión " + Nombre + " Aterriza");
	}

}
