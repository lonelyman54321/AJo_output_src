/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzg;

public final class zzax
implements Runnable {
    public final /* synthetic */ zzbb zza;

    public /* synthetic */ zzax(zzbb zzbb2) {
        this.zza = zzbb2;
    }

    public final void run() {
        zzg zzg2 = new zzg(4, "Web view timed out.");
        this.zza.zzf(zzg2);
    }
}

