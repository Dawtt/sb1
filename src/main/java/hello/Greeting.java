package hello;

/**
 * The id field is a unique identifier for the greeting, and content is the textual representation of the greeting.
 *
 * To model the greeting representation, you create a resource representation class. Provide a plain old java object with fields, constructors, and accessors for the id and content data:
 * As you see in steps below, Spring uses the Jackson JSON library to automatically marshal instances of type Greeting into JSON.
 * 	from: https://spring.io/guides/gs/rest-service/
 */
public class Greeting {
	
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public long getId() {
		return id;
	}

	public String GetContent() {
		return content;
	}
}
