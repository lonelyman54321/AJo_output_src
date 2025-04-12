/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi$ActionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.icing.zzaf;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zzx;

final class zzah
implements AppIndexApi$ActionResult {
    private final zzal zza;
    private final PendingResult zzb;
    private final Action zzc;

    public zzah(zzal zzal2, PendingResult pendingResult, Action action) {
        this.zza = zzal2;
        this.zzb = pendingResult;
        this.zzc = action;
    }

    public final PendingResult end(GoogleApiClient googleApiClient) {
        Object object = googleApiClient.getContext().getPackageName();
        long l2 = System.currentTimeMillis();
        object = zzaf.zza(this.zzc, l2, (String)object, 2);
        zzal zzal2 = this.zza;
        zzx[] zzxArray = new zzx[]{object};
        return zzal2.zza(googleApiClient, zzxArray);
    }

    public final PendingResult getPendingResult() {
        return this.zzb;
    }
}

