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
	System.out.println("Seu imc é " + imc);
	
	if (imc < 18.4) {
		System.out.println("Seu índice corporal está abaixo do ideal. Isso pode ser apenas uma característica pessoal, mas também pode ser um sinal de desnutrição ou de algum problema de saúde. Caso esteja perdendo peso sem motivo aparente, procure um médico");
	} 
	else if ((imc >= 18.5) && (imc <=24.9)) {
		System.out.println("Parabéns, você está com o peso normal. Recomendamos que mantenha hábitos saudáveis em seu dia a dia. Especialistas sugerem ingerir de 4 a 5 porções diárias de frutas, verduras e legumes, além da prática de exercícios físicos.");
		}
		else if ((imc >= 25.0) && (imc <=29.9)) {
			System.out.println("De acordo com seu IMC, você possui sobrepeso. Atenção! Alguns quilos a mais já são suficientes para que algumas pessoas desenvolvam doenças associadas, como diabetes e hipertensão. É importante rever seus hábitos. ");
		}
			else if (imc >= 30.0 ){
				System.out.println("De acordo com seu IMC, você possui obesidade. O excesso de peso é fator de risco para desenvolvimento de outros problemas de saúde. A boa notícia é que uma pequena perda de peso já traz benefícios à saúde. Procure um médico para definir o tratamento mais adequado para você.");
			}
			else {
				System.out.println("Você possui obesidade grave. Ao atingir este nível de IMC, o risco de doenças associadas é muito alto. Busque ajuda de um profissional de saúde; não perca tempo.");
			}
	
		
}
}