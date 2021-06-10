package assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Anagrams Tester.
 *
 * @author <Miguel Nobrega>
 * @version 1.0
 * @since <pre>Jun 10, 2021</pre>
 */
public class AnagramsTest {

    /**
     * Method: isAnagram()
     */
    @Test
    public void testIsAnagram_returnTrue() throws Exception {
        Anagrams anagram = new Anagrams("Abcd", "dcba");

        //When Abcd and dcba, expected true
        Boolean result = anagram.isAnagram();
        Boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testIsAnagram_returnFalse() throws Exception {
        Anagrams anagram = new Anagrams("Anagram", "Tests");

        //When given Anagram and Tests, expected false
        Boolean result = anagram.isAnagram();
        Boolean expected = false;

        assertEquals(expected, result);
    }
} 
