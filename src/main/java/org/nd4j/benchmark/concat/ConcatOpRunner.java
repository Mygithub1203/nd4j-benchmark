package org.nd4j.benchmark.concat;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class ConcatOpRunner implements OpRunner {
    INDArray arr;

    public ConcatOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(1000, 1000);
    }

    @Override
    public void runOp() {
        Nd4j.concat(0,arr,arr);
    }



}
