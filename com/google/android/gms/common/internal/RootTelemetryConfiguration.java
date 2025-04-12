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
import com.google.android.gms.common.internal.zzak;

public class RootTelemetryConfiguration
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    static {
        zzak zzak2 = new zzak();
        CREATOR = zzak2;
    }

    public RootTelemetryConfiguration(int n3, boolean bl2, boolean bl3, int n4, int n7) {
        this.zza = n3;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzd = n4;
        this.zze = n7;
    }

    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    public int getVersion() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getVersion();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = (int)(this.getMethodInvocationTelemetryEnabled() ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 2, n4 != 0);
        n4 = this.getMethodTimingTelemetryEnabled();
        SafeParcelWriter.writeBoolean(parcel, 3, n4 != 0);
        n4 = this.getBatchPeriodMillis();
        SafeParcelWriter.writeInt(parcel, 4, n4);
        n4 = this.getMaxMethodInvocationsInBatch();
        SafeParcelWriter.writeInt(parcel, 5, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

