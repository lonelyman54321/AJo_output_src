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
import com.google.android.gms.internal.vision.zzaq;

final class zzat
extends ContentObserver {
    public zzat(Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzaq.zza().set(true);
    }
}

