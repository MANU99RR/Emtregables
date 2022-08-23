package Bootcamp;

public class Entregable_Cuatro {

	public static void main(String[] args) {
		TorreDeControl torre = new TorreDeControl();
		Avion avion = new Avion("F-35 Lightning II");
		Helicoptero_22 helicoptero = new Helicoptero_22("Boeing AH-64 Apache");
		Ovni ovni = new Ovni ("NaveEspacial626");
		Super_Man superman = new Super_Man ("Cripton");
		
		
		torre.PuedeAterrizar(avion);
		torre.PuedeAterrizar(helicoptero);
		torre.PuedeAterrizar(ovni);
		torre.PuedeAterrizar(superman);

	}

}
