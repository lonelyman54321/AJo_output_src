/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 */
package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import com.google.android.gms.analytics.CampaignTrackingReceiver;

final class zzc
implements Runnable {
    final /* synthetic */ BroadcastReceiver.PendingResult zza;

    public zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.zza;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}

