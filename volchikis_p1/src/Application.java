public class Application {

	public static void main(String[] args) {
		 DuplicateRemover duplicateRemover = new DuplicateRemover();
		 
		 //Call DuplicateRemover class and use methods
	        duplicateRemover.remove("problem1.txt");
	        duplicateRemover.write("unique_words.txt");
	}

}
