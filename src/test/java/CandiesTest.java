import homework1.allsweets.Candies;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Irina Goncharova
 */
public class CandiesTest {
    private Candies candy1;

    @Before
    public void createNewCandy() {
        candy1 = new Candies("Babble", 25, 2, "lemon", "candy", 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputNameIsEmpty() {
        candy1.setName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputWeightIsNegative() {
        candy1.setWeight(-5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputSugarContentIsNegative() {
        candy1.setSugarCont(-7);
    }

}
