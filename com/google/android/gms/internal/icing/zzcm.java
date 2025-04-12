/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbs;
import com.google.android.gms.internal.icing.zzbw;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcj;
import com.google.android.gms.internal.icing.zzck;
import com.google.android.gms.internal.icing.zzcl;
import com.google.android.gms.internal.icing.zzcn;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdm;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzep;
import com.google.android.gms.internal.icing.zzfn;
import com.google.android.gms.internal.icing.zzfq;
import com.google.android.gms.internal.icing.zzfr;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzcm
extends zzbw {
    private static final Logger zzb = Logger.getLogger(zzcm.class.getName());
    private static final boolean zzc = zzfn.zza();
    zzcn zza;

    private zzcm() {
    }

    public /* synthetic */ zzcm(zzcj zzcj2) {
    }

    public static int zzA(zzcf zzcf2) {
        int n3 = zzcf2.zzc();
        return zzcm.zzw(n3) + n3;
    }

    public static int zzB(zzee zzee2, zzep zzep2) {
        int n3;
        int n4 = ((zzbs)(zzee2 = (zzbs)zzee2)).zzi();
        if (n4 == (n3 = -1)) {
            n4 = zzep2.zzd(zzee2);
            ((zzbs)zzee2).zzj(n4);
        }
        return zzcm.zzw(n4) + n4;
    }

    public static int zzE(int n3, zzee zzee2, zzep zzep2) {
        int n4;
        n3 = zzcm.zzw(n3 << 3);
        n3 += n3;
        int n7 = ((zzbs)(zzee2 = (zzbs)zzee2)).zzi();
        if (n7 == (n4 = -1)) {
            n7 = zzep2.zzd(zzee2);
            ((zzbs)zzee2).zzj(n7);
        }
        return n3 + n7;
    }

    public static /* synthetic */ boolean zzF() {
        return zzc;
    }

    public static zzcm zzt(byte[] byArray) {
        int n3 = byArray.length;
        zzck zzck2 = new zzck(byArray, 0, n3);
        return zzck2;
    }

    public static int zzu(int n3) {
        return zzcm.zzw(n3 << 3);
    }

    public static int zzv(int n3) {
        if (n3 >= 0) {
            return zzcm.zzw(n3);
        }
        return 10;
    }

    public static int zzw(int n3) {
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

    public static int zzx(long l2) {
        long l3;
        long l4 = (long)-128 & l2;
        int n3 = 1;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return n3;
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
            object2 += n3;
        }
        return (int)object2;
    }

    public static int zzy(String object) {
        int n3;
        try {
            n3 = zzfr.zzc((CharSequence)object);
        }
        catch (zzfq zzfq2) {
            Charset charset = zzdh.zza;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return zzcm.zzw(n3) + n3;
    }

    public static int zzz(zzdm zzdm2) {
        int n3 = zzdm2.zza();
        return zzcm.zzw(n3) + n3;
    }

    public final void zzC() {
        int n3 = this.zzs();
        if (n3 == 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Did not write as much data as expected.");
        throw illegalStateException;
    }

    public final void zzD(String object, zzfq object2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block6: {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String string2 = "inefficientWriteStringNoTag";
            String string3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
            String string4 = "com.google.protobuf.CodedOutputStream";
            logger.logp(level, string4, string2, string3, (Throwable)object2);
            object2 = zzdh.zza;
            object = ((String)object).getBytes((Charset)object2);
            int n3 = ((Object)object).length;
            this.zzl(n3);
            logger = null;
            try {
                this.zzq((byte[])object, 0, n3);
                return;
            }
            catch (zzcl zzcl2) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block6;
            }
            throw zzcl2;
        }
        object2 = new zzcl(indexOutOfBoundsException2);
        throw object2;
    }

    public abstract void zza(int var1, int var2);

    public abstract void zzb(int var1, int var2);

    public abstract void zzc(int var1, int var2);

    public abstract void zzd(int var1, int var2);

    public abstract void zze(int var1, long var2);

    public abstract void zzf(int var1, long var2);

    public abstract void zzg(int var1, boolean var2);

    public abstract void zzh(int var1, String var2);

    public abstract void zzi(int var1, zzcf var2);

    public abstract void zzj(byte var1);

    public abstract void zzk(int var1);

    public abstract void zzl(int var1);

    public abstract void zzm(int var1);

    public abstract void zzn(long var1);

    public abstract void zzo(long var1);

    public abstract void zzq(byte[] var1, int var2, int var3);

    public abstract int zzs();
}

