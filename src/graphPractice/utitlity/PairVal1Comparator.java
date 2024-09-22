package graphPractice.utitlity;

import java.util.Comparator;

public class PairVal1Comparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.getVal1() < o2.getVal1()){
            return -1; // means o1 comes before o2
        }else if(o1.getVal1() > o2.getVal1()){
            return 1; // o2 comes before o1
        }else{
            return 0;
        }
    }
}
