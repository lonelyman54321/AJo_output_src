/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfho;

public final class zzcsk
implements zzdaz {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzfho zzd;

    public /* synthetic */ zzcsk(Context context, VersionInfoParcel versionInfoParcel, zzfgt zzfgt2, zzfho zzfho2) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfgt2;
        this.zzd = zzfho2;
    }

    public final void zzs() {
        zzay zzay2 = zzu.zzs();
        Context context = this.zza;
        String string2 = this.zzb.afmaVersion;
        String string3 = this.zzc.zzD.toString();
        String string4 = this.zzd.zzf;
        zzay2.zzn(context, string2, string3, string4);
    }
}

