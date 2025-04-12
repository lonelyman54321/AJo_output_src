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
import com.google.android.gms.vision.face.internal.client.zze;

public final class zzf
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;
    public float zzf;

    static {
        zze zze2 = new zze();
        CREATOR = zze2;
    }

    public zzf() {
    }

    public zzf(int n3, int n4, int n7, boolean bl2, boolean bl3, float f5) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = bl2;
        this.zze = bl3;
        this.zzf = f5;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        int n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        boolean bl3 = this.zzd;
        SafeParcelWriter.writeBoolean(parcel, 5, bl3);
        boolean bl4 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 6, bl4);
        float f5 = this.zzf;
        SafeParcelWriter.writeFloat(parcel, 7, f5);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

