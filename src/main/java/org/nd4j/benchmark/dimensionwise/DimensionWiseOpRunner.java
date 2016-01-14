package org.nd4j.benchmark.dimensionwise;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.transforms.Sigmoid;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class DimensionWiseOpRunner implements OpRunner {
    INDArray arr;

    public DimensionWiseOpRunner() {
        Nd4j.factory().setOrder('c');
        arr = Nd4j.create(128, 119537);
    }

    @Override
    public void runOp() {
       Nd4j.getExecutioner().exec(new Sigmoid(arr),1);
    }



}
