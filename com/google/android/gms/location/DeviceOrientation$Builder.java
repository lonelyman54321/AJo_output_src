/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.location.DeviceOrientation;
import java.util.Arrays;

public final class DeviceOrientation$Builder {
    private final float[] zza;
    private float zzb;
    private float zzc;
    private long zzd;
    private byte zze = 0;
    private float zzf;
    private float zzg;

    public DeviceOrientation$Builder(DeviceOrientation deviceOrientation) {
        byte by2;
        DeviceOrientation.zzb(deviceOrientation.zzc());
        float[] fArray = deviceOrientation.zzc();
        int n3 = deviceOrientation.zzc().length;
        fArray = Arrays.copyOf(fArray, n3);
        this.zza = fArray;
        float f5 = deviceOrientation.zzd();
        this.setHeadingDegrees(f5);
        f5 = deviceOrientation.zze();
        this.setHeadingErrorDegrees(f5);
        f5 = deviceOrientation.zzi();
        this.setConservativeHeadingErrorDegrees(f5);
        long l2 = deviceOrientation.zzf();
        this.setElapsedRealtimeNs(l2);
        this.zzf = f5 = deviceOrientation.zzh();
        this.zze = by2 = deviceOrientation.zzg();
    }

    public DeviceOrientation$Builder(float[] fArray, float f5, float f6, long l2) {
        DeviceOrientation.zzb(fArray);
        int n3 = fArray.length;
        fArray = Arrays.copyOf(fArray, n3);
        this.zza = fArray;
        this.setHeadingDegrees(f5);
        this.setHeadingErrorDegrees(f6);
        this.setElapsedRealtimeNs(l2);
        this.zzf = 0.0f;
        this.zzg = 180.0f;
        this.zze = 0;
    }

    public DeviceOrientation build() {
        float[] fArray = this.zza;
        float f5 = this.zzb;
        float f6 = this.zzc;
        long l2 = this.zzd;
        byte by2 = this.zze;
        float f7 = this.zzf;
        float f8 = this.zzg;
        DeviceOrientation deviceOrientation = new DeviceOrientation(fArray, f5, f6, l2, by2, f7, f8);
        return deviceOrientation;
    }

    public DeviceOrientation$Builder clearConservativeHeadingErrorDegrees() {
        this.zzg = 180.0f;
        int n3 = this.zze & 0xFFFFFFBF;
        this.zzf = 0.0f;
        n3 = (byte)((byte)n3 & 0xFFFFFFDF);
        this.zze = (byte)n3;
        return this;
    }

    public DeviceOrientation$Builder setAttitude(float[] fArray) {
        DeviceOrientation.zzb(fArray);
        int n3 = fArray.length;
        float[] fArray2 = this.zza;
        System.arraycopy(fArray, 0, fArray2, 0, n3);
        return this;
    }

    public DeviceOrientation$Builder setConservativeHeadingErrorDegrees(float f5) {
        byte by2;
        byte by4 = 0;
        float f6 = 180.0f;
        float f7 = 0.0f;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1)) <= 0) {
            by4 = 1;
        }
        String string2 = "conservativeHeadingErrorDegrees should be between 0 and 180.";
        zzer.zzb(by4 != 0, string2);
        this.zzg = f5;
        this.zze = by4 = (byte)(this.zze | 0x40);
        by4 = (byte)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
        if (by4 < 0) {
            double d2 = Math.cos(Math.toRadians(f5));
            double d5 = 1.0 - d2;
            d2 = 2.0 / d5;
            f7 = (float)d2;
        }
        this.zzf = f7;
        this.zze = by2 = (byte)(this.zze | 0x20);
        return this;
    }

    public DeviceOrientation$Builder setElapsedRealtimeNs(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        zzer.zzb(bl2, "elapsedRealtimeNs should be greater than or equal to 0.");
        this.zzd = l2;
        return this;
    }

    public DeviceOrientation$Builder setHeadingDegrees(float f5) {
        float f6;
        float f7 = 0.0f;
        boolean bl2 = false;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 360.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            bl2 = true;
        }
        zzer.zzb(bl2, "headingDegrees should be greater than or equal to 0 and less than 360.");
        this.zzb = f5;
        return this;
    }

    public DeviceOrientation$Builder setHeadingErrorDegrees(float f5) {
        float f6;
        float f7 = 0.0f;
        boolean bl2 = false;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 180.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        zzer.zzb(bl2, "headingErrorDegrees should be between 0 and 180.");
        this.zzc = f5;
        return this;
    }
}

