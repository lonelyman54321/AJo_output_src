/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

public final class InternalEventsParams {
    public static final InternalEventsParams INSTANCE;
    public static final String INTERNAL_EVENTS_DIR_NAME = "affise-internal-events";
    public static final int INTERNAL_EVENTS_SEND_COUNT = 100;
    public static final int INTERNAL_EVENTS_STORE_TIME = 604800000;

    static {
        InternalEventsParams internalEventsParams;
        INSTANCE = internalEventsParams = new InternalEventsParams();
    }

    private InternalEventsParams() {
    }
}

