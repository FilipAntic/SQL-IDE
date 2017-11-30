package model.indTree;

import java.io.Serializable;
/**
 * Ova klasa sluzi za opis vrednosti polja koje ulazi u sastav primarnog kljuca
 * @author Lenka
 *
 */

public class KeyElement implements Serializable {

	private String type;
	private Object value;

	public KeyElement(String type, Object value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}

}
