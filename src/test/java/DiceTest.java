import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest
{
    @Test
    public void testRollRange()
    {
        for (int i = 4; i <= 10; i++)
        {
            Dice dice = new Dice(i, "color");
            testcheckRange(1, i, dice.roll());
        }

    }

    @RepeatedTest(5)
    public void testRollMany()
    {
        Dice dice = new Dice(10, "black");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dice.rollMany(10));
    }

    private void testcheckRange(int low, int high, int value)
    {
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}
