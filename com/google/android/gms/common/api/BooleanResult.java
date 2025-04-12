/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public class BooleanResult
implements Result {
    private final Status zaa;
    private final boolean zab;

    public BooleanResult(Status status, boolean bl2) {
        this.zaa = status = (Status)Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof BooleanResult;
        if (!bl4) {
            return false;
        }
        object = (BooleanResult)object;
        Status status = this.zaa;
        Status status2 = ((BooleanResult)object).zaa;
        bl4 = status.equals(status2);
        if (bl4 && (bl4 = this.zab) == (bl2 = ((BooleanResult)object).zab)) {
            return bl3;
        }
        return false;
    }

    public Status getStatus() {
        return this.zaa;
    }

    public boolean getValue() {
        return this.zab;
    }

    public final int hashCode() {
        int n3 = (this.zaa.hashCode() + 527) * 31;
        int n4 = this.zab;
        return n3 + n4;
    }
}

