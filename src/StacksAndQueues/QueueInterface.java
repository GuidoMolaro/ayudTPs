package tps.StacksAndQueues;

import tps.utils.IsEmptyException;

public interface QueueInterface<T> {

    void enqueue(T element);
    T dequeue() throws IsEmptyException;
    boolean isEmpty();
    int size();

}
