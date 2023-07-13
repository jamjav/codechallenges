package challenges.codility;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddOccurrencesInArrayTest {

    @BeforeTest
    public void setUp() {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();
    }

    @DataProvider(name = "dp1")
    public Object[][] createData1() {
        return new Object[][]{
                new Object[]{new int[]{9, 3, 9, 3, 9, 7, 9}, 7},
                new Object[]{new int[]{1, 2, 1, 3, 5, 2, 3}, 5},
                new Object[]{new int[]{1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2}, 5},
                new Object[]{new int[]{2}, 2},
                new Object[]{new int[]{1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000}, 5000000},
        };
    }

    @Test(dataProvider = "dp1")
    public void verifySolution(int[] pA, int pExpectedNonPair) {
        System.out.println(Arrays.toString(pA));
        Assert.assertEquals(OddOccurrencesInArray.solution(pA), pExpectedNonPair);
    }

}