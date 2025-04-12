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
import com.google.android.gms.internal.ads.zzags;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzagt
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    private static final zzan zzf;
    private static final zzan zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        Object object = new zzal();
        ((zzal)object).zzX("application/id3");
        zzf = ((zzal)object).zzad();
        object = new zzal();
        ((zzal)object).zzX("application/x-scte35");
        zzg = ((zzal)object).zzad();
        object = new zzags();
        CREATOR = object;
    }

    public zzagt(Parcel object) {
        long l2;
        String string2 = object.readString();
        this.zza = string2;
        this.zzb = string2 = object.readString();
        this.zzc = l2 = object.readLong();
        this.zzd = l2 = object.readLong();
        object = object.createByteArray();
        this.zze = (byte[])object;
    }

    public zzagt(String string2, String string3, long l2, long l3, byte[] byArray) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = l2;
        this.zzd = l3;
        this.zze = byArray;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzagt.class) == (object2 = object.getClass())) {
            boolean bl3;
            boolean bl4;
            long l2;
            object = (zzagt)object;
            long l3 = this.zzc;
            long l4 = ((zzagt)object).zzc;
            long l7 = l3 - l4;
            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 == false && (object4 = (l2 = (l3 = this.zzd) - (l4 = ((zzagt)object).zzd)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (bl4 = zzgd.zzG(object2 = this.zza, object3 = ((zzagt)object).zza)) && (bl4 = zzgd.zzG(object2 = this.zzb, object3 = ((zzagt)object).zzb)) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zze), (byte[])(object = (Object)((zzagt)object).zze)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzh;
        if (n3 == 0) {
            String string2 = this.zza;
            int n4 = 0;
            if (string2 != null) {
                n3 = string2.hashCode();
            } else {
                n3 = 0;
                string2 = null;
            }
            String string3 = this.zzb;
            if (string3 != null) {
                n4 = string3.hashCode();
            }
            n3 += 527;
            long l2 = this.zzc;
            long l3 = this.zzd;
            byte[] byArray = this.zze;
            int n7 = 32;
            long l4 = l3 >>> n7;
            long l7 = l2 >>> n7;
            n3 = (n3 * 31 + n4) * 31;
            n4 = (int)(l2 ^= l7);
            n3 = (n3 + n4) * 31;
            n4 = (int)(l3 ^= l4);
            n3 = (n3 + n4) * 31;
            n4 = Arrays.hashCode(byArray);
            this.zzh = n3 += n4;
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EMSG: scheme=");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", id=");
        long l2 = this.zzd;
        stringBuilder.append(l2);
        stringBuilder.append(", durationMs=");
        l2 = this.zzc;
        stringBuilder.append(l2);
        stringBuilder.append(", value=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        parcel.writeString((String)object);
        object = this.zzb;
        parcel.writeString((String)object);
        long l2 = this.zzc;
        parcel.writeLong(l2);
        l2 = this.zzd;
        parcel.writeLong(l2);
        object = this.zze;
        parcel.writeByteArray((byte[])object);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

