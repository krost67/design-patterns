package com.podlasenko.example.correct;

import com.podlasenko.example.history.InternetSessionHistory;

import java.util.List;

public class InternetSubscriber extends Subscriber {

    private Long freeUsage;

    @Override
    public Double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(this.getSubscriberId());
        Long totalData = sessions.stream()
                .mapToLong(InternetSessionHistory.InternetSession::getDataUsed)
                .sum();
        Long chargeableData = totalData - freeUsage;

        return (double) (chargeableData * this.getBaseRate() / 100);
    }
}