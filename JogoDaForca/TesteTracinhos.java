 public class TesteTracinhos {
	
	public static void main (String[] args) {

		try {

		 Tracinhos a = new Tracinhos (5);		// Instancia um objeto "a" da classe Tracinhos com qtd de 5 tracinhos
		 System.out.println("Palavra a: " +a);
		 a.revele(0, 'N');		// Revela a primeira letra
		 a.revele(1,'A');		// Revela a segunda letra
		 a.revele(2,'T');		// Revela a terceira letra
		 a.revele(3,'A');		// Revela a quarta letra
		 a.revele(4,'L');		// Revela a quinta letra
		 System.out.println();
		 System.out.println("Revelada.: " +a);		// Exibe a palavra com todas as letras reveladas
		 System.out.println();
		 System.out.println("Ainda possui tracinho? " +a.isAindaComTracinhos());		// Verifica se a palavra ainda possui tracinho
		
		 System.out.println();System.out.println();
		 
		 Tracinhos b = new Tracinhos (4);		// Instancia um objeto "b" da classe Tracinhos com qtd de 4 tracinhos
		 System.out.println("Palavra b: " +b);
		 b.revele(0, 'A');		// Revela a primeira letra
		 b.revele(1,'M');		// Revela a segunda letra
		 b.revele(2,'O');		// Revela a terceira letra
		 System.out.println();
		 System.out.println("Revelada.: " +b);	// Exibe a palavra com todas as letras reveladas
		 System.out.println();
		 System.out.println("Ainda possui tracinho? " +b.isAindaComTracinhos());	// Exibe a palavra com todas as letras reveladas
		 System.out.println();System.out.println();
		 
		 System.out.println("Verificando se as palavras A e B sao iguais: " +a.equals(b));	// Verificamos se "a" = "b" através do método equals
		 System.out.println();System.out.println();
		 
		 Tracinhos c = (Tracinhos) a.clone();	// Cria objeto "c" da classe Tracinhos através do método clone, clonando "a"
		 System.out.println("Clonando a palavra A em C: "+c);
		 System.out.println();System.out.println();
		 
		 System.out.println("Calculo Hashcode da palavra A: " +a.hashCode());	// Calculo do Hascode de "a"
		 System.out.println();
		 System.out.println("Calculo Hashcode da palavra B: " +b.hashCode());	// Calculo do Hascode de "b"
		 System.out.println();
		 System.out.println("Calculo Hashcode da palavra C: " +c.hashCode());	// Calculo do Hascode de "c" que deverá ser igual o de "a"
		}
		
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
 }
