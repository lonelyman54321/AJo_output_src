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
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgl;
import com.google.android.gms.internal.ads.zzgm;

public final class zzgn
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final long zzc;

    static {
        zzgl zzgl2 = new zzgl();
        CREATOR = zzgl2;
    }

    public zzgn(long l2, long l3, long l4) {
        this.zza = l2;
        this.zzb = l3;
        this.zzc = l4;
    }

    public /* synthetic */ zzgn(Parcel parcel, zzgm zzgm2) {
        long l2;
        long l3;
        this.zza = l3 = parcel.readLong();
        this.zzb = l3 = parcel.readLong();
        this.zzc = l2 = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof zzgn;
        if (!object2) {
            return false;
        }
        object = (zzgn)object;
        long l7 = this.zza;
        long l8 = ((zzgn)object).zza;
        long l12 = l7 - l8;
        object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (!object2 && !(object2 = (l4 = (l7 = this.zzb) - (l8 = ((zzgn)object).zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) && (l3 = (l2 = (l7 = this.zzc) - (l8 = ((zzgn)object).zzc)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.zza;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3);
        l3 = this.zzc;
        long l4 = this.zzb;
        n4 += 527;
        long l7 = l3 >>> n3;
        l3 ^= l7;
        l7 = l4 >>> n3;
        n4 *= 31;
        int n7 = (int)(l4 ^= l7);
        n4 = (n4 + n7) * 31;
        n7 = (int)l3;
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Mp4Timestamp: creation time=");
        long l2 = this.zza;
        stringBuilder.append(l2);
        stringBuilder.append(", modification time=");
        l2 = this.zzb;
        stringBuilder.append(l2);
        stringBuilder.append(", timescale=");
        l2 = this.zzc;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.zza;
        parcel.writeLong(l2);
        l2 = this.zzb;
        parcel.writeLong(l2);
        l2 = this.zzc;
        parcel.writeLong(l2);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

