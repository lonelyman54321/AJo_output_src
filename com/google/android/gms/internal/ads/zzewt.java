/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzeob;
import com.google.android.gms.internal.ads.zzewx;
import java.util.List;

public final class zzewt
implements Runnable {
    public final /* synthetic */ zzewx zza;
    public final /* synthetic */ zzbte zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ zzeob zze;
    public final /* synthetic */ zzccn zzf;

    public /* synthetic */ zzewt(zzewx zzewx2, zzbte zzbte2, Bundle bundle, List list, zzeob zzeob2, zzccn zzccn2) {
        this.zza = zzewx2;
        this.zzb = zzbte2;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzeob2;
        this.zzf = zzccn2;
    }

    public final void run() {
        zzewx zzewx2 = this.zza;
        zzbte zzbte2 = this.zzb;
        Bundle bundle = this.zzc;
        List list = this.zzd;
        zzeob zzeob2 = this.zze;
        zzccn zzccn2 = this.zzf;
        zzewx2.zze(zzbte2, bundle, list, zzeob2, zzccn2);
    }
}

