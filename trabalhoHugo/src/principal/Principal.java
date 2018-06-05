package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public Principal(File f) throws FileNotFoundException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()== true){
            System.out.println(sc.nextLine());
            //byte nome = sc.nextByte();
            //JOptionPane.showMessageDialog(null, nome);
        }
    }
}
