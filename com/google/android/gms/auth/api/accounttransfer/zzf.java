/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzg;
import com.google.android.gms.auth.api.accounttransfer.zzj;
import com.google.android.gms.auth.api.accounttransfer.zzl;

final class zzf
extends zzj {
    final /* synthetic */ zzg zza;

    public zzf(zzg zzg2, zzl zzl2) {
        this.zza = zzg2;
        super(zzl2);
    }

    public final void zzc(DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}

