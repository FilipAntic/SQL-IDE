package model.indTree;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Ova klasa opisuje jedan element cvora
 * 
 * @author Lenka
 *
 */
public class NodeElement implements Serializable {

	private int blockAddress;

	private ArrayList<KeyElement> keyValue;

	public NodeElement(int blockAddress, ArrayList<KeyElement> keyValue) {
		this.blockAddress = blockAddress;
		this.keyValue = keyValue;
	}

	public ArrayList<KeyElement> getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(ArrayList<KeyElement> keyValue) {
		this.keyValue = keyValue;
	}

	public int getBlockAddress() {
		return blockAddress;
	}

	public void setBlockAddress(int blockAddress) {
		this.blockAddress = blockAddress;
	}

	public String toString() {
		String value = "AE: " + blockAddress + " Key: ";
		for (int i = 0; i < keyValue.size(); i++) {
			value += keyValue.get(i).getValue() + "|";
		}
		return value;

	}

}
