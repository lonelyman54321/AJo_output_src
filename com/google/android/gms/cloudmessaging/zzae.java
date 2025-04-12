/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.cloudmessaging.zzf;

final class zzae
extends zzf {
    final /* synthetic */ Rpc zza;

    public zzae(Rpc rpc, Looper looper) {
        this.zza = rpc;
        super(looper);
    }

    public final void handleMessage(Message message) {
        Rpc.zzc(this.zza, message);
    }
}

