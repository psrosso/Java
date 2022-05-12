import java.util.Scanner;
public class Exe_1 {
	
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	float peso, altura;
	float imc;
	
	
	System.out.println("Digite sua altura (Ex: 1,64)");
	altura = ler.nextFloat();
	System.out.println("Digite seu peso");
	peso = ler.nextFloat();
	
	imc = peso / (altura * altura);
	System.out.println("Seu imc � " + imc);
	
	if (imc < 18.4) {
		System.out.println("Seu �ndice corporal est� abaixo do ideal. Isso pode ser apenas uma caracter�stica pessoal, mas tamb�m pode ser um sinal de desnutri��o ou de algum problema de sa�de. Caso esteja perdendo peso sem motivo aparente, procure um m�dico");
	} 
	else if ((imc >= 18.5) && (imc <=24.9)) {
		System.out.println("Parab�ns, voc� est� com o peso normal. Recomendamos que mantenha h�bitos saud�veis em seu dia a dia. Especialistas sugerem ingerir de 4 a 5 por��es di�rias de frutas, verduras e legumes, al�m da pr�tica de exerc�cios f�sicos.");
		}
		else if ((imc >= 25.0) && (imc <=29.9)) {
			System.out.println("De acordo com seu IMC, voc� possui sobrepeso. Aten��o! Alguns quilos a mais j� s�o suficientes para que algumas pessoas desenvolvam doen�as associadas, como diabetes e hipertens�o. � importante rever seus h�bitos. ");
		}
			else if (imc >= 30.0 ){
				System.out.println("De acordo com seu IMC, voc� possui obesidade. O excesso de peso � fator de risco para desenvolvimento de outros problemas de sa�de. A boa not�cia � que uma pequena perda de peso j� traz benef�cios � sa�de. Procure um m�dico para definir o tratamento mais adequado para voc�.");
			}
			else {
				System.out.println("Voc� possui obesidade grave. Ao atingir este n�vel de IMC, o risco de doen�as associadas � muito alto. Busque ajuda de um profissional de sa�de; n�o perca tempo.");
			}
	
		
}
}