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
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbtu;
import java.util.Arrays;

public final class zzbtt
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
        zzbtu zzbtu2 = new zzbtu();
        CREATOR = zzbtu2;
    }

    public zzbtt(int n3, int n4, int n7) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
    }

    public static zzbtt zza(VersionInfo versionInfo) {
        int n3 = versionInfo.getMajorVersion();
        int n4 = versionInfo.getMinorVersion();
        int n7 = versionInfo.getMicroVersion();
        zzbtt zzbtt2 = new zzbtt(n3, n4, n7);
        return zzbtt2;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        int n3 = object instanceof zzbtt;
        if (n3 != 0) {
            int n4;
            object = (zzbtt)object;
            n3 = ((zzbtt)object).zzc;
            int n7 = this.zzc;
            if (n3 == n7 && (n3 = ((zzbtt)object).zzb) == (n7 = this.zzb) && (n4 = ((zzbtt)object).zza) == (n3 = this.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        return Arrays.hashCode(new int[]{n3, n4, n7});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.zza;
        stringBuilder.append(n3);
        String string2 = ".";
        stringBuilder.append(string2);
        int n4 = this.zzb;
        stringBuilder.append(n4);
        stringBuilder.append(string2);
        n3 = this.zzc;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

