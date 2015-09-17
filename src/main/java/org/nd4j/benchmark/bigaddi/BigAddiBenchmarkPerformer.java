package org.nd4j.benchmark.bigaddi;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class BigAddiBenchmarkPerformer extends BaseBenchmarkPerformer {

    public BigAddiBenchmarkPerformer(int nTimes) {
        super(new BigAddOpRunner(),nTimes);
    }



}
