import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest
{

    @Test
    public void testToString()
    {
        for (int i = 4; i < 25; i++)
        {
            Dice dice = new Dice(i, "color");
            assertEquals("A " + i + " sided die", dice.toString());
        }
    }

    @Test
    public void testRollRange()
    {
        for (int i = 4; i <= 10; i++)
        {
            Dice dice = new Dice(i, "color");
            testCheckRange(1, i, dice.roll());
        }

    }

    @RepeatedTest(5)
    public void testRollMany()
    {
        Dice dice = new Dice(10, "black");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dice.rollMany(10));
    }

    private void testCheckRange(int low, int high, int value)
    {
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}
