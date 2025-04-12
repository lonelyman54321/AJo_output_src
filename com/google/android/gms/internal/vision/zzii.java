/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzhq;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii$zza;
import com.google.android.gms.internal.vision.zzii$zzb;
import com.google.android.gms.internal.vision.zzik;
import com.google.android.gms.internal.vision.zzil;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzmd;
import com.google.android.gms.internal.vision.zzmg;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzii
extends zzhq {
    private static final Logger zzb = Logger.getLogger(zzii.class.getName());
    private static final boolean zzc = zzma.zza();
    zzil zza;

    private zzii() {
    }

    public /* synthetic */ zzii(zzik zzik2) {
        this();
    }

    public static int zza(int n3, zzjt zzjt2) {
        n3 = zzii.zzg(n3 << 3);
        int n4 = zzjt2.zzb();
        return zzii.zzg(n4) + n4 + n3;
    }

    public static int zza(zzjt zzjt2) {
        int n3 = zzjt2.zzb();
        return zzii.zzg(n3) + n3;
    }

    public static int zza(zzkk zzkk2, zzlc zzlc2) {
        int n3;
        int n4 = ((zzhf)(zzkk2 = (zzhf)zzkk2)).zzi();
        if (n4 == (n3 = -1)) {
            n4 = zzlc2.zzb(zzkk2);
            ((zzhf)zzkk2).zzb(n4);
        }
        return zzii.zzg(n4) + n4;
    }

    public static zzii zza(byte[] byArray) {
        int n3 = byArray.length;
        zzii$zza zzii$zza = new zzii$zza(byArray, 0, n3);
        return zzii$zza;
    }

    public static int zzb(double d2) {
        return 8;
    }

    public static int zzb(float f5) {
        return 4;
    }

    public static int zzb(int n3, double d2) {
        return zzii.zzg(n3 << 3) + 8;
    }

    public static int zzb(int n3, float f5) {
        return zzii.zzg(n3 << 3) + 4;
    }

    public static int zzb(int n3, zzjt zzjt2) {
        int n4 = zzii.zzg(8) << 1;
        n3 = zzii.zzg(2, n3) + n4;
        return zzii.zza(3, zzjt2) + n3;
    }

    public static int zzb(int n3, zzkk zzkk2) {
        int n4 = zzii.zzg(8) << 1;
        n3 = zzii.zzg(2, n3) + n4;
        n4 = zzii.zzg(24);
        return zzii.zzb(zzkk2) + n4 + n3;
    }

    public static int zzb(int n3, zzkk zzkk2, zzlc zzlc2) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zza(zzkk2, zzlc2) + n3;
    }

    public static int zzb(int n3, String string2) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zzb(string2) + n3;
    }

    public static int zzb(int n3, boolean bl2) {
        return zzii.zzg(n3 << 3) + 1;
    }

    public static int zzb(zzht zzht2) {
        int n3 = zzht2.zza();
        return zzii.zzg(n3) + n3;
    }

    public static int zzb(zzkk zzkk2) {
        int n3 = zzkk2.zzm();
        return zzii.zzg(n3) + n3;
    }

    public static int zzb(String object) {
        int n3;
        try {
            n3 = zzmd.zza((CharSequence)object);
        }
        catch (zzmg zzmg2) {
            Charset charset = zzjf.zza;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzii.zzg(n3) + n3;
    }

    public static int zzb(boolean bl2) {
        return 1;
    }

    public static int zzb(byte[] byArray) {
        int n3 = byArray.length;
        return zzii.zzg(n3) + n3;
    }

    public static int zzc(int n3, zzht zzht2) {
        n3 = zzii.zzg(n3 << 3);
        int n4 = zzht2.zza();
        return zzii.zzg(n4) + n4 + n3;
    }

    public static int zzc(int n3, zzkk zzkk2, zzlc zzlc2) {
        int n4;
        n3 = zzii.zzg(n3 << 3) << 1;
        int n7 = ((zzhf)(zzkk2 = (zzhf)zzkk2)).zzi();
        if (n7 == (n4 = -1)) {
            n7 = zzlc2.zzb(zzkk2);
            ((zzhf)zzkk2).zzb(n7);
        }
        return n3 + n7;
    }

    public static int zzc(zzkk zzkk2) {
        return zzkk2.zzm();
    }

    public static /* synthetic */ boolean zzc() {
        return zzc;
    }

    public static int zzd(int n3, long l2) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zze(l2) + n3;
    }

    public static int zzd(int n3, zzht zzht2) {
        int n4 = zzii.zzg(8) << 1;
        n3 = zzii.zzg(2, n3) + n4;
        return zzii.zzc(3, zzht2) + n3;
    }

    public static int zzd(long l2) {
        return zzii.zze(l2);
    }

    public static int zze(int n3) {
        return zzii.zzg(n3 << 3);
    }

    public static int zze(int n3, long l2) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zze(l2) + n3;
    }

    public static int zze(long l2) {
        long l3;
        long l4 = (long)-128 & l2;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 1;
        }
        Object object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object2 < 0) {
            return 10;
        }
        l4 = 0xFFFFFFF800000000L & l2;
        long l12 = l4 - l7;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false) {
            l2 >>>= 28;
            object2 = 6;
        } else {
            object2 = 2;
        }
        long l14 = 0xFFE00000L & l2;
        long l15 = l14 == l7 ? 0 : (l14 < l7 ? -1 : 1);
        if (l15 != false) {
            object2 += 2;
            l15 = 14;
            l2 >>>= l15;
        }
        if ((l15 = (l3 = (l2 &= (l14 = -16384L)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            ++object2;
        }
        return (int)object2;
    }

    public static int zzf(int n3) {
        if (n3 >= 0) {
            return zzii.zzg(n3);
        }
        return 10;
    }

    public static int zzf(int n3, int n4) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zzf(n4) + n3;
    }

    public static int zzf(int n3, long l2) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zze(zzii.zzi(l2)) + n3;
    }

    public static int zzf(long l2) {
        return zzii.zze(zzii.zzi(l2));
    }

    public static int zzg(int n3) {
        int n4 = n3 & 0xFFFFFF80;
        if (n4 == 0) {
            return 1;
        }
        n4 = n3 & 0xFFFFC000;
        if (n4 == 0) {
            return 2;
        }
        n4 = 0xFFE00000 & n3;
        if (n4 == 0) {
            return 3;
        }
        n4 = -268435456;
        if ((n3 &= n4) == 0) {
            return 4;
        }
        return 5;
    }

    public static int zzg(int n3, int n4) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zzg(n4) + n3;
    }

    public static int zzg(int n3, long l2) {
        return zzii.zzg(n3 << 3) + 8;
    }

    public static int zzg(long l2) {
        return 8;
    }

    public static int zzh(int n3) {
        return zzii.zzg(zzii.zzm(n3));
    }

    public static int zzh(int n3, int n4) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zzg(zzii.zzm(n4)) + n3;
    }

    public static int zzh(int n3, long l2) {
        return zzii.zzg(n3 << 3) + 8;
    }

    public static int zzh(long l2) {
        return 8;
    }

    public static int zzi(int n3) {
        return 4;
    }

    public static int zzi(int n3, int n4) {
        return zzii.zzg(n3 << 3) + 4;
    }

    private static long zzi(long l2) {
        long l3 = l2 << 1;
        return l2 >> 63 ^ l3;
    }

    public static int zzj(int n3) {
        return 4;
    }

    public static int zzj(int n3, int n4) {
        return zzii.zzg(n3 << 3) + 4;
    }

    public static int zzk(int n3) {
        return zzii.zzf(n3);
    }

    public static int zzk(int n3, int n4) {
        n3 = zzii.zzg(n3 << 3);
        return zzii.zzf(n4) + n3;
    }

    public static int zzl(int n3) {
        return zzii.zzg(n3);
    }

    private static int zzm(int n3) {
        int n4 = n3 << 1;
        return n3 >> 31 ^ n4;
    }

    public abstract int zza();

    public abstract void zza(byte var1);

    public final void zza(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzc(l2);
    }

    public final void zza(float f5) {
        int n3 = Float.floatToRawIntBits(f5);
        this.zzd(n3);
    }

    public abstract void zza(int var1);

    public final void zza(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzc(n3, l2);
    }

    public final void zza(int n3, float f5) {
        int n4 = Float.floatToRawIntBits(f5);
        this.zze(n3, n4);
    }

    public abstract void zza(int var1, int var2);

    public abstract void zza(int var1, long var2);

    public abstract void zza(int var1, zzht var2);

    public abstract void zza(int var1, zzkk var2);

    public abstract void zza(int var1, zzkk var2, zzlc var3);

    public abstract void zza(int var1, String var2);

    public abstract void zza(int var1, boolean var2);

    public abstract void zza(long var1);

    public abstract void zza(zzht var1);

    public abstract void zza(zzkk var1);

    public abstract void zza(String var1);

    public final void zza(String object, zzmg object2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block6: {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String string2 = "inefficientWriteStringNoTag";
            String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
            String string4 = "com.google.protobuf.CodedOutputStream";
            logger.logp(level, string4, string2, string3, (Throwable)object2);
            object2 = zzjf.zza;
            object = ((String)object).getBytes((Charset)object2);
            int n3 = ((Object)object).length;
            this.zzb(n3);
            n3 = ((Object)object).length;
            logger = null;
            try {
                this.zza((byte[])object, 0, n3);
                return;
            }
            catch (zzii$zzb zzii$zzb) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block6;
            }
            throw zzii$zzb;
        }
        object2 = new zzii$zzb(indexOutOfBoundsException2);
        throw object2;
    }

    public final void zza(boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.zza(by2);
    }

    public final void zzb() {
        int n3 = this.zza();
        if (n3 == 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Did not write as much data as expected.");
        throw illegalStateException;
    }

    public abstract void zzb(int var1);

    public abstract void zzb(int var1, int var2);

    public final void zzb(int n3, long l2) {
        l2 = zzii.zzi(l2);
        this.zza(n3, l2);
    }

    public abstract void zzb(int var1, zzht var2);

    public final void zzb(long l2) {
        l2 = zzii.zzi(l2);
        this.zza(l2);
    }

    public abstract void zzb(byte[] var1, int var2, int var3);

    public final void zzc(int n3) {
        n3 = zzii.zzm(n3);
        this.zzb(n3);
    }

    public abstract void zzc(int var1, int var2);

    public abstract void zzc(int var1, long var2);

    public abstract void zzc(long var1);

    public abstract void zzd(int var1);

    public final void zzd(int n3, int n4) {
        n4 = zzii.zzm(n4);
        this.zzc(n3, n4);
    }

    public abstract void zze(int var1, int var2);
}

