package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class UnionFindClient{
    public static void main(String[] args) {
        int pairs = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of sites to start with: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of trials upto which doubling should be done: ");
        int t = sc.nextInt();
       for (int x = 0; x < t; x++) {
            for (int i = 0; i < 100; i++) {
                int connections = count(n);
                pairs = pairs + count(n);
            }
            int connections = pairs / 100;
            System.out.println("Number of connection generated for "+n+" sites are: " + connections);
            n=2*n;
            pairs=0;
       }
    }
    public static int count(int n){
       int p; int q;
        int connections = 0;
        UF_HWQUPC uf = new UF_HWQUPC(n,true);

        do {
            //generateRandomPair(p, q, n);
            Random random= new Random();
            p= random.nextInt(n);
            do{
                q= random.nextInt(n);
            }while(p==q);
            connections++;
        //    System.out.println("Generated pair is: ("+p+","+q+")");
            uf.connect(p,q);
       //     uf.show();
         //   System.out.println(uf);
       //     connections++;
        }while(uf.components()>1);

        return  connections;
    }

    /*public static void generateRandomPair(int p, int q, int n){
        Random random= new Random();
        p= random.nextInt(n);
        do{
            q= random.nextInt(n);
        }while(p==q);
    }*/
}
