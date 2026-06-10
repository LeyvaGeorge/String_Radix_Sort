import java.util.ArrayList;
import java.util.Iterator;
public class StringObjects {
    static ArrayList<String> radixSort(ArrayList<String> array, int charposition){
        //Creating a new Array
        ArrayList<String> sorted = new ArrayList<>();
        
        //Check if position is greater than the legth of a word   
        if (charposition < 0){
            sorted.addAll(array);
            return sorted;
        }
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.length() <= charposition) {
                sorted.add(word); //Add to new array list
                iterator.remove();// Safely remove it from original list
            }
        }
        //Loop through each letter of the alphabet
        for (char index = 'a'; index <= 'z'; index++){
            for (String word: array){
                if(word.charAt(charposition) == index){
                    sorted.add(word);
                }
            }    
        }
        sorted = radixSort(sorted,--charposition);
        //Check if the word is smaller than max legth of word
        //loop each letter to find smallest
        return sorted;
    }
    static ArrayList<String> radixSort(ArrayList<String> array) {
        int maxStrLen = 0;
        ArrayList<String> sorted = new ArrayList<>();
        //Find the longest word
        for (String word : array){
            if (word.length() > maxStrLen)
                maxStrLen = word.length();
        }
        //Sort by letter using recursion
        sorted.addAll(radixSort(array,maxStrLen - 1));
        return sorted;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("joke");
        list.add("book");
        list.add("back");
        list.add("dig");
        list.add("desk");
        list.add("word");
        list.add("fish");
        list.add("ward");
        list.add("dish");
        list.add("wit");
        list.add("deed");
        list.add("fast");
        list.add("dog");
        list.add("bend");
        
        System.out.println("Unordered list");
        for (String word : list) {
            System.out.print(word + " ");
        }
        System.out.println("Ordered list");
        ArrayList<String> orderedList = new ArrayList<>();
        orderedList.addAll(radixSort(list));
        for (String word : orderedList) {
            System.out.print(word + " ");
        }
        
    }
}
