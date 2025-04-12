/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters;

public final class Parameters {
    public static final String AFFISE_EVENTS_COUNT = "affise_events_count";
    public static final String AFFISE_EVENT_CATEGORY = "affise_event_category";
    public static final String AFFISE_EVENT_DATA = "affise_event_data";
    public static final String AFFISE_EVENT_FIRST_FOR_USER = "affise_event_first_for_user";
    public static final String AFFISE_EVENT_ID = "affise_event_id";
    public static final String AFFISE_EVENT_ID_INDEX = "affise_event_id_index";
    public static final String AFFISE_EVENT_NAME = "affise_event_name";
    public static final String AFFISE_EVENT_TIMESTAMP = "affise_event_timestamp";
    public static final String AFFISE_EVENT_USER_DATA = "affise_event_user_data";
    public static final String AFFISE_INTERNAL_EVENTS_COUNT = "affise_internal_events_count";
    public static final String AFFISE_METRICS_EVENTS_COUNT = "affise_metrics_events_count";
    public static final String AFFISE_PARAMETERS = "affise_parameters";
    public static final String AFFISE_SDK_EVENTS_COUNT = "affise_sdk_events_count";
    public static final Parameters INSTANCE;

    static {
        Parameters parameters;
        INSTANCE = parameters = new Parameters();
    }

    private Parameters() {
    }
}

