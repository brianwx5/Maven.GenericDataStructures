package TableNested;

import Table.Entry;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }


    }

    private ArrayList<Entry<K,V>> entries;


    public TableNested() {
        this.entries = new ArrayList();
    }

    public V get(K foo) {
        for (Entry<K, V> entry : entries) {
            if(entry.key.equals(foo)) {
                return entry.value;
            }

        } return null;
    }

    public void put(K foo, V i) {
        remove(foo);
        entries.add(new Entry<K,V>(foo,i));
    }

    public void remove(K foo) {
        for (Entry<K, V> entry : entries) {
            if(entry.key.equals(foo)) {
                entries.remove(entry);
                break;
            }
        }
        //entries = entries.stream().filter(x -> !x.getKey().equals(key)).collect(Collectors.toCollection(ArrayList::new));
    }

}
