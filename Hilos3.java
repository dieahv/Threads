import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Hilos3 extends Thread{
	
	
        public void run()
        {
            InputStream music;
            try
            {
                Scanner scanner = new Scanner(System.in);
                music = new FileInputStream(new File("C:\\Users\\Windows 10\\Documents\\NetBeansProjects\\Hilos3\\src\\hilos3\\CAOS_ Doble_Porción_&_The_Colombians_(VideoClip)_Juegos de Azar.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }

    }
