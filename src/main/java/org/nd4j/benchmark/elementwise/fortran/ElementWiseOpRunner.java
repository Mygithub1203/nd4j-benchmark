package org.nd4j.benchmark.elementwise.fortran;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class ElementWiseOpRunner implements OpRunner {
    INDArray arr;

    public ElementWiseOpRunner() {
        Nd4j.factory().setOrder('f');
        arr = Nd4j.create(1000,1000);
    }

    @Override
    public void runOp() {
       arr.addi(arr);
    }



}
