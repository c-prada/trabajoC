package herenciapolimorfismo;

public class Rectangulo extends FiguraPlana {

	public Rectangulo(double base, double altura) 
	{
		/*Llama al constructor de la superclase y tiene que ser la
		 * primera línea del constructor de la subclase
		 */
		super(base,altura);	
	}

	public double area()
	{
	  return base * altura;
	}
}