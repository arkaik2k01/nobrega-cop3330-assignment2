package assignment2.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest
{

    @Test
    void generateAnswer()
    {
        MagicBall ball = new MagicBall();
        for(int i = 0; i < 100; i++) {
            ball.generateAnswer();
        }
    }
}