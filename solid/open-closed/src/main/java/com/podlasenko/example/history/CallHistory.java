package com.podlasenko.example.history;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CallHistory {

    private static final Map<Long, List<Call>> CALLS = new HashMap<>();

    @Data
    @AllArgsConstructor
    public static class Call {
        private Long subscriberId;
        private LocalDateTime begin;
        private Long duration;
    }

    public static List<Call> getCurrentCalls(Long subscriberId) {
        if (!CALLS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return CALLS.get(subscriberId);
    }

    public static void addSession(Long subscriberId,
                                  LocalDateTime begin,
                                  long duration) {
        List<Call> calls;
        if (!CALLS.containsKey(subscriberId)) {
            calls = new LinkedList<>();
            CALLS.put(subscriberId, calls);
        } else {
            calls = CALLS.get(subscriberId);
        }
        calls.add(new Call(subscriberId, begin, duration));
    }
}