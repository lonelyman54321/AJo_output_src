/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzn;
import java.util.Locale;

public final class zzcl {
    public static final zzcl zza;
    public static final zzn zzb;
    private static final String zze;
    private static final String zzf;
    public final float zzc;
    public final float zzd;
    private final int zzg;

    static {
        float f5 = 1.0f;
        Object object = new zzcl(f5, f5);
        zza = object;
        int n3 = 36;
        zze = Integer.toString(0, n3);
        zzf = Integer.toString(1, n3);
        zzb = object = new zzck();
    }

    public zzcl(float f5, float f6) {
        int n3;
        boolean bl2 = false;
        int n4 = 0;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        f8 = f8 > 0 ? 1.0f : 0.0f;
        zzeq.zzd((boolean)f8);
        float f11 = f6 - 0.0f;
        n4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n4 > 0) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zzc = f5;
        this.zzd = f6;
        this.zzg = n3 = Math.round(f5 * 1000.0f);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzcl> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzcl.class) == (clazz = object.getClass())) {
            float f5;
            float f6;
            float f7;
            object = (zzcl)object;
            float f8 = this.zzc;
            float f11 = ((zzcl)object).zzc;
            float f12 = f8 - f11;
            Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object2 == false && (f7 = (f6 = (f8 = this.zzd) - (f5 = ((zzcl)object).zzd)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.floatToRawIntBits(this.zzc) + 527;
        float f5 = this.zzd;
        return Float.floatToRawIntBits(f5) + (n3 *= 31);
    }

    public final String toString() {
        Float f5 = Float.valueOf(this.zzc);
        Float f6 = Float.valueOf(this.zzd);
        Object[] objectArray = new Object[]{f5, f6};
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objectArray);
    }

    public final long zza(long l2) {
        long l3 = this.zzg;
        return l2 * l3;
    }
}

