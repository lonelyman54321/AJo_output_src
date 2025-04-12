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
import com.google.android.gms.common.internal.zzc;

abstract class zza
extends zzc {
    public final int zza;
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    public zza(BaseGmsClient baseGmsClient, int n3, Bundle bundle) {
        this.zzc = baseGmsClient;
        Boolean bl2 = Boolean.TRUE;
        super(baseGmsClient, bl2);
        this.zza = n3;
        this.zzb = bundle;
    }

    public abstract void zzb(ConnectionResult var1);

    public final void zzc() {
    }

    public abstract boolean zzd();
}

