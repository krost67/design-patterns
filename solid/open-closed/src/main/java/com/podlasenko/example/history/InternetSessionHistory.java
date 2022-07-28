package com.podlasenko.example.history;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class InternetSessionHistory {

    private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

    @Data
    @AllArgsConstructor
    public static class InternetSession {
        private Long subscriberId;
        private LocalDateTime begin;
        private Long dataUsed;
    }

    public static List<InternetSession> getCurrentSessions(Long subscriberId) {
        if (!SESSIONS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return SESSIONS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId,
                                               LocalDateTime begin,
                                               Long dataUsed) {
        List<InternetSession> sessions;
        if (!SESSIONS.containsKey(subscriberId)) {
            sessions = new LinkedList<>();
            SESSIONS.put(subscriberId, sessions);
        } else {
            sessions = SESSIONS.get(subscriberId);
        }
        sessions.add(new InternetSession(subscriberId, begin, dataUsed));
    }
}