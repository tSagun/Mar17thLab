import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

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

    @RepeatedTest(5)
    public void testRollMany()
    {
        for (int i = 4; i <= 10; i++)
        {
            Dice dice = new Dice(i, "color");
            int[] diceNumbers = dice.rollMany(i);
            for (int j = 0; j < i; j++)
            {
                checkRange(1, i, diceNumbers[j]);
            }
        }
    }

    private void checkRange(int low, int high, int value)
    {
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}
