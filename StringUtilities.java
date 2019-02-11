import java.io.*;
import java.lang.*;
import java.lang.StringBuilder;
import java.lang.StringBuffer;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverseString="";
        for(int i=valueToBeReversed.length()-1; i>=0;i--){
        reverseString= reverseString+ valueToBeReversed.charAt(i);}
        return reverseString;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middle = word.length()/2;
        return word.charAt(middle);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
        return value.replaceAll(charToRemove.toString(),"");
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int location = sentence.lastIndexOf(" ");
        return sentence.substring(location+1);
    }
}
