import java.util.Scanner;
public class Exe_1 {
	
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	float Peso, altura;
	float imc;
	
	
	System.out.println("Digite sua altura");
	altura = ler.nextFloat();
	System.out.println("Digite seu peso");
	Peso = ler.nextFloat();
	
	imc = Peso / (altura * altura);
	System.out.println("Seu imc � " + imc);
	
	if (imc < 18.4) {
		System.out.println("Seu �ndice corporal est� abaixo do normal");
	} 
	else if ((imc >= 18.5) && (imc <=24.9)) {
		System.out.println("Seu �ndice corporal est� normal");
		}
		else if ((imc >= 25.0) && (imc <=29.9)) {
			System.out.println("Seu �ndice corporal acima do normal");
		}
			else if (imc >= 30.0 ){
				System.out.println("Seu �ndice corporal est� normal");
			}
			else {
				System.out.println("Voc� possui obesidade grave");
			}
	
		
}
}