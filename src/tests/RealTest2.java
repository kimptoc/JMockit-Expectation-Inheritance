package tests;

import org.testng.annotations.Test;
import work.IThing;
import work.Widget;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class RealTest2 extends AbstractTest {

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

}
