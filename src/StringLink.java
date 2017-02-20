//Stores before and after strings for a specific string number 
public class StringLink implements Comparable<StringLink> {

	// words that come before and after another word & position of word in text
	// file (for higher order chaining)
	private String before;
	private String after;
	private int wordCount;

	// constructor
	public StringLink(String before, String after, int wordCount) {
		this.before = before;
		this.after = after;
		this.wordCount = wordCount;
	}

	// getters for variables
	public String getBefore() {
		return before;
	}

	public String getAfter() {
		return after;
	}

	public int getWordCount() {
		return wordCount;
	}

	// toString
	public String toString() {
		return "([" + this.before + "][" + this.after + "]" + this.wordCount + ")";
	}

	// compareTo
	@Override
	public int compareTo(StringLink o) {
		//compare wordCounts
		int n = o.wordCount - this.wordCount;
		if (n != 0) {
			return n;
		}
		
		//compare before words
		n = this.before.compareTo(o.before);
		if (n != 0) {
			return n;
		}
		
		//compare after words
		n = this.after.compareTo(o.after);
		return n;

	}

	
//	//main for testing
//	public static void main(String args[]) {
//		StringLink b = new StringLink("a", "c", 1);
//		StringLink c = new StringLink("b", "d", 2);
//		StringLink b1 = new StringLink("a", "c", 1);
//
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(b.compareTo(c));
//		System.out.println(c.compareTo(b));
//		System.out.println(b.compareTo(b));
//
//	}

}
