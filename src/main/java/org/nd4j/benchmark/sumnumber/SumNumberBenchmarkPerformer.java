package org.nd4j.benchmark.sumnumber;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class SumNumberBenchmarkPerformer extends BaseBenchmarkPerformer {

    public SumNumberBenchmarkPerformer(int nTimes) {
        super(new SumNumberRunner(),nTimes);
    }



}
