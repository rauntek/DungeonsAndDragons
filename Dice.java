import java.util.Random;

public class Dice
{
    int sides;
    Random rand;
	
    public Dice()
    {
        rand = new Random();
        sides = 0;
    }
    
    public int roll(int numOfSides)
    {
        sides = rand.nextInt(numOfSides) + 1;
        return sides;
    }
}