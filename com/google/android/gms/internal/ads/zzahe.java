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
import com.google.android.gms.internal.ads.zzahd;
import com.google.android.gms.internal.ads.zzahr;
import java.util.Arrays;

public final class zzahe
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final byte[] zza;

    static {
        zzahd zzahd2 = new zzahd();
        CREATOR = zzahd2;
    }

    public zzahe(Parcel object) {
        String string2 = object.readString();
        super(string2);
        object = object.createByteArray();
        this.zza = (byte[])object;
    }

    public zzahe(String string2, byte[] byArray) {
        super(string2);
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahe.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahe)object;
            object2 = this.zzf;
            object3 = ((zzahr)object).zzf;
            boolean bl4 = ((String)object2).equals(object3);
            if (bl4 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zza), (byte[])(object = (Object)((zzahe)object).zza)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzf.hashCode() + 527;
        byte[] byArray = this.zza;
        return Arrays.hashCode(byArray) + (n3 *= 31);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zzf;
        parcel.writeString((String)object);
        object = this.zza;
        parcel.writeByteArray((byte[])object);
    }
}

