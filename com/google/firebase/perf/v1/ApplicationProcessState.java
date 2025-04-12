/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationProcessState$1;
import com.google.firebase.perf.v1.ApplicationProcessState$ApplicationProcessStateVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class ApplicationProcessState
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ ApplicationProcessState[] $VALUES;
    public static final /* enum */ ApplicationProcessState APPLICATION_PROCESS_STATE_UNKNOWN;
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final /* enum */ ApplicationProcessState BACKGROUND;
    public static final int BACKGROUND_VALUE = 2;
    public static final /* enum */ ApplicationProcessState FOREGROUND;
    public static final /* enum */ ApplicationProcessState FOREGROUND_BACKGROUND;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ ApplicationProcessState[] $values() {
        ApplicationProcessState applicationProcessState = APPLICATION_PROCESS_STATE_UNKNOWN;
        applicationProcessState = FOREGROUND;
        applicationProcessState = BACKGROUND;
        applicationProcessState = FOREGROUND_BACKGROUND;
        ApplicationProcessState[] applicationProcessStateArray = new ApplicationProcessState[]{applicationProcessState, applicationProcessState, applicationProcessState, applicationProcessState};
        return applicationProcessStateArray;
    }

    static {
        Object object = new ApplicationProcessState("APPLICATION_PROCESS_STATE_UNKNOWN", 0, 0);
        APPLICATION_PROCESS_STATE_UNKNOWN = object;
        int n3 = 1;
        object = new ApplicationProcessState("FOREGROUND", n3, n3);
        FOREGROUND = object;
        n3 = 2;
        object = new ApplicationProcessState("BACKGROUND", n3, n3);
        BACKGROUND = object;
        n3 = 3;
        object = new ApplicationProcessState("FOREGROUND_BACKGROUND", n3, n3);
        FOREGROUND_BACKGROUND = object;
        $VALUES = ApplicationProcessState.$values();
        internalValueMap = object = new ApplicationProcessState$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ApplicationProcessState() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ApplicationProcessState forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return ApplicationProcessState$ApplicationProcessStateVerifier.INSTANCE;
    }

    public static ApplicationProcessState valueOf(int n3) {
        return ApplicationProcessState.forNumber(n3);
    }

    public static ApplicationProcessState valueOf(String string2) {
        return Enum.valueOf(ApplicationProcessState.class, string2);
    }

    public static ApplicationProcessState[] values() {
        return (ApplicationProcessState[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

