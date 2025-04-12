/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzam;

public final class zzal
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;

    static {
        zzam zzam2 = new zzam();
        CREATOR = zzam2;
    }

    public zzal(int n3) {
        this.zza = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

