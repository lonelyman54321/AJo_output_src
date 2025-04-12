/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.api.Status;

final class zbh
extends zba {
    final /* synthetic */ zbi zba;

    public zbh(zbi zbi2) {
        this.zba = zbi2;
    }

    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}

