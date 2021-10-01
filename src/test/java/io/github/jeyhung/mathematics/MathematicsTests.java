package io.github.jeyhung.mathematics;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class MathematicsTests {
    private final MockedStatic<Mathematics> mathematicsMockedStatic = Mockito.mockStatic(Mathematics.class);

    @Test
    public void MinTest() {
        int min = 1;
        int middle = 2;
        int max = 3;
    }
}
