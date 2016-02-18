package org.nd4j.benchmark.mmul;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class TestMMul {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++)
            doTests('c','c');
    }

    public static void doTests(char order1, char order2) {
        int size = 5000;
        INDArray oneThroughSixty = Nd4j.arange(100000000).reshape(order1,100,100,100,100);
        INDArray oneThroughTwentyFour = Nd4j.arange(100000000).reshape(order2,100,100,100,100);

        int countBefore = 200;
        int count = 200;

        for( int i = 0; i< countBefore; i++) {
            long start = System.nanoTime();
            INDArray result = Nd4j.tensorMmul(oneThroughSixty, oneThroughTwentyFour, new int[][]{{1, 0}, {0, 1}});

            long end = System.nanoTime();
            System.out.println("Orders: " + order1 + " * " + order2 + "; runtime = " + (end-start));


        }

    }
}