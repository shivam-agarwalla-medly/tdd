package co.interleap.courses.tdd;

public class VowelCounter {
    public int vowelCount(String string)
    {
        int counter=0;

        for(int i=0;i<string.length();i++)
        {
            switch (string.charAt(i))
            {
                case 'a':{counter++;break;}
                case 'e':{counter++;break;}
                case 'i':{counter++;break;}
                case 'o':{counter++;break;}
                case 'u':{counter++;break;}

                default:break;
            }
        }

        return counter;
    }
}
