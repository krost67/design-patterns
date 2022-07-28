package com.podlasenko.example.correct;

import com.podlasenko.example.history.CallHistory;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

    @Override
    public Double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(this.getSubscriberId());
        long totalDuration = sessions.stream()
                .mapToLong(CallHistory.Call::getDuration)
                .sum();

        return (double) (totalDuration * this.getBaseRate() / 100);
    }
}