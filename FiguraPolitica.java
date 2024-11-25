
package twitterdemo;

import java.util.*;

/**
 *
 * @author sistemas
 */
public class FiguraPolitica implements Subject{
    List <Observer> observers;
    String nombre;
    String usuario;

    public FiguraPolitica(String nombre, String usuario){
        observers = new ArrayList();
        this.nombre = nombre;
        this.usuario = usuario;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void tweet(String tweet){
        System.out.println("Nombre: '"+nombre +"', Tweet: '" + tweet +"'");
        notifySubscriber(tweet);
    }
    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifySubscriber(String tweet) {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(usuario,tweet);
        }
    }
    
}
