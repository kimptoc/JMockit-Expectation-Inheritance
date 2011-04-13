package work;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 12:48
 * To change this template use File | Settings | File Templates.
 */
public class XWidget implements Runnable {


    private IAnother _other;

    public void go(IAnother other)
    {
        _other = other;
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(this, 100, 321, TimeUnit.MILLISECONDS);
    }

    public void run() {
        _other.yetMore();

    }
}
