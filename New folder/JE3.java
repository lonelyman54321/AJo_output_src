/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

public final class JE3
extends zd3_0 {
    public JE3$a n;
    public int o;
    public boolean p;
    public KE3$c q;
    public KE3$a r;

    public final void a(long l2) {
        KE3$c kE3$c;
        boolean bl2;
        this.g = l2;
        long l3 = 0L;
        int n3 = 0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            kE3$c = null;
        }
        this.p = bl2;
        kE3$c = this.q;
        if (kE3$c != null) {
            n3 = kE3$c.e;
        }
        this.o = n3;
    }

    public final long b(Xm2 xm2) {
        Object object = xm2.a;
        int n3 = 0;
        int n4 = object[0];
        int n7 = n4 & 1;
        int n8 = 1;
        if (n7 == n8) {
            return -1;
        }
        Object object2 = this.n;
        ct3.h(object2);
        n4 >>= n8;
        int n10 = ((JE3$a)object2).e;
        int n14 = 8;
        n10 = 8 - n10;
        int n15 = 255;
        n10 = n15 >>> n10;
        Object[] objectArray = ((JE3$a)object2).d;
        object = objectArray[n4 &= n10];
        n4 = (int)(object.a ? 1 : 0);
        object2 = ((JE3$a)object2).a;
        n4 = n4 == 0 ? ((KE3$c)object2).e : ((KE3$c)object2).f;
        n7 = (int)(this.p ? 1 : 0);
        if (n7 != 0) {
            n3 = (this.o + n4) / 4;
        }
        long l2 = n3;
        objectArray = xm2.a;
        n15 = objectArray.length;
        int n16 = xm2.c + 4;
        if (n15 < n16) {
            objectArray = Arrays.copyOf((byte[])objectArray, n16);
            n15 = objectArray.length;
            xm2.G(n15, (byte[])objectArray);
        } else {
            xm2.H(n16);
        }
        objectArray = xm2.a;
        int n17 = xm2.c;
        n15 = n17 + -4;
        long l3 = 255L;
        byte by2 = (byte)(l2 & l3);
        objectArray[n15] = (KE3$b)by2;
        n15 = n17 + -3;
        n14 = (byte)(l2 >>> n14 & l3);
        objectArray[n15] = (KE3$b)n14;
        n14 = n17 + -2;
        n15 = (byte)(l2 >>> 16 & l3);
        objectArray[n14] = (KE3$b)n15;
        n14 = (byte)(l2 >>> 24 & l3);
        objectArray[n17 -= n8] = (KE3$b)n14;
        this.p = n8;
        this.o = n4;
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(Xm2 xm2, long l2, Zd3$a zd3$a) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        Object object5;
        int n7;
        Object object6;
        block50: {
            boolean bl2;
            int n8;
            int n10;
            KE3$b[] kE3$bArray;
            int n14;
            block49: {
                block48: {
                    block47: {
                        JE3 jE3 = this;
                        object6 = xm2;
                        Zd3$a zd3$a2 = zd3$a;
                        JE3$a jE3$a = this.n;
                        n7 = 0;
                        object5 = null;
                        if (jE3$a != null) {
                            zd3$a.a.getClass();
                            return false;
                        }
                        object4 = this.q;
                        n4 = 1;
                        n14 = 4;
                        if (object4 != null) break block47;
                        KE3.d(n4, xm2, false);
                        xm2.o();
                        int n15 = xm2.w();
                        int n16 = xm2.o();
                        n7 = xm2.k();
                        int n17 = n7 <= 0 ? -1 : n7;
                        n7 = xm2.k();
                        int n18 = n7 <= 0 ? -1 : n7;
                        xm2.k();
                        n7 = xm2.w();
                        double d2 = n7 & 0xF;
                        long l3 = 0x4000000000000000L;
                        double d5 = 2.0;
                        d2 = Math.pow(d5, d2);
                        int n19 = (int)d2;
                        n7 = (n7 & 0xF0) >> n14;
                        double d7 = n7;
                        d7 = Math.pow(d5, d7);
                        int n20 = (int)d7;
                        xm2.w();
                        object5 = ((Xm2)object6).a;
                        int n21 = ((Xm2)object6).c;
                        byte[] byArray = Arrays.copyOf((byte[])object5, n21);
                        Object object7 = object6;
                        int n22 = n19;
                        jE3.q = object6 = new KE3$c(n15, n16, n17, n18, n19, n20, byArray);
                        break block48;
                    }
                    kE3$bArray = this.r;
                    if (kE3$bArray != null) break block49;
                    this.r = object6 = KE3.c(xm2, n4 != 0, n4 != 0);
                }
                boolean bl3 = false;
                object3 = null;
                break block50;
            }
            int n24 = xm2.c;
            byte[] byArray = new byte[n24];
            byte[] byArray2 = xm2.a;
            System.arraycopy(byArray2, 0, byArray, 0, n24);
            n24 = 5;
            KE3.d(n24, xm2, false);
            int n25 = xm2.w() + n4;
            byte[] byArray3 = xm2.a;
            IE3 iE3 = new IE3(byArray3);
            int n26 = xm2.b;
            int n27 = 8;
            iE3.c(n26 *= 8);
            n26 = 0;
            object6 = null;
            while (true) {
                block54: {
                    block53: {
                        block51: {
                            block52: {
                                n10 = 24;
                                n7 = 2;
                                n3 = 16;
                                if (n26 >= n25) break block51;
                                n27 = iE3.b(n10);
                                if (n27 != (n8 = 5653314)) {
                                    object6 = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                                    int n28 = iE3.c * 8;
                                    n4 = iE3.d;
                                    ((StringBuilder)object6).append(n28 += n4);
                                    throw ParserException.a(((StringBuilder)object6).toString(), null);
                                }
                                n3 = iE3.b(n3);
                                n8 = iE3.b(n10);
                                n27 = (int)(iE3.a() ? 1 : 0);
                                if (n27 != 0) break block52;
                                n27 = (int)(iE3.a() ? 1 : 0);
                                break block53;
                            }
                            iE3.c(n24);
                            Object var37_43 = null;
                            for (n27 = 0; n27 < n8; n27 += n10) {
                                n10 = KE3.a(n8 - n27);
                                n10 = iE3.b(n10);
                            }
                            break block54;
                        }
                        n26 = 6;
                        n8 = iE3.b(n26) + n4;
                        byArray2 = null;
                        for (n25 = 0; n25 < n8; ++n25) {
                            n27 = iE3.b(n3);
                            if (n27 == 0) continue;
                            throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                        }
                        break;
                    }
                    for (n10 = 0; n10 < n8; ++n10) {
                        if (n27 != 0) {
                            bl2 = iE3.a();
                            if (!bl2) continue;
                            iE3.c(n24);
                            continue;
                        }
                        iE3.c(n24);
                    }
                }
                if ((n27 = iE3.b(n14)) > n7) {
                    object6 = new StringBuilder("lookup type greater than 2 not decodable: ");
                    ((StringBuilder)object6).append(n27);
                    throw ParserException.a(((StringBuilder)object6).toString(), null);
                }
                if (n27 == n4 || n27 == n7) {
                    long l4;
                    long l7;
                    n7 = 32;
                    iE3.c(n7);
                    iE3.c(n7);
                    n7 = iE3.b(n14) + n4;
                    iE3.c(n4);
                    if (n27 == n4) {
                        double d9;
                        if (n3 != 0) {
                            l7 = n8;
                            l4 = n3;
                            double d12 = l7;
                            double d13 = 1.0;
                            d9 = l4;
                            d9 = d13 / d9;
                            d9 = Math.floor(Math.pow(d12, d9));
                            l4 = (long)d9;
                        } else {
                            l4 = 0L;
                            d9 = 0.0;
                        }
                    } else {
                        l7 = n8;
                        l4 = (long)n3 * l7;
                    }
                    l7 = n7;
                    n7 = (int)(l4 *= l7);
                    iE3.c(n7);
                }
                ++n26;
                n7 = 0;
                object5 = null;
                n27 = 8;
            }
            n8 = iE3.b(n26) + n4;
            n25 = 0;
            byArray2 = null;
            while (true) {
                n27 = 3;
                if (n25 >= n8) break;
                n10 = iE3.b(n3);
                if (n10 == 0) {
                    n26 = 8;
                    iE3.c(n26);
                    n7 = 16;
                    iE3.c(n7);
                    iE3.c(n7);
                    iE3.c(6);
                    iE3.c(n26);
                    n14 = iE3.b(4) + n4;
                    object5 = null;
                    for (n7 = 0; n7 < n14; ++n7) {
                        iE3.c(n26);
                        n26 = 8;
                    }
                } else {
                    Object object8;
                    if (n10 != n4) {
                        object6 = new StringBuilder("floor type greater than 1 not decodable: ");
                        ((StringBuilder)object6).append(n10);
                        throw ParserException.a(((StringBuilder)object6).toString(), null);
                    }
                    n10 = iE3.b(n24);
                    int[] nArray = new int[n10];
                    object6 = null;
                    n3 = -1;
                    for (n26 = 0; n26 < n10; ++n26) {
                        nArray[n26] = n7 = iE3.b(n14);
                        if (n7 > n3) {
                            n3 = n7;
                        }
                        n7 = 2;
                    }
                    object6 = new int[++n3];
                    object5 = null;
                    for (n7 = 0; n7 < n3; ++n7) {
                        object8 = iE3.b(n27) + 1;
                        object6[n7] = object8;
                        int n29 = iE3.b(2);
                        n27 = 8;
                        if (n29 > 0) {
                            iE3.c(n27);
                        }
                        int n30 = n3;
                        object2 = null;
                        for (n14 = 0; n14 < (n3 = n4 << n29); ++n14) {
                            iE3.c(n27);
                            n27 = 8;
                        }
                        n3 = n30;
                        n14 = 4;
                        n27 = 3;
                    }
                    iE3.c(2);
                    n14 = iE3.b(4);
                    object5 = null;
                    n3 = 0;
                    object = null;
                    n27 = 0;
                    Object var37_45 = null;
                    for (n7 = 0; n7 < n10; ++n7) {
                        Object object8 = nArray[n7];
                        object8 = object6[object8];
                        n3 += object8;
                        while (n27 < n3) {
                            iE3.c(n14);
                            ++n27;
                        }
                    }
                }
                ++n25;
                n26 = 6;
                n7 = 2;
                n14 = 4;
                n3 = 16;
                n24 = 5;
                n10 = 24;
            }
            n7 = iE3.b(n26) + n4;
            n14 = 0;
            object2 = null;
            while (true) {
                int n32;
                int[] nArray;
                if (n14 < n7) {
                    n8 = iE3.b(16);
                    if (n8 > (n3 = 2)) {
                        throw ParserException.a("residueType greater than 2 is not decodable", null);
                    }
                    n3 = 24;
                    iE3.c(n3);
                    iE3.c(n3);
                    iE3.c(n3);
                    n8 = iE3.b(n26) + n4;
                    n26 = 8;
                    iE3.c(n26);
                    nArray = new int[n8];
                    byArray2 = null;
                } else {
                    n7 = iE3.b(n26) + n4;
                    object6 = null;
                    break;
                }
                for (n25 = 0; n25 < n8; ++n25) {
                    n27 = 3;
                    n10 = iE3.b(n27);
                    bl2 = iE3.a();
                    n3 = 5;
                    n32 = bl2 ? iE3.b(n3) : 0;
                    nArray[n25] = n32 = n32 * 8 + n10;
                    n3 = 24;
                }
                n3 = 5;
                n27 = 3;
                byArray2 = null;
                for (n25 = 0; n25 < n8; ++n25) {
                    for (n10 = 0; n10 < n26; ++n10) {
                        n32 = nArray[n25];
                        int n34 = n4 << n10;
                        if ((n32 &= n34) != 0) {
                            iE3.c(n26);
                        }
                        n26 = 8;
                    }
                    n26 = 8;
                }
                ++n14;
                n26 = 6;
            }
            for (n26 = 0; n26 < n7; ++n26) {
                n14 = 16;
                n3 = iE3.b(n14);
                if (n3 != 0) {
                    object2 = new StringBuilder;
                    object3 = "mapping type other than 0 not supported: ";
                    ((StringBuilder)object2)((String)object3);
                    ((StringBuilder)object2).append(n3);
                    object2 = ((StringBuilder)object2).toString();
                    Cx.c((String)object2);
                    n14 = 2;
                    n25 = 4;
                    continue;
                }
                n14 = (int)(iE3.a() ? 1 : 0);
                if (n14 != 0) {
                    n14 = 4;
                    n3 = iE3.b(n14) + n4;
                } else {
                    n3 = 1;
                }
                n14 = (int)(iE3.a() ? 1 : 0);
                n8 = ((KE3$c)object4).a;
                if (n14 != 0) {
                    n24 = iE3.b(8) + n4;
                    object2 = null;
                    for (n14 = 0; n14 < n24; ++n14) {
                        n25 = n8 + -1;
                        n27 = KE3.a(n25);
                        iE3.c(n27);
                        n25 = KE3.a(n25);
                        iE3.c(n25);
                    }
                }
                if ((n24 = iE3.b(n14 = 2)) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (n3 > n4) {
                    Object var47_58 = null;
                    for (n24 = 0; n24 < n8; ++n24) {
                        n25 = 4;
                        iE3.c(n25);
                    }
                }
                n25 = 4;
                object3 = null;
                for (n8 = 0; n8 < n3; ++n8) {
                    n24 = 8;
                    iE3.c(n24);
                    iE3.c(n24);
                    iE3.c(n24);
                }
            }
            n26 = iE3.b(6);
            n7 = n26 + 1;
            KE3$b[] kE3$bArray2 = new KE3$b[n7];
            object2 = null;
            for (n14 = 0; n14 < n7; ++n14) {
                KE3$b kE3$b;
                n3 = (int)(iE3.a() ? 1 : 0);
                n8 = 16;
                iE3.b(n8);
                iE3.b(n8);
                n25 = 8;
                iE3.b(n25);
                kE3$bArray2[n14] = kE3$b = new KE3$b(n3 != 0);
            }
            n7 = (int)(iE3.a() ? 1 : 0);
            if (n7 == 0) {
                throw ParserException.a("framing bit after modes not set as expected", null);
            }
            n26 = KE3.a(n26);
            object2 = object5;
            object = kE3$bArray;
            object3 = byArray;
            kE3$bArray = kE3$bArray2;
            n24 = n26;
            object3 = object5 = new JE3$a((KE3$c)object4, (KE3$a)object, byArray, kE3$bArray2, n26);
        }
        jE3.n = object3;
        if (object3 == null) {
            return n4 != 0;
        }
        object6 = new ArrayList();
        object5 = ((JE3$a)object3).a;
        object2 = ((KE3$c)object5).g;
        ((ArrayList)object6).add(object2);
        object2 = ((JE3$a)object3).c;
        ((ArrayList)object6).add(object2);
        object2 = KE3.b(ImmutableList.copyOf(((JE3$a)object3).b.a));
        object4 = new d$a();
        object = ip1_0.l("audio/vorbis");
        ((d$a)object4).n = object;
        ((d$a)object4).h = n3 = ((KE3$c)object5).d;
        ((d$a)object4).i = n3 = ((KE3$c)object5).c;
        ((d$a)object4).C = n3 = ((KE3$c)object5).a;
        ((d$a)object4).D = n7 = ((KE3$c)object5).b;
        ((d$a)object4).q = object6;
        ((d$a)object4).k = object2;
        zd3$a2.a = object6 = new d((d$a)object4);
        return n4 != 0;
    }

    public final void d(boolean bl2) {
        super.d(bl2);
        if (bl2) {
            bl2 = false;
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}

