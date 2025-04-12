/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzm;

public class ConnectionTelemetryConfiguration
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean bl2, boolean bl3, int[] nArray, int n3, int[] nArray2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzd = nArray;
        this.zze = n3;
        this.zzf = nArray2;
    }

    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        int n7 = this.getMethodInvocationTelemetryEnabled();
        SafeParcelWriter.writeBoolean(parcel, 2, n7 != 0);
        n7 = this.getMethodTimingTelemetryEnabled();
        SafeParcelWriter.writeBoolean(parcel, 3, n7 != 0);
        object = this.getMethodInvocationMethodKeyAllowlist();
        SafeParcelWriter.writeIntArray(parcel, 4, (int[])object, false);
        n7 = this.getMaxMethodInvocationsLogged();
        SafeParcelWriter.writeInt(parcel, 5, n7);
        object = this.getMethodInvocationMethodKeyDisallowlist();
        SafeParcelWriter.writeIntArray(parcel, 6, (int[])object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final RootTelemetryConfiguration zza() {
        return this.zza;
    }
}

