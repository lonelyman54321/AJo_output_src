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
import com.google.android.gms.internal.ads.zzahh;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzahi
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahr[] zze;

    static {
        zzahh zzahh2 = new zzahh();
        CREATOR = zzahh2;
    }

    public zzahi(Parcel parcel) {
        super("CTOC");
        String[] stringArray = parcel.readString();
        int n3 = zzgd.zza;
        this.zza = stringArray;
        int n4 = parcel.readByte();
        n3 = 0;
        int n7 = 1;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            stringArray = null;
        }
        this.zzb = n4;
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            stringArray = null;
        }
        this.zzc = n4;
        stringArray = parcel.createStringArray();
        this.zzd = stringArray;
        n4 = parcel.readInt();
        zzahr[] zzahrArray = new zzahr[n4];
        this.zze = zzahrArray;
        while (n3 < n4) {
            zzahrArray = this.zze;
            Object object = zzahr.class.getClassLoader();
            zzahrArray[n3] = object = (zzahr)parcel.readParcelable((ClassLoader)object);
            n3 += n7;
        }
    }

    public zzahi(String string2, boolean bl2, boolean bl3, String[] stringArray, zzahr[] zzahrArray) {
        super("CTOC");
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzd = stringArray;
        this.zze = zzahrArray;
    }

    public final boolean equals(Object objectArray) {
        Object[] objectArray2;
        Object[] objectArray3;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (objectArray3 = zzahi.class) == (objectArray2 = objectArray.getClass())) {
            boolean bl3;
            objectArray = (zzahi)objectArray;
            boolean bl4 = this.zzb;
            boolean bl5 = objectArray.zzb;
            if (bl4 == bl5 && (bl4 = this.zzc) == (bl5 = objectArray.zzc) && (bl4 = zzgd.zzG(objectArray2 = this.zza, objectArray3 = objectArray.zza)) && (bl4 = Arrays.equals(objectArray2 = this.zzd, objectArray3 = objectArray.zzd)) && (bl3 = Arrays.equals(objectArray2 = this.zze, objectArray = objectArray.zze))) {
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
        return ((n4 + 527) * 31 + n7) * 31 + n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object[] objectArray = this.zza;
        parcel.writeString((String)objectArray);
        n3 = (int)(this.zzb ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (int)(this.zzc ? 1 : 0);
        parcel.writeByte((byte)n3);
        objectArray = this.zzd;
        parcel.writeStringArray((String[])objectArray);
        n3 = this.zze.length;
        parcel.writeInt(n3);
        for (zzahr zzahr2 : this.zze) {
            parcel.writeParcelable((Parcelable)zzahr2, 0);
        }
    }
}

