/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjn$zza;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zznl;

final class zzjn$zzb
extends zzjn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjn$zzb(byte[] object, int n3, int n4) {
        n3 = 0;
        IllegalArgumentException illegalArgumentException = null;
        super(null);
        if (object != null) {
            n3 = ((byte[])object).length - n4 | n4;
            if (n3 >= 0) {
                this.zzb = object;
                this.zzd = 0;
                this.zzc = n4;
                return;
            }
            object = D70.b(((byte[])object).length, n4, "Array range is invalid. Buffer.length=", ", offset=0, length=");
            illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = new NullPointerException;
        super("buffer");
        throw object;
    }

    private final void zzc(byte[] byArray, int n3, int n4) {
        int n7;
        int n8;
        byte[] byArray2;
        try {
            byArray2 = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            int n10 = this.zzd;
            n8 = this.zzc;
            zzjn$zza zzjn$zza = new zzjn$zza(n10, n8, n4, (Throwable)indexOutOfBoundsException);
            throw zzjn$zza;
        }
        n8 = this.zzd;
        System.arraycopy(byArray, n3, byArray2, n8, n4);
        this.zzd = n7 = this.zzd + n4;
    }

    public final int zza() {
        int n3 = this.zzc;
        int n4 = this.zzd;
        return n3 - n4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(byte by2) {
        void var5_7;
        int n3;
        Object object;
        int n4;
        block4: {
            n4 = this.zzd;
            try {
                object = this.zzb;
                n3 = n4 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                // empty catch block
                break block4;
            }
            try {
                object[n4] = by2;
                this.zzd = n3;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                n4 = n3;
            }
        }
        object = new zzjn$zza;
        n3 = this.zzc;
        object(n4, n3, 1, (Throwable)var5_7);
        throw object;
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zzc(byArray, n3, n4);
    }

    public final void zzb(int n3, zzlm zzlm2) {
        int n4 = 1;
        int n7 = 3;
        this.zzj(n4, n7);
        int n8 = 2;
        this.zzk(n8, n3);
        this.zzj(n7, n8);
        this.zzc(zzlm2);
        this.zzj(n4, 4);
    }

    public final void zzb(int n3, String string2) {
        this.zzj(n3, 2);
        this.zzb(string2);
    }

    public final void zzb(int n3, boolean bl2) {
        this.zzj(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.zza((byte)n3);
    }

    public final void zzb(zziy zziy2) {
        int n3 = zziy2.zzb();
        this.zzk(n3);
        zziy2.zza(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String string2) {
        zznd zznd22;
        int n3;
        block6: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block5: {
                int n4;
                int n7;
                block7: {
                    int n8;
                    n3 = this.zzd;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block5;
                    }
                    catch (zznd zznd22) {
                        break block6;
                    }
                    {
                        n7 = zzjn.zzg(n7);
                        n4 = string2.length();
                        n4 = zzjn.zzg(n4);
                        if (n4 != n7) break block7;
                        this.zzd = n7 = n3 + n4;
                        byte[] byArray = this.zzb;
                        int n10 = this.zza();
                        n7 = zzna.zza(string2, byArray, n7, n10);
                        this.zzd = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzk(n8);
                    this.zzd = n7;
                    return;
                }
                n7 = zzna.zza(string2);
                this.zzk(n7);
                byte[] byArray = this.zzb;
                n4 = this.zzd;
                int n14 = this.zza();
                this.zzd = n7 = zzna.zza(string2, byArray, n4, n14);
                return;
            }
            zzjn$zza zzjn$zza = new zzjn$zza(indexOutOfBoundsException2);
            throw zzjn$zza;
        }
        this.zzd = n3;
        this.zza(string2, zznd22);
    }

    public final void zzb(byte[] byArray, int n3, int n4) {
        this.zzk(n4);
        this.zzc(byArray, 0, n4);
    }

    public final void zzc(int n3, zziy zziy2) {
        this.zzj(n3, 2);
        this.zzb(zziy2);
    }

    public final void zzc(int n3, zzlm zzlm2, zzme zzme2) {
        this.zzj(n3, 2);
        Object object = zzlm2;
        n3 = ((zzio)zzlm2).zza(zzme2);
        this.zzk(n3);
        object = this.zza;
        zzme2.zza((Object)zzlm2, (zznl)object);
    }

    public final void zzc(zzlm zzlm2) {
        int n3 = zzlm2.zzcf();
        this.zzk(n3);
        zzlm2.zza(this);
    }

    public final void zzd(int n3, zziy zziy2) {
        int n4 = 1;
        int n7 = 3;
        this.zzj(n4, n7);
        this.zzk(2, n3);
        this.zzc(n7, zziy2);
        this.zzj(n4, 4);
    }

    public final void zzf(int n3, long l2) {
        this.zzj(n3, 1);
        this.zzf(l2);
    }

    public final void zzf(long l2) {
        int n3 = this.zzd;
        int n4 = 8;
        try {
            byte[] byArray = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            int n7 = this.zzc;
            zzjn$zza zzjn$zza = new zzjn$zza(n3, n7, n4, (Throwable)indexOutOfBoundsException);
            throw zzjn$zza;
        }
        int n8 = (int)l2;
        byArray[n3] = n8;
        n8 = n3 + 1;
        long l3 = l2 >> n4;
        int n10 = (int)l3;
        int n14 = n10;
        byArray[n8] = n14;
        n8 = n3 + 2;
        l3 = l2 >> 16;
        n10 = (int)l3;
        n14 = (byte)n10;
        byArray[n8] = n14;
        n8 = n3 + 3;
        l3 = l2 >> 24;
        n10 = (int)l3;
        n14 = (byte)n10;
        byArray[n8] = n14;
        n8 = n3 + 4;
        l3 = l2 >> 32;
        n10 = (int)l3;
        n14 = (byte)n10;
        byArray[n8] = n14;
        n8 = n3 + 5;
        l3 = l2 >> 40;
        n10 = (int)l3;
        n14 = (byte)n10;
        byArray[n8] = n14;
        n8 = n3 + 6;
        l3 = l2 >> 48;
        n10 = (int)l3;
        n14 = (byte)n10;
        byArray[n8] = n14;
        n8 = n3 + 7;
        n14 = 56;
        int n15 = (int)(l2 >>= n14);
        byte by2 = (byte)n15;
        byArray[n8] = by2;
        this.zzd = n3 += n4;
    }

    public final void zzg(int n3, int n4) {
        this.zzj(n3, 5);
        this.zzh(n4);
    }

    public final void zzh(int n3) {
        int n4;
        Object object;
        int n7 = this.zzd;
        int n8 = 4;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzjn$zza;
            n4 = this.zzc;
            object(n7, n4, n8, (Throwable)indexOutOfBoundsException);
            throw object;
        }
        n4 = n3;
        object[n7] = n4;
        n4 = n7 + 1;
        byte by2 = (byte)(n3 >> 8);
        object[n4] = by2;
        n4 = n7 + 2;
        by2 = (byte)(n3 >> 16);
        object[n4] = by2;
        n4 = n7 + 3;
        n3 >>= 24;
        object[n4] = n3;
        this.zzd = n7 += n8;
    }

    public final void zzh(int n3, int n4) {
        this.zzj(n3, 0);
        this.zzi(n4);
    }

    public final void zzh(int n3, long l2) {
        this.zzj(n3, 0);
        this.zzh(l2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(long l2) {
        byte by2;
        block12: {
            void var18_21;
            byte by4;
            byte by5 = this.zzd;
            byte by6 = zzjn.zzc();
            by2 = 7;
            long l3 = 0L;
            long l4 = -128;
            if (by6 != 0 && (by6 = this.zza()) >= (by4 = 10)) {
                while (true) {
                    byte[] byArray;
                    long l7;
                    long l8;
                    if ((by6 = (byte)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                        byArray = this.zzb;
                        by2 = by5 + 1;
                        l3 = by5;
                        int n3 = (int)l2;
                        byte by7 = (byte)n3;
                        zzmz.zza(byArray, l3, by7);
                        break block12;
                    }
                    byArray = this.zzb;
                    by4 = by5 + 1;
                    long l12 = by5;
                    by5 = (byte)((int)l2 | 0x80);
                    zzmz.zza(byArray, l12, by5);
                    l2 >>>= by2;
                    by5 = by4;
                }
            }
            while (true) {
                byte[] byArray;
                long l14;
                long l15;
                if ((by6 = (byte)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                    byArray = this.zzb;
                    by2 = by5 + 1;
                    int n4 = (int)l2;
                    byte by8 = (byte)n4;
                    try {
                        byArray[by5] = by8;
                        break block12;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        by5 = by2;
                        break;
                    }
                }
                try {
                    byArray = this.zzb;
                    by4 = by5 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    break;
                }
                byte by9 = (byte)((int)l2 | 0x80);
                try {
                    byArray[by5] = by9;
                    l2 >>>= by2;
                    by5 = by4;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    by5 = by4;
                    break;
                }
            }
            by6 = this.zzc;
            zzjn$zza zzjn$zza = new zzjn$zza(by5, by6, 1, (Throwable)var18_21);
            throw zzjn$zza;
        }
        this.zzd = by2;
    }

    public final void zzi(int n3) {
        if (n3 >= 0) {
            this.zzk(n3);
            return;
        }
        long l2 = n3;
        this.zzh(l2);
    }

    public final void zzj(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzk(n3);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(int n3) {
        void var6_9;
        int n4;
        Object object;
        int n7;
        block8: {
            n7 = this.zzd;
            while (true) {
                int n8;
                if ((n8 = n3 & 0xFFFFFF80) == 0) {
                    object = this.zzb;
                    n4 = n7 + 1;
                    n3 = (byte)n3;
                    object[n7] = n3;
                    this.zzd = n4;
                    return;
                }
                try {
                    object = this.zzb;
                    n4 = n7 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    break block8;
                }
                byte by2 = (byte)(n3 | 0x80);
                object[n7] = by2;
                n3 >>>= 7;
                n7 = n4;
                continue;
                break;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                n7 = n4;
            }
        }
        object = new zzjn$zza;
        n4 = this.zzc;
        object(n7, n4, 1, (Throwable)var6_9);
        throw object;
    }

    public final void zzk(int n3, int n4) {
        this.zzj(n3, 0);
        this.zzk(n4);
    }
}

