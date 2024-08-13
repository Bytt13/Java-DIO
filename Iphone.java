public class Iphone {

    public Iphone(){

    }

    public void ligar(String numero){
        System.out.println("ligando para " + numero);
    }

    public void atender(){
        System.out.println("a ligacao foi atendida");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("o correio de voz foi iniciado");
    }

    public void exibirPagina(String url){
        System.out.println("a pagina de url " + url + " esta sendo exibida");
    }

    public void adicionarNovaAba(){
        System.out.println("uma nova aba foi adicionada");
    }

    public void atualizarAba(){
        System.out.println("a pagina foi atualizada com sucesso");
    }

    public void tocar(){
        System.out.println("a musica esta tocando");
    }

    public void pausar(){
        System.out.println("a musica foi pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("a musica " + musica + " foi selecionada");
    }
}
