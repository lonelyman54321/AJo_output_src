/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbww;
import java.util.List;

public final class zzbwv
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ApplicationInfo zza;
    public final String zzb;
    public final PackageInfo zzc;
    public final String zzd;
    public final int zze;
    public final String zzf;
    public final List zzg;
    public final boolean zzh;
    public final boolean zzi;

    static {
        zzbww zzbww2 = new zzbww();
        CREATOR = zzbww2;
    }

    public zzbwv(ApplicationInfo applicationInfo, String string2, PackageInfo packageInfo, String string3, int n3, String string4, List list, boolean bl2, boolean bl3) {
        this.zzb = string2;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = string3;
        this.zze = n3;
        this.zzf = string4;
        this.zzg = list;
        this.zzh = bl2;
        this.zzi = bl3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        string2 = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)string2, n3, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        int bl2 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, bl2);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zzg;
        SafeParcelWriter.writeStringList(parcel, 7, (List)object, false);
        boolean bl3 = this.zzh;
        SafeParcelWriter.writeBoolean(parcel, 8, bl3);
        boolean bl4 = this.zzi;
        SafeParcelWriter.writeBoolean(parcel, 9, bl4);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

