package org.nd4j.benchmark.dimensionwise;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;

/**
 * @author Adam Gibson
 */
public class DimensionwiseBenchmarkPerformer extends BaseBenchmarkPerformer {

    public DimensionwiseBenchmarkPerformer(int nTimes) {
        super(new DimensionWiseOpRunner(),nTimes);
    }



}
