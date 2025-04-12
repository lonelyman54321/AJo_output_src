/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbny;

public final class zzbnx
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final Bundle zzb;

    static {
        zzbny zzbny2 = new zzbny();
        CREATOR = zzbny2;
    }

    public zzbnx(String string2, Bundle bundle) {
        this.zza = string2;
        this.zzb = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Bundle bundle = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 2, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

