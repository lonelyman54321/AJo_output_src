/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason;
import com.google.protobuf.Internal$EnumVerifier;

final class NetworkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        NetworkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier networkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier = new NetworkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier();
        INSTANCE = networkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier;
    }

    private NetworkRequestMetric$NetworkClientErrorReason$NetworkClientErrorReasonVerifier() {
    }

    public boolean isInRange(int n3) {
        NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason = NetworkRequestMetric$NetworkClientErrorReason.forNumber(n3);
        if (networkRequestMetric$NetworkClientErrorReason != null) {
            n3 = 1;
        } else {
            n3 = 0;
            networkRequestMetric$NetworkClientErrorReason = null;
        }
        return n3 != 0;
    }
}

