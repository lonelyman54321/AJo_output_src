/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzchn;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzgez;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcho
implements zzgez {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzaxd zzb;
    public final /* synthetic */ VersionInfoParcel zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ zzegk zze;
    public final /* synthetic */ zzfhs zzf;
    public final /* synthetic */ String zzg;

    public /* synthetic */ zzcho(Context context, zzaxd zzaxd2, VersionInfoParcel versionInfoParcel, zza zza2, zzegk zzegk2, zzfhs zzfhs2, String string2) {
        this.zza = context;
        this.zzb = zzaxd2;
        this.zzc = versionInfoParcel;
        this.zzd = zza2;
        this.zze = zzegk2;
        this.zzf = zzfhs2;
        this.zzg = string2;
    }

    public final ListenableFuture zza() {
        zzu.zzz();
        Object object = this.zza;
        Object object2 = zzcix.zza();
        zzaxd zzaxd2 = this.zzb;
        zzegk zzegk2 = this.zze;
        zza zza2 = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzc;
        zzfhs zzfhs2 = this.zzf;
        zzbdm zzbdm2 = zzbdm.zza();
        object = zzchq.zza((Context)object, (zzcix)object2, "", false, false, zzaxd2, null, versionInfoParcel, null, null, zza2, zzbdm2, null, null, zzegk2, zzfhs2);
        object2 = zzccm.zza(object);
        Object object3 = object.zzN();
        zzchn zzchn2 = new zzchn((zzccm)object2);
        object3.zzB(zzchn2);
        object3 = this.zzg;
        object.loadUrl((String)object3);
        return object2;
    }
}

