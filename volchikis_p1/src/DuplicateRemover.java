import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.PrintWriter;

public class DuplicateRemover {
    //instance variable
    private Set<String> uniqueWords; 
    
    // initialize the instance variable
    public DuplicateRemover() {
      uniqueWords = new HashSet<String>();   
    }
    //method that takes input file name
    public void remove(String dataFile) {
        //declare scanner variable
        Scanner in = null;
        //use try block to open file, if not catch
        try {
            //open file for reading
            in = new Scanner(new File(dataFile));
            //while file has content to read, continue
            while(in.hasNext()) {
                //read net word and add it to Set
                uniqueWords.add(in.next());
            }
        }
        catch(IOException ex) { // catch IO errors            
            System.out.println(dataFile+" not found !");
        }
        
        finally {
           if(in!=null) in.close(); //close file
        }            
    }
    
    public void write(String outputFile) {
        //declare PrintWriter variable
        PrintWriter out = null;
        try{
            //open file for writing
            out = new PrintWriter(new File(outputFile));
            //take each word and write to file
            for(String word:uniqueWords) {
               out.println(word); // write to file
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
