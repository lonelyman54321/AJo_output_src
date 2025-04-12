/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.internal.auth-api.zbd;

final class zbk
extends zbd {
    private final BaseImplementation$ResultHolder zba;

    public zbk(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zba = baseImplementation$ResultHolder;
    }

    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}

