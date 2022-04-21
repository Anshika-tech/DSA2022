//implementation of graph by list.
import java.util.ArrayList;
public class Graph {
    static void addEdge(ArrayList<ArrayList<Integer>>obj,int x,int y){
        obj.get(x).add(y);
        obj.get(y).add(x);
    }
    static void printGraph(ArrayList<ArrayList<Integer>>obj){
        for(int i=0;i<obj.size();i++){
            System.out.println("vertex connected to "+ i);
            for(int j=0;j<obj.get(i).size();j++){
                System.out.print(obj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int vertex=5;
        ArrayList<ArrayList<Integer>>obj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertex;i++){
            obj.add(new ArrayList<>());
        }
        addEdge(obj,0,1);
        addEdge(obj,1,3);
        addEdge(obj,1,2);
        addEdge(obj,2,3);
        addEdge(obj,0,3);
        addEdge(obj,0,4);
        addEdge(obj,4,3);
        printGraph(obj);
    }
}
