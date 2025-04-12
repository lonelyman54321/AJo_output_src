/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaep;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgec;
import com.google.android.gms.internal.ads.zzin;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class zzsg {
    private static final byte[] zza;
    private static final byte[] zzb;
    private ByteBuffer zzc;
    private int zzd;
    private int zze;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[47];
        byte[] byArray3 = byArray;
        byArray2[0] = 79;
        byArray3[1] = 103;
        byArray2[2] = 103;
        byArray3[3] = 83;
        byArray2[4] = 0;
        byArray3[5] = 2;
        byArray2[6] = 0;
        byArray3[7] = 0;
        byArray2[8] = 0;
        byArray3[9] = 0;
        byArray2[10] = 0;
        byArray3[11] = 0;
        byArray2[12] = 0;
        byArray3[13] = 0;
        byArray2[14] = 0;
        byArray3[15] = 0;
        byArray2[16] = 0;
        byArray3[17] = 0;
        byArray2[18] = 0;
        byArray3[19] = 0;
        byArray2[20] = 0;
        byArray3[21] = 0;
        byArray2[22] = 28;
        byArray3[23] = -43;
        byArray2[24] = -59;
        byArray3[25] = -9;
        byArray2[26] = 1;
        byArray3[27] = 19;
        byArray2[28] = 79;
        byArray3[29] = 112;
        byArray2[30] = 117;
        byArray3[31] = 115;
        byArray2[32] = 72;
        byArray3[33] = 101;
        byArray2[34] = 97;
        byArray3[35] = 100;
        byArray2[36] = 1;
        byArray3[37] = 2;
        byArray2[38] = 56;
        byArray3[39] = 1;
        byArray2[40] = -128;
        byArray3[41] = -69;
        byArray2[42] = 0;
        byArray3[43] = 0;
        byArray2[44] = 0;
        byArray3[45] = 0;
        byArray3[46] = 0;
        zza = byArray;
        byte[] byArray4 = byArray = new byte[44];
        byte[] byArray5 = byArray;
        byArray4[0] = 79;
        byArray5[1] = 103;
        byArray4[2] = 103;
        byArray5[3] = 83;
        byArray4[4] = 0;
        byArray5[5] = 0;
        byArray4[6] = 0;
        byArray5[7] = 0;
        byArray4[8] = 0;
        byArray5[9] = 0;
        byArray4[10] = 0;
        byArray5[11] = 0;
        byArray4[12] = 0;
        byArray5[13] = 0;
        byArray4[14] = 0;
        byArray5[15] = 0;
        byArray4[16] = 0;
        byArray5[17] = 0;
        byArray4[18] = 1;
        byArray5[19] = 0;
        byArray4[20] = 0;
        byArray5[21] = 0;
        byArray4[22] = 11;
        byArray5[23] = -103;
        byArray4[24] = 87;
        byArray5[25] = 83;
        byArray4[26] = 1;
        byArray5[27] = 16;
        byArray4[28] = 79;
        byArray5[29] = 112;
        byArray4[30] = 117;
        byArray5[31] = 115;
        byArray4[32] = 84;
        byArray5[33] = 97;
        byArray4[34] = 103;
        byArray5[35] = 115;
        byArray4[36] = 0;
        byArray5[37] = 0;
        byArray4[38] = 0;
        byArray5[39] = 0;
        byArray4[40] = 0;
        byArray5[41] = 0;
        byArray4[42] = 0;
        byArray5[43] = 0;
        zzb = byArray;
    }

    public zzsg() {
        ByteBuffer byteBuffer;
        this.zzc = byteBuffer = zzdz.zza;
        this.zze = 0;
        this.zzd = 2;
    }

    private static final void zzc(ByteBuffer byteBuffer, long l2, int n3, int n4, boolean n7) {
        byteBuffer.put((byte)79);
        byte by2 = 103;
        byteBuffer.put(by2);
        byteBuffer.put(by2);
        byteBuffer.put((byte)83);
        by2 = 0;
        byteBuffer.put((byte)0);
        int n8 = 1;
        n7 = n8 != n7 ? 0 : 2;
        byteBuffer.put((byte)n7);
        byteBuffer.putLong(l2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n3);
        byteBuffer.putInt(0);
        byte by4 = zzgec.zza(n4);
        byteBuffer.put(by4);
    }

    public final void zza(zzin zzin2, List list) {
        int n3;
        ByteBuffer byteBuffer;
        int n4;
        int n7;
        zzsg zzsg2 = this;
        zzin zzin3 = zzin2;
        Object object = zzin2.zzc;
        object.getClass();
        int n8 = ((Buffer)object).limit();
        Object object2 = zzin2.zzc;
        int n10 = ((Buffer)object2).position();
        if ((n8 -= n10) == 0) {
            return;
        }
        n8 = this.zzd;
        n10 = 0;
        object2 = null;
        int n14 = 1;
        int n15 = 2;
        if (n8 == n15 && ((n8 = list.size()) == n14 || (n8 = list.size()) == (n7 = 3))) {
            object = list;
            object2 = object = list.get(0);
            object2 = (byte[])object;
        }
        object = zzin3.zzc;
        n7 = ((Buffer)object).position();
        int n16 = ((Buffer)object).limit();
        int n17 = n16 - n7;
        int n18 = zzsg2.zzd;
        int n19 = n17 + 255;
        int n20 = 255;
        int n21 = (n19 /= n20) + 27 + n17;
        if (n18 == n15) {
            n18 = object2 != null ? ((Object)object2).length + 28 : 47;
            n4 = n18 + 44;
            n21 += n4;
        } else {
            n18 = 0;
        }
        Object object3 = zzsg2.zzc;
        n4 = ((Buffer)object3).capacity();
        if (n4 < n21) {
            byteBuffer = ByteBuffer.allocate(n21);
            object3 = ByteOrder.LITTLE_ENDIAN;
            zzsg2.zzc = byteBuffer = byteBuffer.order((ByteOrder)object3);
        } else {
            byteBuffer = zzsg2.zzc;
            byteBuffer.clear();
        }
        byteBuffer = zzsg2.zzc;
        n4 = zzsg2.zzd;
        if (n4 == n15) {
            if (object2 != null) {
                n3 = 1;
                boolean bl2 = true;
                long l2 = 0L;
                object3 = byteBuffer;
                zzsg.zzc(byteBuffer, l2, 0, n3, bl2);
                n4 = ((Object)object2).length;
                long l3 = n4;
                n14 = zzgec.zza(l3);
                byteBuffer.put((byte)n14);
                byteBuffer.put((byte[])object2);
                object2 = byteBuffer.array();
                n14 = byteBuffer.arrayOffset();
                n10 = zzgd.zze((byte[])object2, n14, n4 += 28, 0);
                n14 = 22;
                byteBuffer.putInt(n14, n10);
                byteBuffer.position(n4);
            } else {
                object2 = zza;
                byteBuffer.put((byte[])object2);
            }
            object2 = zzb;
            byteBuffer.put((byte[])object2);
        }
        n10 = zzaep.zzc((ByteBuffer)object);
        zzsg2.zze = n14 = zzsg2.zze + n10;
        n10 = zzsg2.zzd;
        long l4 = n14;
        n3 = 0;
        ByteBuffer byteBuffer2 = byteBuffer;
        zzsg.zzc(byteBuffer, l4, n10, n19, false);
        object2 = null;
        for (n10 = 0; n10 < n19; ++n10) {
            if (n17 >= n20) {
                n15 = -1;
                byteBuffer2.put((byte)n15);
                n17 += -255;
                continue;
            }
            n15 = (byte)n17;
            byteBuffer2.put((byte)n15);
            n17 = 0;
        }
        while (n7 < n16) {
            n10 = ((ByteBuffer)object).get(n7);
            byteBuffer2.put((byte)n10);
            ++n7;
        }
        n10 = ((Buffer)object).limit();
        ((ByteBuffer)object).position(n10);
        byteBuffer2.flip();
        n8 = zzsg2.zzd;
        n10 = 2;
        if (n8 == n10) {
            object = byteBuffer2.array();
            n10 = byteBuffer2.arrayOffset() + n18 + 44;
            n15 = byteBuffer2.limit();
            n7 = byteBuffer2.position();
            n8 = zzgd.zze((byte[])object, n10, n15 -= n7, 0);
            byteBuffer2.putInt(n18 += 66, n8);
        } else {
            object = byteBuffer2.array();
            n10 = byteBuffer2.arrayOffset();
            n15 = byteBuffer2.limit();
            n7 = byteBuffer2.position();
            n8 = zzgd.zze((byte[])object, n10, n15 -= n7, 0);
            n10 = 22;
            byteBuffer2.putInt(n10, n8);
        }
        zzsg2.zzd = n8 = zzsg2.zzd + 1;
        zzsg2.zzc = byteBuffer2;
        zzin2.zzb();
        n8 = zzsg2.zzc.remaining();
        zzin3.zzi(n8);
        object = zzin3.zzc;
        object2 = zzsg2.zzc;
        ((ByteBuffer)object).put((ByteBuffer)object2);
        zzin2.zzj();
    }

    public final void zzb() {
        ByteBuffer byteBuffer;
        this.zzc = byteBuffer = zzdz.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}

