/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype;
import com.google.protobuf.Internal$EnumVerifier;

final class NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier networkConnectionInfo$MobileSubtype$MobileSubtypeVerifier = new NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier();
        INSTANCE = networkConnectionInfo$MobileSubtype$MobileSubtypeVerifier;
    }

    private NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier() {
    }

    public boolean isInRange(int n3) {
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = NetworkConnectionInfo$MobileSubtype.forNumber(n3);
        if (networkConnectionInfo$MobileSubtype != null) {
            n3 = 1;
        } else {
            n3 = 0;
            networkConnectionInfo$MobileSubtype = null;
        }
        return n3 != 0;
    }
}

