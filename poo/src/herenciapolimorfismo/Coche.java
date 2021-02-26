package herenciapolimorfismo;

public class Coche extends Vehiculo
{
	private int pasajeros;
	
	public Coche (int ruedas, int autonomia, int pasajeros)
	{
		super(ruedas,autonomia);
		this.pasajeros = pasajeros;
	}
    //////////////////////////////////////////
	public int getPasajeros() 
	{
		return pasajeros;
	}
    ///////////////////////////////////////////////
	public void setPasajeros(int pasajeros) 
	{
		this.pasajeros = pasajeros;
	}
	/////////////////////////////////////////////////	
	public void verDatos(){
		//Reutilizamos el código de vehículo
		super.verDatos();
		System.out.println("Pasajeros: " + pasajeros );
	}
}
