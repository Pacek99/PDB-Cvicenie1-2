package sk.upjs.gursky.pdb;

import sk.upjs.gursky.bplustree.BPKey;

import java.nio.ByteBuffer;

public class PersonSalaryKey implements BPKey<PersonSalaryKey> {

	private int key;

	public PersonSalaryKey() {}

	public PersonSalaryKey(int key) {
		
		this.key = key;
	}
	
	public int getSize() {
		return 4;
	}
	
	public void load(ByteBuffer bb) {

		key = bb.getInt();
	}
	
	public void save(ByteBuffer bb) {

		bb.putInt(key);
	}
	
	public int compareTo(PersonSalaryKey personSalaryKey) {
		return Integer.compare(key, personSalaryKey.key);
	}
}
