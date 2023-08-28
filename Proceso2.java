import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;


public class Proceso2 implements Runnable{

  @Override
  public void run(){

  }

   public static void playMusic(String location){
            
            try
            {

              File musica = new File (location);   
              
              if(musica.exists()){
                  AudioInputStream audioInput = AudioSystem.getAudioInputStream(musica);
                  Clip clip = AudioSystem.getClip();
                  clip.open(audioInput);
                  clip.start();
              }
              else{
                  System.out.println("No se encuentra el archivo");
              }

            }
            catch(Exception e)
            {
                System.out.println(e);

            }
         }
}