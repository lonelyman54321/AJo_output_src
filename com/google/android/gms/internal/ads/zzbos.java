/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbow;

public final class zzbos
implements Runnable {
    public final /* synthetic */ zzbow zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbos(zzbow zzbow2, String string2) {
        this.zza = zzbow2;
        this.zzb = string2;
    }

    public final void run() {
        zzbow zzbow2 = this.zza;
        String string2 = this.zzb;
        zzbow2.zzm(string2);
    }
}

