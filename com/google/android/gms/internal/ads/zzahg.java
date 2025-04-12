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
import com.google.android.gms.internal.ads.zzahf;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzahg
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahr[] zzg;

    static {
        zzahf zzahf2 = new zzahf();
        CREATOR = zzahf2;
    }

    public zzahg(Parcel parcel) {
        super("CHAP");
        long l2;
        int n3;
        String string2 = parcel.readString();
        int n4 = zzgd.zza;
        this.zza = string2;
        this.zzb = n3 = parcel.readInt();
        this.zzc = n3 = parcel.readInt();
        this.zzd = l2 = parcel.readLong();
        this.zze = l2 = parcel.readLong();
        n3 = parcel.readInt();
        zzahr[] zzahrArray = new zzahr[n3];
        this.zzg = zzahrArray;
        zzahrArray = null;
        for (n4 = 0; n4 < n3; ++n4) {
            zzahr[] zzahrArray2 = this.zzg;
            Object object = zzahr.class.getClassLoader();
            zzahrArray2[n4] = object = (zzahr)parcel.readParcelable((ClassLoader)object);
        }
    }

    public zzahg(String string2, int n3, int n4, long l2, long l3, zzahr[] zzahrArray) {
        super("CHAP");
        this.zza = string2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = l2;
        this.zze = l3;
        this.zzg = zzahrArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object objectArray) {
        Object[] objectArray2;
        Object object;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object = zzahg.class) == (objectArray2 = objectArray.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            objectArray = (zzahg)objectArray;
            int n3 = this.zzb;
            int n4 = objectArray.zzb;
            if (n3 == n4 && (n3 = this.zzc) == (n4 = objectArray.zzc) && (l8 = (l7 = (l4 = this.zzd) - (l3 = objectArray.zzd)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false && (l8 = (l2 = (l4 = this.zze) - (l3 = objectArray.zze)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n3 = (int)(zzgd.zzG(objectArray2 = this.zza, object = objectArray.zza) ? 1 : 0)) != 0 && (bl3 = Arrays.equals(objectArray2 = this.zzg, objectArray = objectArray.zzg))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zza;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        int n4 = this.zzb;
        int n7 = this.zzc;
        long l2 = this.zzd;
        long l3 = this.zze;
        n4 = ((n4 + 527) * 31 + n7) * 31;
        n7 = (int)l2;
        n4 = (n4 + n7) * 31;
        n7 = (int)l3;
        return (n4 + n7) * 31 + n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        zzahr[] zzahrArray = this.zza;
        parcel.writeString((String)zzahrArray);
        n3 = this.zzb;
        parcel.writeInt(n3);
        n3 = this.zzc;
        parcel.writeInt(n3);
        long l2 = this.zzd;
        parcel.writeLong(l2);
        l2 = this.zze;
        parcel.writeLong(l2);
        n3 = this.zzg.length;
        parcel.writeInt(n3);
        for (zzahr zzahr2 : this.zzg) {
            parcel.writeParcelable((Parcelable)zzahr2, 0);
        }
    }
}

