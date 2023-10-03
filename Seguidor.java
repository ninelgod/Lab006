
package twitterdemo;

/**
 *
 * @author sistemas
 */
public class Seguidor implements Observer{
    public String nombre;
    
    public Seguidor(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void update(String usuario, String tweet) {
        System.out.println("'"+nombre +"' notificacion recibida del usuario '#"+ usuario +
                "', Tweet: '"+ tweet+"'");
    }
    
}
