package org.nd4j.benchmark.elementwise.fortran;

import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.benchmark.api.OpRunner;
//import org.nd4j.linalg.cpu.nativecpu.ops.NativeOps;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.ops.transforms.Transforms;
//import org.nd4j.linalg.ops.transforms.Transforms;

import java.nio.IntBuffer;

/**
 * @author Adam Gibson
 */
public class ElementWiseOpRunner implements OpRunner {
    INDArray arr;
    IntBuffer indexes;
    //NativeOps ops;

    public ElementWiseOpRunner() {
        Nd4j.factory().setOrder('f');
        arr = Nd4j.create(12000,12000);
        int[] buff = new int[12000 * 12000];
        for(int i = 0; i < 12000 * 12000; i++) {
            buff[i] = i;
        }
        DataBuffer realBuffer = Nd4j.createBuffer(buff);
       // indexes = realBuffer.asNioInt();
       // ops = new NativeOps();
    }

    @Override
    public void runOp() {
       Transforms.abs(arr);
      //  ops.execTransform(0,arr.data().asNioFloat(),arr.shapeInfo(),arr.data().asNioFloat(),arr.shapeInfo(),null,arr.length(),indexes,indexes);
        //ops.execTransform(0,arr.data().asNioFloat(),1,arr.data().asNioFloat(),1,null,arr.length());
    }



}
