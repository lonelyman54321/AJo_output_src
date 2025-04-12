/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzgzq;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhap;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhau;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhfa;
import com.google.android.gms.internal.ads.zzhfe;
import com.google.android.gms.internal.ads.zzhff;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzhat
extends zzgzq {
    private static final Logger zza = Logger.getLogger(zzhat.class.getName());
    private static final boolean zzb = zzhfa.zzA();
    public static final /* synthetic */ int zzf;
    zzhau zze;

    private zzhat() {
        throw null;
    }

    public /* synthetic */ zzhat(zzhas zzhas2) {
    }

    public static int zzA(zzhde zzhde2, zzhdz zzhdz2) {
        int n3 = ((zzgzi)zzhde2).zzaM(zzhdz2);
        return zzhat.zzD(n3) + n3;
    }

    public static int zzB(int n3) {
        int n4 = 4096;
        if (n3 > n4) {
            return n4;
        }
        return n3;
    }

    public static int zzC(String object) {
        int n3;
        try {
            n3 = zzhff.zze((String)object);
        }
        catch (zzhfe zzhfe2) {
            Charset charset = zzhcb.zzb;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzhat.zzD(n3) + n3;
    }

    public static int zzD(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3) * 9;
        return 352 - n3 >>> 6;
    }

    public static int zzE(long l2) {
        int n3 = Long.numberOfLeadingZeros(l2) * 9;
        return 640 - n3 >>> 6;
    }

    public static zzhat zzF(byte[] byArray, int n3, int n4) {
        zzhap zzhap2 = new zzhap(byArray, 0, n4);
        return zzhap2;
    }

    public static /* bridge */ /* synthetic */ boolean zzI() {
        return zzb;
    }

    public static int zzy(int n3, zzhde zzhde2, zzhdz zzhdz2) {
        n3 = zzhat.zzD(n3 << 3);
        n3 += n3;
        return ((zzgzi)zzhde2).zzaM(zzhdz2) + n3;
    }

    public static int zzz(zzhde zzhde2) {
        int n3 = zzhde2.zzaY();
        return zzhat.zzD(n3) + n3;
    }

    public final void zzG() {
        int n3 = this.zzb();
        if (n3 == 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Did not write as much data as expected.");
        throw illegalStateException;
    }

    public final void zzH(String object, zzhfe object2) {
        int n3;
        Logger logger = zza;
        Level level = Level.WARNING;
        String string2 = "inefficientWriteStringNoTag";
        String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
        String string4 = "com.google.protobuf.CodedOutputStream";
        logger.logp(level, string4, string2, string3, (Throwable)object2);
        object2 = zzhcb.zzb;
        object = ((String)object).getBytes((Charset)object2);
        try {
            n3 = ((Object)object).length;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object2 = new zzhaq(indexOutOfBoundsException);
            throw object2;
        }
        this.zzu(n3);
        logger = null;
        this.zza((byte[])object, 0, n3);
    }

    public abstract void zzL();

    public abstract void zzM(byte var1);

    public abstract void zzN(int var1, boolean var2);

    public abstract void zzO(int var1, zzhac var2);

    public abstract void zza(byte[] var1, int var2, int var3);

    public abstract int zzb();

    public abstract void zzh(int var1, int var2);

    public abstract void zzi(int var1);

    public abstract void zzj(int var1, long var2);

    public abstract void zzk(long var1);

    public abstract void zzl(int var1, int var2);

    public abstract void zzm(int var1);

    public abstract void zzn(int var1, zzhde var2, zzhdz var3);

    public abstract void zzo(int var1, zzhde var2);

    public abstract void zzp(int var1, zzhac var2);

    public abstract void zzq(int var1, String var2);

    public abstract void zzs(int var1, int var2);

    public abstract void zzt(int var1, int var2);

    public abstract void zzu(int var1);

    public abstract void zzv(int var1, long var2);

    public abstract void zzw(long var1);
}

