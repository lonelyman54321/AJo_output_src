/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.retries;

import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.RetryStrategy;

public final class Retries {
    private Retries() {
    }

    public static Object retry(int n3, Object object, Function function, RetryStrategy retryStrategy) {
        Object object2;
        int n4 = 1;
        if (n3 < n4) {
            return function.apply(object);
        }
        while ((object = retryStrategy.shouldRetry(object, object2 = function.apply(object))) != null && (n3 += -1) >= n4) {
        }
        return object2;
    }
}

