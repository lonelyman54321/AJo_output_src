/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderResult
implements Result,
Releasable {
    protected final DataHolder mDataHolder;
    protected final Status mStatus;

    public DataHolderResult(DataHolder dataHolder) {
        int n3 = dataHolder.getStatusCode();
        Status status = new Status(n3);
        this(dataHolder, status);
    }

    public DataHolderResult(DataHolder dataHolder, Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}

