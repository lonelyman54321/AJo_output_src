/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.zza;

public final class zzg
extends zza {
    final /* synthetic */ BaseGmsClient zze;

    public zzg(BaseGmsClient baseGmsClient, int n3, Bundle bundle) {
        this.zze = baseGmsClient;
        super(baseGmsClient, n3, bundle);
    }

    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zze;
        boolean bl2 = baseGmsClient.enableLocalFallback();
        if (bl2 && (bl2 = BaseGmsClient.zzo(baseGmsClient = this.zze))) {
            BaseGmsClient.zzk(this.zze, 16);
            return;
        }
        this.zze.zzc.onReportServiceBinding(connectionResult);
        this.zze.onConnectionFailed(connectionResult);
    }

    public final boolean zzd() {
        BaseGmsClient$ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks = this.zze.zzc;
        ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
        baseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(connectionResult);
        return true;
    }
}

