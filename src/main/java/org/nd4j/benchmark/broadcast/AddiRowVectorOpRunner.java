package org.nd4j.benchmark.broadcast;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author Adam Gibson
 */
public class AddiRowVectorOpRunner implements OpRunner {
    INDArray arr1,arr2;

    public AddiRowVectorOpRunner() {
        arr1 = Nd4j.create(new int[]{12000,12000});
        arr2 = Nd4j.create(1,12000);

    }

    @Override
    public void runOp() {
        arr1.addiRowVector(arr2);
    }



}
