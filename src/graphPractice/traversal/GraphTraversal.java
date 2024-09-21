package graphPractice.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

    private void dfsUtil(ArrayList<ArrayList<Integer>> adjacencyGraph,int src,boolean[] vis){
        vis[src]=true;
        System.out.print(src+"  ");

        for(int neighbour:adjacencyGraph.get(src)){
            if(!vis[neighbour]){
                dfsUtil(adjacencyGraph,neighbour,vis);
            }
        }
    }

    public void dfs(ArrayList<ArrayList<Integer>> adjacencyGraph){
        int V=adjacencyGraph.size();
        boolean[] vis=new boolean[V];

        for(int node=0;node<V;node++){
            if(!vis[node]){
                dfsUtil(adjacencyGraph,node,vis);
            }
        }
    }

    public void bfs(ArrayList<ArrayList<Integer>> adjacencyGraph){
        int V=adjacencyGraph.size();
        boolean[] vis=new boolean[V];


    }

    private void bfsUtil(ArrayList<ArrayList<Integer>> adjacencyGraph,int src,boolean[] vis){

        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        vis[src]=true;

        while(!q.isEmpty()){
            int node=q.poll();
            for(int neighbour:adjacencyGraph.get(node)){
                if(!vis[neighbour]){
                    q.offer(neighbour);
                    vis[neighbour]=true;
                }
            }
        }

    }
}
