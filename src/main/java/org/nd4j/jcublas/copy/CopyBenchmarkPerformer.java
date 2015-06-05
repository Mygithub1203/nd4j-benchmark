package org.nd4j.jcublas.copy;

import org.nd4j.linalg.benchmark.api.BaseBenchmarkPerformer;
import org.nd4j.linalg.benchmark.dimensionwise.DimensionWiseOpRunner;

/**
 * @author Adam Gibson
 */
public class CopyBenchmarkPerformer extends BaseBenchmarkPerformer {

    public CopyBenchmarkPerformer(int nTimes) {
        super(new CopyOpRunner(),nTimes);
    }



}
