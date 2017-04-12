package cliente;

import unirio.Publicacoes;



/**
 *
 * @author Filipe-pc
 */
public class Cliente {

    public static void main(String[] args) {
        //unirio.Publicacoes pub = consultaPorNome("artigo");
        System.out.println("Multiplicacao: " + multiplicacao(3, 12));

        Publicacoes pub = consultaPublicacaoPorNome("Artigo 1");
        for (int i = 0; i < pub.getPublicacoes().size(); i++) {
            System.out.println(pub.getPublicacoes().get(i).getTitulo());
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

}