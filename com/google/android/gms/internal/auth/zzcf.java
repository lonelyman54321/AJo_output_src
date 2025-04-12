/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.auth.zzcg;

final class zzcf
extends ContentObserver {
    final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcg2, Handler handler) {
        this.zza = zzcg2;
        super(null);
    }

    public final void onChange(boolean bl2) {
        this.zza.zze();
    }
}

