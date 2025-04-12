/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.internal.service.zaa;

final class zad
extends zaa {
    private final BaseImplementation$ResultHolder zaa;

    public zad(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zaa = baseImplementation$ResultHolder;
    }

    public final void zab(int n3) {
        Status status = new Status(n3);
        this.zaa.setResult(status);
    }
}

