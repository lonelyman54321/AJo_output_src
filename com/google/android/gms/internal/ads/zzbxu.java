/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzfjj;
import java.util.List;

public final class zzbxu
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle zza;
    public final VersionInfoParcel zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfjj zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;

    static {
        zzbxv zzbxv2 = new zzbxv();
        CREATOR = zzbxv2;
    }

    public zzbxu(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String string2, List list, PackageInfo packageInfo, String string3, String string4, zzfjj zzfjj2, String string5, boolean bl2, boolean bl3, Bundle bundle2) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = string2;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = string3;
        this.zzh = string4;
        this.zzi = zzfjj2;
        this.zzj = string5;
        this.zzk = bl2;
        this.zzl = bl3;
        this.zzm = bundle2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, object, false);
        Object object2 = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object2, n3, false);
        object2 = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object2, n3, false);
        object2 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object2, false);
        object2 = this.zze;
        SafeParcelWriter.writeStringList(parcel, 5, (List)object2, false);
        object2 = this.zzf;
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)object2, n3, false);
        object2 = this.zzg;
        SafeParcelWriter.writeString(parcel, 7, (String)object2, false);
        object2 = this.zzh;
        SafeParcelWriter.writeString(parcel, 9, (String)object2, false);
        object2 = this.zzi;
        SafeParcelWriter.writeParcelable(parcel, 10, (Parcelable)object2, n3, false);
        object = this.zzj;
        SafeParcelWriter.writeString(parcel, 11, (String)object, false);
        boolean bl2 = this.zzk;
        SafeParcelWriter.writeBoolean(parcel, 12, bl2);
        bl2 = this.zzl;
        SafeParcelWriter.writeBoolean(parcel, 13, bl2);
        object = this.zzm;
        SafeParcelWriter.writeBundle(parcel, 14, object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

