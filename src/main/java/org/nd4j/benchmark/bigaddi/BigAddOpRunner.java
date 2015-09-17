package org.nd4j.benchmark.bigaddi;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author Adam Gibson
 */
public class BigAddOpRunner implements OpRunner {
    INDArray arr1,arr2;

    public BigAddOpRunner() {
        Nd4j.factory().setOrder('c');
        ClassPathResource resource = new ClassPathResource("matrix.txt.gz");
        try {
            BufferedInputStream bis = new BufferedInputStream(new GZIPInputStream(resource.getInputStream()));
            DataInputStream dis = new DataInputStream(bis);
            arr1 = Nd4j.read(dis);
            arr2 = Nd4j.read(dis);
        }catch (Exception e) {

        }

    }

    @Override
    public void runOp() {
        arr1.addi(arr2);
    }



}
