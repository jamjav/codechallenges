package challenges.codility;

import challenges.codility.timecomplexity.FrogJmp;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrogJmpTest {

    @BeforeTest
    public void setUp() {
        FrogJmp solution = new FrogJmp();
    }

    @DataProvider(name = "dp1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{3, 999111321, 7, 142730189},
        };
    }

    @Test(dataProvider = "dp1")
    public void verifySolution(int pX, int pY, int pD, int pExpectedNonPair) {
        //System.out.println(Arrays.toString(pX, pY, pD));
        Assert.assertEquals(FrogJmp.solution(pX, pY, pD), pExpectedNonPair);
    }

}