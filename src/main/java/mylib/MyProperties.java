package mylib;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("my-properties")
public class MyProperties {

	private String message;
	private int id;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
