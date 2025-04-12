/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbu;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcl;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.icing.zzfn;
import com.google.android.gms.internal.icing.zzfq;
import com.google.android.gms.internal.icing.zzfr;

final class zzck
extends zzcm {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzck(byte[] object, int n3, int n4) {
        Object object2 = null;
        super(null);
        n3 = ((byte[])object).length;
        int n7 = n3 - n4 | n4;
        if (n7 >= 0) {
            this.zzb = object;
            this.zzd = 0;
            this.zzc = n4;
            return;
        }
        object = new IllegalArgumentException;
        object2 = n3;
        Integer n8 = 0;
        Integer n10 = n4;
        Object[] objectArray = new Object[]{object2, n8, n10};
        object2 = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
        super((String)object2);
        throw object;
    }

    public final void zza(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzl(n3);
    }

    public final void zzb(int n3, int n4) {
        this.zzl(n3 <<= 3);
        this.zzk(n4);
    }

    public final void zzc(int n3, int n4) {
        this.zzl(n3 <<= 3);
        this.zzl(n4);
    }

    public final void zzd(int n3, int n4) {
        n3 = n3 << 3 | 5;
        this.zzl(n3);
        this.zzm(n4);
    }

    public final void zze(int n3, long l2) {
        this.zzl(n3 <<= 3);
        this.zzn(l2);
    }

    public final void zzf(int n3, long l2) {
        n3 = n3 << 3 | 1;
        this.zzl(n3);
        this.zzo(l2);
    }

    public final void zzg(int n3, boolean bl2) {
        this.zzl(n3 <<= 3);
        this.zzj((byte)(bl2 ? 1 : 0));
    }

    public final void zzh(int n3, String string2) {
        n3 = n3 << 3 | 2;
        this.zzl(n3);
        this.zzr(string2);
    }

    public final void zzi(int n3, zzcf zzcf2) {
        n3 = n3 << 3 | 2;
        this.zzl(n3);
        n3 = zzcf2.zzc();
        this.zzl(n3);
        zzcf2.zzf(this);
    }

    public final void zzj(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzcl;
            Integer n4 = this.zzd;
            Integer n7 = this.zzc;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.zzd;
        int n14 = n10 + 1;
        this.zzd = n14;
        object[n10] = by2;
    }

    public final void zzk(int n3) {
        if (n3 >= 0) {
            this.zzl(n3);
            return;
        }
        long l2 = n3;
        this.zzn(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n4 = 1;
        int n7 = zzcm.zzF();
        if (n7 != 0) {
            n7 = zzbu.zza;
        }
        while (true) {
            int n8;
            int n10;
            if ((n7 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.zzb;
                    n10 = this.zzd;
                    this.zzd = n8 = n10 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n10] = n3;
                return;
            }
            object = this.zzb;
            n10 = this.zzd;
            this.zzd = n8 = n10 + 1;
            n8 = (byte)(n3 & 0x7F | 0x80);
            {
                object[n10] = n8;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new zzcl;
        Integer n14 = this.zzd;
        Integer n15 = this.zzc;
        Integer n16 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = n14;
        objectArray[n4] = n15;
        objectArray[2] = n16;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object(string2, indexOutOfBoundsException2);
        throw object;
    }

    public final void zzm(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzcl;
            Integer n10 = this.zzd;
            Integer n14 = this.zzc;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.zzd;
        int n17 = n16 + 1;
        this.zzd = n17;
        int n18 = n3 & 0xFF;
        object[n16] = n18;
        n18 = n16 + 2;
        this.zzd = n18;
        byte by2 = (byte)(n3 >> 8 & 0xFF);
        object[n17] = by2;
        n17 = n16 + 3;
        this.zzd = n17;
        by2 = (byte)(n3 >> 16 & 0xFF);
        object[n18] = by2;
        n16 += 4;
        this.zzd = n16;
        n3 = (byte)(n3 >> 24 & 0xFF);
        object[n17] = n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n3;
        int n4 = 1;
        int n7 = zzcm.zzF();
        int n8 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n7 != 0) {
            n7 = this.zzc;
            n3 = this.zzd;
            if ((n7 -= n3) >= (n3 = 10)) {
                while (true) {
                    int n10;
                    byte[] byArray;
                    long l7;
                    long l8;
                    if ((n7 = (int)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                        byArray = this.zzb;
                        n8 = this.zzd;
                        this.zzd = n4 += n8;
                        long l12 = n8;
                        byte by2 = (byte)l2;
                        zzfn.zzp(byArray, l12, by2);
                        return;
                    }
                    byArray = this.zzb;
                    n3 = this.zzd;
                    this.zzd = n10 = n3 + 1;
                    l7 = n3;
                    byte by4 = (byte)((int)l2 & 0x7F | 0x80);
                    zzfn.zzp(byArray, l7, by4);
                    l2 >>>= n8;
                }
            }
        }
        while (true) {
            int n14;
            long l14;
            long l15;
            if ((n7 = (int)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                try {
                    int n15;
                    object = this.zzb;
                    n8 = this.zzd;
                    this.zzd = n15 = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                int n16 = (int)l2;
                byte by5 = (byte)n16;
                object[n8] = by5;
                return;
            }
            object = this.zzb;
            n3 = this.zzd;
            this.zzd = n14 = n3 + 1;
            n14 = (byte)((int)l2 & 0x7F | 0x80);
            {
                object[n3] = n14;
                l2 >>>= n8;
                continue;
            }
            break;
        }
        object = this.zzd;
        Integer n17 = this.zzc;
        Integer n18 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n4] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzcl zzcl2 = new zzcl(string2, indexOutOfBoundsException2);
        throw zzcl2;
    }

    public final void zzo(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.zzd;
            Integer n8 = this.zzc;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            zzcl zzcl2 = new zzcl((String)object2, indexOutOfBoundsException);
            throw zzcl2;
        }
        int n14 = this.zzd;
        int n15 = n14 + 1;
        this.zzd = n15;
        int n16 = (int)l2 & 0xFF;
        object[n14] = n16;
        n16 = n14 + 2;
        this.zzd = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 3;
        this.zzd = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 4;
        this.zzd = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 5;
        this.zzd = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 6;
        this.zzd = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 7;
        this.zzd = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n14 += n17;
        this.zzd = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)(n19 & 0xFF);
        object[n15] = by4;
    }

    public final void zzp(byte[] byArray, int n3, int n4) {
        Object object;
        String string2 = null;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzcl;
            Integer n7 = this.zzd;
            Integer n8 = this.zzc;
            Integer n10 = n4;
            Object[] objectArray = new Object[]{n7, n8, n10};
            string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n14 = this.zzd;
        System.arraycopy(byArray, 0, object, n14, n4);
        int n15 = this.zzd + n4;
        this.zzd = n15;
    }

    public final void zzq(byte[] byArray, int n3, int n4) {
        this.zzp(byArray, 0, n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr(String string2) {
        zzfq zzfq22;
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
                    n3 = this.zzd;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block7;
                    }
                    catch (zzfq zzfq22) {
                        break block8;
                    }
                    {
                        n7 = zzcm.zzw(n7);
                        n4 = string2.length();
                        n4 = zzcm.zzw(n4);
                        if (n4 != n7) break block9;
                        this.zzd = n7 = n3 + n4;
                        byArray = this.zzb;
                        n10 = this.zzc - n7;
                    }
                    {
                        n7 = zzfr.zzd(string2, byArray, n7, n10);
                        this.zzd = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzl(n8);
                    this.zzd = n7;
                    return;
                }
                n7 = zzfr.zzc(string2);
                this.zzl(n7);
                byte[] byArray = this.zzb;
                n4 = this.zzd;
                int n14 = this.zzc - n4;
                {
                    this.zzd = n7 = zzfr.zzd(string2, byArray, n4, n14);
                    return;
                }
            }
            zzcl zzcl2 = new zzcl(indexOutOfBoundsException2);
            throw zzcl2;
        }
        this.zzd = n3;
        this.zzD(string2, zzfq22);
    }

    public final int zzs() {
        int n3 = this.zzc;
        int n4 = this.zzd;
        return n3 - n4;
    }
}

