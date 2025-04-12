/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.icing.zzaw;
import com.google.android.gms.internal.icing.zzay;

final class zzax
extends zzaw {
    final /* synthetic */ zzay zza;

    public zzax(zzay zzay2) {
        this.zza = zzay2;
    }

    public final void zzc(Status status) {
        zzay.zza(this.zza);
        this.zza.setResult(status);
    }
}

