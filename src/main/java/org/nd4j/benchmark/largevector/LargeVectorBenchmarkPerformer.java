package org.nd4j.benchmark.largevector;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class LargeVectorBenchmarkPerformer extends BaseBenchmarkPerformer {

    public LargeVectorBenchmarkPerformer(int nTimes) {
        super(new LargeVectorOpRunner(),nTimes);
    }



}
