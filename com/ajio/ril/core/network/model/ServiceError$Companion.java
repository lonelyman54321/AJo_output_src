/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.model;

public final class ServiceError$Companion {
    static final /* synthetic */ ServiceError$Companion $$INSTANCE;
    public static final int API_TIME_OUT = 2;
    public static final int EOF_EXCEPTION = 6;
    public static final int NO_INTERNET_CONNECTION = 0;
    public static final int NO_INTERNET_RETRY_INITIATED = 4;
    public static final int NO_INTERNET_RETRY_SUCCESS = 5;
    public static final int NO_SERVER_CONNECTION = 1;
    public static final int OTHERS_ERRORS = 3;

    static {
        ServiceError$Companion serviceError$Companion;
        $$INSTANCE = serviceError$Companion = new ServiceError$Companion();
    }

    private ServiceError$Companion() {
    }
}

