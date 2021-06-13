package assignment2.ex33;

import java.util.Random;

public class MagicBall
{
    private int ranNum;
    Random rand = new Random();
    private String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

    public void generateRanNum()
    {
        this.ranNum = rand.nextInt(4);
    }

    public String generateAnswer()
    {
        generateRanNum();
        return answers[this.ranNum];
    }
}
