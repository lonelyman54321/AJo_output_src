/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import java.io.IOException;

public final class zznp
implements zzfe {
    public final /* synthetic */ zzmy zza;
    public final /* synthetic */ zzvf zzb;
    public final /* synthetic */ zzvk zzc;
    public final /* synthetic */ IOException zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zznp(zzmy zzmy2, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        this.zza = zzmy2;
        this.zzb = zzvf2;
        this.zzc = zzvk2;
        this.zzd = iOException;
        this.zze = bl2;
    }

    public final void zza(Object object) {
        Object object2 = object;
        object2 = (zzna)object;
        zzmy zzmy2 = this.zza;
        zzvf zzvf2 = this.zzb;
        zzvk zzvk2 = this.zzc;
        IOException iOException = this.zzd;
        boolean bl2 = this.zze;
        object2.zzj(zzmy2, zzvf2, zzvk2, iOException, bl2);
    }
}

