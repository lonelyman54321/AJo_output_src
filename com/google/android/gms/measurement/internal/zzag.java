/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzpm;

public final class zzag
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String zza;
    public String zzb;
    public zzpm zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public zzbl zzg;
    public long zzh;
    public zzbl zzi;
    public long zzj;
    public zzbl zzk;

    static {
        zzaj zzaj2 = new zzaj();
        CREATOR = zzaj2;
    }

    public zzag(zzag abstractSafeParcelable) {
        boolean bl2;
        long l2;
        Preconditions.checkNotNull(abstractSafeParcelable);
        Object object = abstractSafeParcelable.zza;
        this.zza = object;
        object = abstractSafeParcelable.zzb;
        this.zzb = object;
        this.zzc = object = abstractSafeParcelable.zzc;
        this.zzd = l2 = abstractSafeParcelable.zzd;
        this.zze = bl2 = abstractSafeParcelable.zze;
        this.zzf = object = abstractSafeParcelable.zzf;
        this.zzg = object = abstractSafeParcelable.zzg;
        this.zzh = l2 = abstractSafeParcelable.zzh;
        this.zzi = object = abstractSafeParcelable.zzi;
        this.zzj = l2 = abstractSafeParcelable.zzj;
        abstractSafeParcelable = abstractSafeParcelable.zzk;
        this.zzk = abstractSafeParcelable;
    }

    public zzag(String string2, String string3, zzpm zzpm2, long l2, boolean bl2, String string4, zzbl zzbl2, long l3, zzbl zzbl3, long l4, zzbl zzbl4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzpm2;
        this.zzd = l2;
        this.zze = bl2;
        this.zzf = string4;
        this.zzg = zzbl2;
        this.zzh = l3;
        this.zzi = zzbl3;
        this.zzj = l4;
        this.zzk = zzbl4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        long l2 = this.zzd;
        SafeParcelWriter.writeLong(parcel, 5, l2);
        boolean bl2 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        object = this.zzg;
        SafeParcelWriter.writeParcelable(parcel, 8, (Parcelable)object, n3, false);
        l2 = this.zzh;
        SafeParcelWriter.writeLong(parcel, 9, l2);
        object = this.zzi;
        SafeParcelWriter.writeParcelable(parcel, 10, (Parcelable)object, n3, false);
        l2 = this.zzj;
        SafeParcelWriter.writeLong(parcel, 11, l2);
        object = this.zzk;
        SafeParcelWriter.writeParcelable(parcel, 12, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

