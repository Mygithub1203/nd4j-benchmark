package org.nd4j.benchmark.tad;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class TADOpRunner implements OpRunner {
    INDArray arr;

    public TADOpRunner() {
        Nd4j.factory().setOrder('f');
        arr = Nd4j.create(5,5,5,5,5,5,5,5);
    }

    @Override
    public void runOp() {
        //Nd4j.getBlasWrapper().iamax(arr);
        arr.tensorAlongDimension(0,0,1,2,3);
    }



}
