import java.util.*;

public class HashST<Key, Value> 
{
	private int m = 1024;
	
	private Node[] lists = new Node[m];
	
	private class Node{
		private Object key;
		private Object val;
		private Node next;
		public Node(Object key, Object val, Node next){
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	
	private int hash(Key key){
		return Math.abs(key.hashCode() % m);
		}
	public Value get(Key key){
		int i = hash(key);
		for (Node x = lists[i]; x != null; x = x.next){
			if (key.equals(x.key))
			return (Value) x.val;
		}
		return null;
	}
	
	public void put(Key key, Value val) {
		int i = hash(key);
		for(Node x = lists[i]; x != null; x = x.next){
			if(key.equals(x.key)){
				x.val = val;
				return;
			}
		}
		lists[i] = new Node(key, val, lists[i]);
	}
	
	
	
	public boolean contains(Key key){
		return get(key) != null;
	}
	
	public int size(){
		int c = 0;
		for(int i = 0; i < m; i++){
			for(Node x = lists[i]; x != null; x = x.next){
				c++;
			}
		}
		return c;
	}
	
	public Iterable<Key> keys(){
		Queue<Key> q = new LinkedList<>();
		for(int i = 0; i < m; i++){
			for(Node x = lists[i]; x != null; x = x.next){
				q.add((Key) x.key);
			}
		}
		return q;
	}	
}
