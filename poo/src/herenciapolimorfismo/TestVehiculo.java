package herenciapolimorfismo;

public class TestVehiculo 
{

	public static void main(String[] args) 
	{
	    //Creamos un camión
		Camion camion1 = new Camion(8,500,2000);
		camion1.verDatos();
		//Creamos un coche
		Coche coche1 = new Coche(4,600,5);
		coche1.verDatos();
	}

}
