/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzic;
import com.google.android.gms.internal.gtm.zzid;
import com.google.android.gms.internal.gtm.zzif;
import com.google.android.gms.internal.gtm.zzig;

final class zzie
implements zzic {
    final /* synthetic */ zzig zza;
    private final Handler zzb;

    public /* synthetic */ zzie(zzig zzig2, zzif object) {
        this.zza = zzig2;
        zzig2 = zzig.zzc(zzig2).getMainLooper();
        zzid zzid2 = new zzid(this);
        super((Looper)zzig2, zzid2);
        this.zzb = object;
    }

    private final Message zzd() {
        Handler handler = this.zzb;
        Object object = zzig.zzg();
        return handler.obtainMessage(1, object);
    }

    public final void zza() {
        Handler handler = this.zzb;
        Object object = zzig.zzg();
        handler.removeMessages(1, object);
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Object object = zzig.zzg();
        handler.removeMessages(1, object);
        handler = this.zzb;
        Message message = this.zzd();
        handler.sendMessage(message);
    }

    public final void zzc(long l2) {
        Handler handler = this.zzb;
        Object object = zzig.zzg();
        handler.removeMessages(1, object);
        handler = this.zzb;
        Message message = this.zzd();
        handler.sendMessageDelayed(message, 1800000L);
    }
}

