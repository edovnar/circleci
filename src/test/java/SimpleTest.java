import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SimpleTest {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static final Random random = new Random();

    @Test
    public void hello() {
        Assert.assertTrue(true);
    }

    @Test
    public void helloo() throws InterruptedException {
        log.info("Sleeping for 10 seconds...");
        TimeUnit.SECONDS.sleep(10);
        Assert.assertTrue(true);
    }

    @Test
    public void helloOrNot() {
        int a = random.nextInt(3);
        boolean greatRandom = a != 2;
        Assert.assertTrue(greatRandom);
    }

    @Test
    public void notOrHello() {
        int a = random.nextInt(3);
        boolean greatRandom = a == 2;
        Assert.assertTrue(greatRandom);
    }

}
