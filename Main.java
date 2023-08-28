public class Main{

  public static void main(String []args){
        
    String filepath = ("Promise.wav");
    Proceso2 p = new Proceso2();
    Proceso1 thread1 = new Proceso1();
     Thread thread2 = new Thread (new Proceso2());
    thread1.start();
    thread2.start();
    
    p.playMusic(filepath);
    }
}