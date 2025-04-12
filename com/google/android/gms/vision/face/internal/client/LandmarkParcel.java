/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.face.internal.client.zzm;

public final class LandmarkParcel
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final float zzb;
    public final int zzc;
    private final int zzd;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    public LandmarkParcel(int n3, float f5, float f6, int n4) {
        this.zzd = n3;
        this.zza = f5;
        this.zzb = f6;
        this.zzc = n4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        float f5 = this.zza;
        SafeParcelWriter.writeFloat(parcel, 2, f5);
        f5 = this.zzb;
        SafeParcelWriter.writeFloat(parcel, 3, f5);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

