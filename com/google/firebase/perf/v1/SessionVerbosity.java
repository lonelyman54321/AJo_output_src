/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.SessionVerbosity$1;
import com.google.firebase.perf.v1.SessionVerbosity$SessionVerbosityVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class SessionVerbosity
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ SessionVerbosity[] $VALUES;
    public static final /* enum */ SessionVerbosity GAUGES_AND_SYSTEM_EVENTS;
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final /* enum */ SessionVerbosity SESSION_VERBOSITY_NONE;
    public static final int SESSION_VERBOSITY_NONE_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ SessionVerbosity[] $values() {
        SessionVerbosity sessionVerbosity = SESSION_VERBOSITY_NONE;
        sessionVerbosity = GAUGES_AND_SYSTEM_EVENTS;
        SessionVerbosity[] sessionVerbosityArray = new SessionVerbosity[]{sessionVerbosity, sessionVerbosity};
        return sessionVerbosityArray;
    }

    static {
        Object object = new SessionVerbosity("SESSION_VERBOSITY_NONE", 0, 0);
        SESSION_VERBOSITY_NONE = object;
        int n3 = 1;
        object = new SessionVerbosity("GAUGES_AND_SYSTEM_EVENTS", n3, n3);
        GAUGES_AND_SYSTEM_EVENTS = object;
        $VALUES = SessionVerbosity.$values();
        internalValueMap = object = new SessionVerbosity$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SessionVerbosity() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static SessionVerbosity forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return SessionVerbosity$SessionVerbosityVerifier.INSTANCE;
    }

    public static SessionVerbosity valueOf(int n3) {
        return SessionVerbosity.forNumber(n3);
    }

    public static SessionVerbosity valueOf(String string2) {
        return Enum.valueOf(SessionVerbosity.class, string2);
    }

    public static SessionVerbosity[] values() {
        return (SessionVerbosity[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

