/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzco;

final class zzcn
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzco zzco2 = new zzco(parcel);
        return zzco2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzco[n3];
    }
}

