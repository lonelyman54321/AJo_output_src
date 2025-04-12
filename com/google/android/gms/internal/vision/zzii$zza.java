/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzhi;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzii$zzb;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzmd;
import com.google.android.gms.internal.vision.zzmg;
import com.google.android.gms.internal.vision.zzmr;

final class zzii$zza
extends zzii {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;
    private int zze;

    public zzii$zza(byte[] object, int n3, int n4) {
        int n7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        super(null);
        if (object != null) {
            n7 = ((byte[])object).length - n4 | n4;
            if (n7 >= 0) {
                this.zzb = object;
                this.zzc = 0;
                this.zze = 0;
                this.zzd = n4;
                return;
            }
            object = ((byte[])object).length;
            Integer n8 = 0;
            Integer n10 = n4;
            Object[] objectArray = new Object[]{object, n8, n10};
            object = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
            illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = new NullPointerException;
        super("buffer");
        throw object;
    }

    private final void zzc(byte[] byArray, int n3, int n4) {
        Object object;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.zze;
            Integer n7 = this.zzd;
            Object object2 = n4;
            Object[] objectArray = new Object[]{object, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            zzii$zzb zzii$zzb = new zzii$zzb((String)object2, indexOutOfBoundsException);
            throw zzii$zzb;
        }
        int n8 = this.zze;
        System.arraycopy(byArray, n3, object, n8, n4);
        int n10 = this.zze + n4;
        this.zze = n10;
    }

    public final int zza() {
        int n3 = this.zzd;
        int n4 = this.zze;
        return n3 - n4;
    }

    public final void zza(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzii$zzb;
            Integer n4 = this.zze;
            Integer n7 = this.zzd;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.zze;
        int n14 = n10 + 1;
        this.zze = n14;
        object[n10] = by2;
    }

    public final void zza(int n3) {
        if (n3 >= 0) {
            this.zzb(n3);
            return;
        }
        long l2 = n3;
        this.zza(l2);
    }

    public final void zza(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzb(n3);
    }

    public final void zza(int n3, long l2) {
        this.zza(n3, 0);
        this.zza(l2);
    }

    public final void zza(int n3, zzht zzht2) {
        this.zza(n3, 2);
        this.zza(zzht2);
    }

    public final void zza(int n3, zzkk zzkk2) {
        int n4 = 1;
        int n7 = 3;
        this.zza(n4, n7);
        int n8 = 2;
        this.zzc(n8, n3);
        this.zza(n7, n8);
        this.zza(zzkk2);
        this.zza(n4, 4);
    }

    public final void zza(int n3, zzkk zzkk2, zzlc zzlc2) {
        this.zza(n3, 2);
        Object object = zzkk2;
        object = (zzhf)zzkk2;
        int n4 = ((zzhf)object).zzi();
        int n7 = -1;
        if (n4 == n7) {
            n4 = zzlc2.zzb(object);
            ((zzhf)object).zzb(n4);
        }
        this.zzb(n4);
        object = this.zza;
        zzlc2.zza((Object)zzkk2, (zzmr)object);
    }

    public final void zza(int n3, String string2) {
        this.zza(n3, 2);
        this.zza(string2);
    }

    public final void zza(int n3, boolean bl2) {
        this.zza(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.zza((byte)n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n3;
        int n4 = 1;
        int n7 = zzii.zzc();
        int n8 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n7 != 0 && (n7 = this.zza()) >= (n3 = 10)) {
            while (true) {
                int n10;
                byte[] byArray;
                long l7;
                long l8;
                if ((n7 = (int)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                    byArray = this.zzb;
                    n8 = this.zze;
                    this.zze = n4 += n8;
                    long l12 = n8;
                    byte by2 = (byte)l2;
                    zzma.zza(byArray, l12, by2);
                    return;
                }
                byArray = this.zzb;
                n3 = this.zze;
                this.zze = n10 = n3 + 1;
                l7 = n3;
                byte by4 = (byte)((int)l2 & 0x7F | 0x80);
                zzma.zza(byArray, l7, by4);
                l2 >>>= n8;
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
                    n8 = this.zze;
                    this.zze = n15 = n8 + 1;
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
            n3 = this.zze;
            this.zze = n14 = n3 + 1;
            n14 = (byte)((int)l2 & 0x7F | 0x80);
            {
                object[n3] = n14;
                l2 >>>= n8;
                continue;
            }
            break;
        }
        object = this.zze;
        Integer n17 = this.zzd;
        Integer n18 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n4] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzii$zzb zzii$zzb = new zzii$zzb(string2, indexOutOfBoundsException2);
        throw zzii$zzb;
    }

    public final void zza(zzht zzht2) {
        int n3 = zzht2.zza();
        this.zzb(n3);
        zzht2.zza(this);
    }

    public final void zza(zzkk zzkk2) {
        int n3 = zzkk2.zzm();
        this.zzb(n3);
        zzkk2.zza(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String string2) {
        zzmg zzmg22;
        int n3;
        block6: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block5: {
                int n4;
                int n7;
                block7: {
                    int n8;
                    n3 = this.zze;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block5;
                    }
                    catch (zzmg zzmg22) {
                        break block6;
                    }
                    {
                        n7 = zzii.zzg(n7);
                        n4 = string2.length();
                        n4 = zzii.zzg(n4);
                        if (n4 != n7) break block7;
                        this.zze = n7 = n3 + n4;
                        byte[] byArray = this.zzb;
                        int n10 = this.zza();
                        n7 = zzmd.zza(string2, byArray, n7, n10);
                        this.zze = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzb(n8);
                    this.zze = n7;
                    return;
                }
                n7 = zzmd.zza(string2);
                this.zzb(n7);
                byte[] byArray = this.zzb;
                n4 = this.zze;
                int n14 = this.zza();
                this.zze = n7 = zzmd.zza(string2, byArray, n4, n14);
                return;
            }
            zzii$zzb zzii$zzb = new zzii$zzb(indexOutOfBoundsException2);
            throw zzii$zzb;
        }
        this.zze = n3;
        this.zza(string2, zzmg22);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.zzc(byArray, n3, n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n4;
        int n7 = 1;
        int n8 = zzii.zzc();
        if (n8 != 0 && (n8 = zzhi.zza()) == 0 && (n8 = this.zza()) >= (n4 = 5)) {
            int n10;
            n8 = n3 & 0xFFFFFF80;
            if (n8 == 0) {
                byte[] byArray = this.zzb;
                n4 = this.zze;
                this.zze = n7 += n4;
                long l2 = n4;
                n3 = (byte)n3;
                zzma.zza(byArray, l2, (byte)n3);
                return;
            }
            byte[] byArray = this.zzb;
            n4 = this.zze;
            this.zze = n10 = n4 + 1;
            long l3 = n4;
            int n14 = n3 | 0x80;
            zzma.zza(byArray, l3, (byte)n14);
            n8 = n3 >>> 7;
            n4 = n8 & 0xFFFFFF80;
            if (n4 == 0) {
                byte[] byArray2 = this.zzb;
                n4 = this.zze;
                this.zze = n7 += n4;
                l3 = n4;
                n7 = (byte)n8;
                zzma.zza(byArray2, l3, (byte)n7);
                return;
            }
            byte[] byArray3 = this.zzb;
            n10 = this.zze;
            this.zze = n14 = n10 + 1;
            long l4 = n10;
            n8 = (byte)(n8 | 0x80);
            zzma.zza(byArray3, l4, (byte)n8);
            n8 = n3 >>> 14;
            n4 = n8 & 0xFFFFFF80;
            if (n4 == 0) {
                byte[] byArray4 = this.zzb;
                n4 = this.zze;
                this.zze = n7 += n4;
                l3 = n4;
                n7 = (byte)n8;
                zzma.zza(byArray4, l3, (byte)n7);
                return;
            }
            byArray3 = this.zzb;
            n10 = this.zze;
            this.zze = n14 = n10 + 1;
            l4 = n10;
            n8 = (byte)(n8 | 0x80);
            zzma.zza(byArray3, l4, (byte)n8);
            n8 = n3 >>> 21;
            n4 = n8 & 0xFFFFFF80;
            if (n4 == 0) {
                byte[] byArray5 = this.zzb;
                n4 = this.zze;
                this.zze = n7 += n4;
                l3 = n4;
                n7 = (byte)n8;
                zzma.zza(byArray5, l3, (byte)n7);
                return;
            }
            byArray3 = this.zzb;
            n10 = this.zze;
            this.zze = n14 = n10 + 1;
            l4 = n10;
            n8 = (byte)(n8 | 0x80);
            zzma.zza(byArray3, l4, (byte)n8);
            n3 >>>= 28;
            byArray = this.zzb;
            n4 = this.zze;
            this.zze = n7 += n4;
            l3 = n4;
            n3 = (byte)n3;
            zzma.zza(byArray, l3, (byte)n3);
            return;
        }
        while (true) {
            int n15;
            if ((n8 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.zzb;
                    n4 = this.zze;
                    this.zze = n15 = n4 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n4] = n3;
                return;
            }
            object = this.zzb;
            n4 = this.zze;
            this.zze = n15 = n4 + 1;
            n15 = (byte)(n3 & 0x7F | 0x80);
            {
                object[n4] = n15;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new zzii$zzb;
        Integer n16 = this.zze;
        Integer n17 = this.zzd;
        Integer n18 = n7;
        Object[] objectArray = new Object[3];
        objectArray[0] = n16;
        objectArray[n7] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object(string2, indexOutOfBoundsException2);
        throw object;
    }

    public final void zzb(int n3, int n4) {
        this.zza(n3, 0);
        this.zza(n4);
    }

    public final void zzb(int n3, zzht zzht2) {
        int n4 = 1;
        int n7 = 3;
        this.zza(n4, n7);
        this.zzc(2, n3);
        this.zza(n7, zzht2);
        this.zza(n4, 4);
    }

    public final void zzb(byte[] byArray, int n3, int n4) {
        this.zzb(n4);
        this.zzc(byArray, 0, n4);
    }

    public final void zzc(int n3, int n4) {
        this.zza(n3, 0);
        this.zzb(n4);
    }

    public final void zzc(int n3, long l2) {
        this.zza(n3, 1);
        this.zzc(l2);
    }

    public final void zzc(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.zze;
            Integer n8 = this.zzd;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            zzii$zzb zzii$zzb = new zzii$zzb((String)object2, indexOutOfBoundsException);
            throw zzii$zzb;
        }
        int n14 = this.zze;
        int n15 = n14 + 1;
        this.zze = n15;
        int n16 = (int)l2;
        object[n14] = n16;
        n16 = n14 + 2;
        this.zze = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 3;
        this.zze = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n16 = n14 + 4;
        this.zze = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 5;
        this.zze = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n16 = n14 + 6;
        this.zze = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 7;
        this.zze = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n14 += n17;
        this.zze = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)n19;
        object[n15] = by4;
    }

    public final void zzd(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzii$zzb;
            Integer n10 = this.zze;
            Integer n14 = this.zzd;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.zze;
        int n17 = n16 + 1;
        this.zze = n17;
        int n18 = n3;
        object[n16] = n18;
        n18 = n16 + 2;
        this.zze = n18;
        byte by2 = (byte)(n3 >> 8);
        object[n17] = by2;
        n17 = n16 + 3;
        this.zze = n17;
        by2 = (byte)(n3 >> 16);
        object[n18] = by2;
        n16 += 4;
        this.zze = n16;
        n3 = (byte)(n3 >>> 24);
        object[n17] = n3;
    }

    public final void zze(int n3, int n4) {
        this.zza(n3, 5);
        this.zzd(n4);
    }
}

