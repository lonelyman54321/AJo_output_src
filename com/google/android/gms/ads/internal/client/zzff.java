/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzff
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;

    static {
        zzfg zzfg2 = new zzfg();
        CREATOR = zzfg2;
    }

    public zzff(int n3, int n4) {
        this.zza = n3;
        this.zzb = n4;
    }

    public zzff(RequestConfiguration requestConfiguration) {
        int n3;
        int n4;
        this.zza = n4 = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = n3 = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

