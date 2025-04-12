/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbd;
import com.google.android.gms.internal.auth-api.zbe;
import com.google.android.gms.internal.auth-api.zbg;

final class zbf
extends zbd {
    final /* synthetic */ zbg zba;

    public zbf(zbg zbg2) {
        this.zba = zbg2;
    }

    public final void zbb(Status status, Credential credential) {
        zbg zbg2 = this.zba;
        zbe zbe2 = new zbe(status, credential);
        zbg2.setResult(zbe2);
    }

    public final void zbc(Status status) {
        zbg zbg2 = this.zba;
        zbe zbe2 = new zbe(status, null);
        zbg2.setResult(zbe2);
    }
}

