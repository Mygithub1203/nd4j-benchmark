package org.nd4j.benchmark.argmax;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class ArgMaxOpRunner implements OpRunner {
    INDArray arr;

    public ArgMaxOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(12000,12000);
    }

    @Override
    public void runOp() {
        Nd4j.argMax(arr,1);
    }



}
