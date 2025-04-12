/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfx;
import com.google.android.gms.internal.ads.zzfz;

final class zzfy
implements zzfa {
    private Message zza;
    private zzfz zzb;

    private zzfy() {
        throw null;
    }

    public /* synthetic */ zzfy(zzfx zzfx2) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfz.zzl(this);
    }

    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zzd();
    }

    public final zzfy zzb(Message message, zzfz zzfz2) {
        this.zza = message;
        this.zzb = zzfz2;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean bl2 = handler.sendMessageAtFrontOfQueue(message);
        this.zzd();
        return bl2;
    }
}

