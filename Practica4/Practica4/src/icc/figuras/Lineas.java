package icc.figuras;
import icc.colors.Colors;
//Clase para hacer líneas epicardas
public class Lineas {
    
    //Método para tener líneas en la terminal y mantenerla visualmente organizada
    public void Epica(){
        Colors.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-",Colors.CYAN + Colors.HIGH_INTENSITY); 
    }
    /*Mismo método que el anterior, pero con un println (Para que el [java] de la terminal
    no se vea raro)*/
    public void EpicaLn(){
        System.out.println();
        Colors.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-",Colors.CYAN +Colors.HIGH_INTENSITY); 
    }
}