/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbk;

public final class zzbl
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final zzbg zzb;
    public final String zzc;
    public final long zzd;

    static {
        zzbk zzbk2 = new zzbk();
        CREATOR = zzbk2;
    }

    public zzbl(zzbl object, long l2) {
        Preconditions.checkNotNull(object);
        Object object2 = ((zzbl)object).zza;
        this.zza = object2;
        this.zzb = object2 = ((zzbl)object).zzb;
        this.zzc = object = ((zzbl)object).zzc;
        this.zzd = l2;
    }

    public zzbl(String string2, zzbg zzbg2, String string3, long l2) {
        this.zza = string2;
        this.zzb = zzbg2;
        this.zzc = string3;
        this.zzd = l2;
    }

    public final String toString() {
        CharSequence charSequence = this.zzc;
        String string2 = this.zza;
        String string3 = String.valueOf(this.zzb);
        charSequence = og_1.a("origin=", (String)charSequence, ",name=", string2, ",params=");
        ((StringBuilder)charSequence).append(string3);
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        zzbg zzbg2 = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 3, zzbg2, n3, false);
        string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        long l2 = this.zzd;
        SafeParcelWriter.writeLong(parcel, 5, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

