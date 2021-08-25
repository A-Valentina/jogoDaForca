public class TesteErros {

	public static void main (String[] args) {

  int qtdErro = 0;
		try
		{

			ControladorDeErros a = new ControladorDeErros(5); //teste ControladorDeErros
			System.out.println("Quantidade max de erros A: "+a);
			
			a.registreUmErro(); //teste registreUmErro
			a.registreUmErro(); 
		    System.out.println("Voce errou duas vezes! Erros: "+a); // Registro de 2 erros em "a" para teste
		    
			System.out.println();
			
			ControladorDeErros b = new ControladorDeErros(1); // instancia um novo objeto da classe Controlador de Erros para teste
			System.out.println("Quantidade max de erros B: "+b);
			b.registreUmErro();
			System.out.println("Voce errou! Erros: "+b);
			
			System.out.println();

			if (a.isAtingidoMaximoDeErros()) {  // teste isAtingidoMaximoDeErros
					System.out.println("A, atingiu o limite de erros");
				}
			else {
				 System.out.println("A, nao atingiu o limite de erros");
			}
			System.out.println();
			
			if (b.isAtingidoMaximoDeErros()) { // teste isAtingidoMaximoDeErros
					System.out.println("B, atingiu o limite de erros");
				}
			else {
				System.out.println("B, nao atingiu o limite de erros");
			}
			
			System.out.println();System.out.println();
			System.out.println("Verificando se A e B sao iguais: " +a.equals(b));	// Verificamos se "a" = "b" através do método equals
																					// Não serão iguais pois não tiveram a msm qtd de erros
			
			System.out.println();System.out.println();
			System.out.println("Calculo Hashcode de A: " +a.hashCode());	// Calculo do Hascode de "a"
			System.out.println();
			System.out.println("Calculo Hashcode de B: " +b.hashCode());	// Calculo do Hascode de "b"
			
			System.out.println();System.out.println();
			ControladorDeErros c = (ControladorDeErros) a.clone();	// Clonando A em C
			System.out.println("Clonando A em C: "+c);
			System.out.println();
			System.out.println("Calculo Hashcode de C: " +c.hashCode());	// Calculo do Hascode de "c" que deve ser o mesmo de "a"

		} catch(Exception erro)
		{}

		}
	}
