package org.nd4j.benchmark.max;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class MaxOpRunner implements OpRunner {
    INDArray arr;

    public MaxOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(12000,12000);
    }

    @Override
    public void runOp() {
        //Nd4j.getBlasWrapper().iamax(arr);
        arr.sum(1);
    }



}
