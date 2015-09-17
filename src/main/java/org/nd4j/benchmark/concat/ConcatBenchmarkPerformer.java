package org.nd4j.benchmark.concat;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class ConcatBenchmarkPerformer extends BaseBenchmarkPerformer {

    public ConcatBenchmarkPerformer(int nTimes) {
        super(new ConcatOpRunner(),nTimes);
    }



}
