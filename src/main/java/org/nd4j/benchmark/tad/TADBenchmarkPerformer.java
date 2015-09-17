package org.nd4j.benchmark.tad;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class TADBenchmarkPerformer extends BaseBenchmarkPerformer {

    public TADBenchmarkPerformer(int nTimes) {
        super(new TADOpRunner(),nTimes);
    }



}
