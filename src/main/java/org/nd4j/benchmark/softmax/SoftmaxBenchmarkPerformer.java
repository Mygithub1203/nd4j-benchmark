package org.nd4j.benchmark.softmax;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class SoftmaxBenchmarkPerformer extends BaseBenchmarkPerformer {

    public SoftmaxBenchmarkPerformer(int nTimes) {
        super(new SoftMaxOpRunner(),nTimes);
    }



}
