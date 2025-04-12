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
import com.google.android.gms.internal.ads.zzab;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class zzae
implements Comparator,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    private final zzad[] zzc;
    private int zzd;

    static {
        zzab zzab2 = new zzab();
        CREATOR = zzab2;
    }

    public zzae(Parcel zzadArray) {
        int n3;
        String string2;
        this.zza = string2 = zzadArray.readString();
        string2 = zzad.CREATOR;
        zzadArray = (zzad[])zzadArray.createTypedArray((Parcelable.Creator)string2);
        this.zzc = zzadArray;
        this.zzb = n3 = zzadArray.length;
    }

    private zzae(String object, boolean bl2, zzad ... object2) {
        int n3;
        this.zza = object;
        if (bl2) {
            object = object2.clone();
            object2 = object;
            object2 = (zzad[])object;
        }
        this.zzc = object2;
        this.zzb = n3 = ((zzad[])object2).length;
        Arrays.sort(object2, this);
    }

    public zzae(String string2, zzad ... zzadArray) {
        this(null, true, zzadArray);
    }

    public zzae(List zzadArray) {
        zzad[] zzadArray2 = new zzad[]{};
        zzadArray = zzadArray.toArray(zzadArray2);
        this(null, false, zzadArray);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object objectArray) {
        Object object;
        Object object2;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object2 = zzae.class) == (object = objectArray.getClass())) {
            boolean bl3;
            objectArray = (zzae)objectArray;
            object = this.zza;
            object2 = objectArray.zza;
            boolean bl4 = zzgd.zzG(object, object2);
            if (bl4 && (bl3 = Arrays.equals(object = this.zzc, objectArray = objectArray.zzc))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzd;
        if (n3 == 0) {
            String string2 = this.zza;
            if (string2 == null) {
                n3 = 0;
                string2 = null;
            } else {
                n3 = string2.hashCode();
            }
            Object[] objectArray = this.zzc;
            n3 *= 31;
            int n4 = Arrays.hashCode(objectArray);
            this.zzd = n3 += n4;
        }
        return n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable[] parcelableArray = this.zza;
        parcel.writeString((String)parcelableArray);
        parcelableArray = this.zzc;
        parcel.writeTypedArray(parcelableArray, 0);
    }

    public final zzad zza(int n3) {
        return this.zzc[n3];
    }

    public final zzae zzb(String string2) {
        zzad[] zzadArray = this.zza;
        boolean bl2 = zzgd.zzG(zzadArray, string2);
        if (bl2) {
            return this;
        }
        zzadArray = this.zzc;
        zzae zzae2 = new zzae(string2, false, zzadArray);
        return zzae2;
    }
}

