package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {
    private E getFirst;
    private E getSecond;

    public Pair (E first, E second) {
        this.getFirst = first;
        this.getSecond = second;
    }

    public E getFirst() {
        return getFirst;
    }

    public E getSecond() {
        return getSecond;
    }

    public E min() {
        if(getFirst.compareTo(getSecond) < 0) {
            return getFirst;
        } else {
            return getSecond;
        }
    }

    public E max() {
        if(getFirst.compareTo(getSecond) > 0) {
            return getFirst;
        } else {
            return getSecond;
        }
    }
}
