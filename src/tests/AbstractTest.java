package tests;

import mockit.NonStrict;
import mockit.NonStrictExpectations;
import org.testng.annotations.BeforeMethod;
import work.IStuff;
import work.IThing;
import work.Widget;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 09:52
 * To change this template use File | Settings | File Templates.
 */
public class AbstractTest {

    @NonStrict IThing mockThing;

    @BeforeMethod
    public void initThing()
    {
        new NonStrictExpectations()
        {
            {
                mockThing.jiggery();
                returns("stuff");
                mockThing.newOne();
                result = mockWidget;
            }
        };
    }

    @NonStrict IStuff mockStuff;

    @BeforeMethod
    public void initStuff()
    {
        new NonStrictExpectations()
        {
            {
                mockStuff.foobar();
                returns("hello");
                mockStuff.newOne();
                result = mockWidget;
            }
        };
    }

    @NonStrict Widget mockWidget;

    @BeforeMethod
    public void initWidget()
    {
        new NonStrictExpectations()
        {
            {
                Widget.crank();
                returns("mocked!");
            }
        };
    }
}
