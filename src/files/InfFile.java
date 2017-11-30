package files;

import java.util.ArrayList;

public interface InfFile {

	public void add();

	public void sort();

	public void change();

	public void update(ArrayList<String> objects);

	public void delete();

	public void fetchNext();

	public void fetchBack();

	void sort(ArrayList<String> string, ArrayList<Integer> integer);

	void add(ArrayList<String> objects);

	void update();
}
