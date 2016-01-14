package org.nd4j.benchmark.largevector;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class LargeVectorOpRunner implements OpRunner {
    INDArray arr;

    public LargeVectorOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(1,65000000);
    }

    @Override
    public void runOp() {
        Nd4j.argMax(arr,1);
    }



}
