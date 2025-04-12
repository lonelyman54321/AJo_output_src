/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.vision.zzai;

public final class zzaj
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Rect zza;

    static {
        zzai zzai2 = new zzai();
        CREATOR = zzai2;
    }

    public zzaj() {
        Rect rect;
        this.zza = rect = new Rect();
    }

    public zzaj(Rect rect) {
        this.zza = rect;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Rect rect = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)rect, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

