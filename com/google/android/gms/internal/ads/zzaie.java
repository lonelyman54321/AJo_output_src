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
import com.google.android.gms.internal.ads.zzaic;
import com.google.android.gms.internal.ads.zzaid;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;

public final class zzaie
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    static {
        zzaic zzaic2 = new zzaic();
        CREATOR = zzaic2;
    }

    public zzaie(long l2, long l3, long l4, long l7, long l8) {
        this.zza = l2;
        this.zzb = l3;
        this.zzc = l4;
        this.zzd = l7;
        this.zze = l8;
    }

    public /* synthetic */ zzaie(Parcel parcel, zzaid zzaid2) {
        long l2;
        long l3;
        this.zza = l3 = parcel.readLong();
        this.zzb = l3 = parcel.readLong();
        this.zzc = l3 = parcel.readLong();
        this.zzd = l3 = parcel.readLong();
        this.zze = l2 = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzaie> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzaie.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (zzaie)object;
            long l12 = this.zza;
            long l14 = ((zzaie)object).zza;
            long l15 = l12 - l14;
            Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object2 == false && (object2 = (l8 = (l12 = this.zzb) - (l14 = ((zzaie)object).zzb)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false && (object2 = (l7 = (l12 = this.zzc) - (l14 = ((zzaie)object).zzc)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false && (object2 = (l4 = (l12 = this.zzd) - (l14 = ((zzaie)object).zzd)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (l3 = (l2 = (l12 = this.zze) - (l14 = ((zzaie)object).zze)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.zza;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3);
        l3 = this.zze;
        long l4 = this.zzd;
        long l7 = this.zzc;
        long l8 = this.zzb;
        n4 += 527;
        long l12 = l3 >>> n3;
        l3 ^= l12;
        l12 = l4 >>> n3;
        l4 ^= l12;
        l12 = l7 >>> n3;
        l7 ^= l12;
        l12 = l8 >>> n3;
        n4 *= 31;
        int n7 = (int)(l8 ^= l12);
        n4 = (n4 + n7) * 31;
        n7 = (int)l7;
        n4 = (n4 + n7) * 31;
        n7 = (int)l4;
        n4 = (n4 + n7) * 31;
        n7 = (int)l3;
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Motion photo metadata: photoStartPosition=");
        long l2 = this.zza;
        stringBuilder.append(l2);
        stringBuilder.append(", photoSize=");
        l2 = this.zzb;
        stringBuilder.append(l2);
        stringBuilder.append(", photoPresentationTimestampUs=");
        l2 = this.zzc;
        stringBuilder.append(l2);
        stringBuilder.append(", videoStartPosition=");
        l2 = this.zzd;
        stringBuilder.append(l2);
        stringBuilder.append(", videoSize=");
        l2 = this.zze;
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
        l2 = this.zzd;
        parcel.writeLong(l2);
        l2 = this.zze;
        parcel.writeLong(l2);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

