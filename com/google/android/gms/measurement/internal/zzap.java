/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzao;

public final class zzap
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle zza;

    static {
        zzao zzao2 = new zzao();
        CREATOR = zzao2;
    }

    public zzap(Bundle bundle) {
        this.zza = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Bundle bundle = this.zza;
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

