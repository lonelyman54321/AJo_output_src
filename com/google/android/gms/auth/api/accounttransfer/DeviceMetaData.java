/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class DeviceMetaData
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    private boolean zzb;
    private long zzc;
    private final boolean zzd;

    static {
        zzy zzy2 = new zzy();
        CREATOR = zzy2;
    }

    public DeviceMetaData(int n3, boolean bl2, long l2, boolean bl3) {
        this.zza = n3;
        this.zzb = bl2;
        this.zzc = l2;
        this.zzd = bl3;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        boolean bl3 = this.isLockScreenSolved();
        SafeParcelWriter.writeBoolean(parcel, 2, bl3);
        long l2 = this.getMinAgeOfLockScreen();
        SafeParcelWriter.writeLong(parcel, 3, l2);
        boolean bl4 = this.isChallengeAllowed();
        SafeParcelWriter.writeBoolean(parcel, 4, bl4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

