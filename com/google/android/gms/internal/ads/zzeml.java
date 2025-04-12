/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzemm;
import com.google.android.gms.internal.ads.zzemo;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzeml
implements Runnable {
    public final /* synthetic */ zzemm zza;
    public final /* synthetic */ zzfhf zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzeho zzd;

    public /* synthetic */ zzeml(zzemm zzemm2, zzfhf zzfhf2, zzfgt zzfgt2, zzeho zzeho2) {
        this.zza = zzemm2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
        this.zzd = zzeho2;
    }

    public final void run() {
        zzemo zzemo2 = this.zza.zzd;
        zzfhf zzfhf2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        zzeho zzeho2 = this.zzd;
        zzemo.zzd(zzemo2, zzfhf2, zzfgt2, zzeho2);
    }
}

