/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhx;

final class zzhs
extends ContentObserver {
    public zzhs(zzhq zzhq2, Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzhx.zzc();
    }
}

