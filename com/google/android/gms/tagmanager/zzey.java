/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.tagmanager.zzew;
import com.google.android.gms.tagmanager.zzex;
import com.google.android.gms.tagmanager.zzez;
import com.google.android.gms.tagmanager.zzfa;

final class zzey
implements zzew {
    final /* synthetic */ zzfa zza;
    private final Handler zzb;

    public /* synthetic */ zzey(zzfa zzfa2, zzez object) {
        this.zza = zzfa2;
        zzfa2 = zzfa.zzd(zzfa2).getMainLooper();
        zzex zzex2 = new zzex(this);
        super((Looper)zzfa2, zzex2);
        this.zzb = object;
    }

    private final Message zzd() {
        Handler handler = this.zzb;
        Object object = zzfa.zzh();
        return handler.obtainMessage(1, object);
    }

    public final void zza() {
        Handler handler = this.zzb;
        Object object = zzfa.zzh();
        handler.removeMessages(1, object);
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Object object = zzfa.zzh();
        handler.removeMessages(1, object);
        handler = this.zzb;
        Message message = this.zzd();
        handler.sendMessage(message);
    }

    public final void zzc(long l2) {
        Handler handler = this.zzb;
        Object object = zzfa.zzh();
        handler.removeMessages(1, object);
        handler = this.zzb;
        Message message = this.zzd();
        handler.sendMessageDelayed(message, 1800000L);
    }
}

