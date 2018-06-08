
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
        List<Integer> vertAlca = new ArrayList<Integer>(0);
        int i=0;
        
        vertices.add(partida);
        vertAlca.add(partida);
        while(vertices.size() == 0){
            i = partida;
            vertices.remove(0);
            for(int j=0 ; j< matriz.length; j++){
               if(matriz[i][j] != 0){
                   vertices.add(j);
                   vertAlca.add(j);
               }
            }
        }
        System.out.println(vertices);
        for(int j=0; j< vertices.size(); j++){
            visitados[j] = vertices.get(j);
        }
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
        List<Integer> vertices = new ArrayList<Integer>(0);
        List<Integer> vertAlca = new ArrayList<Integer>(0);
        int i=0;
        
        vertices.add(partida);
        vertAlca.add(partida);
        while(vertices.size() == 0){
            i = partida;
            vertices.remove(vertices.size()-1);
            for(int j=0 ; j< matriz.length; j++){
               if(matriz[i][j] != 0){
                   vertices.add(j);
                   vertAlca.add(j);
               }
            }
        }
        System.out.println(vertices);
        for(int j=0; j< vertices.size(); j++){
            visitados[j] = vertices.get(j);
        }
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
