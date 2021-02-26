package herenciapolimorfismo;

public class Triangulo extends FiguraPlana 
{

	public Triangulo(double base, double altura) 
	{
		super(base, altura);
	}

	public double area() 
	{
		return (base*altura)/2;
	}

}