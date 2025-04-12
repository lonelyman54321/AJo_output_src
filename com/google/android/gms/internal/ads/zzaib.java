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
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaib
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzaia zzaia2 = new zzaia();
        CREATOR = zzaia2;
    }

    public zzaib(Parcel object) {
        String string2 = object.readString();
        super(string2);
        this.zza = string2 = object.readString();
        object = object.readString();
        this.zzb = object;
    }

    public zzaib(String string2, String string3, String string4) {
        super(string2);
        this.zza = string3;
        this.zzb = string4;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzaib.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzaib)object;
            object2 = this.zzf;
            object3 = ((zzahr)object).zzf;
            boolean bl4 = ((String)object2).equals(object3);
            if (bl4 && (bl4 = zzgd.zzG(object2 = this.zza, object3 = ((zzaib)object).zza)) && (bl3 = zzgd.zzG(object2 = this.zzb, object = ((zzaib)object).zzb))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zzf;
        int n4 = string2.hashCode() + 527;
        String string3 = this.zza;
        int n7 = 0;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n4 *= 31;
        String string4 = this.zzb;
        if (string4 != null) {
            n7 = string4.hashCode();
        }
        return (n4 + n3) * 31 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(": url=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zzf;
        parcel.writeString(string2);
        string2 = this.zza;
        parcel.writeString(string2);
        string2 = this.zzb;
        parcel.writeString(string2);
    }
}

