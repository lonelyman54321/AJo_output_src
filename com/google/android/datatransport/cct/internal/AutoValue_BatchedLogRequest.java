/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import java.util.List;

final class AutoValue_BatchedLogRequest
extends BatchedLogRequest {
    private final List logRequests;

    public AutoValue_BatchedLogRequest(List object) {
        if (object != null) {
            this.logRequests = object;
            return;
        }
        object = new NullPointerException("Null logRequests");
        throw object;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof BatchedLogRequest;
        if (bl2) {
            object = (BatchedLogRequest)object;
            List list = this.logRequests;
            object = ((BatchedLogRequest)object).getLogRequests();
            return list.equals(object);
        }
        return false;
    }

    public List getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BatchedLogRequest{logRequests=");
        List list = this.logRequests;
        stringBuilder.append(list);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

