package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    
    static  File f ;

    public static void setFile(File f) throws FileNotFoundException {
        
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      //  this.f = f;
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
            JOptionPane.showMessageDialog(null, "deu");
        }
    }
}
