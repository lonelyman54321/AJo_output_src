/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzl;

public final class zzk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    Bundle zza;
    Feature[] zzb;
    int zzc;
    ConnectionTelemetryConfiguration zzd;

    static {
        zzl zzl2 = new zzl();
        CREATOR = zzl2;
    }

    public zzk() {
    }

    public zzk(Bundle bundle, Feature[] featureArray, int n3, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArray;
        this.zzc = n3;
        this.zzd = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Bundle bundle = this.zza;
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        Object object = this.zzb;
        SafeParcelWriter.writeTypedArray(parcel, 2, object, n3, false);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        object = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

