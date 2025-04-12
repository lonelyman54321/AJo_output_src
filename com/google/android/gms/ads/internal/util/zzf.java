/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzfuv;

public final class zzf
extends zzfuv {
    public zzf(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
            return;
        }
        catch (Exception exception) {
            zzu.zzo().zzw(exception, "AdMobHandler.handleMessage");
            return;
        }
    }

    public final void zza(Message message) {
        try {
            super.zza(message);
            return;
        }
        catch (Throwable throwable) {
            zzu.zzp();
            zzt.zzM(zzu.zzo().zzd(), throwable);
            throw throwable;
        }
    }
}

