
public class LinkedList<T> {
	private T item;
	private LinkedList<T> past;
	private LinkedList<T> next;
	
	
	

	
	public boolean has(T item){
		LinkedList<T> link = getFirst();
		while(link != null){
			if(link.item.equals(item)){
				return true;
			}
			link = link.next;
		}
		return false;
	}
	public T get(int position){
		LinkedList<T> link = getFirst();
		for(int i=0;i<position;i++){
			link = link.next;
			if(link == null){
				return null;
			}
		}
		return link.item;
	}
	public void append(T item){
		LinkedList<T> link = new LinkedList<T>();
		LinkedList<T> last = getLast();
		last.next = link;
		link.past = last;
		return;
	}
	public void prepend(T item){
		LinkedList<T> link = new LinkedList<T>();
		LinkedList<T> first = getLast();
		first.past = link;
		link.next = first;
		return;
	}
	public int indexOf(T item){
		LinkedList<T> link = getFirst();
		int index = 0;
		while(link.next != null){
			if(link.item.equals(item)){
				return index;
			}
			index++;
			link = link.next;
		}
		return -1;
	}
	public boolean remove(T item){
		LinkedList<T> link = getFirst();
		while(link != null){
			if(link.item.equals(item)){
				link.past.next = link.next;
				link.next.past = link.past;
				link = null;
				return true;
			}
			link = link.next;
		}
		return false;
	}
	public LinkedList<T> reversed(){
		LinkedList<T> first = getFirst();
		LinkedList<T> link = new LinkedList<T>();
		while(first != null){
			link = first.next;
			first.next = first.past;
			first.past = link;
			first = link;
		}
		return first;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private LinkedList<T> getFirst(){
		LinkedList<T> first = this;
		while(first.past != null){
			first = first.past;
		}
		return first;
	}
	
	
	private LinkedList<T> getLast(){
		LinkedList<T> last = this;
		while(last.next != null){
			last = last.next;
		}
		return last;
	}

}
