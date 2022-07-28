package com.podlasenko.example.wrong;

import com.podlasenko.example.history.CallHistory;
import lombok.Data;

import java.util.List;

@Data
public class PhoneSubscriber {

    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

    public Double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream()
                .mapToLong(CallHistory.Call::getDuration)
                .sum();

        return (double) (totalDuration * baseRate / 100);
    }
}