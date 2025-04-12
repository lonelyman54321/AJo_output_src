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
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaht
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;

    static {
        zzahs zzahs2 = new zzahs();
        CREATOR = zzahs2;
    }

    public zzaht(Parcel object) {
        super("----");
        String string2 = object.readString();
        this.zza = string2;
        this.zzb = string2 = object.readString();
        object = object.readString();
        this.zzc = object;
    }

    public zzaht(String string2, String string3, String string4) {
        super("----");
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzaht.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzaht)object;
            object2 = this.zzb;
            object3 = ((zzaht)object).zzb;
            boolean bl4 = zzgd.zzG(object2, object3);
            if (bl4 && (bl4 = zzgd.zzG(object2 = this.zza, object3 = ((zzaht)object).zza)) && (bl3 = zzgd.zzG(object2 = this.zzc, object = ((zzaht)object).zzc))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.zza;
        int n7 = 0;
        if (string2 != null) {
            n4 = string2.hashCode();
        } else {
            n4 = 0;
            string2 = null;
        }
        String string3 = this.zzb;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n4 += 527;
        String string4 = this.zzc;
        if (string4 != null) {
            n7 = string4.hashCode();
        }
        return (n4 * 31 + n3) * 31 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(": domain=");
        string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zzf;
        parcel.writeString(string2);
        string2 = this.zza;
        parcel.writeString(string2);
        string2 = this.zzc;
        parcel.writeString(string2);
    }
}

