/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import com.ril.ajio.services.data.StatusNew;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SaveForLaterResponse {
    private StatusNew status;
    private Integer statusCode;

    public SaveForLaterResponse() {
        this(null, null, 3, null);
    }

    public SaveForLaterResponse(Integer n3, StatusNew statusNew) {
        this.statusCode = n3;
        this.status = statusNew;
    }

    public /* synthetic */ SaveForLaterResponse(Integer n3, StatusNew statusNew, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = null;
        }
        if ((n4 &= 2) != 0) {
            statusNew = null;
        }
        this(n3, statusNew);
    }

    public final StatusNew getStatus() {
        return this.status;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final void setStatus(StatusNew statusNew) {
        this.status = statusNew;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }
}

