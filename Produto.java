 public class Produto {
	 
	 private int codigo;
	 private String nome;
	 private float valor;
	 private int quantidade;
	 
	 	 
	 public Produto (int codigo, String nome, float valor, int quantidade) {
		 
		 this.codigo = codigo;
		 this.nome = nome;
		 this.valor = valor;
		 this.quantidade  = quantidade;
		 		 
	 }
	 
  


		public int getCodigo () {    
	    	       return codigo;  	 
	     }

	     public void setCodigo (int codigo) {
	    	       this.codigo = codigo;
	     }
	 
	  
	     public String getNome () {
	    	        return nome;
	    	 
	     }
	     
	     public void setNome (String nome) {
	    	       this.nome = nome;
	     }
	  
	     public float getValor () {
	    	       return valor;
	    	 
	     }
	     	     
	     public void setValor (float valor) {
	    	      this.valor = valor;
	    	 
	     }
	    
	     public int getQuantidade () {
	    	     return quantidade;
	    	 }
	     
	     public  void setQuantidade (int quantidade) {
	    	      this.quantidade = quantidade;
	     }
	     
	  
	     public String toString  () {
	    	     return "Produto [codigo="+ codigo +",  nome="+ nome +", valor="+valor+", quantidade="+quantidade+"]";
	    	 
	     }
	     
	     
	     
	     public void removerEstoque (int quantidade) {
	    	 
	    	 
	     }
	
	 
  } 