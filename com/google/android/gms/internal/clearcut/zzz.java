/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.zzy;

final class zzz
extends ContentObserver {
    public zzz(Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl2) {
        zzy.zze().set(true);
    }
}

