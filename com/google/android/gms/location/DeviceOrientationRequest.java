/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzn;

public final class DeviceOrientationRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final long OUTPUT_PERIOD_DEFAULT = 20000L;
    public static final long OUTPUT_PERIOD_FAST = 5000L;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000L;
    private final long zza;
    private final boolean zzb;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
    }

    public DeviceOrientationRequest(long l2, boolean bl2) {
        this.zza = l2;
        this.zzb = bl2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        Object object2 = object instanceof DeviceOrientationRequest;
        if (!object2) {
            return false;
        }
        object = (DeviceOrientationRequest)object;
        long l2 = this.zza;
        long l3 = ((DeviceOrientationRequest)object).zza;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (!object2 && (object2 = this.zzb) == (bl2 = ((DeviceOrientationRequest)object).zzb)) {
            return bl3;
        }
        return false;
    }

    public long getSamplingPeriodMicros() {
        return this.zza;
    }

    public int hashCode() {
        Long l2 = this.zza;
        Boolean bl2 = this.zzb;
        Object[] objectArray = new Object[]{l2, bl2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        long l2 = this.zza;
        CharSequence charSequence = String.valueOf(l2);
        int n3 = ((String)charSequence).length();
        int n4 = 1;
        int n7 = (int)(this.zzb ? 1 : 0);
        String string2 = n4 != n7 ? "" : ", withVelocity";
        int n8 = string2.length() + (n3 += 46) + n4;
        charSequence = new StringBuilder(n8);
        ((StringBuilder)charSequence).append("DeviceOrientationRequest[samplingPeriodMicros=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("]");
        return ((StringBuilder)charSequence).toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.getSamplingPeriodMicros();
        SafeParcelWriter.writeLong(parcel, 2, l2);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzb() {
        return this.zzb;
    }
}

