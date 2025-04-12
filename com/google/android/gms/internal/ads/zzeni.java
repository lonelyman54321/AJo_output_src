/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzenj;
import com.google.android.gms.internal.ads.zzeno;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;

final class zzeni
implements zzg {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzfhf zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ zzeno zzd;
    final /* synthetic */ zzenj zze;

    public zzeni(zzenj zzenj2, zzccn zzccn2, zzfhf zzfhf2, zzfgt zzfgt2, zzeno zzeno2) {
        this.zza = zzccn2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
        this.zzd = zzeno2;
        this.zze = zzenj2;
    }

    public final void zza(View object) {
        zzeno zzeno2 = this.zzd;
        zzens zzens2 = zzenj.zzd(this.zze);
        zzfhf zzfhf2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        object = zzens2.zza(zzfhf2, zzfgt2, (View)object, zzeno2);
        this.zza.zzc(object);
    }

    public final void zzb() {
    }

    public final void zzc() {
    }
}

