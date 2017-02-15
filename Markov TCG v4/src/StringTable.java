import java.util.LinkedList;

//Stores StringNodes in a hash table for quick access
public class StringTable {

	// hash table
	private int size;
	private LinkedList hashTable[];
	
	
	private StringTable(int size) {
		this.size = size;
		hashTable = new StringNode[size];
		
	}
	
	public void addWord(String word){
		if (hashTable[word.hashCode() % size] == null) {
			
		}
	}

	

}
