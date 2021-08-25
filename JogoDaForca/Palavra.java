public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
		// verifica se o texto recebido � nulo ou ent�o vazio,
		// ou seja, sem nenhum caractere, lan�ando exce��o.
		if (texto == null)
			throw new Exception ("Palavra ausente");
		// armazena o texto recebido em this.texto.
		this.texto = texto;
    }
     
    public int getQuantidade (char letra) throws Exception
    {
		if(Character.isWhitespace(letra))
			throw new Exception ("LETRA AUSENTE");
		
		// percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
		
		int qtd = 0;
		
		for(int i = 0; i < this.texto.length(); i++ ){
			if(this.texto.charAt(i) == letra)
				qtd++;
		}    
		return qtd;
    }
    
    public int getTamanho ()
    {
        return this.texto.length();
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lan�ar excecao caso nao encontre em this.texto
        // a I�zima apari��o da letra fornecida.
        
        if(Character.isWhitespace(letra))
			throw new Exception ("LETRA AUSENTE");
			
	   int achou = -1;
	   int posicao = 0;
	   
	   for (int y = 0; y < texto.length(); y++) { // percorre o texto
		  if(this.texto.charAt(y) == letra) {  // verifica se naquela posicao y = letra
		    achou++;  // se y for igual a letra, incrementa a variavel achou
			 if (achou == i) { 
				posicao = y;
				break; 
			 }	
		  }
	   }
	   
		if (achou == -1)
		 throw new Exception ("LETRA AUSENTE!");
		 
		return posicao;
    }

   

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        if(this == obj) 
			return true;
        
        if(obj == null) 
			return false;
        
        if(this.getClass() != obj.getClass())  // verifica se as classes n�o s�o iguais
			return false;
        
        Palavra plv = (Palavra)obj;  // Cria um novo objeto "plv" da classe Palavra, que recebe o obj passado por par�metrso
        
        if(this.texto != plv.texto)  // Verifica se as palavras s�o iguais
			return false;
        
        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 10;
        
        ret = 11 * ret + new String (this.texto).hashCode(); // c�lculo do hashCode.
        
        if(ret < 0) ret =- ret; // Transforma em positivo caso a vari�vel ret seja negativa.
        
        return ret;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
