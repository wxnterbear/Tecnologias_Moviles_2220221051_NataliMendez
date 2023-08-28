
import java.util.*;


public class Proceso1 extends Thread{

  @Override
  public void run(){
    
  
    Scanner leer_consola = new Scanner(System.in);
    String a = "";
    String b = "";
    String c = "";

    
    System.out.println("");
    System.out.print("¿Cuál es tu nombre?: ");
    a=leer_consola.nextLine();

    System.out.println("");
    System.out.print("¿En qué semestre vas?: ");
    b=leer_consola.nextLine();

    System.out.println("");
    System.out.print("¿Qué carrera estudias?: ");
    c=leer_consola.nextLine();    

    System.out.println("");
    System.out.print("Tu nombre es:  " + a + ", vas en " +b+ " semestre y cursas la carrera de " + c + ".");
  
  }


}