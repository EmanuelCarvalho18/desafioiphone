// Interface para o Reprodutor Musical
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface para o Aparelho Telefônico
public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que representa um iPhone que implementa os papéis
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementações dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementações dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.ligar();
        iphone.tocar();
        iphone.exibirPagina();
    }
}
