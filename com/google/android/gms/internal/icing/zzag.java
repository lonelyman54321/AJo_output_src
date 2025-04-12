/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.internal.icing.zzaj;
import com.google.android.gms.internal.icing.zzak;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zzx;

final class zzag
extends zzaj {
    final /* synthetic */ zzx[] zza;

    public zzag(zzal zzal2, GoogleApiClient googleApiClient, zzx[] zzxArray) {
        this.zza = zzxArray;
        super(googleApiClient);
    }

    public final void zza(zzaa zzaa2) {
        zzak zzak2 = new zzak(this);
        zzx[] zzxArray = this.zza;
        zzaa2.zzd(zzak2, null, zzxArray);
    }
}

