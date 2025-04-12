/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

public final class InternalParameters {
    public static final String AFFISE_INTERNAL_EVENT_DATA = "internal_event_data";
    public static final String AFFISE_INTERNAL_EVENT_ID = "internal_event_id";
    public static final String AFFISE_INTERNAL_EVENT_NAME = "internal_event_name";
    public static final String AFFISE_INTERNAL_EVENT_TIMESTAMP = "internal_event_timestamp";
    public static final InternalParameters INSTANCE;

    static {
        InternalParameters internalParameters;
        INSTANCE = internalParameters = new InternalParameters();
    }

    private InternalParameters() {
    }
}

