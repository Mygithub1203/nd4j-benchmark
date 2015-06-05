package org.nd4j.jcublas.copy;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.jcublas.CublasPointer;

/**
 * @author Adam Gibson
 */
public class CopyOpRunner implements OpRunner {
    INDArray arr = Nd4j.create(1000000);
    INDArray dup = arr.dup();


    @Override
    public void runOp() {
        CublasPointer pointer = new CublasPointer(arr);
        try {
            pointer.copyToHost();
            pointer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
