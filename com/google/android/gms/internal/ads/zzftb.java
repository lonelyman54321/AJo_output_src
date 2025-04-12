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
import com.google.android.gms.internal.ads.zzftc;
import java.util.Arrays;

public final class zzftb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    static {
        zzftc zzftc2 = new zzftc();
        CREATOR = zzftc2;
    }

    public zzftb(int n3, byte[] byArray, int n4) {
        byte[] byArray2;
        this.zza = n3;
        if (byArray == null) {
            n3 = 0;
            byArray2 = null;
        } else {
            n3 = byArray.length;
            byArray2 = Arrays.copyOf(byArray, n3);
        }
        this.zzb = byArray2;
        this.zzc = n4;
    }

    public zzftb(byte[] byArray, int n3) {
        int n4 = 1;
        this(n4, null, n4);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        byte[] byArray = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

