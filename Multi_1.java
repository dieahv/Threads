import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Multi_1 extends Thread{
    
    public void run (){
        int num_1 = 0;
        int num_2 = 0;
        int res = 0;
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");    
		num_1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		num_2 = scan.nextInt();
		
		res = num_1*num_2;
		System.out.println("La multiplicación es " + num_1 + " * " + num_2 + " = " + res);
    }
}
