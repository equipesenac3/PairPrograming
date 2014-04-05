package jppairprograming;


public class Exercicio3 {
	
	private double raio;
	private double altura;
	
	public Exercicio3(double raio, double altura){
		calculaVolume(raio,altura);
	}

	public void calculaVolume(double raio, double altura) {
		double volume = 0;
		volume = (3.1416 * (raio*raio)) * altura;
		System.out.println("O volume total do Cilindro �: " + volume);
	}

}
