/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfh;

public final class zzfc
implements Handler.Callback {
    public final /* synthetic */ zzfh zza;

    public /* synthetic */ zzfc(zzfh zzfh2) {
        this.zza = zzfh2;
    }

    public final boolean handleMessage(Message message) {
        zzfh.zzg(this.zza, message);
        return true;
    }
}

