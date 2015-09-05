
public class Link<T> {
	protected T item;
	protected Link<T> past;
	protected Link<T> next;
	
	
	protected Link(T item){
		this.item = item;
	}
	
}
