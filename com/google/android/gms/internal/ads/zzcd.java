/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcb;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;
import java.util.List;

public final class zzcd
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    private final zzcc[] zzb;

    static {
        zzcb zzcb2 = new zzcb();
        CREATOR = zzcb2;
    }

    public zzcd(long l2, zzcc ... zzccArray) {
        this.zza = l2;
        this.zzb = zzccArray;
    }

    public zzcd(Parcel parcel) {
        long l2;
        zzcc[] zzccArray;
        int n3;
        zzcc[] zzccArray2 = new zzcc[parcel.readInt()];
        this.zzb = zzccArray2;
        zzccArray2 = null;
        for (int i3 = 0; i3 < (n3 = (zzccArray = this.zzb).length); ++i3) {
            Object object = zzcc.class.getClassLoader();
            zzccArray[i3] = object = (zzcc)parcel.readParcelable((ClassLoader)object);
        }
        this.zza = l2 = parcel.readLong();
    }

    public zzcd(List zzccArray) {
        zzcc[] zzccArray2 = new zzcc[]{};
        zzccArray = zzccArray.toArray(zzccArray2);
        this(-9223372036854775807L, zzccArray);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object[] objectArray;
        Object[] objectArray2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (objectArray2 = zzcd.class) == (objectArray = object.getClass())) {
            long l2;
            long l3;
            long l4;
            long l7;
            object = (zzcd)object;
            objectArray = this.zzb;
            objectArray2 = ((zzcd)object).zzb;
            boolean bl3 = Arrays.equals(objectArray, objectArray2);
            if (bl3 && (l7 = (l4 = (l3 = this.zza) - (l2 = ((zzcd)object).zza)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Arrays.hashCode(this.zzb) * 31;
        long l2 = this.zza;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        return n3 + n4;
    }

    public final String toString() {
        String string2;
        long l2 = this.zza;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        String string3 = Arrays.toString(this.zzb);
        if (l4 == false) {
            string2 = "";
        } else {
            String string4 = ", presentationTimeUs=";
            string2 = Wm2.a(l2, string4);
        }
        return cP.a("entries=", string3, string2);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzb.length;
        parcel.writeInt(n3);
        for (zzcc zzcc2 : this.zzb) {
            parcel.writeParcelable((Parcelable)zzcc2, 0);
        }
        long l2 = this.zza;
        parcel.writeLong(l2);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzcc zzb(int n3) {
        return this.zzb[n3];
    }

    public final zzcd zzc(zzcc ... zzccArray) {
        int n3 = zzccArray.length;
        if (n3 == 0) {
            return this;
        }
        long l2 = this.zza;
        zzcc[] zzccArray2 = this.zzb;
        int n4 = zzgd.zza;
        n4 = zzccArray2.length;
        int n7 = n4 + n3;
        zzccArray2 = Arrays.copyOf(zzccArray2, n7);
        System.arraycopy(zzccArray, 0, zzccArray2, n4, n3);
        zzcd zzcd2 = new zzcd(l2, zzccArray2);
        return zzcd2;
    }

    public final zzcd zzd(zzcd zzccArray) {
        if (zzccArray == null) {
            return this;
        }
        zzccArray = zzccArray.zzb;
        return this.zzc(zzccArray);
    }
}

