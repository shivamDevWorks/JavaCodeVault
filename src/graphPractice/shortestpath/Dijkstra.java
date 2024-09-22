package graphPractice.shortestpath;

import graphPractice.utitlity.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

    public int[] singleSourceShortestPath(ArrayList<ArrayList<Pair>> adj, int src){
        int V=adj.size();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,src));
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);

        while(!pq.isEmpty()){
            Pair p=pq.poll();

            for(Pair neighbour:adj.get(p.getVal1())){
                if(dist[neighbour.getVal1()] > p.getVal1()+neighbour.getVal2()){
                    dist[neighbour.getVal1()]=p.getVal1()+neighbour.getVal2();
                    pq.add(new Pair(dist[neighbour.getVal1()],neighbour.getVal1()));
                }
            }
        }
        return dist;
    }
}
