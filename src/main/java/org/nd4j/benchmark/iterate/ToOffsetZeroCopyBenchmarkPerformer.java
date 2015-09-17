package org.nd4j.benchmark.iterate;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class ToOffsetZeroCopyBenchmarkPerformer extends BaseBenchmarkPerformer {

    public ToOffsetZeroCopyBenchmarkPerformer(int nTimes) {
        super(new ToOffsetZeroCopyOpRunner(),nTimes);
    }



}
