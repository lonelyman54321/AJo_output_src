/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType;
import com.google.protobuf.Internal$EnumVerifier;

final class NetworkConnectionInfo$NetworkType$NetworkTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        NetworkConnectionInfo$NetworkType$NetworkTypeVerifier networkConnectionInfo$NetworkType$NetworkTypeVerifier = new NetworkConnectionInfo$NetworkType$NetworkTypeVerifier();
        INSTANCE = networkConnectionInfo$NetworkType$NetworkTypeVerifier;
    }

    private NetworkConnectionInfo$NetworkType$NetworkTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = NetworkConnectionInfo$NetworkType.forNumber(n3);
        if (networkConnectionInfo$NetworkType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            networkConnectionInfo$NetworkType = null;
        }
        return n3 != 0;
    }
}

