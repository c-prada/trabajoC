package circulo;

public class TestCirculo {

	public static void main(String[] args) {
       Circulo miCirculo = new Circulo();
       System.out.println(miCirculo.getRadio());
       miCirculo.setRadio(10);
       System.out.println(miCirculo.getRadio());
       System.out.println("El área del círculo es " + miCirculo.calcularSuperficie());
	   Circulo tuCirculo = new Circulo(miCirculo);
	   System.out.println("El aŕea del círculo es " + tuCirculo.calcularSuperficie());
	}
}
