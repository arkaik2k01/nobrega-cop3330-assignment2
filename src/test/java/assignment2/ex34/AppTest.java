package assignment2.ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    @Test
    void removeTest()
    {
        //Given...
        App test = new App();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Test1");
        names.add("Test2");
        names.add("Test3");

        //When string "Test1" is removed, list size should be 2
        int expected = 2;
        test.removeName(names, "Test1");
        int result = names.size();

        assertEquals(expected, result);

    }

    @Test
    void removeTest2()
    {
        //Given...
        App test = new App();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Test1");
        names.add("Test2");
        names.add("Test3");

        //When string "No word" is removed, list size should be 3
        int expected = 3;
        test.removeName(names, "No word");
        int result = names.size();

        assertEquals(expected, result);

    }
}