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
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzahm
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    static {
        zzahl zzahl2 = new zzahl();
        CREATOR = zzahl2;
    }

    public zzahm(Parcel object) {
        super("GEOB");
        String string2 = object.readString();
        this.zza = string2;
        this.zzb = string2 = object.readString();
        this.zzc = string2 = object.readString();
        object = object.createByteArray();
        this.zzd = (byte[])object;
    }

    public zzahm(String string2, String string3, String string4, byte[] byArray) {
        super("GEOB");
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahm.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahm)object;
            object2 = this.zza;
            object3 = ((zzahm)object).zza;
            boolean bl4 = zzgd.zzG(object2, object3);
            if (bl4 && (bl4 = zzgd.zzG(object2 = this.zzb, object3 = ((zzahm)object).zzb)) && (bl4 = zzgd.zzG(object2 = this.zzc, object3 = ((zzahm)object).zzc)) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzd), (byte[])(object = (Object)((zzahm)object).zzd)))) {
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
        Object object = this.zzb;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 += 527;
        String string3 = this.zzc;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = n4 * 31 + n3;
        object = this.zzd;
        n4 = (n4 * 31 + n7) * 31;
        return Arrays.hashCode((byte[])object) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(": mimeType=");
        string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", filename=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.zzc;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        parcel.writeString((String)object);
        object = this.zzb;
        parcel.writeString((String)object);
        object = this.zzc;
        parcel.writeString((String)object);
        object = this.zzd;
        parcel.writeByteArray((byte[])object);
    }
}

