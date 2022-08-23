package Bootcamp;

public class TorreDeControl {
	
	public void PuedeAterrizar(Volador objetoVolador) {		
if (Aterrizable.class.isAssignableFrom(objetoVolador.getClass())) {
			System.out.println(objetoVolador.Nombre + " Puede aterrizar");
		
			if(objetoVolador.getClass().toString().contains("Avion")) 
			{
				var objeto = (Avion) objetoVolador;
				objeto.Aterrizar();
			}else {
				var objeto = (Helicoptero_22) objetoVolador;
				objeto.Aterrizar();
			}			
			
		}else {
			System.out.println(objetoVolador.Nombre + " no puede aterrizar");
		}
	}
}
