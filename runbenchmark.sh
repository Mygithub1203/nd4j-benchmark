#!/usr/bin/env bash

mvn clean install -DskipTests
java -cp target/nd4j-benchmark-1.0-SNAPSHOT.jar org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp -r org.nd4j.linalg.benchmark.accum.SumBenchmarkPerformer -n 1000