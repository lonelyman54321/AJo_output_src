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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbnd;

public final class zzbnc
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    static {
        zzbnd zzbnd2 = new zzbnd();
        CREATOR = zzbnd2;
    }

    public zzbnc(boolean bl2, String string2, int n3, byte[] byArray, String[] stringArray, String[] stringArray2, boolean bl3, long l2) {
        this.zza = bl2;
        this.zzb = string2;
        this.zzc = n3;
        this.zzd = byArray;
        this.zze = stringArray;
        this.zzf = stringArray2;
        this.zzg = bl3;
        this.zzh = l2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = (int)(this.zza ? 1 : 0);
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, n3 != 0);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int bl2 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, bl2);
        Object[] objectArray = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, objectArray, false);
        objectArray = this.zze;
        SafeParcelWriter.writeStringArray(parcel, 5, (String[])objectArray, false);
        objectArray = this.zzf;
        SafeParcelWriter.writeStringArray(parcel, 6, (String[])objectArray, false);
        boolean bl3 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 7, bl3);
        long l2 = this.zzh;
        SafeParcelWriter.writeLong(parcel, 8, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

