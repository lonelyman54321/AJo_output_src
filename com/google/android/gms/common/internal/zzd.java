/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.Log
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzk;

public final class zzd
extends zzac {
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int n3) {
        this.zza = baseGmsClient;
        this.zzb = n3;
    }

    public final void onPostInitComplete(int n3, IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.zza;
        int n4 = this.zzb;
        baseGmsClient.onPostInitHandler(n3, iBinder, bundle, n4);
        this.zza = null;
    }

    public final void zzb(int n3, Bundle bundle) {
        Exception exception = new Exception();
        Log.wtf((String)"GmsClient", (String)"received deprecated onAccountValidationComplete callback, ignoring", (Throwable)exception);
    }

    public final void zzc(int n3, IBinder iBinder, zzk zzk2) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzk2);
        BaseGmsClient.zzj(baseGmsClient, zzk2);
        zzk2 = zzk2.zza;
        this.onPostInitComplete(n3, iBinder, (Bundle)zzk2);
    }
}

