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
import com.google.android.gms.internal.ads.zzaik;
import com.google.android.gms.internal.ads.zzail;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;

public final class zzaim
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final int zzb;

    static {
        zzaik zzaik2 = new zzaik();
        CREATOR = zzaik2;
    }

    public zzaim(float f5, int n3) {
        this.zza = f5;
        this.zzb = n3;
    }

    public /* synthetic */ zzaim(Parcel parcel, zzail zzail2) {
        int n3;
        float f5;
        this.zza = f5 = parcel.readFloat();
        this.zzb = n3 = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzaim> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzaim.class) == (clazz = object.getClass())) {
            int n3;
            object = (zzaim)object;
            float f5 = this.zza;
            float f6 = ((zzaim)object).zza;
            float f7 = f5 - f6;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 == false && (object2 = (Object)this.zzb) == (n3 = ((zzaim)object).zzb)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (Float.valueOf(this.zza).hashCode() + 527) * 31;
        int n4 = this.zzb;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("smta: captureFrameRate=");
        float f5 = this.zza;
        stringBuilder.append(f5);
        stringBuilder.append(", svcTemporalLayerCount=");
        int n3 = this.zzb;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        float f5 = this.zza;
        parcel.writeFloat(f5);
        n3 = this.zzb;
        parcel.writeInt(n3);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

