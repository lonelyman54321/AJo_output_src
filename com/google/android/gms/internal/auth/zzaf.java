/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzag;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzal;

final class zzaf
extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzag2) {
        this.zza = zzag2;
    }

    public final void zzc(boolean bl2) {
        zzag zzag2 = this.zza;
        Status status = bl2 ? Status.RESULT_SUCCESS : zzal.zza();
        zzak zzak2 = new zzak(status);
        zzag2.setResult(zzak2);
    }
}

