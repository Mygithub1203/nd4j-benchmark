package org.nd4j.benchmark.largevector;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class ArgmaxBenchmarkPerformer extends BaseBenchmarkPerformer {

    public ArgmaxBenchmarkPerformer(int nTimes) {
        super(new ArgMaxOpRunner(),nTimes);
    }



}
