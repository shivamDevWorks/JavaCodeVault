package graphPractice.traversal;

import java.util.ArrayList;

public class GraphTraversal {

    public void dfs(ArrayList<ArrayList<Integer>> graph,int v,boolean[] vis){
        vis[v]=true;
        System.out.print(v+"  ");

        for(int u:graph.get(v)){
            if(!vis[u]){
                dfs(graph,u,vis);
            }
        }
    }
}
