package cliente;

import java.util.Scanner;
import unirio.Publicacoes;

/**
 *
 * @author Filipe-pc
 */
public class Cliente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int entrada = -1;

        System.out.println("Multiplicacao: " + multiplicacao(3, 12));

        Publicacoes pub = consultaPublicacaoPorNome("");
        for (int i = 0; i < pub.getPublicacoes().size(); i++) {

            System.out.println(pub.getPublicacoes().get(i).getId() + " - " + pub.getPublicacoes().get(i).getTitulo()
                    + " Ano de publicação: " + pub.getPublicacoes().get(i).getAnoPublicacao());
        }

        while (entrada != 0) {
           
            System.out.println("Digite 0 para sair ou o numero da publicação que deseja eliminar");
            entrada = scan.nextInt();
            removePublicacao(entrada);
        }
        
        pub = consultaPublicacaoPorNome("");
        for (int i = 0; i < pub.getPublicacoes().size(); i++) {

            System.out.println(pub.getPublicacoes().get(i).getTitulo()
                    + " Ano de publicação: " + pub.getPublicacoes().get(i).getAnoPublicacao());
        }

    }

    private static Publicacoes consultaPorNome(String nomePublicacao) {
        unirio.Servico_Service servico = new unirio.Servico_Service();

        unirio.Servico port = servico.getServicoPort();
        return port.consultaPorNome(nomePublicacao);
    }

    private static Publicacoes consultaPublicacaoPorNome(String nomePublicacao) {
        unirio.Servico_Service servico = new unirio.Servico_Service();

        unirio.Servico port = servico.getServicoPort();
        return port.consultaPublicacaoPorNome(nomePublicacao);
    }

    private static int multiplicacao(int inteiro1, int inteiro2) {
        unirio.Servico_Service service = new unirio.Servico_Service();
        unirio.Servico port = service.getServicoPort();
        return port.multiplicacao(inteiro1, inteiro2);
    }

    private static Boolean addPublicacao(int Id, String titulo, int paginaInicial, int paginaFinal, Integer anoPublicacao) {
        unirio.Servico_Service service = new unirio.Servico_Service();
        unirio.Servico port = service.getServicoPort();
        return port.addPublicacao(Id, titulo, paginaInicial, paginaFinal, anoPublicacao);
    }

    private static Boolean removePublicacao(int Id) {
        unirio.Servico_Service service = new unirio.Servico_Service();
        unirio.Servico port = service.getServicoPort();
        return port.removePublicacao(Id);
    }

}
