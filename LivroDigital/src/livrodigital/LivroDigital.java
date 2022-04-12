package livrodigital;

public class LivroDigital {
    private int paginas;
    private int paginaslidas;
    private String titulo;
    static int numlivros;
    
   public void setPaginas(int p){
       this.paginas=p;
   }
   
   public int getPaginas(){
       return paginas;
   }
   public void setTitulo(String t){
       this.titulo=t;
   }
   public String getTitulo(){
       return titulo;
   }

    public LivroDigital(int paginas, int paginaslidas, String titulo) {
        this.paginas = paginas;
        this.paginaslidas = paginaslidas;
        this.titulo = titulo;
        numlivros++;
    }

    public LivroDigital(String titulo) {
        this.titulo = titulo;
        numlivros++;
    }

    public int getPaginaslidas() {
        return paginaslidas;
    }

    public void setPaginaslidas(int paginaslidas) {
        this.paginaslidas = paginaslidas;
    }
   public  void verificarprocesso(){
       float p;
       p= (this.getPaginaslidas()*100)/this.getPaginas();
       System.out.println("O leitor ja leu cerca de " +p+ "% das paginas do livro");
   }
   public void status(){
       System.out.println("Titulo: " +this.getTitulo());
       System.out.println("O livro possui " +this.getPaginas() +" paginas");
       
   }
}
