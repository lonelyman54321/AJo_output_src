/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzf;
import com.google.android.play.core.splitinstall.zzx;

final class zzv
implements zzf {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ Intent zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzx zzd;

    public zzv(zzx zzx2, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.zzd = zzx2;
        this.zza = splitInstallSessionState;
        this.zzb = intent;
        this.zzc = context;
    }

    public final void zza() {
        zzx zzx2 = this.zzd;
        SplitInstallSessionState splitInstallSessionState = this.zza;
        zzx.zzh(zzx2, splitInstallSessionState, 5, 0);
    }

    public final void zzb(int n3) {
        zzx zzx2 = this.zzd;
        SplitInstallSessionState splitInstallSessionState = this.zza;
        zzx.zzh(zzx2, splitInstallSessionState, 6, n3);
    }

    public final void zzc() {
        Object object = this.zzb;
        Object[] objectArray = "triggered_from_app_after_verification";
        boolean bl2 = object.getBooleanExtra((String)objectArray, false);
        if (!bl2) {
            this.zzb.putExtra((String)objectArray, true);
            object = this.zzc;
            objectArray = this.zzb;
            object.sendBroadcast((Intent)objectArray);
            return;
        }
        object = zzx.zzf(this.zzd);
        objectArray = new Object[]{};
        ((zzu)object).zzb("Splits copied and verified more than once.", objectArray);
    }
}

