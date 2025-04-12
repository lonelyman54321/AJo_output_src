/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbs;
import com.google.android.gms.internal.auth.zzbv;

final class zzbr
extends zzbd {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbs2) {
        this.zza = zzbs2;
    }

    public final void zzc(String object) {
        if (object != null) {
            zzbs zzbs2 = this.zza;
            zzbv zzbv2 = new zzbv((String)object);
            zzbs2.setResult(zzbv2);
            return;
        }
        object = this.zza;
        Status status = new Status(3006);
        zzbv zzbv3 = new zzbv(status);
        ((BasePendingResult)object).setResult(zzbv3);
    }
}

