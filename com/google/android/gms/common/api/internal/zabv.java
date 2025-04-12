/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.zaag;
import com.google.android.gms.common.api.internal.zada;

public final class zabv
extends zaag {
    private final GoogleApi zaa;

    public zabv(GoogleApi googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zaa = googleApi;
    }

    public final BaseImplementation$ApiMethodImpl enqueue(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        return this.zaa.doRead(baseImplementation$ApiMethodImpl);
    }

    public final BaseImplementation$ApiMethodImpl execute(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        return this.zaa.doWrite(baseImplementation$ApiMethodImpl);
    }

    public final Context getContext() {
        return this.zaa.getApplicationContext();
    }

    public final Looper getLooper() {
        return this.zaa.getLooper();
    }

    public final void zao(zada zada2) {
    }

    public final void zap(zada zada2) {
    }
}

