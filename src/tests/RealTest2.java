package tests;

import mockit.NonStrict;
import mockit.Verifications;
import org.testng.annotations.Test;
import work.IAnother;
import work.IThing;
import work.Widget;
import work.XWidget;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class RealTest2 extends AbstractTest {

    @NonStrict
    IAnother mockAnother;

    @Test
    public void aNoddyTest()
    {
        assert mockThing.jiggery().equals("stuff") : "found stuff?";
    }

    @Test
    public void aNoddyTest1()
    {
        IThing s = new IThing();
        assert s.jiggery().equals("stuff") : "found stuff?";
        assert mockThing.jiggery().equals("stuff") : "found stuff?";
        assert Widget.crank().equals("mocked!") : "widget";
    }

    @Test
    public void aNoddyTest2()
    {
        assert mockThing.jiggery().equals("stuff") : "found stuff?";
        assert mockStuff.foobar().equals("hello") : "found hello?";
        assert Widget.crank().equals("mocked!") : "widget";
    }

    @Test
    public void aNoddyTest3()
    {
        assert mockThing.jiggery().equals("stuff") : "found stuff?";
        assert mockStuff.foobar().equals("hello") : "found hello?";
        assert Widget.crank().equals("mocked!") : "widget";
        IThing s = new IThing();
        assert s.jiggery().equals("stuff") : "found stuff?";
    }

    @Test
    public void verifyTest()
    {
        XWidget w = new XWidget();
        w.go(mockAnother);

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            //ignored
        }

        new Verifications()
        {
            {
                mockAnother.yetMore(); times = 1;
            }
        };
    }
}
