
package principal;

import java.util.ArrayList;
import java.util.List;

class BFS{
    int i, partida;
    float[][] matriz = new float[i][i];
    int[] visitados = new int[i];

    public BFS( float[][] matriz, int partida){
        this.matriz = matriz;
        this.partida = partida;
    }
    
    public int[] getVisitados() {
        List<Integer> vertices = new ArrayList<Integer>(0);
        
        vertices.add(partida);
        //Como marcar como visitado?
//        while(vertices.size() == 0){
//            
//        }
        
        
        
        return visitados;
    }   
}
class DFS{
    int i, partida;
    float[][] matriz = new float[i][i];
    int[] visitados = new int[i];

    public DFS( float[][] matriz, int partida){
        this.matriz = matriz;
        this.partida = partida;
    }
    
    public int[] getVisitados() {
        
        
        
        return visitados;
    } 
}
class Kruskal{
    
}
class Prim{
    int i;
    float[][] matriz = new float[i][i];
    int[] visitados = new int[i];

    public Prim( float[][] matriz){
        this.matriz = matriz;
    }
    
    public int[] getVisitados() {
        
        
        
        return visitados;
    } 
}



public class AlgoritmosGrafo {

    //BFS
    
    
  
}
