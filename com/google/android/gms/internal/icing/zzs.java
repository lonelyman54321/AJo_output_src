/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzm;
import com.google.android.gms.internal.icing.zzt;
import com.google.android.gms.internal.icing.zzu;
import java.util.Arrays;

public final class zzs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final int zzd;
    public final boolean zze;
    public final String zzf;
    public final zzm[] zzg;
    public final String zzh;
    public final zzu zzi;

    static {
        zzt zzt2 = new zzt();
        CREATOR = zzt2;
    }

    public zzs(String string2, String string3, boolean bl2, int n3, boolean bl3, String string4, zzm[] zzmArray, String string5, zzu zzu2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = bl2;
        this.zzd = n3;
        this.zze = bl3;
        this.zzf = string4;
        this.zzg = zzmArray;
        this.zzh = string5;
        this.zzi = zzu2;
    }

    public final boolean equals(Object objectArray) {
        boolean bl2;
        Object object;
        Object[] objectArray2;
        boolean bl3 = true;
        if (this == objectArray) {
            return bl3;
        }
        int n3 = objectArray instanceof zzs;
        if (n3 == 0) {
            return false;
        }
        objectArray = (zzs)objectArray;
        n3 = this.zzc;
        int n4 = objectArray.zzc;
        if (n3 == n4 && (n3 = this.zzd) == (n4 = objectArray.zzd) && (n3 = (int)(this.zze ? 1 : 0)) == (n4 = (int)(objectArray.zze ? 1 : 0)) && (n3 = (int)(Objects.equal(objectArray2 = this.zza, object = objectArray.zza) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(objectArray2 = this.zzb, object = objectArray.zzb) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(objectArray2 = this.zzf, object = objectArray.zzf) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(objectArray2 = this.zzh, object = objectArray.zzh) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(objectArray2 = this.zzi, object = objectArray.zzi) ? 1 : 0)) != 0 && (bl2 = Arrays.equals(objectArray2 = this.zzg, objectArray = objectArray.zzg))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zza;
        String string3 = this.zzb;
        Boolean bl2 = this.zzc;
        Integer n3 = this.zzd;
        Boolean bl3 = this.zze;
        String string4 = this.zzf;
        Integer n4 = Arrays.hashCode(this.zzg);
        String string5 = this.zzh;
        zzu zzu2 = this.zzi;
        Object[] objectArray = new Object[]{string2, string3, bl2, n3, bl3, string4, n4, string5, zzu2};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        boolean bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        int n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        boolean bl3 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 5, bl3);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zzg;
        SafeParcelWriter.writeTypedArray(parcel, 7, object, n3, false);
        object = this.zzh;
        SafeParcelWriter.writeString(parcel, 11, (String)object, false);
        object = this.zzi;
        SafeParcelWriter.writeParcelable(parcel, 12, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

