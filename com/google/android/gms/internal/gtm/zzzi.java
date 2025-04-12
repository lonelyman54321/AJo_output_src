/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaet;
import com.google.android.gms.internal.gtm.zzaev;
import com.google.android.gms.internal.gtm.zzaew;
import com.google.android.gms.internal.gtm.zzyh;
import com.google.android.gms.internal.gtm.zzyp;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzf;
import com.google.android.gms.internal.gtm.zzzh;
import com.google.android.gms.internal.gtm.zzzj;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzzi
extends zzyp {
    private static final Logger zza = Logger.getLogger(zzzi.class.getName());
    private static final boolean zzb = zzaet.zzx();
    public static final /* synthetic */ int zzf;
    zzzj zze;

    private zzzi() {
        throw null;
    }

    public /* synthetic */ zzzi(zzzh zzzh2) {
    }

    public static int zzA(zzadl zzadl2, zzadx zzadx2) {
        int n3 = ((zzyh)zzadl2).zzQ(zzadx2);
        return zzzi.zzC(n3) + n3;
    }

    public static int zzB(String object) {
        int n3;
        try {
            n3 = zzaew.zzc((String)object);
        }
        catch (zzaev zzaev2) {
            Charset charset = zzaco.zza;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzzi.zzC(n3) + n3;
    }

    public static int zzC(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3) * 9;
        return 352 - n3 >>> 6;
    }

    public static int zzD(long l2) {
        int n3 = Long.numberOfLeadingZeros(l2) * 9;
        return 640 - n3 >>> 6;
    }

    public static /* bridge */ /* synthetic */ boolean zzF() {
        return zzb;
    }

    public static int zzy(int n3, zzadl zzadl2, zzadx zzadx2) {
        n3 = zzzi.zzC(n3 << 3);
        n3 += n3;
        return ((zzyh)zzadl2).zzQ(zzadx2) + n3;
    }

    public static int zzz(zzadl zzadl2) {
        int n3 = zzadl2.zzY();
        return zzzi.zzC(n3) + n3;
    }

    public final void zzE(String object, zzaev object2) {
        int n3;
        Logger logger = zza;
        Level level = Level.WARNING;
        String string2 = "inefficientWriteStringNoTag";
        String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
        String string4 = "com.google.protobuf.CodedOutputStream";
        logger.logp(level, string4, string2, string3, (Throwable)object2);
        object2 = zzaco.zza;
        object = ((String)object).getBytes((Charset)object2);
        try {
            n3 = ((Object)object).length;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object2 = new zzzf(indexOutOfBoundsException);
            throw object2;
        }
        this.zzu(n3);
        logger = null;
        this.zza((byte[])object, 0, n3);
    }

    public abstract void zzI();

    public abstract void zzJ(byte var1);

    public abstract void zzK(int var1, boolean var2);

    public abstract void zzL(int var1, zzyx var2);

    public abstract void zza(byte[] var1, int var2, int var3);

    public abstract int zzb();

    public abstract void zzh(int var1, int var2);

    public abstract void zzi(int var1);

    public abstract void zzj(int var1, long var2);

    public abstract void zzk(long var1);

    public abstract void zzl(int var1, int var2);

    public abstract void zzm(int var1);

    public abstract void zzn(int var1, zzadl var2, zzadx var3);

    public abstract void zzo(int var1, zzadl var2);

    public abstract void zzp(int var1, zzyx var2);

    public abstract void zzq(int var1, String var2);

    public abstract void zzs(int var1, int var2);

    public abstract void zzt(int var1, int var2);

    public abstract void zzu(int var1);

    public abstract void zzv(int var1, long var2);

    public abstract void zzw(long var1);
}

