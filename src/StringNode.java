import java.util.ArrayList;

//Stores StringLinks and word count of every instance of a string in a sentence. 

public class StringNode {
	// word that corresponds to node & list of words that come before/after
	private String name;
	private ArrayList<StringLink> connections;
	private StringNode next;

	// constructors
	public StringNode(String name, StringLink link) {
		this.name = name;
		this.connections = new ArrayList<StringLink>();
		this.next = null;
		connections.add(link);
	}

	// getters/setters
	public String getName() {
		return name;
	}

	public StringNode getNext() {
		return next;
	}
	
	public void setNext(StringNode next) {
		this.next = next;
	}
	
	// add a new link to the ArrayList
	public void addLink(StringLink sl) {
		connections.add(sl);
	}
	
	// toString
	public String toString() {
		String s = "Node: [" + this.name + "]\n";
		for (int i = 0; i < connections.size(); i++) {
			s += ("Link " + i + ": " + connections.get(i).toString() + "\n");
		}
		return s;
	}

	public static void main(String args[]) {
		StringLink link = new StringLink("", "b", 1);
		StringNode abc = new StringNode("a", link);
		StringLink link2 = new StringLink("", "b", 4);
		abc.addLink(link2);

		System.out.println(abc);
	}

}
