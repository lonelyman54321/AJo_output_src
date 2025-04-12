/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.TransportInfo$DispatchDestination;
import com.google.protobuf.Internal$EnumVerifier;

final class TransportInfo$DispatchDestination$DispatchDestinationVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        TransportInfo$DispatchDestination$DispatchDestinationVerifier transportInfo$DispatchDestination$DispatchDestinationVerifier = new TransportInfo$DispatchDestination$DispatchDestinationVerifier();
        INSTANCE = transportInfo$DispatchDestination$DispatchDestinationVerifier;
    }

    private TransportInfo$DispatchDestination$DispatchDestinationVerifier() {
    }

    public boolean isInRange(int n3) {
        TransportInfo$DispatchDestination transportInfo$DispatchDestination = TransportInfo$DispatchDestination.forNumber(n3);
        if (transportInfo$DispatchDestination != null) {
            n3 = 1;
        } else {
            n3 = 0;
            transportInfo$DispatchDestination = null;
        }
        return n3 != 0;
    }
}

