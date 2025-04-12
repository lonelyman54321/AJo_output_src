/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhfa;
import com.google.android.gms.internal.ads.zzhfe;
import com.google.android.gms.internal.ads.zzhff;
import com.google.android.gms.internal.ads.zzhfi;

final class zzhap
extends zzhat {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhap(byte[] object, int n3, int n4) {
        Object object2 = null;
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
        object2 = n3;
        Integer n8 = 0;
        Integer n10 = n4;
        Object[] objectArray = new Object[]{object2, n8, n10};
        object2 = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
        super((String)object2);
        throw object;
    }

    public final void zzL() {
    }

    public final void zzM(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzhaq;
            Integer n4 = this.zzc;
            Integer n7 = this.zzb;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.zzc;
        int n14 = n10 + 1;
        this.zzc = n14;
        object[n10] = by2;
    }

    public final void zzN(int n3, boolean bl2) {
        this.zzu(n3 <<= 3);
        this.zzM((byte)(bl2 ? 1 : 0));
    }

    public final void zzO(int n3, zzhac zzhac2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        n3 = zzhac2.zzd();
        this.zzu(n3);
        zzhac2.zzo(this);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zze(byArray, n3, n4);
    }

    public final int zzb() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        return n3 - n4;
    }

    public final void zze(byte[] byArray, int n3, int n4) {
        Object object;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.zzc;
            Integer n7 = this.zzb;
            Object object2 = n4;
            Object[] objectArray = new Object[]{object, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            zzhaq zzhaq2 = new zzhaq((String)object2, indexOutOfBoundsException);
            throw zzhaq2;
        }
        int n8 = this.zzc;
        System.arraycopy(byArray, n3, object, n8, n4);
        int n10 = this.zzc + n4;
        this.zzc = n10;
    }

    public final void zzh(int n3, int n4) {
        n3 = n3 << 3 | 5;
        this.zzu(n3);
        this.zzi(n4);
    }

    public final void zzi(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzhaq;
            Integer n10 = this.zzc;
            Integer n14 = this.zzb;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.zzc;
        int n17 = n16 + 1;
        this.zzc = n17;
        int n18 = n3 & 0xFF;
        object[n16] = n18;
        n18 = n16 + 2;
        this.zzc = n18;
        byte by2 = (byte)(n3 >> 8 & 0xFF);
        object[n17] = by2;
        n17 = n16 + 3;
        this.zzc = n17;
        by2 = (byte)(n3 >> 16 & 0xFF);
        object[n18] = by2;
        n16 += 4;
        this.zzc = n16;
        n3 = (byte)(n3 >> 24 & 0xFF);
        object[n17] = n3;
    }

    public final void zzj(int n3, long l2) {
        n3 = n3 << 3 | 1;
        this.zzu(n3);
        this.zzk(l2);
    }

    public final void zzk(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.zza;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.zzc;
            Integer n8 = this.zzb;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            zzhaq zzhaq2 = new zzhaq((String)object2, indexOutOfBoundsException);
            throw zzhaq2;
        }
        int n14 = this.zzc;
        int n15 = n14 + 1;
        this.zzc = n15;
        int n16 = (int)l2 & 0xFF;
        object[n14] = n16;
        n16 = n14 + 2;
        this.zzc = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 3;
        this.zzc = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 4;
        this.zzc = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 5;
        this.zzc = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 6;
        this.zzc = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 7;
        this.zzc = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n14 += n17;
        this.zzc = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)(n19 & 0xFF);
        object[n15] = by4;
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

    public final void zzn(int n3, zzhde zzhde2, zzhdz zzhdz2) {
        n3 = n3 << 3 | 2;
        this.zzu(n3);
        Object object = zzhde2;
        n3 = ((zzgzi)zzhde2).zzaM(zzhdz2);
        this.zzu(n3);
        object = this.zze;
        zzhdz2.zzj(zzhde2, (zzhfi)object);
    }

    public final void zzo(int n3, zzhde zzhde2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzu(26);
        n3 = zzhde2.zzaY();
        this.zzu(n3);
        zzhde2.zzda(this);
        this.zzu(12);
    }

    public final void zzp(int n3, zzhac zzhac2) {
        this.zzu(11);
        this.zzt(2, n3);
        this.zzO(3, zzhac2);
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
        zzhfe zzhfe22;
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
                    catch (zzhfe zzhfe22) {
                        break block8;
                    }
                    {
                        n7 = zzhat.zzD(n7);
                        n4 = string2.length();
                        n4 = zzhat.zzD(n4);
                        if (n4 != n7) break block9;
                        this.zzc = n7 = n3 + n4;
                        byArray = this.zza;
                        n10 = this.zzb - n7;
                    }
                    {
                        n7 = zzhff.zzd(string2, byArray, n7, n10);
                        this.zzc = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzu(n8);
                    this.zzc = n7;
                    return;
                }
                n7 = zzhff.zze(string2);
                this.zzu(n7);
                byte[] byArray = this.zza;
                n4 = this.zzc;
                int n14 = this.zzb - n4;
                {
                    this.zzc = n7 = zzhff.zzd(string2, byArray, n4, n14);
                    return;
                }
            }
            zzhaq zzhaq2 = new zzhaq(indexOutOfBoundsException2);
            throw zzhaq2;
        }
        this.zzc = n3;
        this.zzH(string2, zzhfe22);
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n4 = 1;
        while (true) {
            int n7;
            int n8;
            int n10;
            if ((n10 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.zza;
                    n8 = this.zzc;
                    this.zzc = n7 = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n8] = n3;
                return;
            }
            object = this.zza;
            n8 = this.zzc;
            this.zzc = n7 = n8 + 1;
            n7 = (byte)((n3 | 0x80) & 0xFF);
            {
                object[n8] = n7;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new zzhaq;
        Integer n14 = this.zzc;
        Integer n15 = this.zzb;
        Integer n16 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = n14;
        objectArray[n4] = n15;
        objectArray[2] = n16;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object(string2, indexOutOfBoundsException2);
        throw object;
    }

    public final void zzv(int n3, long l2) {
        this.zzu(n3 <<= 3);
        this.zzw(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzw(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        byte by2;
        int n3 = 1;
        int n4 = zzhat.zzI();
        int n7 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n4 != 0) {
            n4 = this.zzb;
            by2 = this.zzc;
            if ((n4 -= by2) >= (by2 = 10)) {
                while (true) {
                    int n8;
                    long l7 = l2 & l4;
                    n4 = (int)(l7 == l3 ? 0 : (l7 < l3 ? -1 : 1));
                    by2 = (int)l2;
                    if (n4 == 0) {
                        byte[] byArray = this.zza;
                        byte by4 = this.zzc;
                        this.zzc = n3 += by4;
                        long l8 = by4;
                        by4 = by2;
                        zzhfa.zzq(byArray, l8, by4);
                        return;
                    }
                    byte[] byArray = this.zza;
                    int n10 = this.zzc;
                    this.zzc = n8 = n10 + 1;
                    long l12 = n10;
                    by2 = (byte)((by2 | 0x80) & 0xFF);
                    zzhfa.zzq(byArray, l12, by2);
                    l2 >>>= n7;
                }
            }
        }
        while (true) {
            int n14;
            long l14;
            long l15;
            if ((n4 = (int)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                try {
                    int n15;
                    object = this.zza;
                    n7 = this.zzc;
                    this.zzc = n15 = n7 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                int n16 = (int)l2;
                byte by5 = (byte)n16;
                object[n7] = by5;
                return;
            }
            object = this.zza;
            by2 = this.zzc;
            this.zzc = n14 = by2 + 1;
            n14 = (byte)(((int)l2 | 0x80) & 0xFF);
            {
                object[by2] = n14;
                l2 >>>= n7;
                continue;
            }
            break;
        }
        object = this.zzc;
        Integer n17 = this.zzb;
        Integer n18 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n3] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzhaq zzhaq2 = new zzhaq(string2, indexOutOfBoundsException2);
        throw zzhaq2;
    }
}

