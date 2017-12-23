package flang;
import java.util.HashMap;
import java.util.Map;

class Context {
	Map<String, Integer> variables;
	boolean was_return;
	int return_value;

	Context() {
		variables = new HashMap<>();
		was_return = false;
	}

	public void setValue(String s, int v) {
		variables.put(s, v);
	}

	public int getValue(String s) {
		int v = (Integer) variables.get(s);
		return v;
	}
}