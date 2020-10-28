package chapter6.array;

public class CharArrayTest {
    
    public static void main(String[] args) {
        
        char[] alpahbets = new char[26];
        char number = 'A';

        for(int i = 0; i < alpahbets.length; i++)
        {
            alpahbets[i] = number++;
        }

        for(int i = 0; i < alpahbets.length; i++)
        {
            System.out.println(alpahbets[i]);
        }
    }
}
