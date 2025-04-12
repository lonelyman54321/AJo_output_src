/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn$zza;
import com.google.android.gms.internal.measurement.zzjn$zzb;
import com.google.android.gms.internal.measurement.zzjp;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zznd;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzjn
extends zziv {
    private static final Logger zzb = Logger.getLogger(zzjn.class.getName());
    private static final boolean zzc = zzmz.zzc();
    zzjp zza;

    private zzjn() {
    }

    public /* synthetic */ zzjn(zzjq zzjq2) {
        this();
    }

    public static int zza(double d2) {
        return 8;
    }

    public static int zza(float f5) {
        return 4;
    }

    public static int zza(int n3) {
        return zzjn.zze((long)n3);
    }

    public static int zza(int n3, double d2) {
        return zzjn.zzg(n3 << 3) + 8;
    }

    public static int zza(int n3, float f5) {
        return zzjn.zzg(n3 << 3) + 4;
    }

    public static int zza(int n3, int n4) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zze((long)n4) + n3;
    }

    public static int zza(int n3, long l2) {
        return zzjn.zzg(n3 << 3) + 8;
    }

    public static int zza(int n3, zziy zziy2) {
        n3 = zzjn.zzg(n3 << 3);
        int n4 = zziy2.zzb();
        return zzjn.zzg(n4) + n4 + n3;
    }

    public static int zza(int n3, zzku zzku2) {
        int n4 = zzjn.zzg(8) << 1;
        n3 = zzjn.zzf(2, n3) + n4;
        return zzjn.zzb(3, zzku2) + n3;
    }

    public static int zza(int n3, zzlm zzlm2) {
        int n4 = zzjn.zzg(8) << 1;
        n3 = zzjn.zzf(2, n3) + n4;
        n4 = zzjn.zzg(24);
        return zzjn.zzb(zzlm2) + n4 + n3;
    }

    public static int zza(int n3, zzlm zzlm2, zzme zzme2) {
        n3 = zzjn.zzg(n3 << 3) << 1;
        return ((zzio)zzlm2).zza(zzme2) + n3;
    }

    public static int zza(int n3, String string2) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zza(string2) + n3;
    }

    public static int zza(int n3, boolean bl2) {
        return zzjn.zzg(n3 << 3) + 1;
    }

    public static int zza(long l2) {
        return 8;
    }

    public static int zza(zziy zziy2) {
        int n3 = zziy2.zzb();
        return zzjn.zzg(n3) + n3;
    }

    public static int zza(zzku zzku2) {
        int n3 = zzku2.zza();
        return zzjn.zzg(n3) + n3;
    }

    public static int zza(zzlm zzlm2) {
        return zzlm2.zzcf();
    }

    public static int zza(zzlm zzlm2, zzme zzme2) {
        int n3 = ((zzio)zzlm2).zza(zzme2);
        return zzjn.zzg(n3) + n3;
    }

    public static int zza(String object) {
        int n3;
        try {
            n3 = zzna.zza((String)object);
        }
        catch (zznd zznd2) {
            Charset charset = zzkj.zza;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzjn.zzg(n3) + n3;
    }

    public static int zza(boolean bl2) {
        return 1;
    }

    public static int zza(byte[] byArray) {
        int n3 = byArray.length;
        return zzjn.zzg(n3) + n3;
    }

    public static int zzb(int n3) {
        return 4;
    }

    public static int zzb(int n3, int n4) {
        return zzjn.zzg(n3 << 3) + 4;
    }

    public static int zzb(int n3, long l2) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zze(l2) + n3;
    }

    public static int zzb(int n3, zziy zziy2) {
        int n4 = zzjn.zzg(8) << 1;
        n3 = zzjn.zzf(2, n3) + n4;
        return zzjn.zza(3, zziy2) + n3;
    }

    public static int zzb(int n3, zzku zzku2) {
        n3 = zzjn.zzg(n3 << 3);
        int n4 = zzku2.zza();
        return zzjn.zzg(n4) + n4 + n3;
    }

    public static int zzb(int n3, zzlm zzlm2, zzme zzme2) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zza(zzlm2, zzme2) + n3;
    }

    public static int zzb(long l2) {
        return zzjn.zze(l2);
    }

    public static int zzb(zzlm zzlm2) {
        int n3 = zzlm2.zzcf();
        return zzjn.zzg(n3) + n3;
    }

    public static zzjn zzb(byte[] byArray) {
        int n3 = byArray.length;
        zzjn$zzb zzjn$zzb = new zzjn$zzb(byArray, 0, n3);
        return zzjn$zzb;
    }

    public static int zzc(int n3) {
        return zzjn.zze((long)n3);
    }

    public static int zzc(int n3, int n4) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zze((long)n4) + n3;
    }

    public static int zzc(int n3, long l2) {
        return zzjn.zzg(n3 << 3) + 8;
    }

    public static int zzc(long l2) {
        return 8;
    }

    public static /* bridge */ /* synthetic */ boolean zzc() {
        return zzc;
    }

    public static int zzd(int n3) {
        return 4;
    }

    public static int zzd(int n3, int n4) {
        return zzjn.zzg(n3 << 3) + 4;
    }

    public static int zzd(int n3, long l2) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zze(zzjn.zzi(l2)) + n3;
    }

    public static int zzd(long l2) {
        return zzjn.zze(zzjn.zzi(l2));
    }

    public static int zze(int n3) {
        return zzjn.zzg(zzjn.zzl(n3));
    }

    public static int zze(int n3, int n4) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zzg(zzjn.zzl(n4)) + n3;
    }

    public static int zze(int n3, long l2) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zze(l2) + n3;
    }

    public static int zze(long l2) {
        int n3 = Long.numberOfLeadingZeros(l2) * 9;
        return 640 - n3 >>> 6;
    }

    public static int zzf(int n3) {
        return zzjn.zzg(n3 << 3);
    }

    public static int zzf(int n3, int n4) {
        n3 = zzjn.zzg(n3 << 3);
        return zzjn.zzg(n4) + n3;
    }

    public static int zzg(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3) * 9;
        return 352 - n3 >>> 6;
    }

    private static long zzi(long l2) {
        long l3 = l2 << 1;
        return l2 >> 63 ^ l3;
    }

    private static int zzl(int n3) {
        int n4 = n3 << 1;
        return n3 >> 31 ^ n4;
    }

    public abstract int zza();

    public abstract void zza(byte var1);

    public final void zza(String object, zznd object2) {
        int n3;
        Logger logger = zzb;
        Level level = Level.WARNING;
        String string2 = "inefficientWriteStringNoTag";
        String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
        String string4 = "com.google.protobuf.CodedOutputStream";
        logger.logp(level, string4, string2, string3, (Throwable)object2);
        object2 = zzkj.zza;
        object = ((String)object).getBytes((Charset)object2);
        try {
            n3 = ((Object)object).length;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object2 = new zzjn$zza(indexOutOfBoundsException);
            throw object2;
        }
        this.zzk(n3);
        n3 = ((Object)object).length;
        logger = null;
        this.zza((byte[])object, 0, n3);
    }

    public final void zzb() {
        int n3 = this.zza();
        if (n3 == 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Did not write as much data as expected.");
        throw illegalStateException;
    }

    public final void zzb(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzf(l2);
    }

    public final void zzb(float f5) {
        int n3 = Float.floatToRawIntBits(f5);
        this.zzh(n3);
    }

    public final void zzb(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzf(n3, l2);
    }

    public final void zzb(int n3, float f5) {
        int n4 = Float.floatToRawIntBits(f5);
        this.zzg(n3, n4);
    }

    public abstract void zzb(int var1, zzlm var2);

    public abstract void zzb(int var1, String var2);

    public abstract void zzb(int var1, boolean var2);

    public abstract void zzb(zziy var1);

    public abstract void zzb(String var1);

    public final void zzb(boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.zza(by2);
    }

    public abstract void zzb(byte[] var1, int var2, int var3);

    public abstract void zzc(int var1, zziy var2);

    public abstract void zzc(int var1, zzlm var2, zzme var3);

    public abstract void zzc(zzlm var1);

    public abstract void zzd(int var1, zziy var2);

    public abstract void zzf(int var1, long var2);

    public abstract void zzf(long var1);

    public abstract void zzg(int var1, int var2);

    public final void zzg(int n3, long l2) {
        l2 = zzjn.zzi(l2);
        this.zzh(n3, l2);
    }

    public final void zzg(long l2) {
        l2 = zzjn.zzi(l2);
        this.zzh(l2);
    }

    public abstract void zzh(int var1);

    public abstract void zzh(int var1, int var2);

    public abstract void zzh(int var1, long var2);

    public abstract void zzh(long var1);

    public abstract void zzi(int var1);

    public final void zzi(int n3, int n4) {
        n4 = zzjn.zzl(n4);
        this.zzk(n3, n4);
    }

    public final void zzj(int n3) {
        n3 = zzjn.zzl(n3);
        this.zzk(n3);
    }

    public abstract void zzj(int var1, int var2);

    public abstract void zzk(int var1);

    public abstract void zzk(int var1, int var2);
}

