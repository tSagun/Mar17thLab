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
            checkRange(1, i, dice.roll());
        }

    }

    @Test
    public void testRollMany()
    {
        Dice dice = new Dice(10, "black");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> dice.rollMany(10));
    }

    private void checkRange(int low, int high, int value)
    {
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}
