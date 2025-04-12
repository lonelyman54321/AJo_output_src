/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

public final class zzh
implements Runnable {
    public final /* synthetic */ CloudMessagingReceiver zza;
    public final /* synthetic */ Intent zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ BroadcastReceiver.PendingResult zze;

    public /* synthetic */ zzh(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean bl2, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = cloudMessagingReceiver;
        this.zzb = intent;
        this.zzc = context;
        this.zzd = bl2;
        this.zze = pendingResult;
    }

    public final void run() {
        CloudMessagingReceiver cloudMessagingReceiver = this.zza;
        Intent intent = this.zzb;
        Context context = this.zzc;
        boolean bl2 = this.zzd;
        BroadcastReceiver.PendingResult pendingResult = this.zze;
        cloudMessagingReceiver.zza(intent, context, bl2, pendingResult);
    }
}

