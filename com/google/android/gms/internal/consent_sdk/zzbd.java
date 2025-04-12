/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzbn;

public final class zzbd
implements Runnable {
    public final /* synthetic */ zzbn zza;
    public final /* synthetic */ zzbb zzb;

    public /* synthetic */ zzbd(zzbn zzbn2, zzbb zzbb2) {
        this.zza = zzbn2;
        this.zzb = zzbb2;
    }

    public final void run() {
        zzbn zzbn2 = this.zza;
        zzbb zzbb2 = this.zzb;
        zzbn2.zza(zzbb2);
    }
}

