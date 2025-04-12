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
import com.google.android.gms.internal.ads.zzahw;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzahx
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;

    static {
        zzahw zzahw2 = new zzahw();
        CREATOR = zzahw2;
    }

    public zzahx(Parcel object) {
        super("PRIV");
        String string2 = object.readString();
        this.zza = string2;
        object = object.createByteArray();
        this.zzb = (byte[])object;
    }

    public zzahx(String string2, byte[] byArray) {
        super("PRIV");
        this.zza = string2;
        this.zzb = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahx.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahx)object;
            object2 = this.zza;
            object3 = ((zzahx)object).zza;
            boolean bl4 = zzgd.zzG(object2, object3);
            if (bl4 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzb), (byte[])(object = (Object)((zzahx)object).zzb)))) {
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
        byte[] byArray = this.zzb;
        n3 = (n3 + 527) * 31;
        return Arrays.hashCode(byArray) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(": owner=");
        string2 = this.zza;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        parcel.writeString((String)object);
        object = this.zzb;
        parcel.writeByteArray((byte[])object);
    }
}

