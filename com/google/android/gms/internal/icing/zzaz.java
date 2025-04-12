/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.icing.zzaw;
import com.google.android.gms.internal.icing.zzba;
import com.google.android.gms.internal.icing.zzbb;
import com.google.android.gms.search.GoogleNowAuthState;

final class zzaz
extends zzaw {
    final /* synthetic */ zzba zza;

    public zzaz(zzba zzba2) {
        this.zza = zzba2;
    }

    public final void zzb(Status status, GoogleNowAuthState googleNowAuthState) {
        zzba.zza(this.zza);
        zzba zzba2 = this.zza;
        zzbb zzbb2 = new zzbb(status, googleNowAuthState);
        zzba2.setResult(zzbb2);
    }
}

