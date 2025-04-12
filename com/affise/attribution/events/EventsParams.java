/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

public final class EventsParams {
    public static final String EVENTS_DIR_NAME = "affise-events";
    public static final int EVENTS_SEND_COUNT = 100;
    public static final int EVENTS_STORE_TIME = 604800000;
    public static final EventsParams INSTANCE;

    static {
        EventsParams eventsParams;
        INSTANCE = eventsParams = new EventsParams();
    }

    private EventsParams() {
    }
}

