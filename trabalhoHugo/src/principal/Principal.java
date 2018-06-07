package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    
    int i,j;
    float[][] matriz = new float[i][j];
    
    public Principal(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        int cont=1, v1, v2, maxTam=100;
        int[] auxNum = new int[maxTam];
        do{        
           sc.next();
           cont++;
           if(cont%2==0){
               auxNum[cont-1] = Integer.parseInt(sc.next());
           }
          /*if(cont==2){
               aux = cont-2; 
               auxNum[aux]= Float.parseFloat(sc.next());
               System.out.println(auxNum[aux]);
           }else{
               if(cont==3){
                   aux = cont-3; 
                   auxNum[aux]= Float.parseFloat(sc.next());
                    System.out.println(auxNum[aux]);
                    System.out.println(auxNum.length);
               }else{
                   if(cont==4){
                       cont=0;
                   }
               }
           }*/
          
          
        }while(sc.hasNextLine()==true);
        System.out.println(cont);
        for(int k =0; k <auxNum.length;k++){
            System.out.println(auxNum[k]);
        }
        
        sc.close();
    }

    public float[][] getMatriz() {
        return matriz;
    }

    public void setMatriz( int i, int j) {
        this.matriz = new float[i][j];
    }
    
}
