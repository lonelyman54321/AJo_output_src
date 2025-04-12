/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzvy;
import java.io.IOException;

public final class zzvu
implements Runnable {
    public final /* synthetic */ zzvx zza;
    public final /* synthetic */ zzvy zzb;
    public final /* synthetic */ zzvf zzc;
    public final /* synthetic */ zzvk zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzvu(zzvx zzvx2, zzvy zzvy2, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        this.zza = zzvx2;
        this.zzb = zzvy2;
        this.zzc = zzvf2;
        this.zzd = zzvk2;
        this.zze = iOException;
        this.zzf = bl2;
    }

    public final void run() {
        zzvo zzvo2 = this.zza.zzb;
        zzvf zzvf2 = this.zzc;
        zzvk zzvk2 = this.zzd;
        IOException iOException = this.zze;
        zzvy zzvy2 = this.zzb;
        boolean bl2 = this.zzf;
        zzvy2.zzah(0, zzvo2, zzvf2, zzvk2, iOException, bl2);
    }
}

