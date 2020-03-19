import homework1.allsweets.Candies;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Irina Goncharova
 */
public class CandiesTest {

    private static Candies candy1;
    private static Candies candy2;

    @BeforeClass
    public static void createNewCandy() {
        candy1 = new Candies("Babble", 25, 2, "lemon", "candy", 4);
        candy2 = new Candies("", -5, -2, "", "", 1);
    }

    @Test
    public void  shouldCreateNotNullCandy () {
        Assert.assertNotNull(candy1);
    }

//    @Test
//    public void shouldReturnError_WhenInputNameIsNull() {
//        candy1.setName("");
//        Assert.a
//


}
