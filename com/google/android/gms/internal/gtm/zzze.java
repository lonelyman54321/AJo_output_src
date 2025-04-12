/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaet;
import com.google.android.gms.internal.gtm.zzaev;
import com.google.android.gms.internal.gtm.zzaew;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyh;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzf;
import com.google.android.gms.internal.gtm.zzzi;

final class zzze
extends zzzi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzze(byte[] object, int n3, int n4) {
        String string2 = null;
        super(null);
        n3 = ((byte[])object).length;
        int n7 = n3 - n4 | n4;
        if (n7 >= 0) {
            this.zza = object;
            this.zzc = 0;
            this.zzb = n4;
            return;
        }
        object = new IllegalArgumentException;
        string2 = D70.b(n3, n4, "Array range is invalid. Buffer.length=", ", offset=0, length=");
        super(string2);
        throw object;
    }

    public final void zzI() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzJ(byte by2) {
        zzzf zzzf2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        Object object;
        int n3;
        block4: {
            int n4;
            n3 = this.zzc;
            try {
                object = this.zza;
                n4 = n3 + 1;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException3) {
                indexOutOfBoundsException = indexOutOfBoundsException3;
                break block4;
            }
            try {
                object[n3] = by2;
                this.zzc = n4;
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                indexOutOfBoundsException = indexOutOfBoundsException2;
                n3 = n4;
            }
        }
        by2 = (byte)this.zzb;
        long l2 = n3;
        long l3 = by2;
        object = zzzf2;
        zzzf2 = new zzzf(l2, l3, 1, indexOutOfBoundsException);
        throw zzzf2;
    }

    public final void zzK(int n3, boolean bl2) {
        this.zzu(n3 <<= 3);
        this.zzJ((byte)(bl2 ? 1 : 0));
    }

    public final void zzL(int n3, zzyx zzyx2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        n3 = zzyx2.zzd();
        this.zzu(n3);
        zzyx2.zzg(this);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zze(byArray, 0, n4);
    }

    public final int zzb() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        return n3 - n4;
    }

    public final void zze(byte[] object, int n3, int n4) {
        int n7;
        int n8;
        byte[] byArray;
        try {
            byArray = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzzf;
            n3 = this.zzc;
            n8 = this.zzb;
            long l2 = n3;
            long l3 = n8;
            object(l2, l3, n4, indexOutOfBoundsException);
            throw object;
        }
        n8 = this.zzc;
        System.arraycopy(object, 0, byArray, n8, n4);
        this.zzc = n7 = this.zzc + n4;
    }

    public final void zzh(int n3, int n4) {
        n3 = n3 << 3 | 5;
        this.zzu(n3);
        this.zzi(n4);
    }

    public final void zzi(int n3) {
        Object object;
        int n4 = this.zzc;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            zzzf zzzf2;
            n3 = this.zzb;
            long l2 = n4;
            long l3 = n3;
            object = zzzf2;
            zzzf2 = new zzzf(l2, l3, 4, indexOutOfBoundsException);
            throw zzzf2;
        }
        int n7 = n3;
        object[n4] = n7;
        n7 = n4 + 1;
        byte by2 = (byte)(n3 >> 8);
        object[n7] = by2;
        n7 = n4 + 2;
        by2 = (byte)(n3 >> 16);
        object[n7] = by2;
        n7 = n4 + 3;
        n3 = (byte)(n3 >> 24);
        object[n7] = n3;
        this.zzc = n4 += 4;
    }

    public final void zzj(int n3, long l2) {
        n3 = n3 << 3 | 1;
        this.zzu(n3);
        this.zzk(l2);
    }

    public final void zzk(long l2) {
        long l3;
        int n3;
        Object object;
        int n4 = this.zzc;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            zzzf zzzf2;
            n3 = this.zzb;
            long l4 = n4;
            l3 = n3;
            object = zzzf2;
            zzzf2 = new zzzf(l4, l3, 8, indexOutOfBoundsException);
            throw zzzf2;
        }
        int n7 = (int)l2;
        object[n4] = n7;
        n7 = n4 + 1;
        int n8 = 8;
        l3 = l2 >> n8;
        int n10 = (int)l3;
        int n14 = n10;
        object[n7] = n14;
        n7 = n4 + 2;
        l3 = l2 >> 16;
        n10 = (int)l3;
        n14 = (byte)n10;
        object[n7] = n14;
        n7 = n4 + 3;
        l3 = l2 >> 24;
        n10 = (int)l3;
        n14 = (byte)n10;
        object[n7] = n14;
        n7 = n4 + 4;
        l3 = l2 >> 32;
        n10 = (int)l3;
        n14 = (byte)n10;
        object[n7] = n14;
        n7 = n4 + 5;
        l3 = l2 >> 40;
        n10 = (int)l3;
        n14 = (byte)n10;
        object[n7] = n14;
        n7 = n4 + 6;
        l3 = l2 >> 48;
        n10 = (int)l3;
        n14 = (byte)n10;
        object[n7] = n14;
        n7 = n4 + 7;
        n14 = 56;
        int n15 = (int)(l2 >>= n14);
        n3 = (byte)n15;
        object[n7] = n3;
        this.zzc = n4 += n8;
    }

    public final void zzl(int n3, int n4) {
        this.zzu(n3 <<= 3);
        this.zzm(n4);
    }

    public final void zzm(int n3) {
        if (n3 >= 0) {
            this.zzu(n3);
            return;
        }
        long l2 = n3;
        this.zzw(l2);
    }

    public final void zzn(int n3, zzadl zzadl2, zzadx zzadx2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        Object object = zzadl2;
        n3 = ((zzyh)zzadl2).zzQ(zzadx2);
        this.zzu(n3);
        object = this.zze;
        zzadx2.zzj(zzadl2, (zzaez)object);
    }

    public final void zzo(int n3, zzadl zzadl2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzu(26);
        n3 = zzadl2.zzY();
        this.zzu(n3);
        zzadl2.zzax(this);
        this.zzu(12);
    }

    public final void zzp(int n3, zzyx zzyx2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzL(3, zzyx2);
        this.zzu(12);
    }

    public final void zzq(int n3, String string2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        this.zzr(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr(String string2) {
        zzaev zzaev22;
        int n3;
        block8: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block7: {
                int n4;
                int n7;
                block9: {
                    int n8;
                    int n10;
                    byte[] byArray;
                    n3 = this.zzc;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block7;
                    }
                    catch (zzaev zzaev22) {
                        break block8;
                    }
                    {
                        n7 = zzzi.zzC(n7);
                        n4 = string2.length();
                        n4 = zzzi.zzC(n4);
                        if (n4 != n7) break block9;
                        this.zzc = n7 = n3 + n4;
                        byArray = this.zza;
                        n10 = this.zzb - n7;
                    }
                    {
                        n7 = zzaew.zzb(string2, byArray, n7, n10);
                        this.zzc = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzu(n8);
                    this.zzc = n7;
                    return;
                }
                n7 = zzaew.zzc(string2);
                this.zzu(n7);
                byte[] byArray = this.zza;
                n4 = this.zzc;
                int n14 = this.zzb - n4;
                {
                    this.zzc = n7 = zzaew.zzb(string2, byArray, n4, n14);
                    return;
                }
            }
            zzzf zzzf2 = new zzzf(indexOutOfBoundsException2);
            throw zzzf2;
        }
        this.zzc = n3;
        this.zzE(string2, zzaev22);
    }

    public final void zzs(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzu(n3);
    }

    public final void zzt(int n3, int n4) {
        this.zzu(n3 <<= 3);
        this.zzu(n4);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(int n3) {
        zzzf zzzf2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        Object object;
        int n4;
        block9: {
            IndexOutOfBoundsException indexOutOfBoundsException2222222;
            block8: {
                int n7;
                n4 = this.zzc;
                while (true) {
                    int n8;
                    if ((n8 = n3 & 0xFFFFFF80) == 0) {
                        object = this.zza;
                        n7 = n4 + 1;
                        n3 = (byte)n3;
                        object[n4] = n3;
                        this.zzc = n7;
                        return;
                    }
                    try {
                        object = this.zza;
                        n7 = n4 + 1;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2222222) {
                        break block8;
                    }
                    byte by2 = (byte)(n3 | 0x80);
                    object[n4] = by2;
                    n3 >>>= 7;
                    n4 = n7;
                    continue;
                    break;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException3) {
                    indexOutOfBoundsException = indexOutOfBoundsException3;
                    n4 = n7;
                    break block9;
                }
            }
            indexOutOfBoundsException = indexOutOfBoundsException2222222;
        }
        n3 = this.zzb;
        long l2 = n4;
        long l3 = n3;
        object = zzzf2;
        zzzf2 = new zzzf(l2, l3, 1, indexOutOfBoundsException);
        throw zzzf2;
    }

    public final void zzv(int n3, long l2) {
        this.zzu(n3 <<= 3);
        this.zzw(l2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzw(long l2) {
        byte by2;
        block12: {
            zzzf zzzf2;
            IndexOutOfBoundsException indexOutOfBoundsException;
            int n3;
            Object object;
            byte by4;
            block13: {
                void var18_21;
                byte by5;
                by4 = this.zzc;
                byte by6 = zzzi.zzF();
                by2 = 7;
                long l3 = 0L;
                long l4 = -128;
                if (by6 != 0 && (by6 = this.zzb - by4) >= (by5 = 10)) {
                    while (true) {
                        byte[] byArray;
                        long l7;
                        long l8;
                        if ((by6 = (byte)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                            byArray = this.zza;
                            by2 = by4 + 1;
                            l3 = by4;
                            int n4 = (int)l2;
                            byte by7 = (byte)n4;
                            zzaet.zzn(byArray, l3, by7);
                            break block12;
                        }
                        byArray = this.zza;
                        by5 = by4 + 1;
                        long l12 = by4;
                        by4 = (byte)((int)l2 | 0x80);
                        zzaet.zzn(byArray, l12, by4);
                        l2 >>>= by2;
                        by4 = by5;
                    }
                }
                while (true) {
                    long l14;
                    long l15;
                    if ((by6 = (byte)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                        object = this.zza;
                        by2 = by4 + 1;
                        int n7 = (int)l2;
                        n3 = (byte)n7;
                        try {
                            object[by4] = n3;
                            break block12;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                            indexOutOfBoundsException = indexOutOfBoundsException2;
                            by4 = by2;
                            break block13;
                        }
                    }
                    try {
                        object = this.zza;
                        by5 = by4 + 1;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException3) {
                        break;
                    }
                    byte by8 = (byte)((int)l2 | 0x80);
                    try {
                        object[by4] = by8;
                        l2 >>>= by2;
                        by4 = by5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException4) {
                        by4 = by5;
                        break;
                    }
                }
                indexOutOfBoundsException = var18_21;
            }
            n3 = this.zzb;
            long l16 = by4;
            long l17 = n3;
            object = zzzf2;
            zzzf2 = new zzzf(l16, l17, 1, indexOutOfBoundsException);
            throw zzzf2;
        }
        this.zzc = by2;
    }
}

