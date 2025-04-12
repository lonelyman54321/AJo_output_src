/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.auth.api.signin.internal.zbk;
import com.google.android.gms.common.api.Status;

final class zbj
extends zba {
    final /* synthetic */ zbk zba;

    public zbj(zbk zbk2) {
        this.zba = zbk2;
    }

    public final void zbb(Status status) {
        this.zba.setResult(status);
    }
}

