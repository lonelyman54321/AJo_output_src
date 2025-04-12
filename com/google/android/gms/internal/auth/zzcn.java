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
import com.google.android.gms.internal.auth.zzco;
import com.google.android.gms.internal.auth.zzdc;

final class zzcn
extends ContentObserver {
    public zzcn(zzco zzco2, Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzdc.zzd();
    }
}

