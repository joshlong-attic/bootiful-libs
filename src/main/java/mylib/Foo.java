package mylib;

/**
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
public class Foo {

	private final String msg;

	public Foo(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Foo{" +
			"msg='" + msg + '\'' +
			'}';
	}
}
