package org.nd4j.benchmark.assign;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class AssignBenchmarkPerformer extends BaseBenchmarkPerformer {

    public AssignBenchmarkPerformer(int nTimes) {
        super(new AssignOpRunner(),nTimes);
    }



}
