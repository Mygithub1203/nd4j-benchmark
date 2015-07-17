package org.nd4j.benchmark.softmax;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.transforms.SoftMax;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class SoftMaxOpRunner implements OpRunner {
    INDArray arr;

    public SoftMaxOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(1000,1000);
    }

    @Override
    public void runOp() {
        Nd4j.getExecutioner().exec(new SoftMax(arr),1);
    }



}
