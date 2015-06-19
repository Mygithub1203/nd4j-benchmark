# nd4j-benchmark

This project is dedicated to running benchmarks on ND4J matrix operations.

Run:
   
      org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp -n $YOUR NUMBER OF TRIALS -r csv of fully qualified path of trials you want to run *(e.g. org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp)*

##Command-Line Example 

Here's a general matrix multiplication (Gemm) example already baked in to the nd4j-perf module:

    java -cp lib/* org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp -n 10k -r org.nd4j.linalg.benchmark.gemm.GemmBenchmarkPerformer,org.nd4j.linalg.benchmark.gemm.GemmBenchmarkPerformer

##IntelliJ

Notice we specify gemm twice. This is just to demonstrate how you would run multiple classes.

You can also run this in IntelliJ with an app configuration:

https://www.jetbrains.com/idea/help/creating-and-editing-run-debug-configurations.html

Specify org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp as the main class, and specify your arguments in program arguments.

#Heap Space

If you need more heap space (in your VM arguments), add:

-XmxMAX_HEAP_SPACE -XmsMINHEAP_SPACE

-Xmx2g -Xms2g

#Flags

**-r** If you leave -r off, it will run every benchmark on the class path

To run one or more particular backends, just include them in your POM.xml file (the default combination right now is jcublas vs jblas).

**-n** number of trials

#Custom OpRunners

Create a class extending BaseBenchmarkPerformer (similar to what we did in the copy benchmark). 

Create an associated OpRunner. 

Pass that custom OpRunner in to your new benchmaker performer.

The BenchmarkRunnerApp will automatically pick up those classes and run them for you.
