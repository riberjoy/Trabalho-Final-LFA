package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javafx.beans.binding.Bindings;


public class Principal {
    
    static int tam;
    static float[][] matriz = new float[tam][tam];
    
    public Principal(File f) throws FileNotFoundException {
        List<Integer> v1 = new ArrayList<Integer>(0);  
        List<Integer> v2 = new ArrayList<Integer>(0);
        List<Float> peso = new ArrayList<Float>(0);
        Scanner sc = new Scanner(f);
        int aux = 0, cont=0;

        //Passagem de valores do arquivo para os vetores.
        do{
            v1.add(Integer.parseInt(sc.next()));
            v2.add(Integer.parseInt(sc.next()));
            peso.add(Float.parseFloat(sc.next()));
            cont++; //quantidade de arestas
        }while(sc.hasNextLine());
        
        sc.close(); //Fechamento do arquivo.
        
        if(Collections.max(v1)> Collections.max(v2)){ //Busca do vertice de maior valor
            aux=Collections.max(v1);
        }else{
            aux = Collections.max(v2);
        }  
        Principal.setMatriz(v1, v2, peso, cont, aux);
    }
    
    
    public static int getTam(){
        return tam;
    } 

    public static float[][] setMatriz( List<Integer> v1, List<Integer> v2,  List<Float> peso, int cont, int aux){
        float[][] auxM = new float[aux][aux];
        
        for(int i=0; i<cont; i++){
            auxM[v1.get(i)-1][v2.get(i)-1]= peso.get(i);
            auxM[v2.get(i)-1][v1.get(i)-1]= peso.get(i);
        }
            
        for(int i=0; i<aux; i++){
            for(int j=0; j<aux; j++){
                System.out.print(auxM[i][j] + "\t");
            }
            System.out.println("");
        }
        return Principal.matriz = auxM;
    } 
    
    public static float[][] getMatriz(){
        return matriz;
    }  
}
