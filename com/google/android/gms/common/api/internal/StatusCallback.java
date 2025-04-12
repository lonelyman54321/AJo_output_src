/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;

public class StatusCallback
extends IStatusCallback$Stub {
    private final BaseImplementation$ResultHolder resultHolder;

    public StatusCallback(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.resultHolder = baseImplementation$ResultHolder;
    }

    public void onResult(Status status) {
        this.resultHolder.setResult(status);
    }
}

