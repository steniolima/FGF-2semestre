/**
               Tarefa 03 � GQ2
            Entregar at� 13/10/2016
 Com a ajuda da ferramenta Eclipse, realize os seguintes passos.

? Crie um novo Projeto (tipo Java Project) chamado PTarefa03SeuNome.
? Crie uma nova classe Produto (desmarque a op��o main).

o Adicione � classe Produto os seguintes atributos (todos com o
modificador private)
   ? int codigo;
   ? String nome;
   ? float valor;
   ? int quantidade.
o Adicione � classe Produto os dois m�todos construtores abaixo:
  ? public Produto();
  ? public Produto(int c�digo, String nome, float valor,
int quantidade).

? Crie uma nova classe chamada MainProduto (marque a op��o main).

o Dentro do m�todo main, instancie uma vari�vel (objeto) p do tipo
Produto usando um dos construtores criados.


o Modifique a classe Produto para permitir que a classe MainProduto
tenha acesso aos seus atributos.

o Em seguida, imprima todos os atributos do objeto p.

o Acrescente um m�todo na classe Produto para dar baixa no estoque
sempre que uma quantidade do produto seja vendida. Por exemplo,
supondo que um produto tenha o valor 20 para o atributo quantidade,
ao dar baixa em 5 unidades o atributo passaria a valer 15.

? O m�todo deve ter a seguinte assinatura:
? public removerEstoque (int quantidade).

o Teste o novo m�todo criado.
o Exporte o seu projeto com a extens�o .zip (conforme nomenclatura abaixo) e
entregue no Portal (Tarefa 03 � GQ2).

*/





package PTarefa03;


public class MainProduto  {
	

public static void main (String [] args) {
		  
	    Produto p = new Produto();
	    System.out.println (p.getNome());
	    
	   
		       
     }
	
   
		
}