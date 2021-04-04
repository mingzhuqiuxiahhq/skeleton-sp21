package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        Stopwatch sw = new Stopwatch();
        AList<Double> time = new AList<>();
        AList<Integer> size = new AList<>();
        AList<Integer> OpCounts = new AList<>();
        //List<Double> microSec = new ArrayList<>(8);
        int initSize = 100000;

        while (initSize <= 12800000) {
            int opCalls = 0;
            AList<Integer> n = new AList<>();
            while (n.size() < initSize) {
                n.addLast(1);
                opCalls += 1;
            }
            time.addLast(sw.elapsedTime());
            OpCounts.addLast(opCalls);
            size.addLast(initSize);
            initSize *= 2;
        }
        
        printTimingTable(size, time, OpCounts);
    }
}
