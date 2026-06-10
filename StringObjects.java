
public class StringObjects {
    
    static String[] radixSort(String[] array) {
        int length = 0;
        String[] sorted = new String[array.length];
        //Find the longest word
        for (String word : array){
            if (word.length() > length)
                length = word.length();
        }
        //Sort by letter using recursion
        return sorted;
    }
    public static void main(String[] args) {
        String[] list = {"joke", "book", "back", "dig", "desk", "word", "fish", "ward", "dish", "wit", "deed", "fast", "dog", "bend"}; 
        System.out.println("Unordered list");
        for (String word : list) {
            System.out.print(word + " ");
        }
        System.out.println("Ordered list");
        list  = radixSort(list);
        for (String word : list) {
            System.out.print(word + " ");
        }
        
    }
}
