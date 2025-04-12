/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzclt;
import com.google.android.gms.internal.ads.zzdej;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzeoi;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepd;
import com.google.android.gms.internal.ads.zzepi;
import com.google.android.gms.internal.ads.zzfdf;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkq;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhky;
import com.google.android.gms.internal.ads.zzhlg;

final class zzclu
implements zzfdi {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcla zzd;
    private final zzclu zze = this;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;

    public /* synthetic */ zzclu(zzcla object, Context object2, String object3, zzq zzq2, zzclt zzclt2) {
        zzhky zzhky2;
        zzhky zzhky3;
        zzhky zzhky4;
        this.zzd = object;
        this.zza = object2;
        this.zzb = zzq2;
        this.zzc = object3;
        zzhkp zzhkp2 = zzhkq.zza(object2);
        this.zzf = zzhkp2;
        zzhkp zzhkp3 = zzhkq.zza(zzq2);
        this.zzg = zzhkp3;
        object2 = zzcla.zzV((zzcla)object);
        object3 = new zzepd((zzhlg)object2);
        this.zzh = zzhky4 = zzhko.zzc((zzhky)object3);
        this.zzi = zzhky3 = zzhko.zzc(zzepi.zza());
        this.zzj = zzhky2 = zzhko.zzc(zzdej.zza());
        zzhky zzhky5 = zzcla.zzP((zzcla)object);
        zzhky zzhky6 = zzcla.zzL((zzcla)object);
        zzfhq zzfhq2 = zzfhq.zza();
        object = new zzfdg(zzhkp2, zzhky5, zzhkp3, zzhky6, zzhky4, zzhky3, zzfhq2, zzhky2);
        this.zzk = object = zzhko.zzc((zzhky)object);
    }

    public final zzeoi zza() {
        Object object = this.zzk;
        Object object2 = object = object.zzb();
        object2 = (zzfdf)object;
        Object object3 = object = this.zzh.zzb();
        object3 = (zzepc)object;
        VersionInfoParcel versionInfoParcel = zzcla.zzE(this.zzd).zze();
        zzhkx.zzb(versionInfoParcel);
        Object object4 = object = zzcla.zzV(this.zzd).zzb();
        object4 = (zzdvc)object;
        Context context = this.zza;
        zzq zzq2 = this.zzb;
        String string2 = this.zzc;
        zzeoi zzeoi2 = new zzeoi(context, zzq2, string2, (zzfdf)object2, (zzepc)object3, versionInfoParcel, (zzdvc)object4);
        return zzeoi2;
    }
}

