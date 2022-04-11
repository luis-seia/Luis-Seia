
package biblioteca;


public class Emprestimo{
    public static void main(String[] args) {
        
        Livro  l1=new Livro();
        System.out.println("======Informacoes do livro========");
        l1.operacoes();
        
        Pessoa p1=new Pessoa();
        System.out.println("=======Informmacoes da pessoa======");
        p1.inserir();
        System.out.println(l1.toString());
        p1.imprimir();
        
        
        
                
    }
    
    
    
    
    
        
        
    
    
}
