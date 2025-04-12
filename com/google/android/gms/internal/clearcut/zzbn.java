/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzas;
import com.google.android.gms.internal.clearcut.zzba;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn$zza;
import com.google.android.gms.internal.clearcut.zzbn$zzb;
import com.google.android.gms.internal.clearcut.zzbn$zzc;
import com.google.android.gms.internal.clearcut.zzbn$zzd;
import com.google.android.gms.internal.clearcut.zzbn$zze;
import com.google.android.gms.internal.clearcut.zzbo;
import com.google.android.gms.internal.clearcut.zzbp;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcv;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzff;
import com.google.android.gms.internal.clearcut.zzfi;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbn
extends zzba {
    private static final Logger logger = Logger.getLogger(zzbn.class.getName());
    private static final boolean zzfy = zzfd.zzed();
    zzbp zzfz;

    private zzbn() {
    }

    public /* synthetic */ zzbn(zzbo zzbo2) {
        this();
    }

    public static int zza(int n3, zzcv zzcv2) {
        n3 = zzbn.zzr(n3);
        int n4 = zzcv2.zzas();
        return zzbn.zzt(n4) + n4 + n3;
    }

    public static int zza(zzcv zzcv2) {
        int n3 = zzcv2.zzas();
        return zzbn.zzt(n3) + n3;
    }

    public static zzbn zza(ByteBuffer object) {
        boolean bl2 = ((ByteBuffer)object).hasArray();
        if (bl2) {
            zzbn$zzb zzbn$zzb = new zzbn$zzb((ByteBuffer)object);
            return zzbn$zzb;
        }
        bl2 = ((ByteBuffer)object).isDirect();
        if (bl2 && !(bl2 = ((Buffer)object).isReadOnly())) {
            bl2 = zzfd.zzee();
            if (bl2) {
                zzbn$zze zzbn$zze = new zzbn$zze((ByteBuffer)object);
                return zzbn$zze;
            }
            zzbn$zzd zzbn$zzd = new zzbn$zzd((ByteBuffer)object);
            return zzbn$zzd;
        }
        object = new IllegalArgumentException("ByteBuffer is read-only");
        throw object;
    }

    public static /* synthetic */ boolean zzah() {
        return zzfy;
    }

    public static int zzb(double d2) {
        return 8;
    }

    public static int zzb(float f5) {
        return 4;
    }

    public static int zzb(int n3, double d2) {
        return zzbn.zzr(n3) + 8;
    }

    public static int zzb(int n3, float f5) {
        return zzbn.zzr(n3) + 4;
    }

    public static int zzb(int n3, zzcv zzcv2) {
        int n4 = zzbn.zzr(1) << 1;
        n3 = zzbn.zzh(2, n3) + n4;
        return zzbn.zza(3, zzcv2) + n3;
    }

    public static int zzb(int n3, zzdo zzdo2, zzef zzef2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzb(zzdo2, zzef2) + n3;
    }

    public static int zzb(int n3, String string2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzh(string2) + n3;
    }

    public static int zzb(zzbb zzbb2) {
        int n3 = zzbb2.size();
        return zzbn.zzt(n3) + n3;
    }

    public static int zzb(zzdo zzdo2, zzef zzef2) {
        int n3;
        int n4 = ((zzas)(zzdo2 = (zzas)zzdo2)).zzs();
        if (n4 == (n3 = -1)) {
            n4 = zzef2.zzm(zzdo2);
            ((zzas)zzdo2).zzf(n4);
        }
        return zzbn.zzt(n4) + n4;
    }

    public static int zzb(boolean bl2) {
        return 1;
    }

    public static int zzc(int n3, zzbb zzbb2) {
        n3 = zzbn.zzr(n3);
        int n4 = zzbb2.size();
        return zzbn.zzt(n4) + n4 + n3;
    }

    public static int zzc(int n3, zzdo zzdo2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzc(zzdo2) + n3;
    }

    public static int zzc(int n3, zzdo zzdo2, zzef zzef2) {
        int n4;
        n3 = zzbn.zzr(n3) << 1;
        int n7 = ((zzas)(zzdo2 = (zzas)zzdo2)).zzs();
        if (n7 == (n4 = -1)) {
            n7 = zzef2.zzm(zzdo2);
            ((zzas)zzdo2).zzf(n7);
        }
        return n3 + n7;
    }

    public static int zzc(int n3, boolean bl2) {
        return zzbn.zzr(n3) + 1;
    }

    public static int zzc(zzdo zzdo2) {
        int n3 = zzdo2.zzas();
        return zzbn.zzt(n3) + n3;
    }

    public static zzbn zzc(byte[] byArray) {
        int n3 = byArray.length;
        zzbn$zza zzbn$zza = new zzbn$zza(byArray, 0, n3);
        return zzbn$zza;
    }

    public static int zzd(int n3, long l2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzf(l2) + n3;
    }

    public static int zzd(int n3, zzbb zzbb2) {
        int n4 = zzbn.zzr(1) << 1;
        n3 = zzbn.zzh(2, n3) + n4;
        return zzbn.zzc(3, zzbb2) + n3;
    }

    public static int zzd(int n3, zzdo zzdo2) {
        int n4 = zzbn.zzr(1) << 1;
        n3 = zzbn.zzh(2, n3) + n4;
        return zzbn.zzc(3, zzdo2) + n3;
    }

    public static int zzd(zzdo zzdo2) {
        return zzdo2.zzas();
    }

    public static int zzd(byte[] byArray) {
        int n3 = byArray.length;
        return zzbn.zzt(n3) + n3;
    }

    public static int zze(int n3, long l2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzf(l2) + n3;
    }

    public static int zze(long l2) {
        return zzbn.zzf(l2);
    }

    public static int zzf(int n3, long l2) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzf(zzbn.zzj(l2)) + n3;
    }

    public static int zzf(long l2) {
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

    public static int zzg(int n3, int n4) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzs(n4) + n3;
    }

    public static int zzg(int n3, long l2) {
        return zzbn.zzr(n3) + 8;
    }

    public static int zzg(long l2) {
        return zzbn.zzf(zzbn.zzj(l2));
    }

    public static int zzh(int n3, int n4) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzt(n4) + n3;
    }

    public static int zzh(int n3, long l2) {
        return zzbn.zzr(n3) + 8;
    }

    public static int zzh(long l2) {
        return 8;
    }

    public static int zzh(String object) {
        int n3;
        try {
            n3 = zzff.zza((CharSequence)object);
        }
        catch (zzfi zzfi2) {
            Charset charset = zzci.UTF_8;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzbn.zzt(n3) + n3;
    }

    public static int zzi(int n3, int n4) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzt(zzbn.zzy(n4)) + n3;
    }

    public static int zzi(long l2) {
        return 8;
    }

    public static int zzj(int n3, int n4) {
        return zzbn.zzr(n3) + 4;
    }

    private static long zzj(long l2) {
        long l3 = l2 << 1;
        return l2 >> 63 ^ l3;
    }

    public static int zzk(int n3, int n4) {
        return zzbn.zzr(n3) + 4;
    }

    public static int zzl(int n3, int n4) {
        n3 = zzbn.zzr(n3);
        return zzbn.zzs(n4) + n3;
    }

    public static int zzr(int n3) {
        return zzbn.zzt(n3 << 3);
    }

    public static int zzs(int n3) {
        if (n3 >= 0) {
            return zzbn.zzt(n3);
        }
        return 10;
    }

    public static int zzt(int n3) {
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

    public static int zzu(int n3) {
        return zzbn.zzt(zzbn.zzy(n3));
    }

    public static int zzv(int n3) {
        return 4;
    }

    public static int zzw(int n3) {
        return 4;
    }

    public static int zzx(int n3) {
        return zzbn.zzs(n3);
    }

    private static int zzy(int n3) {
        int n4 = n3 << 1;
        return n3 >> 31 ^ n4;
    }

    public static int zzz(int n3) {
        return zzbn.zzt(n3);
    }

    public abstract void flush();

    public abstract void write(byte[] var1, int var2, int var3);

    public abstract void zza(byte var1);

    public final void zza(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzd(l2);
    }

    public final void zza(float f5) {
        int n3 = Float.floatToRawIntBits(f5);
        this.zzq(n3);
    }

    public final void zza(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.zzc(n3, l2);
    }

    public final void zza(int n3, float f5) {
        int n4 = Float.floatToRawIntBits(f5);
        this.zzf(n3, n4);
    }

    public abstract void zza(int var1, long var2);

    public abstract void zza(int var1, zzbb var2);

    public abstract void zza(int var1, zzdo var2);

    public abstract void zza(int var1, zzdo var2, zzef var3);

    public abstract void zza(int var1, String var2);

    public abstract void zza(zzbb var1);

    public abstract void zza(zzdo var1, zzef var2);

    public final void zza(String object, zzfi object2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block6: {
            Logger logger = zzbn.logger;
            Level level = Level.WARNING;
            String string2 = "inefficientWriteStringNoTag";
            String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
            String string4 = "com.google.protobuf.CodedOutputStream";
            logger.logp(level, string4, string2, string3, (Throwable)object2);
            object2 = zzci.UTF_8;
            object = ((String)object).getBytes((Charset)object2);
            int n3 = ((Object)object).length;
            this.zzo(n3);
            n3 = ((Object)object).length;
            logger = null;
            try {
                this.zza((byte[])object, 0, n3);
                return;
            }
            catch (zzbn$zzc zzbn$zzc) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block6;
            }
            throw zzbn$zzc;
        }
        object2 = new zzbn$zzc(indexOutOfBoundsException2);
        throw object2;
    }

    public final void zza(boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.zza(by2);
    }

    public abstract int zzag();

    public abstract void zzb(int var1, int var2);

    public final void zzb(int n3, long l2) {
        l2 = zzbn.zzj(l2);
        this.zza(n3, l2);
    }

    public abstract void zzb(int var1, zzbb var2);

    public abstract void zzb(int var1, zzdo var2);

    public abstract void zzb(int var1, boolean var2);

    public abstract void zzb(long var1);

    public abstract void zzb(zzdo var1);

    public abstract void zzc(int var1, int var2);

    public abstract void zzc(int var1, long var2);

    public final void zzc(long l2) {
        l2 = zzbn.zzj(l2);
        this.zzb(l2);
    }

    public abstract void zzd(int var1, int var2);

    public abstract void zzd(long var1);

    public abstract void zzd(byte[] var1, int var2, int var3);

    public final void zze(int n3, int n4) {
        n4 = zzbn.zzy(n4);
        this.zzd(n3, n4);
    }

    public abstract void zzf(int var1, int var2);

    public abstract void zzg(String var1);

    public abstract void zzn(int var1);

    public abstract void zzo(int var1);

    public final void zzp(int n3) {
        n3 = zzbn.zzy(n3);
        this.zzo(n3);
    }

    public abstract void zzq(int var1);
}

