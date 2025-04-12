/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbud;

public final class zzbub
implements Runnable {
    public final /* synthetic */ zzbud zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzbub(zzbud zzbud2, boolean bl2) {
        this.zza = zzbud2;
        this.zzb = bl2;
    }

    public final void run() {
        zzbud zzbud2 = this.zza;
        boolean bl2 = this.zzb;
        zzbud2.zzc(bl2);
    }
}

