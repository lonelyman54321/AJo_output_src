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
import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.location.zzm;
import java.util.Arrays;

public class DeviceOrientation
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    public DeviceOrientation(float[] fArray, float f5, float f6, long l2, byte by2, float f7, float f8) {
        byte by4;
        float f11;
        float f12;
        DeviceOrientation.zzj(fArray);
        boolean bl2 = true;
        int n3 = 0;
        float f14 = f5 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (f15 >= 0 && (f15 = (f12 = f5 - (f11 = 360.0f)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0) {
            f15 = 1.0f;
            f11 = Float.MIN_VALUE;
        } else {
            f15 = 0.0f;
            f11 = 0.0f;
        }
        zzer.zza((boolean)f15);
        f15 = 0x43340000;
        f11 = 180.0f;
        float f16 = f6 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        f17 = f17 >= 0 && (f17 = f6 == f11 ? 0 : (f6 < f11 ? -1 : 1)) <= 0 ? 1.0f : 0.0f;
        zzer.zza((boolean)f17);
        float f18 = f8 - 0.0f;
        n3 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        n3 = n3 >= 0 && (n3 = (int)(f8 == f11 ? 0 : (f8 < f11 ? -1 : 1))) <= 0 ? 1 : 0;
        zzer.zza(n3 != 0);
        long l3 = 0L;
        f17 = (float)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (f17 < 0) {
            bl2 = false;
        }
        zzer.zza(bl2);
        this.zza = fArray;
        this.zzb = f5;
        this.zzc = f6;
        this.zzf = f7;
        this.zzg = f8;
        this.zzd = l2;
        this.zze = by4 = (byte)((byte)((byte)(by2 | 0x10) | 4) | 8);
    }

    public static /* synthetic */ void zzb(float[] fArray) {
        DeviceOrientation.zzj(fArray);
    }

    private static void zzj(float[] fArray) {
        boolean bl2;
        block6: {
            block5: {
                float f5;
                int n3;
                int n4;
                bl2 = true;
                if (fArray != null && (n4 = fArray.length) == (n3 = 4)) {
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    n4 = 0;
                    f5 = 0.0f;
                }
                String string2 = "Input attitude array should be of length 4.";
                zzer.zzb(n4 != 0, string2);
                f5 = fArray[0];
                n4 = Float.isNaN(f5);
                if (n4 != 0 || (n4 = Float.isNaN(f5 = fArray[bl2])) != 0 || (n4 = Float.isNaN(f5 = fArray[2])) != 0) break block5;
                n4 = 3;
                f5 = 4.2E-45f;
                float f6 = fArray[n4];
                boolean bl3 = Float.isNaN(f6);
                if (!bl3) break block6;
            }
            bl2 = false;
        }
        zzer.zzb(bl2, "Input attitude cannot contain NaNs.");
    }

    public boolean equals(Object object) {
        boolean bl2;
        long l2;
        long l3;
        long l4;
        int n3;
        float f5;
        float[] fArray;
        float f6;
        float f7;
        int n32;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n4 = object instanceof DeviceOrientation;
        if (n4 == 0) {
            return false;
        }
        object = (DeviceOrientation)object;
        n4 = this.zza();
        if (n4 == (n32 = ((DeviceOrientation)object).zza()) && ((n4 = this.zza()) == 0 || (n4 = Float.compare(f7 = this.zzf, f6 = ((DeviceOrientation)object).zzf)) == 0)) {
            n4 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f7 = 0.0f;
            fArray = null;
        }
        n32 = this.hasConservativeHeadingErrorDegrees();
        int n7 = ((DeviceOrientation)object).hasConservativeHeadingErrorDegrees();
        if (n32 == n7 && ((n32 = this.hasConservativeHeadingErrorDegrees()) == 0 || (n32 = Float.compare(f6 = this.getConservativeHeadingErrorDegrees(), f5 = ((DeviceOrientation)object).getConservativeHeadingErrorDegrees())) == 0)) {
            n32 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n32 = 0;
            f6 = 0.0f;
        }
        f5 = this.zzb;
        float f8 = ((DeviceOrientation)object).zzb;
        int n8 = Float.compare(f5, f8);
        if (n8 == 0 && (n3 = Float.compare(f5 = this.zzc, f8 = ((DeviceOrientation)object).zzc)) == 0 && n4 != 0 && n32 != 0 && (n4 = (int)((l4 = (l3 = this.zzd) - (l2 = ((DeviceOrientation)object).zzd)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0 && (bl2 = Arrays.equals(fArray = this.zza, (float[])(object = (Object)((DeviceOrientation)object).zza)))) {
            return bl3;
        }
        return false;
    }

    public float[] getAttitude() {
        return (float[])this.zza.clone();
    }

    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }

    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    public float getHeadingDegrees() {
        return this.zzb;
    }

    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees() {
        int n3 = this.zze & 0x40;
        return n3 != 0;
    }

    public int hashCode() {
        Float f5 = Float.valueOf(this.zzb);
        Float f6 = Float.valueOf(this.zzc);
        Float f7 = Float.valueOf(this.zzg);
        Long l2 = this.zzd;
        float[] fArray = this.zza;
        Byte by2 = this.zze;
        Object[] objectArray = new Object[]{f5, f6, f7, l2, fArray, by2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeviceOrientation[attitude=");
        String string2 = Arrays.toString(this.zza);
        stringBuilder.append(string2);
        stringBuilder.append(", headingDegrees=");
        float f5 = this.zzb;
        stringBuilder.append(f5);
        string2 = ", headingErrorDegrees=";
        stringBuilder.append(string2);
        f5 = this.zzc;
        stringBuilder.append(f5);
        boolean bl2 = this.hasConservativeHeadingErrorDegrees();
        if (bl2) {
            string2 = ", conservativeHeadingErrorDegrees=";
            stringBuilder.append(string2);
            f5 = this.zzg;
            stringBuilder.append(f5);
        }
        stringBuilder.append(", elapsedRealtimeNs=");
        long l2 = this.zzd;
        stringBuilder.append(l2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        float[] fArray = this.getAttitude();
        SafeParcelWriter.writeFloatArray(parcel, 1, fArray, false);
        float f5 = this.getHeadingDegrees();
        SafeParcelWriter.writeFloat(parcel, 4, f5);
        f5 = this.getHeadingErrorDegrees();
        SafeParcelWriter.writeFloat(parcel, 5, f5);
        long l2 = this.getElapsedRealtimeNs();
        SafeParcelWriter.writeLong(parcel, 6, l2);
        byte by2 = this.zze;
        SafeParcelWriter.writeByte(parcel, 7, by2);
        f5 = this.zzf;
        SafeParcelWriter.writeFloat(parcel, 8, f5);
        f5 = this.getConservativeHeadingErrorDegrees();
        SafeParcelWriter.writeFloat(parcel, 9, f5);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final boolean zza() {
        int n3 = this.zze & 0x20;
        return n3 != 0;
    }

    public final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    public final /* synthetic */ float zzd() {
        return this.zzb;
    }

    public final /* synthetic */ float zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ byte zzg() {
        return this.zze;
    }

    public final /* synthetic */ float zzh() {
        return this.zzf;
    }

    public final /* synthetic */ float zzi() {
        return this.zzg;
    }
}

