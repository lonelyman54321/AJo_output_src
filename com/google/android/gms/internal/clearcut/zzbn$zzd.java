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
import com.google.android.gms.internal.clearcut.zzff;
import com.google.android.gms.internal.clearcut.zzfi;
import com.google.android.gms.internal.clearcut.zzfr;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class zzbn$zzd
extends zzbn {
    private final int zzgb;
    private final ByteBuffer zzgc;
    private final ByteBuffer zzgd;

    public zzbn$zzd(ByteBuffer byteBuffer) {
        super(null);
        int n3;
        this.zzgc = byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.zzgd = byteBuffer2 = byteBuffer2.order(byteOrder);
        this.zzgb = n3 = byteBuffer.position();
    }

    private final void zzi(String string2) {
        Object object;
        try {
            object = this.zzgd;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new zzbn$zzc(indexOutOfBoundsException);
            throw object;
        }
        zzff.zza(string2, (ByteBuffer)object);
    }

    public final void flush() {
        ByteBuffer byteBuffer = this.zzgc;
        int n3 = this.zzgd.position();
        byteBuffer.position(n3);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block5: {
            ByteBuffer byteBuffer = this.zzgd;
            try {
                byteBuffer.put(byArray, n3, n4);
                return;
            }
            catch (BufferOverflowException bufferOverflowException) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block5;
            }
            zzbn$zzc zzbn$zzc = new zzbn$zzc(bufferOverflowException);
            throw zzbn$zzc;
        }
        zzbn$zzc zzbn$zzc = new zzbn$zzc(indexOutOfBoundsException2);
        throw zzbn$zzc;
    }

    public final void zza(byte by2) {
        Object object;
        try {
            object = this.zzgd;
        }
        catch (BufferOverflowException bufferOverflowException) {
            object = new zzbn$zzc(bufferOverflowException);
            throw object;
        }
        ((ByteBuffer)object).put(by2);
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
        return this.zzgd.remaining();
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
        BufferOverflowException bufferOverflowException2;
        while (true) {
            ByteBuffer byteBuffer;
            long l3;
            long l4;
            long l7;
            long l8;
            if ((l8 = (l7 = (l4 = (long)-128 & l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
                try {
                    byteBuffer = this.zzgd;
                }
                catch (BufferOverflowException bufferOverflowException2) {
                    break;
                }
                int n3 = (int)l2;
                byte by2 = (byte)n3;
                byteBuffer.put(by2);
                return;
            }
            byteBuffer = this.zzgd;
            byte by4 = (byte)((int)l2 & 0x7F | 0x80);
            {
                byteBuffer.put(by4);
                int n4 = 7;
                l2 >>>= n4;
                continue;
            }
            break;
        }
        zzbn$zzc zzbn$zzc = new zzbn$zzc(bufferOverflowException2);
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
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.zzgd;
        }
        catch (BufferOverflowException bufferOverflowException) {
            zzbn$zzc zzbn$zzc = new zzbn$zzc(bufferOverflowException);
            throw zzbn$zzc;
        }
        byteBuffer.putLong(l2);
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
            IllegalArgumentException illegalArgumentException2;
            Object object;
            block5: {
                int n4;
                block7: {
                    ByteBuffer byteBuffer;
                    int n7;
                    object = this.zzgd;
                    n3 = ((Buffer)object).position();
                    try {
                        n4 = string2.length() * 3;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block5;
                    }
                    catch (zzfi zzfi22) {
                        break block6;
                    }
                    {
                        n4 = zzbn.zzt(n4);
                        n7 = string2.length();
                        n7 = zzbn.zzt(n7);
                        if (n7 != n4) break block7;
                        byteBuffer = this.zzgd;
                        n4 = byteBuffer.position() + n7;
                        ByteBuffer byteBuffer2 = this.zzgd;
                        byteBuffer2.position(n4);
                        this.zzi(string2);
                        byteBuffer2 = this.zzgd;
                        n7 = byteBuffer2.position();
                        ByteBuffer byteBuffer3 = this.zzgd;
                        byteBuffer3.position(n3);
                        n4 = n7 - n4;
                    }
                    this.zzo(n4);
                    byteBuffer = this.zzgd;
                    byteBuffer.position(n7);
                    return;
                }
                n4 = zzff.zza(string2);
                this.zzo(n4);
                this.zzi(string2);
                return;
            }
            object = new zzbn$zzc(illegalArgumentException2);
            throw object;
        }
        this.zzgd.position(n3);
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
        BufferOverflowException bufferOverflowException2;
        Object object;
        while (true) {
            int n4;
            if ((n4 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.zzgd;
                }
                catch (BufferOverflowException bufferOverflowException2) {
                    break;
                }
                n3 = (byte)n3;
                ((ByteBuffer)object).put((byte)n3);
                return;
            }
            object = this.zzgd;
            byte by2 = (byte)(n3 & 0x7F | 0x80);
            {
                ((ByteBuffer)object).put(by2);
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new zzbn$zzc(bufferOverflowException2);
        throw object;
    }

    public final void zzq(int n3) {
        Object object;
        try {
            object = this.zzgd;
        }
        catch (BufferOverflowException bufferOverflowException) {
            object = new zzbn$zzc(bufferOverflowException);
            throw object;
        }
        ((ByteBuffer)object).putInt(n3);
    }
}

