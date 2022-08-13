package com.podlasenko.example.fifo;

import com.podlasenko.example.model.fifo.FifoCollection;
import com.podlasenko.example.model.fifo.Queue;
import com.podlasenko.example.model.list.ArrayLinkedList;
import com.podlasenko.example.model.list.NodeLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    private FifoCollection<Integer> arrayQueue;
    private FifoCollection<String> nodeQueue;

    @Before
    public void setup() {
        arrayQueue = new Queue<>(new ArrayLinkedList<>());
        nodeQueue = new Queue<>(new NodeLinkedList<>());
    }

    @Test
    public void poll_ShouldWorkAsExpected_UsingArrayQueue() {
        arrayQueue.offer(10);
        arrayQueue.offer(20);
        arrayQueue.offer(30);
        int firstElement = arrayQueue.poll();
        int secondElement = arrayQueue.poll();
        int thirdElement = arrayQueue.poll();

        assertEquals(10, firstElement);
        assertEquals(20, secondElement);
        assertEquals(30, thirdElement);
    }

    @Test
    public void poll_ShouldWorkAsExpected_UsingNodeQueue() {
        nodeQueue.offer("My");
        nodeQueue.offer("dear");
        nodeQueue.offer("friend");
        String firstElement = nodeQueue.poll();
        String secondElement = nodeQueue.poll();
        String thirdElement = nodeQueue.poll();

        assertEquals("My", firstElement);
        assertEquals("dear", secondElement);
        assertEquals("friend", thirdElement);
    }
}
