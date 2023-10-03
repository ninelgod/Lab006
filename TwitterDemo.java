package twitterdemo;

/**
 *
 * @author sistemas
 */
public class TwitterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraPolitica pCastillo = new FiguraPolitica("Pedro Castillo", "pCastillo");
        FiguraPolitica kFujimori = new FiguraPolitica("Keiko Fujimori", "kFujimori");
        
        Seguidor juan = new Seguidor ("Juan");
        Seguidor victor = new Seguidor ("Victor");
        Seguidor raquel = new Seguidor ("raquel");
        Seguidor miguel = new Seguidor ("miguel");
        Seguidor katy = new Seguidor ("katy");
        
        //REGISTRO DE SUSCRIPTORES PARA pCastillo
        pCastillo.addSubscriber(juan);
        pCastillo.addSubscriber(victor);
        pCastillo.addSubscriber(raquel);
        pCastillo.addSubscriber(miguel);
        pCastillo.addSubscriber(katy);
        
        //REGISTRO DE SUSCRIPTORES PARA kFujimori
        kFujimori.addSubscriber(juan);
        kFujimori.addSubscriber(victor);
        kFujimori.addSubscriber(raquel);
        kFujimori.addSubscriber(miguel);
        kFujimori.addSubscriber(katy);
        
        //Tweets
        pCastillo.tweet("Hola amigos!");
        System.out.println("");
        kFujimori.tweet("Soy inocente");
        System.out.println("");
        //Quitar suscriptor de pCastillo
        pCastillo.removeSubscriber(raquel);
        
        //Quitar suscriptor de kFujimori
        kFujimori.removeSubscriber(juan);
        
        //Tweet
        pCastillo.tweet("Permanezcan en casa Seguros");
        System.out.println("");
        kFujimori.tweet("Fraude de elecciones");
        System.out.println("");
        }
    }
    
