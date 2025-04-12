/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 */
package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.plus.internal.zza;

final class zzk
extends zza {
    private final BaseImplementation$ResultHolder zzv;

    public zzk(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zzv = baseImplementation$ResultHolder;
    }

    public final void zza(int n3, Bundle bundle) {
        Object object;
        if (bundle != null) {
            object = "pendingIntent";
            bundle = (PendingIntent)bundle.getParcelable((String)object);
        } else {
            bundle = null;
        }
        object = new Status(n3, null, (PendingIntent)bundle);
        this.zzv.setResult(object);
    }
}

