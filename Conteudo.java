public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }
}
