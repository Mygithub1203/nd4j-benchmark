package org.nd4j.benchmark.slice;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class SliceBenchmarkPerformer extends BaseBenchmarkPerformer {

    public SliceBenchmarkPerformer(int nTimes) {
        super(new SliceOpRunner(),nTimes);
    }



}
