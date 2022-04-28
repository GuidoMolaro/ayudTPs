package tps.StacksAndQueues;

import tps.utils.IsEmptyException;

public interface StackInterface<T> {
    
    boolean isEmpty();
    T peek();
    void pop() throws IsEmptyException;
    void stack(T element);
    int size();
    void empty();

}
