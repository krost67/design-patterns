package com.podlasenko.example.model.fifo;

import com.podlasenko.example.model.list.LinkedList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Queue<T> implements FifoCollection<T> {

    private final LinkedList<T> list;

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
