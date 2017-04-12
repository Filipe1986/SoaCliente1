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
        
        System.out.println("Resultado add " + addPublicacao(9, "Artigo 9", 3, 30, 1990));
        
        

        Publicacoes pub = consultaPublicacaoPorNome("Artigo 9");
        for (int i = 0; i < pub.getPublicacoes().size(); i++) {
            System.out.println(pub.getPublicacoes().get(i).getTitulo() 
                    +" Ano de publicação: "+ pub.getPublicacoes().get(i).getAnoPublicacao());
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

    private static Boolean addPublicacao(int Id, String titulo, int paginaInicial, int paginaFinal,Integer  anoPublicacao) {
       unirio.Servico_Service service = new unirio.Servico_Service();
        unirio.Servico port = service.getServicoPort();
        return port.addPublicacao( Id,  titulo, paginaInicial, paginaFinal, anoPublicacao);
    }

}