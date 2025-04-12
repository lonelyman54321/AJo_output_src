/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahu;
import java.util.Arrays;

public final class zzahv
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    static {
        zzahu zzahu2 = new zzahu();
        CREATOR = zzahu2;
    }

    public zzahv(int n3, int n4, int n7, int[] nArray, int[] nArray2) {
        super("MLLT");
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = nArray;
        this.zze = nArray2;
    }

    public zzahv(Parcel object) {
        super("MLLT");
        int n3;
        this.zza = n3 = object.readInt();
        this.zzb = n3 = object.readInt();
        this.zzc = n3 = object.readInt();
        int[] nArray = object.createIntArray();
        this.zzd = nArray;
        object = object.createIntArray();
        this.zze = (int[])object;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahv.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahv)object;
            int n3 = this.zza;
            int n4 = ((zzahv)object).zza;
            if (n3 == n4 && (n3 = this.zzb) == (n4 = ((zzahv)object).zzb) && (n3 = this.zzc) == (n4 = ((zzahv)object).zzc) && (n3 = (int)(Arrays.equals((int[])(object2 = (Object)this.zzd), (int[])(object3 = (Object)((zzahv)object).zzd)) ? 1 : 0)) != 0 && (bl3 = Arrays.equals((int[])(object2 = (Object)this.zze), (int[])(object = (Object)((zzahv)object).zze)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza + 527;
        int[] nArray = this.zzd;
        n3 *= 31;
        int n4 = this.zzb;
        n3 = (n3 + n4) * 31;
        n4 = this.zzc;
        n3 = (n3 + n4) * 31;
        int n7 = Arrays.hashCode(nArray) + n3;
        int[] nArray2 = this.zze;
        return Arrays.hashCode(nArray2) + (n7 *= 31);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        parcel.writeInt(n3);
        n3 = this.zzb;
        parcel.writeInt(n3);
        n3 = this.zzc;
        parcel.writeInt(n3);
        int[] nArray = this.zzd;
        parcel.writeIntArray(nArray);
        nArray = this.zze;
        parcel.writeIntArray(nArray);
    }
}

