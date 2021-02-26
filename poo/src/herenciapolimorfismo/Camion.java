package herenciapolimorfismo;

public class Camion extends Vehiculo
{
    private int limCarga;
     
    public Camion (int ruedas, int autonomia, int limCarga)
 	{
 		super(ruedas,autonomia);
 		this.limCarga = limCarga;
 	}
    /////////////////////////////////////////////////////7
	public int getLimCarga() 
	{
		return limCarga;
	}
    ////////////////////////////////////////////////////
	public void setLimCarga(int limCarga) 
	{
		this.limCarga = limCarga;
	}

	/////////////////////////////////////////////////	
 	public void verDatos()
 	{
 		super.verDatos();
 		System.out.println("Carga: " + limCarga);
 	}
 
}
