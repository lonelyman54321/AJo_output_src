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
import com.google.android.gms.internal.auth.zzcb;

final class zzca
extends ContentObserver {
    public zzca(Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzcb.zzb().set(true);
    }
}

