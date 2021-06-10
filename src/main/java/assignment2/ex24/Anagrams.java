package assignment2.ex24;

import java.util.Arrays;

public class Anagrams {

    private String str1;
    private String str2;

    public Anagrams(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    //Converts to a sorted char Array
    public char[] toSortChar(String str)
    {
        char[] charArr = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        Arrays.sort(charArr);
        return charArr;
    }

    public Boolean isAnagram()
    {
        if(str1.length() != str2.length())
            return false;
        //Convert to sorted array
        char[] charArr1 = toSortChar(str1);
        char[] charArr2 = toSortChar(str2);
        //Compare to check if anagram
        for(int i = 0; i < str1.length(); i++)
        {
            if(Character.toLowerCase(charArr1[i]) != Character.toLowerCase(charArr2[i]))
                return false;
        }
        return true;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }
}
