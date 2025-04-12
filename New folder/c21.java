/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class c21
implements a93_0 {
    public byte a;
    public final ie2_2 b;
    public final Inflater c;
    public final oh1_2 d;
    public final CRC32 e;

    public c21(a93_0 object) {
        oh1_2 oh1_22;
        ie2_2 ie2_22;
        Intrinsics.checkNotNullParameter(object, "source");
        this.b = ie2_22 = new ie2_2((a93_0)object);
        this.c = object = new Inflater(true);
        this.d = oh1_22 = new oh1_2(ie2_22, (Inflater)object);
        this.e = object = new CRC32();
    }

    public static void a(int n3, int n4, String string2) {
        int n7 = 3;
        if (n4 == n3) {
            return;
        }
        Integer n8 = n4;
        Object object = n3;
        Object[] objectArray = new Object[n7];
        objectArray[0] = string2;
        objectArray[1] = n8;
        objectArray[2] = object;
        object = xh2_0.a(objectArray, n7, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)");
        IOException iOException = new IOException((String)object);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long a0(ce_2 ce_22, long l2) {
        long l3;
        se_1 se_12;
        int n3;
        long l4;
        Object object;
        long l7;
        c21 c212 = this;
        ce_2 ce_23 = ce_22;
        long l8 = l2;
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(ce_22, (String)object2);
        long l12 = 0L;
        long l14 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
        if (l14 < 0) {
            object2 = Wm2.a(l2, "byteCount < 0: ");
            object2 = object2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        if (l14 == false) {
            return l12;
        }
        int n4 = this.a;
        CRC32 cRC32 = this.e;
        int n7 = 1;
        long l15 = -1;
        ie2_2 ie2_22 = this.b;
        if (n4 == 0) {
            long l16;
            long l17;
            boolean bl2;
            ie2_22.f(10);
            se_1 se_13 = ie2_22.b;
            l12 = 3;
            byte by2 = ((ce_2)se_13).n(l12);
            n4 = by2 >> 1 & n7;
            if (n4 == n7) {
                bl2 = true;
            } else {
                n4 = 0;
                object2 = null;
                bl2 = false;
            }
            if (bl2) {
                l7 = 10;
                object = ie2_22.b;
                l4 = 0L;
                object2 = this;
                this.b((ce_2)object, l4, l7);
            }
            n4 = ie2_22.readShort();
            object = "ID1ID2";
            int n8 = 8075;
            c21.a(n8, n4, (String)object);
            l12 = 8;
            ie2_22.skip(l12);
            n4 = by2 >> 2 & n7;
            if (n4 == n7) {
                l12 = 2;
                ie2_22.f(l12);
                if (bl2) {
                    l7 = 2;
                    object = ie2_22.b;
                    l4 = 0L;
                    object2 = this;
                    this.b((ce_2)object, l4, l7);
                }
                n4 = ((ce_2)se_13).G();
                n3 = (char)-1;
                l7 = n4 &= n3;
                ie2_22.f(l7);
                if (bl2) {
                    object = ie2_22.b;
                    l4 = 0L;
                    object2 = this;
                    l17 = l7;
                    this.b((ce_2)object, l4, l7);
                    l12 = l7;
                } else {
                    l12 = l7;
                }
                ie2_22.skip(l12);
            }
            n4 = by2 >> 3 & n7;
            long l18 = 1L;
            if (n4 == n7) {
                l16 = Long.MAX_VALUE;
                object2 = null;
                l17 = 0L;
                se_13 = ie2_22;
                ie2_22 = null;
                long l19 = ((ie2_2)se_13).a((byte)0, l17, l16);
                long l20 = l19 - l15;
                n4 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
                if (n4 == 0) {
                    object2 = new EOFException();
                    throw object2;
                }
                if (bl2) {
                    l17 = l19 + l18;
                    object = ((ie2_2)se_13).b;
                    l4 = 0L;
                    object2 = this;
                    se_12 = se_13;
                    l7 = l17;
                    this.b((ce_2)object, l4, l17);
                } else {
                    se_12 = se_13;
                }
                ((ie2_2)se_12).skip(l19 += l18);
            } else {
                se_12 = ie2_22;
            }
            n4 = by2 >> 4 & n7;
            if (n4 == n7) {
                l16 = Long.MAX_VALUE;
                ie2_22 = null;
                l17 = 0L;
                se_13 = se_12;
                long l21 = ((ie2_2)se_12).a((byte)0, l17, l16);
                long l22 = l21 - (l12 = (long)-1);
                Object object3 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                if (object3 == false) {
                    object2 = new EOFException();
                    throw object2;
                }
                if (bl2) {
                    l7 = l21 + l18;
                    object = ((ie2_2)se_12).b;
                    l4 = 0L;
                    object2 = this;
                    this.b((ce_2)object, l4, l7);
                }
                ((ie2_2)se_12).skip(l21 += l18);
            }
            if (bl2) {
                n4 = ((ie2_2)se_12).d();
                l3 = cRC32.getValue();
                int n10 = (int)l3;
                n3 = (short)n10;
                String string2 = "FHCRC";
                c21.a(n4, n3, string2);
                cRC32.reset();
            }
            c212.a = (byte)n7;
        } else {
            se_12 = ie2_22;
        }
        n4 = c212.a;
        n3 = 2;
        if (n4 == n7) {
            l4 = ce_23.b;
            object2 = c212.d;
            long l23 = (l8 = ((oh1_2)object2).a0(ce_23, l8)) - (l7 = (long)-1);
            n4 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1));
            if (n4 != 0) {
                object2 = this;
                object = ce_22;
                l7 = l8;
                this.b(ce_22, l4, l8);
                return l8;
            }
            c212.a = (byte)n3;
        }
        if ((n4 = c212.a) != n3) return -1;
        n4 = ((ie2_2)se_12).x0();
        int n14 = (int)cRC32.getValue();
        c21.a(n4, n14, "CRC");
        n4 = ((ie2_2)se_12).x0();
        l3 = c212.c.getBytesWritten();
        int n15 = (int)l3;
        object = "ISIZE";
        c21.a(n4, n15, (String)object);
        c212.a = (byte)3;
        n4 = (int)(((ie2_2)se_12).g() ? 1 : 0);
        if (n4 != 0) return -1;
        object2 = new IOException("gzip finished without exhausting source");
        throw object2;
    }

    public final void b(ce_2 object, long l2, long l3) {
        long l4;
        long l7;
        int n3;
        int n4;
        int n7;
        long l8;
        long l12;
        long l14;
        object = ((ce_2)object).a;
        Intrinsics.checkNotNull(object);
        while ((l14 = (l12 = l2 - (l8 = (long)(n7 = (n4 = ((vx2_2)object).c) - (n3 = ((vx2_2)object).b)))) == 0L ? 0 : (l12 < 0L ? -1 : 1)) >= 0) {
            l7 = n4 -= n3;
            l2 -= l7;
            object = ((vx2_2)object).f;
            Intrinsics.checkNotNull(object);
        }
        while ((n7 = (int)((l4 = l3 - (l7 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) > 0) {
            n7 = ((vx2_2)object).b;
            int n8 = (int)((long)n7 + l2);
            l8 = Math.min((long)(((vx2_2)object).c - n8), l3);
            int n10 = (int)l8;
            CRC32 cRC32 = this.e;
            byte[] byArray = ((vx2_2)object).a;
            cRC32.update(byArray, n8, n10);
            l2 = n10;
            l3 -= l2;
            object = ((vx2_2)object).f;
            Intrinsics.checkNotNull(object);
            l2 = l7;
        }
    }

    public final void close() {
        this.d.close();
    }

    public final a timeout() {
        return this.b.a.timeout();
    }
}

