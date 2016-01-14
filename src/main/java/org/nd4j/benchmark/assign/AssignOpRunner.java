package org.nd4j.benchmark.assign;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class AssignOpRunner implements OpRunner {
    INDArray arr,arr2;

    public AssignOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(1000,1000);
        arr2 = Nd4j.create(1000 * 1000);
    }

    @Override
    public void runOp() {
        arr.assign(arr2);
    }



}
