/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.location.DeviceOrientationRequest;

public final class DeviceOrientationRequest$Builder {
    private long zza;
    private final boolean zzb;

    public DeviceOrientationRequest$Builder(long l2) {
        this.zzb = false;
        this.setSamplingPeriodMicros(l2);
    }

    public DeviceOrientationRequest$Builder(DeviceOrientationRequest deviceOrientationRequest) {
        boolean bl2;
        long l2;
        this.zza = l2 = deviceOrientationRequest.zza();
        this.zzb = bl2 = deviceOrientationRequest.zzb();
    }

    public DeviceOrientationRequest build() {
        long l2 = this.zza;
        boolean bl2 = this.zzb;
        DeviceOrientationRequest deviceOrientationRequest = new DeviceOrientationRequest(l2, bl2);
        return deviceOrientationRequest;
    }

    public DeviceOrientationRequest$Builder setSamplingPeriodMicros(long l2) {
        long l3;
        long l4 = 0L;
        boolean bl2 = false;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object >= 0 && (object = (l3 = l2 - (l4 = Long.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            bl2 = true;
        }
        int n3 = String.valueOf(l2).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 102);
        stringBuilder.append("Invalid interval: ");
        stringBuilder.append(l2);
        stringBuilder.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        String string2 = stringBuilder.toString();
        zzer.zzb(bl2, string2);
        this.zza = l2;
        return this;
    }
}

