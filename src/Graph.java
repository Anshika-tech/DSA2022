//implementation of graph by list.
/*import java.util.ArrayList;
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
}*/
//Breadth first search.
/*import java.util.*;
public class Graph{
    private int V;
    private LinkedList<Integer> adj[];
     public Graph(int v){
         V=v;
         adj=new LinkedList[v];
         for(int i=0;i<v;i++){
             adj[i]=new LinkedList();
         }
     }
     void addedge(int u,int v){
         adj[u].add(v);
     }
     void BFS(int s){
         boolean visited[]=new boolean[V];
         visited[s]=true;
         LinkedList<Integer> queue=new LinkedList<Integer>();
         queue.add(s);
         while(queue.size()!=0){
            s=queue.poll();
             System.out.println(s+" ");
             Iterator<Integer>i=adj[s].listIterator();
             while(i.hasNext()){
                 int n=i.next();
                 if(!visited[n]){
                     visited[n]=true;
                     queue.add(n);
                 }
             }
         }
     }
    public static void main(String[] args) {
         Graph obj=new Graph(5);
         obj.addedge(0,1);
        obj.addedge(1,4);
        obj.addedge(1,2);
        obj.addedge(2,3);
        obj.addedge(4,3);
        System.out.println("Breadth first search");
        obj.BFS(0);
    }
}
*/
//Depth first search
import java.util.*;
public class Graph{
    int V;
    LinkedList<Integer>adj[];
    public Graph(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    void addedge(int v,int w){
        adj[v].add(w);
    }
    void DFSutil(int s,boolean visited[]){
        visited[s]=true;
        System.out.println(s+" ");
        Iterator<Integer>i=adj[s].listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                DFSutil(n,visited);
            }
        }
    }
    void DFS(int v){
        boolean visited[]=new boolean[V];
        DFSutil(v,visited);
    }
    public static void main(String[] args) {
            Graph obj=new Graph(4);
            obj.addedge(0,1);
           obj.addedge(0,2);
           obj.addedge(1,2);
            obj.addedge(2,0);
           obj.addedge(2,3);
           obj.addedge(3,3);
           obj.DFS(2);
    }
}
