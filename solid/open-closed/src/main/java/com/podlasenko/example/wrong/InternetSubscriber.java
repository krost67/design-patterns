package com.podlasenko.example.wrong;

import com.podlasenko.example.history.InternetSessionHistory;
import lombok.Data;

import java.util.List;

@Data
public class InternetSubscriber {

    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private Integer baseRate;
    private Long freeUsage;

    public Double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        Long totalData = sessions.stream()
                .mapToLong(InternetSessionHistory.InternetSession::getDataUsed)
                .sum();
        Long chargeableData = totalData - freeUsage;

        return (double) (chargeableData * baseRate / 100);
    }
}