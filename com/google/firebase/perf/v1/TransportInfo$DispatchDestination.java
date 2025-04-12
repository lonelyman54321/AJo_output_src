/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.TransportInfo$DispatchDestination$1;
import com.google.firebase.perf.v1.TransportInfo$DispatchDestination$DispatchDestinationVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class TransportInfo$DispatchDestination
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ TransportInfo$DispatchDestination[] $VALUES;
    public static final /* enum */ TransportInfo$DispatchDestination FL_LEGACY_V1;
    public static final int FL_LEGACY_V1_VALUE = 1;
    public static final /* enum */ TransportInfo$DispatchDestination SOURCE_UNKNOWN;
    public static final int SOURCE_UNKNOWN_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ TransportInfo$DispatchDestination[] $values() {
        TransportInfo$DispatchDestination transportInfo$DispatchDestination = SOURCE_UNKNOWN;
        transportInfo$DispatchDestination = FL_LEGACY_V1;
        TransportInfo$DispatchDestination[] transportInfo$DispatchDestinationArray = new TransportInfo$DispatchDestination[]{transportInfo$DispatchDestination, transportInfo$DispatchDestination};
        return transportInfo$DispatchDestinationArray;
    }

    static {
        Object object = new TransportInfo$DispatchDestination("SOURCE_UNKNOWN", 0, 0);
        SOURCE_UNKNOWN = object;
        int n3 = 1;
        object = new TransportInfo$DispatchDestination("FL_LEGACY_V1", n3, n3);
        FL_LEGACY_V1 = object;
        $VALUES = TransportInfo$DispatchDestination.$values();
        internalValueMap = object = new TransportInfo$DispatchDestination$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TransportInfo$DispatchDestination() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static TransportInfo$DispatchDestination forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return FL_LEGACY_V1;
        }
        return SOURCE_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return TransportInfo$DispatchDestination$DispatchDestinationVerifier.INSTANCE;
    }

    public static TransportInfo$DispatchDestination valueOf(int n3) {
        return TransportInfo$DispatchDestination.forNumber(n3);
    }

    public static TransportInfo$DispatchDestination valueOf(String string2) {
        return Enum.valueOf(TransportInfo$DispatchDestination.class, string2);
    }

    public static TransportInfo$DispatchDestination[] values() {
        return (TransportInfo$DispatchDestination[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

