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
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzagw
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    static {
        zzagv zzagv2 = new zzagv();
        CREATOR = zzagv2;
    }

    public zzagw(int n3, String string2, String string3, int n4, int n7, int n8, int n10, byte[] byArray) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = n4;
        this.zze = n7;
        this.zzf = n8;
        this.zzg = n10;
        this.zzh = byArray;
    }

    public zzagw(Parcel object) {
        int n3;
        this.zza = n3 = object.readInt();
        String string2 = object.readString();
        this.zzb = string2;
        this.zzc = string2 = object.readString();
        this.zzd = n3 = object.readInt();
        this.zze = n3 = object.readInt();
        this.zzf = n3 = object.readInt();
        this.zzg = n3 = object.readInt();
        object = object.createByteArray();
        this.zzh = (byte[])object;
    }

    public static zzagw zzb(zzfu object) {
        int n3 = ((zzfu)object).zzg();
        int n4 = ((zzfu)object).zzg();
        Object object2 = zzfxs.zza;
        object2 = zzcg.zze(((zzfu)object).zzA(n4, (Charset)object2));
        n4 = ((zzfu)object).zzg();
        Object object3 = zzfxs.zzc;
        object3 = ((zzfu)object).zzA(n4, (Charset)object3);
        int n7 = ((zzfu)object).zzg();
        int n8 = ((zzfu)object).zzg();
        int n10 = ((zzfu)object).zzg();
        int n14 = ((zzfu)object).zzg();
        n4 = ((zzfu)object).zzg();
        byte[] byArray = new byte[n4];
        ((zzfu)object).zzG(byArray, 0, n4);
        object = new zzagw(n3, (String)object2, (String)object3, n7, n8, n10, n14, byArray);
        return object;
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
        if (object != null && (object3 = zzagw.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzagw)object;
            int n3 = this.zza;
            int n4 = ((zzagw)object).zza;
            if (n3 == n4 && (n3 = (int)(((String)(object2 = this.zzb)).equals(object3 = ((zzagw)object).zzb) ? 1 : 0)) != 0 && (n3 = (int)(((String)(object2 = this.zzc)).equals(object3 = ((zzagw)object).zzc) ? 1 : 0)) != 0 && (n3 = this.zzd) == (n4 = ((zzagw)object).zzd) && (n3 = this.zze) == (n4 = ((zzagw)object).zze) && (n3 = this.zzf) == (n4 = ((zzagw)object).zzf) && (n3 = this.zzg) == (n4 = ((zzagw)object).zzg) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzh), (byte[])(object = (Object)((zzagw)object).zzh)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza + 527;
        Object object = this.zzb;
        int n4 = ((String)object).hashCode() + (n3 *= 31);
        String string2 = this.zzc;
        n3 = string2.hashCode() + (n4 *= 31);
        object = this.zzh;
        n3 *= 31;
        int n7 = this.zzd;
        n3 = (n3 + n7) * 31;
        n7 = this.zze;
        n3 = (n3 + n7) * 31;
        n7 = this.zzf;
        n3 = (n3 + n7) * 31;
        n7 = this.zzg;
        n3 = (n3 + n7) * 31;
        return Arrays.hashCode((byte[])object) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Picture: mimeType=");
        String string2 = this.zzb;
        stringBuilder.append(string2);
        stringBuilder.append(", description=");
        string2 = this.zzc;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        parcel.writeInt(n3);
        Object object = this.zzb;
        parcel.writeString((String)object);
        object = this.zzc;
        parcel.writeString((String)object);
        n3 = this.zzd;
        parcel.writeInt(n3);
        n3 = this.zze;
        parcel.writeInt(n3);
        n3 = this.zzf;
        parcel.writeInt(n3);
        n3 = this.zzg;
        parcel.writeInt(n3);
        object = this.zzh;
        parcel.writeByteArray((byte[])object);
    }

    public final void zza(zzby zzby2) {
        byte[] byArray = this.zzh;
        int n3 = this.zza;
        zzby2.zza(byArray, n3);
    }
}

