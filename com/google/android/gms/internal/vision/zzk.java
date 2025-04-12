/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.vision.zzj;

public final class zzk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int zza;
    private boolean zzb;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public zzk() {
    }

    public zzk(int n3, boolean bl2) {
        this.zza = n3;
        this.zzb = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        boolean bl3 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 3, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

