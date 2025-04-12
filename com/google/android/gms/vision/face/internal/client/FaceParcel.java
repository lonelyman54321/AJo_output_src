/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.face.internal.client.zzd;

public class FaceParcel
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final float zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final LandmarkParcel[] zzi;
    public final float zzj;
    public final float zzk;
    public final float zzl;
    public final zza[] zzm;
    public final float zzn;
    private final int zzo;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public FaceParcel(int n3, int n4, float f5, float f6, float f7, float f8, float f11, float f12, float f14, LandmarkParcel[] landmarkParcelArray, float f15, float f16, float f17, zza[] zzaArray, float f18) {
        this.zzo = n3;
        this.zza = n4;
        this.zzb = f5;
        this.zzc = f6;
        this.zzd = f7;
        this.zze = f8;
        this.zzf = f11;
        this.zzg = f12;
        this.zzh = f14;
        this.zzi = landmarkParcelArray;
        this.zzj = f15;
        this.zzk = f16;
        this.zzl = f17;
        this.zzm = zzaArray;
        this.zzn = f18;
    }

    public FaceParcel(int n3, int n4, float f5, float f6, float f7, float f8, float f11, float f12, LandmarkParcel[] landmarkParcelArray, float f14, float f15, float f16) {
        zza[] zzaArray = new zza[]{};
        this(n3, n4, f5, f6, f7, f8, f11, f12, 0.0f, landmarkParcelArray, f14, f15, f16, zzaArray, -1.0f);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zzo;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        float f5 = this.zzb;
        SafeParcelWriter.writeFloat(parcel, 3, f5);
        f5 = this.zzc;
        SafeParcelWriter.writeFloat(parcel, 4, f5);
        f5 = this.zzd;
        SafeParcelWriter.writeFloat(parcel, 5, f5);
        f5 = this.zze;
        SafeParcelWriter.writeFloat(parcel, 6, f5);
        f5 = this.zzf;
        SafeParcelWriter.writeFloat(parcel, 7, f5);
        f5 = this.zzg;
        SafeParcelWriter.writeFloat(parcel, 8, f5);
        Parcelable[] parcelableArray = this.zzi;
        SafeParcelWriter.writeTypedArray(parcel, 9, parcelableArray, n3, false);
        f5 = this.zzj;
        SafeParcelWriter.writeFloat(parcel, 10, f5);
        f5 = this.zzk;
        SafeParcelWriter.writeFloat(parcel, 11, f5);
        f5 = this.zzl;
        SafeParcelWriter.writeFloat(parcel, 12, f5);
        Parcelable[] parcelableArray2 = this.zzm;
        SafeParcelWriter.writeTypedArray(parcel, 13, parcelableArray2, n3, false);
        float f6 = this.zzh;
        SafeParcelWriter.writeFloat(parcel, 14, f6);
        f6 = this.zzn;
        SafeParcelWriter.writeFloat(parcel, 15, f6);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

