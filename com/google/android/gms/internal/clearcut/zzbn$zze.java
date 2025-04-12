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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class zzbn$zze
extends zzbn {
    private final ByteBuffer zzgc;
    private final ByteBuffer zzgd;
    private final long zzge;
    private final long zzgf;
    private final long zzgg;
    private final long zzgh;
    private long zzgi;

    public zzbn$zze(ByteBuffer byteBuffer) {
        super(null);
        long l2;
        long l3;
        this.zzgc = byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.zzgd = byteBuffer2 = byteBuffer2.order(byteOrder);
        this.zzge = l3 = zzfd.zzb(byteBuffer);
        this.zzgf = l2 = (long)byteBuffer.position() + l3;
        long l4 = byteBuffer.limit();
        this.zzgg = l3 += l4;
        this.zzgh = l3 -= (long)10;
        this.zzgi = l2;
    }

    private final void zzk(long l2) {
        ByteBuffer byteBuffer = this.zzgd;
        long l3 = this.zzge;
        int n3 = (int)(l2 - l3);
        byteBuffer.position(n3);
    }

    public final void flush() {
        ByteBuffer byteBuffer = this.zzgc;
        long l2 = this.zzgi;
        long l3 = this.zzge;
        int n3 = (int)(l2 - l3);
        byteBuffer.position(n3);
    }

    public final void write(byte[] object, int n3, int n4) {
        int n7;
        if (object != null && n3 >= 0 && n4 >= 0 && (n7 = ((byte[])object).length - n4) >= n3) {
            long l2 = this.zzgg;
            long l3 = n4;
            long l4 = this.zzgi;
            long l7 = (l2 -= l3) - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 >= 0) {
                long l8;
                long l12 = n3;
                zzfd.zza(object, l12, l4, l3);
                this.zzgi = l8 = this.zzgi + l3;
                return;
            }
        }
        if (object == null) {
            object = new NullPointerException;
            object("value");
            throw object;
        }
        object = new zzbn$zzc;
        Object object3 = this.zzgi;
        Long l14 = this.zzgg;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{object3, l14, n8};
        object3 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object((String)object3);
        throw object;
    }

    public final void zza(byte by2) {
        int n3 = 1;
        long l2 = this.zzgi;
        long l3 = this.zzgg;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            this.zzgi = l3 = 1L + l2;
            zzfd.zza(l2, by2);
            return;
        }
        Long l7 = this.zzgi;
        Long l8 = this.zzgg;
        Integer n4 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = l7;
        objectArray[n3] = l8;
        objectArray[2] = n4;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzbn$zzc zzbn$zzc = new zzbn$zzc(string2);
        throw zzbn$zzc;
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
        this.zza(zzdo2, zzef2);
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
        long l2 = this.zzgg;
        long l3 = this.zzgi;
        return (int)(l2 - l3);
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

    public final void zzb(long l2) {
        long l3;
        int n3 = 1;
        long l4 = this.zzgi;
        long l7 = this.zzgh;
        int n4 = 7;
        long l8 = 0L;
        long l12 = -128;
        long l14 = 1L;
        Object object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object <= 0) {
            while (true) {
                long l15;
                long l16;
                long l17 = (l16 = (l2 & l12) - l8) == 0L ? 0 : (l16 < 0L ? -1 : 1);
                long l18 = this.zzgi;
                if (l17 == false) {
                    this.zzgi = l14 += l18;
                    byte by2 = (byte)l2;
                    zzfd.zza(l18, by2);
                    return;
                }
                this.zzgi = l15 = l18 + l14;
                l17 = (byte)((int)l2 & 0x7F | 0x80);
                zzfd.zza(l18, (byte)l17);
                l2 >>>= n4;
            }
        }
        while ((object = (l3 = (l4 = this.zzgi) - (l7 = this.zzgg)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l7 = l2 & l12;
            long l19 = l7 - l8;
            object = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
            if (object == false) {
                this.zzgi = l14 += l4;
                byte by4 = (byte)l2;
                zzfd.zza(l4, by4);
                return;
            }
            this.zzgi = l7 = l4 + l14;
            byte by5 = (byte)((int)l2 & 0x7F | 0x80);
            zzfd.zza(l4, by5);
            l2 >>>= n4;
        }
        Object object2 = this.zzgi;
        Long l20 = this.zzgg;
        Integer n7 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = object2;
        objectArray[n3] = l20;
        objectArray[2] = n7;
        object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzbn$zzc zzbn$zzc = new zzbn$zzc((String)object2);
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
        ByteBuffer byteBuffer = this.zzgd;
        long l3 = this.zzgi;
        long l4 = this.zzge;
        int n3 = (int)(l3 - l4);
        byteBuffer.putLong(n3, l2);
        this.zzgi = l2 = this.zzgi + (long)8;
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
        long l2;
        block9: {
            IllegalArgumentException illegalArgumentException2;
            block8: {
                IndexOutOfBoundsException indexOutOfBoundsException2;
                block7: {
                    int n3;
                    block10: {
                        long l3;
                        long l4;
                        int n4;
                        l2 = this.zzgi;
                        try {
                            n3 = string2.length() * 3;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            break block8;
                        }
                        catch (zzfi zzfi22) {
                            break block9;
                        }
                        {
                            n3 = zzbn.zzt(n3);
                            n4 = string2.length();
                            n4 = zzbn.zzt(n4);
                            if (n4 != n3) break block10;
                            l4 = this.zzgi;
                            l3 = this.zzge;
                        }
                        n3 = (int)(l4 -= l3) + n4;
                        {
                            ByteBuffer byteBuffer = this.zzgd;
                            byteBuffer.position(n3);
                            byteBuffer = this.zzgd;
                            zzff.zza(string2, byteBuffer);
                            byteBuffer = this.zzgd;
                            n4 = byteBuffer.position() - n3;
                        }
                        this.zzo(n4);
                        l4 = this.zzgi;
                        long l7 = n4;
                        this.zzgi = l4 += l7;
                        return;
                    }
                    n3 = zzff.zza(string2);
                    this.zzo(n3);
                    long l8 = this.zzgi;
                    this.zzk(l8);
                    ByteBuffer byteBuffer = this.zzgd;
                    zzff.zza(string2, byteBuffer);
                    l8 = this.zzgi;
                    long l12 = n3;
                    this.zzgi = l8 += l12;
                    return;
                }
                zzbn$zzc zzbn$zzc = new zzbn$zzc(indexOutOfBoundsException2);
                throw zzbn$zzc;
            }
            zzbn$zzc zzbn$zzc = new zzbn$zzc(illegalArgumentException2);
            throw zzbn$zzc;
        }
        this.zzgi = l2;
        this.zzk(l2);
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

    public final void zzo(int n3) {
        long l2;
        int n4 = 1;
        long l3 = this.zzgi;
        long l4 = this.zzgh;
        long l7 = 1L;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object <= 0) {
            while (true) {
                long l8;
                long l12;
                if ((n4 = n3 & 0xFFFFFF80) == 0) {
                    l12 = this.zzgi;
                    this.zzgi = l7 += l12;
                    n3 = (byte)n3;
                    zzfd.zza(l12, (byte)n3);
                    return;
                }
                l12 = this.zzgi;
                this.zzgi = l8 = l12 + l7;
                byte by2 = (byte)(n3 & 0x7F | 0x80);
                zzfd.zza(l12, by2);
                n3 >>>= 7;
            }
        }
        while ((object = (l2 = (l3 = this.zzgi) - (l4 = this.zzgg)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
            int n7 = n3 & 0xFFFFFF80;
            if (n7 == 0) {
                this.zzgi = l7 += l3;
                n3 = (byte)n3;
                zzfd.zza(l3, (byte)n3);
                return;
            }
            this.zzgi = l4 = l3 + l7;
            n7 = (byte)(n3 & 0x7F | 0x80);
            zzfd.zza(l3, (byte)n7);
            n3 >>>= 7;
        }
        Long l14 = this.zzgi;
        Long l15 = this.zzgg;
        Integer n8 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = l14;
        objectArray[n4] = l15;
        objectArray[2] = n8;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        zzbn$zzc zzbn$zzc = new zzbn$zzc(string2);
        throw zzbn$zzc;
    }

    public final void zzq(int n3) {
        long l2;
        ByteBuffer byteBuffer = this.zzgd;
        long l3 = this.zzgi;
        long l4 = this.zzge;
        int n4 = (int)(l3 - l4);
        byteBuffer.putInt(n4, n3);
        this.zzgi = l2 = this.zzgi + (long)4;
    }
}

