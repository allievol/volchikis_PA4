
public class Application {

    public static void main(String[] args) {
    	
        //create object of DuplicateCounter
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        //count words
        duplicateCounter.count("problem2.txt");
        //write to file
        duplicateCounter.write("unique_word_counts.txt");
    }
    
}