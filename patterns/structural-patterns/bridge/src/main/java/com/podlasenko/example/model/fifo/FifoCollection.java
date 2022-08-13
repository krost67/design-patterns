package com.podlasenko.example.model.fifo;

public interface FifoCollection<T> {

    void offer(T element);

    T poll();
}
