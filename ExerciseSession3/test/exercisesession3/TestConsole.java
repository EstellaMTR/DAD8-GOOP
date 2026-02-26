package exercisesession3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestConsole {
    public final PrintStream standardOutput = System.out;
    public ByteArrayOutputStream outputStreamCaptor;
    public final InputStream standardInput = System.in;

    public void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    public void redirectOut() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public String readOutput() {
        return outputStreamCaptor.toString();
    }
}
