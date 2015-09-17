package org.nd4j.benchmark.max;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class MaxBenchmarkPerformer extends BaseBenchmarkPerformer {

    public MaxBenchmarkPerformer(int nTimes) {
        super(new MaxOpRunner(),nTimes);
    }



}
