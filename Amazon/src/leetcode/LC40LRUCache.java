package leetcode;

import java.util.HashMap;

class Node{
    int key;
    int value;
    Node pre;
    Node next;
 
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LC40LRUCache {
 
    public static void main(String[] args){
    	LC40LRUCache lr=new LC40LRUCache(5);
    	lr.set(1, 1);
    	lr.set(2,2);
    	lr.set(3, 3);
    	lr.set(4, 4);
    	lr.set(5, 5);
    	int val=lr.get(1);
    	System.out.println(""+val);
    	lr.set(6, 6);
    	int val2=lr.get(2);
    	System.out.println(""+val2);
    }
    public LC40LRUCache(int capacity) {
        this.capacity=capacity;
        count=0;
        head = new DoubleLinkedList();
        tail = new DoubleLinkedList();
        head.pre = null;
        tail.post = null;
        head.post = tail;
        tail.pre = head;
    }
 
    private HashMap<Integer,DoubleLinkedList> cache = new HashMap<Integer,DoubleLinkedList>();
    private int capacity;
    private int count;
    private DoubleLinkedList head;
    private DoubleLinkedList tail;
    
    class DoubleLinkedList{
        int val;
        int key;
        DoubleLinkedList pre;
        DoubleLinkedList post;
    }
    
    private void addToList(DoubleLinkedList node){
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }
    
    private DoubleLinkedList deleteTail(){
        DoubleLinkedList del = tail.pre;
        tail.pre = del.pre;
        del.pre.post = tail;
        return del;
    }
    
    private void moveToHead(DoubleLinkedList node){
        node.pre.post = node.post;
        node.post.pre = node.pre;
        addToList(node);
    }

    public int get(int key) {
        DoubleLinkedList node = cache.get(key);
        if(node!=null){
            moveToHead(node);
            return node.val;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(cache.containsKey(key)){
            DoubleLinkedList node = cache.get(key);
            node.val=value;
            moveToHead(node);
        }
        else{
            DoubleLinkedList node = new DoubleLinkedList();
            node.val=value;
            node.key=key;
            cache.put(key,node);
            addToList(node);
            count++;
            if(count>capacity){
                cache.remove(deleteTail().key);
                count--;
            }
        }
    }
}

