/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zztf;

final class zztd
extends Handler {
    final /* synthetic */ zztf zza;

    public zztd(zztf zztf2, Looper looper) {
        this.zza = zztf2;
        super(looper);
    }

    public final void handleMessage(Message message) {
        zztf.zza(this.zza, message);
    }
}

