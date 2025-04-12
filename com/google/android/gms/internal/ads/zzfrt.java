/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.tasks.OnFailureListener;

public final class zzfrt
implements OnFailureListener {
    public final /* synthetic */ zzfrx zza;

    public /* synthetic */ zzfrt(zzfrx zzfrx2) {
        this.zza = zzfrx2;
    }

    public final void onFailure(Exception exception) {
        this.zza.zzf(exception);
    }
}

