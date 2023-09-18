package pers.xgo.onjava.chapter16_validating;

import java.util.concurrent.TimeUnit;

public class Timer {
    private long start = System.nanoTime();

    public long duration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
    }

    public static long duration(Runnable test) {
        Timer timer = new Timer();
        test.run();
        return timer.duration();
    }
}
