import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class DuplicateCounter {
    //instance variable
    private HashMap<String,Integer> wordCounter;
    
    
    public DuplicateCounter() {
        wordCounter = new HashMap<>();
    }
    
    //method that takes input file name and counts the words
    public void count(String dataFile) {
        //declare scanner variable
        Scanner in = null;
        //open try block
        try {
            //open file for reading
            in = new Scanner(new File(dataFile));
            
            //while file has content to read, continue
            while(in.hasNext()) {
                //read word
                String word = in.next();
                
                //check if word is already in the map                
                if(wordCounter.containsKey(word)) {
                    //update word count
                    int wordCount = wordCounter.get(word);
                    wordCount++;
                    wordCounter.put(word, wordCount);
                }
                
                else {
                    //if not in the map, add it
                    wordCounter.put(word, 1);
                }
                    
            }
        }
        catch(IOException ex) { // catch IO errors            
            System.out.println(dataFile+" not found !");
        } 
        
        finally  {
           if(in!=null) in.close(); //close file
        }            
    }
    
    //write words and counts to a file
    public void write(String outputFile) {
        //declare PrintWriter variable
        PrintWriter out = null;
        try{
            //open file for writing
            out = new PrintWriter(new File(outputFile));
            //take each word and write to file along with count
            for(String word:wordCounter.keySet()) {
               out.println(word+" "+wordCounter.get(word)); // write to file
            }
        }
        catch(IOException ex) {
            //error occurred while creating a file
            System.out.println("Cannot create/open file "+outputFile+" !");
        } 
        finally {
           if(out!=null) out.close(); //close file
        }   
    }
}