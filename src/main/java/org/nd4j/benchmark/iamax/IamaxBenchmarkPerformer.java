package org.nd4j.benchmark.iamax;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class IamaxBenchmarkPerformer extends BaseBenchmarkPerformer {

    public IamaxBenchmarkPerformer(int nTimes) {
        super(new IamaxOpRunner(),nTimes);
    }



}
