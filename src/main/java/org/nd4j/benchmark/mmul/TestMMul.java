package org.nd4j.benchmark.mmul;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class TestMMul {

    public static void main(String[] args) {
        doTests('f','f');
        doTests('f','c');
        doTests('c','f');
        for(int i = 0; i < 100; i++)
            doTests('c','c');
    }

    public static void doTests(char order1, char order2){
        int size = 200;

        INDArray first = Nd4j.create(new int[]{size,size},order1);
        INDArray second = Nd4j.create(new int[]{size, size}, order2);

        int countBefore = 200;
        int count = 200;

        for( int i=0; i<countBefore; i++ ){
            first.mmul(second);
        }

        long start = System.currentTimeMillis();
        for( int i=0; i<countBefore; i++ ){
            first.mmul(second);
        }
        long end = System.currentTimeMillis();

        System.out.println("Orders: " + order1 + " * " + order2 + "; runtime = " + (end-start));
    }
}