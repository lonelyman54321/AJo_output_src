/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbyp;

public final class zzbyo
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzl zza;
    public final String zzb;

    static {
        zzbyp zzbyp2 = new zzbyp();
        CREATOR = zzbyp2;
    }

    public zzbyo(zzl zzl2, String string2) {
        this.zza = zzl2;
        this.zzb = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        object = this.zzb;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

