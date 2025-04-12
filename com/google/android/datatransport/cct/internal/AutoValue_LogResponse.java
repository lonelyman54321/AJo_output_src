/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogResponse;

final class AutoValue_LogResponse
extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long l2) {
        this.nextRequestWaitMillis = l2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof LogResponse;
        if (bl3) {
            long l2 = this.nextRequestWaitMillis;
            long l3 = ((LogResponse)(object = (LogResponse)object)).getNextRequestWaitMillis();
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long l2 = this.nextRequestWaitMillis;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^ l3);
        return 0xF4243 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        long l2 = this.nextRequestWaitMillis;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

