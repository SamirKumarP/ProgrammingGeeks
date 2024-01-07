package hackerrank.solutions.hard;

import java.util.HashSet;
import java.util.Set;

public class NameSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Set<String> names = new HashSet<String>();
	private int frequency = 0;
	private String rootName;
	public NameSet(String name, int freq) {
		names.add(name);
		frequency = freq;
		rootName = name;
	}

	public void copyNamesWithFrequency(Set<String> more, int freq) {
		names.addAll(more);
		frequency += freq;
	}

	public Set<String> getNames() {
		return names;
	}

	public int getFrequency() {
		return frequency;
	}

	public String getRootName() {
		return rootName;
	}
	
	public int size() {
		return names.size();
	}
}
