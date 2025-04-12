/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.face.internal.client.zzc;

public final class zza
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PointF[] zza;
    public final int zzb;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public zza(PointF[] pointFArray, int n3) {
        this.zza = pointFArray;
        this.zzb = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        PointF[] pointFArray = this.zza;
        SafeParcelWriter.writeTypedArray(parcel, 2, (Parcelable[])pointFArray, n3, false);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

