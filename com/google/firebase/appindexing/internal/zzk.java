/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.appindexing.internal.zzn;

final class zzk
implements OnFailureListener {
    private final zzn zza;

    public zzk(zzn zzn2) {
        this.zza = zzn2;
    }

    public final void onFailure(Exception exception) {
        this.zza.zzc(exception);
    }
}

