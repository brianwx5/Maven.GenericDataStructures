package Table;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {

    private ArrayList<Entry<K,V>> entries;


    public Table() {
        this.entries = new ArrayList();
    }

    public V get(K foo) {
        for (Entry<K, V> entry : entries) {
            if(entry.getKey().equals(foo)) {
                return entry.getValue();
            }

        } return null;
    }

    public void put(K foo, V i) {
        remove(foo);
        entries.add(new Entry<K,V>(foo,i));
    }

    public void remove(K foo) {
        for (Entry<K, V> entry : entries) {
            if(entry.getKey().equals(foo)) {
                entries.remove(entry);
                break;
            }
        }
        //entries = entries.stream().filter(x -> !x.getKey().equals(key)).collect(Collectors.toCollection(ArrayList::new));
    }
}
