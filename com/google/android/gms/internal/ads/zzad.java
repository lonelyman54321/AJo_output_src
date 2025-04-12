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
import com.google.android.gms.internal.ads.zzac;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;
import java.util.UUID;

public final class zzad
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    static {
        zzac zzac2 = new zzac();
        CREATOR = zzac2;
    }

    public zzad(Parcel object) {
        long l2 = object.readLong();
        long l3 = object.readLong();
        Object object2 = new UUID(l2, l3);
        this.zza = object2;
        this.zzb = object2 = object.readString();
        object2 = object.readString();
        this.zzc = object2;
        object = object.createByteArray();
        this.zzd = (byte[])object;
    }

    public zzad(UUID object, String string2, String string3, byte[] byArray) {
        object.getClass();
        this.zza = object;
        this.zzb = null;
        this.zzc = object = zzcg.zze(string3);
        this.zzd = byArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzad;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (object == this) {
            return bl3;
        }
        object = (zzad)object;
        Object object2 = this.zzb;
        Object object3 = ((zzad)object).zzb;
        boolean bl4 = zzgd.zzG(object2, object3);
        if (bl4 && (bl4 = zzgd.zzG(object2 = this.zzc, object3 = ((zzad)object).zzc)) && (bl4 = zzgd.zzG(object2 = this.zza, object3 = ((zzad)object).zza)) && (bl2 = Arrays.equals((byte[])(object2 = (Object)this.zzd), (byte[])(object = (Object)((zzad)object).zzd)))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zze;
        if (n3 == 0) {
            int n4;
            UUID uUID = this.zza;
            n3 = uUID.hashCode();
            int n7 = 31;
            n3 *= 31;
            String string2 = this.zzb;
            if (string2 == null) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = string2.hashCode();
            }
            n3 = (n3 + n4) * 31;
            string2 = this.zzc;
            n3 = zy_2.b(n3, n7, string2);
            byte[] byArray = this.zzd;
            n7 = Arrays.hashCode(byArray);
            this.zze = n3 += n7;
        }
        return n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.zza.getMostSignificantBits();
        parcel.writeLong(l2);
        l2 = this.zza.getLeastSignificantBits();
        parcel.writeLong(l2);
        Object object = this.zzb;
        parcel.writeString((String)object);
        object = this.zzc;
        parcel.writeString((String)object);
        object = this.zzd;
        parcel.writeByteArray((byte[])object);
    }
}

