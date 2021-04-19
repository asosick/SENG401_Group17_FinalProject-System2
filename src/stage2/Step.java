package stage2;

import java.io.IOException;

public interface Step {
    void doStep(String[] args) throws IOException;
}
