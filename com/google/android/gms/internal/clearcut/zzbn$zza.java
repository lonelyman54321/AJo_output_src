/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzas;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzbn$zzc;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzff;
import com.google.android.gms.internal.clearcut.zzfi;
import com.google.android.gms.internal.clearcut.zzfr;

class zzbn$zza
extends zzbn {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public zzbn$zza(byte[] object, int n3, int n4) {
        int n7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        super(null);
        if (object != null) {
            n7 = n3 | n4;
            int n8 = ((byte[])object).length;
            int n10 = n3 + n4;
            if ((n7 |= (n8 -= n10)) >= 0) {
                this.buffer = object;
                this.offset = n3;
                this.position = n3;
                this.limit = n10;
                return;
            }
            object = ((byte[])object).length;
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[]{object, n14, n15};
            object = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
            illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = new NullPointerException;
        super("buffer");
        throw object;
    }

    public void flush() {
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Object object;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.position;
            Integer n7 = this.limit;
            Object object2 = n4;
            Object[] objectArray = new Object[]{object, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            zzbn$zzc zzbn$zzc = new zzbn$zzc((String)object2, indexOutOfBoundsException);
            throw zzbn$zzc;
        }
        int n8 = this.position;
        System.arraycopy(byArray, n3, object, n8, n4);
        int n10 = this.position + n4;
        this.position = n10;
    }

    public final void zza(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzbn$zzc;
            Integer n4 = this.position;
            Integer n7 = this.limit;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.position;
        int n14 = n10 + 1;
        this.position = n14;
        object[n10] = by2;
    }

    public final void zza(int n3, long l2) {
        this.zzb(n3, 0);
        this.zzb(l2);
    }

    public final void zza(int n3, zzbb zzbb2) {
        this.zzb(n3, 2);
        this.zza(zzbb2);
    }

    public final void zza(int n3, zzdo zzdo2) {
        this.zzb(n3, 2);
        this.zzb(zzdo2);
    }

    public final void zza(int n3, zzdo zzdo2, zzef zzef2) {
        this.zzb(n3, 2);
        Object object = zzdo2;
        object = (zzas)zzdo2;
        int n4 = ((zzas)object).zzs();
        int n7 = -1;
        if (n4 == n7) {
            n4 = zzef2.zzm(object);
            ((zzas)object).zzf(n4);
        }
        this.zzo(n4);
        object = this.zzfz;
        zzef2.zza(zzdo2, (zzfr)object);
    }

    public final void zza(int n3, String string2) {
        this.zzb(n3, 2);
        this.zzg(string2);
    }

    public final void zza(zzbb zzbb2) {
        int n3 = zzbb2.size();
        this.zzo(n3);
        zzbb2.zza(this);
    }

    public final void zza(zzdo zzdo2, zzef zzef2) {
        int n3;
        Object object = zzdo2;
        object = (zzas)zzdo2;
        int n4 = ((zzas)object).zzs();
        if (n4 == (n3 = -1)) {
            n4 = zzef2.zzm(object);
            ((zzas)object).zzf(n4);
        }
        this.zzo(n4);
        object = this.zzfz;
        zzef2.zza(zzdo2, (zzfr)object);
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        this.write(byArray, n3, n4);
    }

    public final int zzag() {
        int n3 = this.limit;
        int n4 = this.position;
        return n3 - n4;
    }

    public final int zzai() {
        int n3 = this.position;
        int n4 = this.offset;
        return n3 - n4;
    }

    public final void zzb(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.zzo(n3);
    }

    public final void zzb(int n3, zzbb zzbb2) {
        int n4 = 1;
        int n7 = 3;
        this.zzb(n4, n7);
        this.zzd(2, n3);
        this.zza(n7, zzbb2);
        this.zzb(n4, 4);
    }

    public final void zzb(int n3, zzdo zzdo2) {
        int n4 = 1;
        int n7 = 3;
        this.zzb(n4, n7);
        this.zzd(2, n3);
        this.zza(n7, zzdo2);
        this.zzb(n4, 4);
    }

    public final void zzb(int n3, boolean bl2) {
        this.zzb(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.zza((byte)n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n3;
        int n4 = 1;
        int n7 = zzbn.zzah();
        int n8 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n7 != 0 && (n7 = this.zzag()) >= (n3 = 10)) {
            while (true) {
                int n10;
                byte[] byArray;
                long l7;
                long l8;
                if ((n7 = (int)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                    byArray = this.buffer;
                    n8 = this.position;
                    this.position = n4 += n8;
                    long l12 = n8;
                    byte by2 = (byte)l2;
                    zzfd.zza(byArray, l12, by2);
                    return;
                }
                byArray = this.buffer;
                n3 = this.position;
                this.position = n10 = n3 + 1;
                l7 = n3;
                byte by4 = (byte)((int)l2 & 0x7F | 0x80);
                zzfd.zza(byArray, l7, by4);
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
                    object = this.buffer;
                    n8 = this.position;
                    this.position = n15 = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                int n16 = (int)l2;
                byte by5 = (byte)n16;
                object[n8] = by5;
                return;
            }
            object = this.buffer;
            n3 = this.position;
            this.position = n14 = n3 + 1;
            n14 = (byte)((int)l2 & 0x7F | 0x80);
            {
                object[n3] = n14;
                l2 >>>= n8;
                continue;
            }
            break;
        }
        object = this.position;
        Integer n17 = this.limit;
        Integer n18 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n4] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzbn$zzc zzbn$zzc = new zzbn$zzc(string2, indexOutOfBoundsException2);
        throw zzbn$zzc;
    }

    public final void zzb(zzdo zzdo2) {
        int n3 = zzdo2.zzas();
        this.zzo(n3);
        zzdo2.zzb(this);
    }

    public final void zzc(int n3, int n4) {
        this.zzb(n3, 0);
        this.zzn(n4);
    }

    public final void zzc(int n3, long l2) {
        this.zzb(n3, 1);
        this.zzd(l2);
    }

    public final void zzd(int n3, int n4) {
        this.zzb(n3, 0);
        this.zzo(n4);
    }

    public final void zzd(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.position;
            Integer n8 = this.limit;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            zzbn$zzc zzbn$zzc = new zzbn$zzc((String)object2, indexOutOfBoundsException);
            throw zzbn$zzc;
        }
        int n14 = this.position;
        int n15 = n14 + 1;
        this.position = n15;
        int n16 = (int)l2;
        object[n14] = n16;
        n16 = n14 + 2;
        this.position = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 3;
        this.position = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n16 = n14 + 4;
        this.position = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 5;
        this.position = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n16 = n14 + 6;
        this.position = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n15] = by2;
        n15 = n14 + 7;
        this.position = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)n18;
        object[n16] = by2;
        n14 += n17;
        this.position = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)n19;
        object[n15] = by4;
    }

    public final void zzd(byte[] byArray, int n3, int n4) {
        this.zzo(n4);
        this.write(byArray, 0, n4);
    }

    public final void zzf(int n3, int n4) {
        this.zzb(n3, 5);
        this.zzq(n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(String string2) {
        zzfi zzfi22;
        int n3;
        block6: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block5: {
                int n4;
                int n7;
                block7: {
                    int n8;
                    n3 = this.position;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block5;
                    }
                    catch (zzfi zzfi22) {
                        break block6;
                    }
                    {
                        n7 = zzbn.zzt(n7);
                        n4 = string2.length();
                        n4 = zzbn.zzt(n4);
                        if (n4 != n7) break block7;
                        this.position = n7 = n3 + n4;
                        byte[] byArray = this.buffer;
                        int n10 = this.zzag();
                        n7 = zzff.zza(string2, byArray, n7, n10);
                        this.position = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.zzo(n8);
                    this.position = n7;
                    return;
                }
                n7 = zzff.zza(string2);
                this.zzo(n7);
                byte[] byArray = this.buffer;
                n4 = this.position;
                int n14 = this.zzag();
                this.position = n7 = zzff.zza(string2, byArray, n4, n14);
                return;
            }
            zzbn$zzc zzbn$zzc = new zzbn$zzc(indexOutOfBoundsException2);
            throw zzbn$zzc;
        }
        this.position = n3;
        this.zza(string2, zzfi22);
    }

    public final void zzn(int n3) {
        if (n3 >= 0) {
            this.zzo(n3);
            return;
        }
        long l2 = n3;
        this.zzb(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n4;
        int n7 = 1;
        int n8 = zzbn.zzah();
        if (n8 != 0 && (n8 = this.zzag()) >= (n4 = 10)) {
            while (true) {
                int n10;
                long l2;
                byte[] byArray;
                if ((n8 = n3 & 0xFFFFFF80) == 0) {
                    byArray = this.buffer;
                    n4 = this.position;
                    this.position = n7 += n4;
                    l2 = n4;
                    n3 = (byte)n3;
                    zzfd.zza(byArray, l2, (byte)n3);
                    return;
                }
                byArray = this.buffer;
                n4 = this.position;
                this.position = n10 = n4 + 1;
                l2 = n4;
                byte by2 = (byte)(n3 & 0x7F | 0x80);
                zzfd.zza(byArray, l2, by2);
                n3 >>>= 7;
            }
        }
        while (true) {
            int n14;
            if ((n8 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.buffer;
                    n4 = this.position;
                    this.position = n14 = n4 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n4] = n3;
                return;
            }
            object = this.buffer;
            n4 = this.position;
            this.position = n14 = n4 + 1;
            n14 = (byte)(n3 & 0x7F | 0x80);
            {
                object[n4] = n14;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new zzbn$zzc;
        Integer n15 = this.position;
        Integer n16 = this.limit;
        Integer n17 = n7;
        Object[] objectArray = new Object[3];
        objectArray[0] = n15;
        objectArray[n7] = n16;
        objectArray[2] = n17;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object(string2, indexOutOfBoundsException2);
        throw object;
    }

    public final void zzq(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzbn$zzc;
            Integer n10 = this.position;
            Integer n14 = this.limit;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.position;
        int n17 = n16 + 1;
        this.position = n17;
        int n18 = n3;
        object[n16] = n18;
        n18 = n16 + 2;
        this.position = n18;
        byte by2 = (byte)(n3 >> 8);
        object[n17] = by2;
        n17 = n16 + 3;
        this.position = n17;
        by2 = (byte)(n3 >> 16);
        object[n18] = by2;
        n16 += 4;
        this.position = n16;
        n3 >>= 24;
        object[n17] = n3;
    }
}

