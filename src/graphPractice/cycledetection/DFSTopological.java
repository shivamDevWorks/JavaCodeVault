package graphPractice.cycledetection;

import java.util.ArrayList;
import java.util.Stack;

public class DFSTopological {


    public static void topologicalSortUtil(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stack){
        vis[v]=true;

        for(int u:adj.get(v)){
            if(!vis[u]){
                topologicalSortUtil(u,adj,vis,stack);
            }
        }

        stack.push(v);
    }
    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        Stack<Integer> st=new Stack<>();
        boolean[] vis=new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topologicalSortUtil(i,adj,vis,st);
            }
        }

        int[] ans=new int[V];
        int index=0;
        while(!st.isEmpty()){
            ans[index++]=st.pop();
        }
        return ans;
    }
}
