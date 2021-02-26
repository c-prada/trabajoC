package cuenta;

import java.util.Scanner;

public class Cuenta {

    //Declaramos los atributos
	private String numCuenta;
	private String nombreTitular;
	private double saldo;
	private double tipoInteres;
	
	//Creamos el constructor
	public Cuenta(String numCuenta, String nombreTitular, double saldo, double tipoInteres) {
		this.numCuenta = numCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}
	
	//Creamos otro constructor en el que, en vez de pasar los paraḿetros podemos introducirlos por teclado
	public Cuenta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el número de cuenta:");
		numCuenta = entrada.nextLine();
		System.out.println("Introduzca el titular de la cuenta:");
		nombreTitular = entrada.nextLine();
		System.out.println("Introduzca el saldo inicial:");
		saldo = entrada.nextDouble();
		System.out.println("Introduzca el tipo de interés:");
		tipoInteres = entrada.nextDouble();
		}
	
	//Creamos un constructor para copiar cualquier objeto de tipo cuenta
	public Cuenta(Cuenta copia) {
		numCuenta = copia.numCuenta;
		nombreTitular = copia.nombreTitular;
		saldo = copia.saldo;
		tipoInteres = copia.tipoInteres;
	}
	
	//Creamos un metodo que vea los datos
	public void verDatos() {
		System.out.println("Número de cuenta: " + numCuenta);
		System.out.println("Titular de la cuenta: " + nombreTitular);
		System.out.println("Saldo actual: " + saldo);
		System.out.println("Tipo de interes: " + tipoInteres);
	}

	//Creamos los métodos set y get
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	//Creamos el método ingreso
	public void ingreso(double cantidad) {
		if (cantidad>0) {
			saldo = saldo + cantidad;
		}
		else {
			System.out.println("La cantidad tiene que ser mayor que 0");
		}
	}
	
	public void reintegro(double cantidad) {
		//Comprobamos que la cantidad sea mayor que 0
		if (cantidad<=0) {
			System.out.println("La cantidad debe ser mayor que 0");
		}
		//Comprobamos que la cantidad mno es mayor al saldo
		else if (cantidad > saldo){
			System.out.println("ERROR. La cantidad supera el saldo");
		}
		else {
			//Actualizamos el saldo
			saldo = saldo - cantidad;
		}
	}
	
}
