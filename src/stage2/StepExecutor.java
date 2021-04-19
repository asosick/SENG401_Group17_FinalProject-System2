package stage2;

import java.io.IOException;

public class StepExecutor {
    private final Step cluster1, cluster2, terminal1, terminal2, transition1, transition2;

    public StepExecutor() {
        cluster1 = new DoClusteringStep1();
        cluster2 = new DoClusteringStep2();
        terminal1 = new DoTerminalClusterValuesStep1();
        terminal2 = new DoTerminalClusterValuesStep2();
        transition1 = new DoTransitionPDTStep1();
        transition2 = new DoTransitionPDTStep2();
    }

    public void doStepCluster1(String[] args) throws IOException {
        cluster1.doStep(args);
    }
    public void doStepCluster2(String[] args) throws IOException {
        cluster2.doStep(args);
    }
    public void doStepTerminal1(String[] args) throws IOException {
        terminal1.doStep(args);
    }
    public void doStepTerminal2(String[] args) throws IOException {
        terminal2.doStep(args);
    }
    public void doStepTransition1(String[] args) throws IOException {
        transition1.doStep(args);
    }
    public void doStepTransition2(String[] args) throws IOException {
        transition2.doStep(args);
    }

    //how it would be used
    public static void main(String[] args) throws IOException {
        StepExecutor stepExecutor = new StepExecutor();
        stepExecutor.doStepCluster1(args);
        stepExecutor.doStepCluster2(args);
        stepExecutor.doStepTerminal1(args);
        stepExecutor.doStepTerminal2(args);
        stepExecutor.doStepTransition1(args);
        stepExecutor.doStepTransition2(args);
    }
}
