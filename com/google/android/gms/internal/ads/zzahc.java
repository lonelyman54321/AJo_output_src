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
import com.google.android.gms.internal.ads.zzahb;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzahc
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    static {
        zzahb zzahb2 = new zzahb();
        CREATOR = zzahb2;
    }

    public zzahc(Parcel object) {
        super("APIC");
        int n3;
        String string2 = object.readString();
        this.zza = string2;
        this.zzb = string2 = object.readString();
        this.zzc = n3 = object.readInt();
        object = object.createByteArray();
        this.zzd = (byte[])object;
    }

    public zzahc(String string2, String string3, int n3, byte[] byArray) {
        super("APIC");
        this.zza = string2;
        this.zzb = string3;
        this.zzc = n3;
        this.zzd = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahc.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahc)object;
            int n3 = this.zzc;
            int n4 = ((zzahc)object).zzc;
            if (n3 == n4 && (n3 = (int)(zzgd.zzG(object2 = this.zza, object3 = ((zzahc)object).zza) ? 1 : 0)) != 0 && (n3 = (int)(zzgd.zzG(object2 = this.zzb, object3 = ((zzahc)object).zzb) ? 1 : 0)) != 0 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzd), (byte[])(object = (Object)((zzahc)object).zzd)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        Object object = this.zza;
        int n4 = 0;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        int n7 = this.zzc;
        String string2 = this.zzb;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n7 = (n7 + 527) * 31 + n3;
        object = this.zzd;
        n7 = (n7 * 31 + n4) * 31;
        return Arrays.hashCode((byte[])object) + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(": mimeType=");
        string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        parcel.writeString((String)object);
        object = this.zzb;
        parcel.writeString((String)object);
        n3 = this.zzc;
        parcel.writeInt(n3);
        object = this.zzd;
        parcel.writeByteArray((byte[])object);
    }

    public final void zza(zzby zzby2) {
        byte[] byArray = this.zzd;
        int n3 = this.zzc;
        zzby2.zza(byArray, n3);
    }
}

