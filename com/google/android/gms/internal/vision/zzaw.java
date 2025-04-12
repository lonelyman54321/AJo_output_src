/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.vision;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.vision.zzau;

final class zzaw
extends ContentObserver {
    private final /* synthetic */ zzau zza;

    public zzaw(zzau zzau2, Handler handler) {
        this.zza = zzau2;
        super(null);
    }

    public final void onChange(boolean bl2) {
        this.zza.zza();
    }
}

