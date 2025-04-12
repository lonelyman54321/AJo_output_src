/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    static {
        zzl zzl2 = new zzl();
        CREATOR = zzl2;
    }

    public zzk(boolean bl2, boolean bl3, String string2, boolean bl4, float f5, int n3, boolean bl5, boolean bl6, boolean bl7) {
        this.zza = bl2;
        this.zzb = bl3;
        this.zzc = string2;
        this.zzd = bl4;
        this.zze = f5;
        this.zzf = n3;
        this.zzg = bl5;
        this.zzh = bl6;
        this.zzi = bl7;
    }

    public zzk(boolean bl2, boolean bl3, boolean bl4, float f5, int n3, boolean bl5, boolean bl6, boolean bl7) {
        this(bl2, bl3, null, bl4, f5, -1, bl5, bl6, bl7);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = (int)(this.zza ? 1 : 0);
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, n3 != 0);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        boolean bl3 = this.zzd;
        SafeParcelWriter.writeBoolean(parcel, 5, bl3);
        float f5 = this.zze;
        SafeParcelWriter.writeFloat(parcel, 6, f5);
        int n7 = this.zzf;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        boolean bl4 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 8, bl4);
        boolean bl5 = this.zzh;
        SafeParcelWriter.writeBoolean(parcel, 9, bl5);
        boolean bl6 = this.zzi;
        SafeParcelWriter.writeBoolean(parcel, 10, bl6);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

