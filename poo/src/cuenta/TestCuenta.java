package cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//Construimos un objeto de tipo cuenta
		Cuenta cuenta1 = new Cuenta("ES34/4602", "María Gomez", 100, 0.01);
		
		//Comprobamos que funciona
        System.out.println("El saldo actual es " + cuenta1.getSaldo());
        
        //Ingresamos 50 euros
        cuenta1.ingreso(50);
        System.out.println("El saldo actual es " + cuenta1.getSaldo());
        
        //Sacamos 25 euros
        cuenta1.reintegro(25);
        System.out.println("El saldo actual es " + cuenta1.getSaldo());
        
        //Intentamos retirar una cantidad negativa
        cuenta1.reintegro(-20);
        
        //Intentamos retirar una cantidad mayor que el saldo
        cuenta1.reintegro(130);
        
        //Creamos una segunda cuenta introduciendo los datos por teclado
        Cuenta cuenta2 = new Cuenta();
        
        //Mostramos información de la nueva cuenta
        cuenta2.verDatos();
        
        //Hacemos una copia de cuenta2
        Cuenta cuenta3 = new Cuenta(cuenta2);
        
        //Mostramos los datos de la cuenta3
        cuenta3.verDatos();
	}

}
