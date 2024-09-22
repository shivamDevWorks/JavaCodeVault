package graphPractice.shortestpath;

import graphPractice.utitlity.Triplet;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {

    public int[] singleSourceShortestPath(ArrayList<Triplet> edges, int src,int V){
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=1;i<V;i++){
            for(Triplet triplet:edges){
                int u=triplet.getVal1();
                int v=triplet.getVal2();
                int w=triplet.getVal3();

                if(dist[u] != Integer.MAX_VALUE && dist[v] > dist[u]+w){
                    dist[v]=dist[u]+w;
                }

            }
        }

        return dist;
    }
}
