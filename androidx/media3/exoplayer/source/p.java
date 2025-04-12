/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 */
package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.p$a;
import androidx.media3.exoplayer.source.q$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class p {
    public final Cj0 a;
    public final int b;
    public final Xm2 c;
    public p$a d;
    public p$a e;
    public p$a f;
    public long g;

    public p(Cj0 cj0) {
        int n3;
        this.a = cj0;
        this.b = n3 = cj0.b;
        Object object = new Xm2(32);
        this.c = object;
        this.d = object = new p$a(0L, n3);
        this.e = object;
        this.f = object;
    }

    public static p$a c(p$a p$a, long l2, ByteBuffer byteBuffer, int n3) {
        long l3;
        long l4;
        Object object;
        while ((object = (l4 = l2 - (l3 = p$a.b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
            p$a = p$a.d;
        }
        while (n3 > 0) {
            int n4 = (int)(p$a.b - l2);
            int n7 = Math.min(n3, n4);
            ae_0 ae_02 = p$a.c;
            byte[] byArray = ae_02.a;
            long l7 = p$a.a;
            l7 = l2 - l7;
            int n8 = (int)l7;
            n4 = ae_02.b;
            byteBuffer.put(byArray, n8 += n4, n7);
            n3 -= n7;
            l3 = n7;
            long l8 = (l2 += l3) - (l3 = p$a.b);
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) continue;
            p$a = p$a.d;
        }
        return p$a;
    }

    public static p$a d(p$a p$a, long l2, byte[] byArray, int n3) {
        int n4;
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = l2 - (l3 = p$a.b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
            p$a = p$a.d;
        }
        for (int i3 = n3; i3 > 0; i3 -= n4) {
            l7 = (int)(p$a.b - l2);
            n4 = Math.min(i3, (int)l7);
            ae_0 ae_02 = p$a.c;
            byte[] byArray2 = ae_02.a;
            long l8 = p$a.a;
            l8 = l2 - l8;
            int n7 = (int)l8;
            l7 = ae_02.b;
            n7 += l7;
            l7 = n3 - i3;
            System.arraycopy(byArray2, n7, byArray, (int)l7, n4);
            long l12 = n4;
            long l14 = (l2 += l12) - (l12 = p$a.b);
            Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object != false) continue;
            p$a = p$a.d;
        }
        return p$a;
    }

    public static p$a e(p$a p$a, DecoderInputBuffer object, q$a q$a, Xm2 object2) {
        long l2;
        Object object3;
        long l3;
        int n3 = 1;
        boolean n4 = ((fE)object).f(0x40000000);
        if (n4) {
            int n7;
            int n8;
            int n10;
            int[] nArray;
            int n14;
            byte[] byArray;
            l3 = q$a.b;
            ((Xm2)object2).F(n3);
            object3 = ((Xm2)object2).a;
            p$a = p.d(p$a, l3, (byte[])object3, n3);
            l2 = 1L;
            l3 += l2;
            object3 = ((Xm2)object2).a;
            int n15 = 0;
            Object object4 = null;
            int n16 = object3[0];
            int n17 = n16 & 0x80;
            if (n17 != 0) {
                n17 = 1;
            } else {
                n17 = 0;
                byArray = null;
            }
            n16 &= 0x7F;
            Fe0 fe0 = ((DecoderInputBuffer)object).c;
            Object[] objectArray = fe0.a;
            if (objectArray == null) {
                int n18 = 16;
                fe0.a = objectArray = new byte[n18];
            } else {
                Arrays.fill(objectArray, (byte)0);
            }
            objectArray = fe0.a;
            p$a = p.d(p$a, l3, objectArray, n16);
            long l4 = n16;
            l3 += l4;
            if (n17 != 0) {
                n16 = 2;
                ((Xm2)object2).F(n16);
                objectArray = ((Xm2)object2).a;
                p$a = p.d(p$a, l3, objectArray, n16);
                l4 = 2;
                l3 += l4;
                n16 = ((Xm2)object2).C();
            } else {
                n16 = 1;
            }
            objectArray = fe0.d;
            if (objectArray == null || (n14 = objectArray.length) < n16) {
                objectArray = new int[n16];
            }
            if ((nArray = fe0.e) == null || (n10 = nArray.length) < n16) {
                nArray = new int[n16];
            }
            if (n17 != 0) {
                n17 = n16 * 6;
                ((Xm2)object2).F(n17);
                byte[] byArray2 = ((Xm2)object2).a;
                p$a = p.d(p$a, l3, byArray2, n17);
                long l7 = n17;
                l3 += l7;
                ((Xm2)object2).I(0);
                while (n15 < n16) {
                    objectArray[n15] = n17 = ((Xm2)object2).C();
                    nArray[n15] = n17 = ((Xm2)object2).A();
                    n15 += n3;
                }
            } else {
                objectArray[0] = 0;
                n3 = q$a.a;
                long l8 = q$a.b;
                l8 = l3 - l8;
                n17 = (int)l8;
                nArray[0] = n3 -= n17;
            }
            wp3$a wp3$a = q$a.c;
            n15 = gz3.a;
            object4 = wp3$a.b;
            byArray = fe0.a;
            fe0.f = n16;
            fe0.d = objectArray;
            fe0.e = nArray;
            fe0.b = object4;
            fe0.a = byArray;
            fe0.c = n10 = wp3$a.a;
            fe0.g = n8 = wp3$a.c;
            fe0.h = n3 = wp3$a.d;
            MediaCodec.CryptoInfo cryptoInfo = fe0.i;
            cryptoInfo.numSubSamples = n16;
            cryptoInfo.numBytesOfClearData = objectArray;
            cryptoInfo.numBytesOfEncryptedData = nArray;
            cryptoInfo.key = object4;
            cryptoInfo.iv = byArray;
            cryptoInfo.mode = n10;
            n16 = gz3.a;
            n15 = 24;
            if (n16 >= n15) {
                object3 = fe0.j;
                object3.getClass();
                object4 = ((Fe0$a)object3).b;
                de0_0.a((MediaCodec.CryptoInfo.Pattern)object4, n8, n3);
                wp3$a = ((Fe0$a)object3).a;
                object3 = ((Fe0$a)object3).b;
                Ee0.a((MediaCodec.CryptoInfo)wp3$a, (MediaCodec.CryptoInfo.Pattern)object3);
            }
            l2 = q$a.b;
            n3 = (int)(l3 - l2);
            l3 = n3;
            q$a.b = l2 += l3;
            q$a.a = n7 = q$a.a - n3;
        }
        if ((n3 = ((fE)object).f(0x10000000)) != 0) {
            int n19;
            n3 = 4;
            ((Xm2)object2).F(n3);
            l3 = q$a.b;
            object3 = ((Xm2)object2).a;
            p$a = p.d(p$a, l3, (byte[])object3, n3);
            int n20 = ((Xm2)object2).A();
            l3 = q$a.b;
            l2 = 4;
            q$a.b = l3 += l2;
            q$a.a = n19 = q$a.a - n3;
            ((DecoderInputBuffer)object).i(n20);
            long l12 = q$a.b;
            ByteBuffer byteBuffer = ((DecoderInputBuffer)object).d;
            p$a = p.c(p$a, l12, byteBuffer, n20);
            l12 = q$a.b;
            long l14 = n20;
            q$a.b = l12 += l14;
            q$a.a = n3 = q$a.a - n20;
            object2 = ((DecoderInputBuffer)object).g;
            if (object2 != null && (n20 = ((Buffer)object2).capacity()) >= n3) {
                object2 = ((DecoderInputBuffer)object).g;
                ((ByteBuffer)object2).clear();
            } else {
                ((DecoderInputBuffer)object).g = object2 = ByteBuffer.allocate(n3);
            }
            l12 = q$a.b;
            object = ((DecoderInputBuffer)object).g;
            int n21 = q$a.a;
            p$a = p.c(p$a, l12, (ByteBuffer)object, n21);
        } else {
            int n22 = q$a.a;
            ((DecoderInputBuffer)object).i(n22);
            long l15 = q$a.b;
            object = ((DecoderInputBuffer)object).d;
            int n24 = q$a.a;
            p$a = p.c(p$a, l15, (ByteBuffer)object, n24);
        }
        return p$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2) {
        Object object;
        long l3;
        Object object2;
        long l4 = -1;
        long l7 = l2 - l4;
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 == false) {
            return;
        }
        while (true) {
            Object object4;
            object2 = this.d;
            l3 = ((p$a)object2).b;
            long l8 = l2 - l3;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object < 0) break;
            Cj0 cj0 = this.a;
            object2 = ((p$a)object2).c;
            synchronized (cj0) {
                int n3;
                object4 = cj0.f;
                object = cj0.e;
                long l12 = object + true;
                cj0.e = (int)l12;
                object4[object] = object2;
                cj0.d = n3 = cj0.d + -1;
                cj0.notifyAll();
            }
            object2 = this.d;
            cj0 = null;
            ((p$a)object2).c = null;
            object4 = ((p$a)object2).d;
            ((p$a)object2).d = null;
            this.d = object4;
        }
        p$a p$a = this.e;
        l2 = p$a.a;
        l3 = ((p$a)object2).a;
        long l14 = l2 - l3;
        object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object < 0) {
            this.e = object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int b(int n3) {
        p$a p$a = this.f;
        Object object = p$a.c;
        if (object == null) {
            int n4;
            Object object2;
            Object object3;
            block8: {
                int n7;
                object = this.a;
                // MONITORENTER : object
                ((Cj0)object).d = n7 = ((Cj0)object).d + 1;
                int n8 = ((Cj0)object).e;
                if (n8 > 0) {
                    object3 = ((Cj0)object).f;
                    ((Cj0)object).e = n8 += -1;
                    object3 = object3[n8];
                    object3.getClass();
                    object2 = ((Cj0)object).f;
                    int n10 = ((Cj0)object).e;
                    n4 = 0;
                    object2[n10] = null;
                    break block8;
                }
                int n14 = ((Cj0)object).b;
                Object[] objectArray = new byte[n14];
                n4 = 0;
                object2 = new ae_0((byte[])objectArray, 0);
                objectArray = ((Cj0)object).f;
                n4 = objectArray.length;
                if (n7 > n4) {
                    n7 = objectArray.length * 2;
                    ((Cj0)object).f = object3 = (Object)Arrays.copyOf(objectArray, n7);
                }
                object3 = object2;
            }
            // MONITOREXIT : object
            object2 = this.f;
            long l2 = object2.b;
            n4 = this.b;
            object = new p$a(l2, n4);
            p$a.c = object3;
            p$a.d = object;
        }
        long l3 = this.f.b;
        long l4 = this.g;
        int n15 = (int)(l3 - l4);
        return Math.min(n3, n15);
    }
}

