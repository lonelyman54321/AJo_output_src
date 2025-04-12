/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod;
import com.google.protobuf.Internal$EnumVerifier;

final class NetworkRequestMetric$HttpMethod$HttpMethodVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        NetworkRequestMetric$HttpMethod$HttpMethodVerifier networkRequestMetric$HttpMethod$HttpMethodVerifier = new NetworkRequestMetric$HttpMethod$HttpMethodVerifier();
        INSTANCE = networkRequestMetric$HttpMethod$HttpMethodVerifier;
    }

    private NetworkRequestMetric$HttpMethod$HttpMethodVerifier() {
    }

    public boolean isInRange(int n3) {
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.forNumber(n3);
        if (networkRequestMetric$HttpMethod != null) {
            n3 = 1;
        } else {
            n3 = 0;
            networkRequestMetric$HttpMethod = null;
        }
        return n3 != 0;
    }
}

