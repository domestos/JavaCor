/**
 * Created by varenik on 23.09.15.
 */
public class InvertString {

    public String reverse(String string){
        System.out.println("Before "+string);
        char[] charArray =  string.toCharArray();
        for (int i = 0; i < charArray.length/2 ; i++) {
            char temp = charArray[charArray.length-1-i];
            charArray[charArray.length-1-i] = charArray[i];
            charArray[i] = temp;
        }
        string = new String(charArray);
        System.out.println("After "+string);
        return string;
    }
}
