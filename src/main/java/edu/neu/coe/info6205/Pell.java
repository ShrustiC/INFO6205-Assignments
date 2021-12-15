package edu.neu.coe.info6205;



public class Pell {
    public Pell() {

    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if (n<=2){
            return n;

        }
        long i = 1;
        long j = 2;
        long r = 0;
        for (int l = 3; l<=n;l++){
            r = 2 * j+i;
            i=j;
            j=r;
        }
        return r;
    }
}

















