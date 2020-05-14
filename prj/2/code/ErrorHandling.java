// Class that deals with errors when performing actions, using data structure
public class ErrorHandling<T> {

	private T data;
	private String error;
	
	private ErrorHandling(T data) {
		this.data = data;
	}
	
	private ErrorHandling(String error) {
		this.error = error;
	}
	
	public T getData() {
		return data;
	}
	
	public String getError() {
		return error;
	}
	
	public boolean isSuccessful() {
		return data != null;
	}
	
	public static <E> ErrorHandling<E> success(E data) {
		return new ErrorHandling<E>(data);
	}
	public static <E> ErrorHandling<E> failure(String error) {
		return new ErrorHandling<E>(error);
	}
}
