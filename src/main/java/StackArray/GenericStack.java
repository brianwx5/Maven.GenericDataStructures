package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public boolean isEmpty() {
        if(elements.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(E foobar) {
        elements = Arrays.copyOf(elements,elements.length+1);
        int lastPosition = elements.length-1;
        elements[lastPosition] = foobar;

    }

    public E pop() {
        E item = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return item;
    }
}
