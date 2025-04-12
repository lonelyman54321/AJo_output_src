/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;

final class AutoValue_BackendResponse
extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse$Status status;

    public AutoValue_BackendResponse(BackendResponse$Status object, long l2) {
        if (object != null) {
            this.status = object;
            this.nextRequestWaitMillis = l2;
            return;
        }
        super("Null status");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof BackendResponse;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            BackendResponse$Status backendResponse$Status = this.status;
            BackendResponse$Status backendResponse$Status2 = ((BackendResponse)(object = (BackendResponse)object)).getStatus();
            bl3 = ((Object)((Object)backendResponse$Status)).equals((Object)backendResponse$Status2);
            if (!bl3 || (l7 = (l4 = (l3 = this.nextRequestWaitMillis) - (l2 = ((BackendResponse)object).getNextRequestWaitMillis())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public BackendResponse$Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3 = ((Object)((Object)this.status)).hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        long l2 = this.nextRequestWaitMillis;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackendResponse{status=");
        BackendResponse$Status backendResponse$Status = this.status;
        stringBuilder.append((Object)backendResponse$Status);
        stringBuilder.append(", nextRequestWaitMillis=");
        long l2 = this.nextRequestWaitMillis;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

