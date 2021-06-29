package co.interleap.courses.tdd;

import java.util.Locale;

public class VowelCounter {
    public int vowelCount(String string)
    {
        int counter=0;
        string=string.toLowerCase();

        for(int i=0;i<string.length();i++)
        {
            if(isVowel(string.charAt(i)))
                counter++;
        }

        return counter;
    }
    private  boolean isVowel(char c)
    {
        switch (c)
        {
            case 'a':{return true;}
            case 'e':{return true;}
            case 'i':{return true;}
            case 'o':{return true;}
            case 'u':{return true;}

            default:return false;
        }
    }
}
