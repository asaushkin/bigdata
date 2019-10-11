import org.junit.Test;

import static org.junit.Assert.*;

public class GradleArgumentTest {

    @Test
    public void getStackName() {
        String stackName = System.getProperty("stackName");

        assertNotNull(stackName);
        assertNotEquals(0, stackName.length());
    }
}
