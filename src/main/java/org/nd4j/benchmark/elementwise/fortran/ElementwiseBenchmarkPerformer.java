package org.nd4j.benchmark.elementwise.fortran;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class ElementwiseBenchmarkPerformer extends BaseBenchmarkPerformer {

    public ElementwiseBenchmarkPerformer(int nTimes) {
        super(new ElementWiseOpRunner(),nTimes);
    }



}
