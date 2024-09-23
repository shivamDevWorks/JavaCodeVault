package graphPractice.cycledetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {

    private ArrayList<Integer> topologicalSort;
    private Boolean isCyclic;

    public KahnsAlgorithm() {
    }

    public ArrayList<Integer> getTopologicalSort() {
        return topologicalSort;
    }

    public Boolean getCyclic() {
        return isCyclic;
    }

    // this algorithm is used to detect cycle in Directed acyclic graph
    public void doTopologicalSort(ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> ans=new ArrayList<>();
        int V=adj.size();
        // step-1 find all the nodes whose indegree is zero and push them to queue
        Queue<Integer> q=new LinkedList<>();
        int[] inDegree=new int[V];
        for(int i=0;i<V;i++){
            for(int u:adj.get(i)){
                inDegree[u]+=1;
            }
        }

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int u:adj.get(node)){
                inDegree[u]-=1;
                if(inDegree[u]==0){
                    q.offer(u);
                }
            }
        }


        if(ans.size() != V){
            this.isCyclic=Boolean.TRUE;
            this.topologicalSort=null;
        }else{
            this.isCyclic=Boolean.FALSE;
            this.topologicalSort=ans;
        }

    }
}
