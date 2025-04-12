/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zza;
import com.google.android.play.core.splitinstall.zzx;
import java.util.List;

final class zzw
implements Runnable {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzx zzd;

    public zzw(zzx zzx2, SplitInstallSessionState splitInstallSessionState, int n3, int n4) {
        this.zzd = zzx2;
        this.zza = splitInstallSessionState;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final void run() {
        zzx zzx2 = this.zzd;
        SplitInstallSessionState splitInstallSessionState = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        int n7 = splitInstallSessionState.sessionId();
        long l2 = splitInstallSessionState.bytesDownloaded();
        long l3 = splitInstallSessionState.totalBytesToDownload();
        List list = splitInstallSessionState.zzb();
        List list2 = splitInstallSessionState.zza();
        PendingIntent pendingIntent = splitInstallSessionState.resolutionIntent();
        List list3 = splitInstallSessionState.zzc();
        zza zza2 = new zza(n7, n3, n4, l2, l3, list, list2, pendingIntent, list3);
        zzx2.zzk(zza2);
    }
}

