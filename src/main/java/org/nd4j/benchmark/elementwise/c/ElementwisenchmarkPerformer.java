package org.nd4j.benchmark.elementwise.c;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class ElementwisenchmarkPerformer extends BaseBenchmarkPerformer {

    public ElementwisenchmarkPerformer(int nTimes) {
        super(new ElementWiseOpRunner(),nTimes);
    }



}
