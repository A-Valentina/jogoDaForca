public class ControladorDeErros implements Cloneable 
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		// verifica se qtdMax fornecida não é positiva, lançando
		// uma exceção.
		// armazena qtdMax fornecida em this.qtdMax
		
		if (qtdMax <= 0)
		 throw new Exception ("A quantidade máxima fornecida não é positiva! ");
		
	    this.qtdMax = qtdMax; // armazena a quantidade máxima recebida por parâmetro
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
        
        if (this.qtdErr == this.qtdMax)
			throw new Exception ("A quantidade de erros já atingiu o máximo permitido!");

		this.qtdErr++; // else

    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // retorna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
        
        if (this.qtdErr == this.qtdMax)
		 return true;

	    return false; // else
	
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }


    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        
        if (obj == null)
		       return false;

		       if (obj.getClass() != this.getClass()) // Verifica se as classes não são iguais
		       return false;
		       
		       ControladorDeErros outro = (ControladorDeErros) obj;
		       
		       if (this.qtdErr != outro.qtdErr)  // Verifica se o atributo qtdErr é igual entre o chamante(this) e o chamado(parametro).
		        return false;
		       
		       if (this.qtdMax != outro.qtdMax) // Verifica se o atributo qtdMax é igual entre o chamante(this) e o chamado(parametro).
		        return false;
		       
		       return true;

    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        
        int ret = 1; // numero natural qualquer > 0
        
         ret = 7 * ret + (new Integer (this.qtdMax)).hashCode();
         ret = 7 * ret + (new Integer (this.qtdErr)).hashCode();
        
        if (ret < 0)
         ret = -ret;
         
        return ret;
        
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
        
        if(c == null)
		  throw new Exception("Parâmetro nulo para construtor de cópia");

		    this.qtdMax = c.qtdMax; // O atributo qtdMax do construtor de cópia, recebe o atributo qtdMax do objeto passado por parâmetro.
			this.qtdErr = c.qtdErr; // O atributo qtdErr do construtor de cópia, recebe o atributo qtdMax do objeto passado por parâmetro.
    }

    public Object clone ()
    {
        // retornar uma cópia de this
        
        ControladorDeErros ret = null; 
        // deve-se declarar fora do try, pois não reconhece algo instanciado dentro do try
		       try {
		         ret = new ControladorDeErros(this);
			   } catch(Exception erro)
			   {
				   } // vazio pois nunca dara erro, pois o this sempre sera um parametro valido

       return ret;
    }
}
