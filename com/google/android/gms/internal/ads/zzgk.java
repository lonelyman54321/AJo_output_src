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
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgi;
import com.google.android.gms.internal.ads.zzgj;

public final class zzgk
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final float zzb;

    static {
        zzgi zzgi2 = new zzgi();
        CREATOR = zzgi2;
    }

    public zzgk(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        float f12 = -90.0f;
        boolean bl2 = false;
        float f14 = f5 == f12 ? 0 : (f5 > f12 ? 1 : -1);
        if (f14 >= 0 && (f14 = (f11 = f5 - (f12 = 90.0f)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0 && (f14 = (f8 = f6 - (f12 = -180.0f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) >= 0 && (f14 = (f7 = f6 - (f12 = 180.0f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        zzeq.zze(bl2, "Invalid latitude or longitude");
        this.zza = f5;
        this.zzb = f6;
    }

    public /* synthetic */ zzgk(Parcel parcel, zzgj zzgj2) {
        float f5;
        float f6;
        this.zza = f6 = parcel.readFloat();
        this.zzb = f5 = parcel.readFloat();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzgk> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzgk.class) == (clazz = object.getClass())) {
            float f5;
            float f6;
            float f7;
            object = (zzgk)object;
            float f8 = this.zza;
            float f11 = ((zzgk)object).zza;
            float f12 = f8 - f11;
            Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object2 == false && (f7 = (f6 = (f8 = this.zzb) - (f5 = ((zzgk)object).zzb)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.valueOf(this.zza).hashCode() + 527;
        int n4 = Float.valueOf(this.zzb).hashCode();
        return n3 * 31 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("xyz: latitude=");
        float f5 = this.zza;
        stringBuilder.append(f5);
        stringBuilder.append(", longitude=");
        f5 = this.zzb;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        float f5 = this.zza;
        parcel.writeFloat(f5);
        f5 = this.zzb;
        parcel.writeFloat(f5);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

