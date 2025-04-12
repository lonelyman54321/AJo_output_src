/*
 * Decompiled with CFR 0.152.
 */
public final class Dr1 {
    public static final LP1 a(LP1 lP1, Er1 er1, Br1 br1, boolean bl2, bp1_0 bp1_02, pg2_0 pg2_02, boolean n3, b30_0 b30_02, int n4) {
        if (n3 == 0) {
            int n7 = -1890658823;
            b30_02.K(n7);
            b30_02.E();
        } else {
            b30$a$a b30$a$a;
            b30_02.K(-1890632411);
            n3 = n4 & 0x70 ^ 0x30;
            int n8 = 32;
            int n10 = 0;
            if (n3 > n8 && (n3 = (int)(b30_02.J(er1) ? 1 : 0)) != 0 || (n3 = n4 & 0x30) == n8) {
                n3 = 1;
            } else {
                n3 = 0;
                b30$a$a = null;
            }
            n8 = n4 & 0x380 ^ 0x180;
            int n14 = 256;
            n8 = n8 > n14 && (n8 = (int)(b30_02.J(br1) ? 1 : 0)) != 0 || (n8 = n4 & 0x180) == n14 ? 1 : 0;
            n3 |= n8;
            n8 = n4 & 0x1C00 ^ 0xC00;
            n14 = 2048;
            n8 = n8 > n14 && (n8 = (int)(b30_02.a(bl2) ? 1 : 0)) != 0 || (n8 = n4 & 0xC00) == n14 ? 1 : 0;
            n3 |= n8;
            n8 = 0xE000 & n4 ^ 0x6000;
            n14 = 16384;
            n8 = n8 > n14 && (n8 = (int)(b30_02.J((Object)bp1_02) ? 1 : 0)) != 0 || (n8 = n4 & 0x6000) == n14 ? 1 : 0;
            n3 |= n8;
            n8 = 0x70000 & n4;
            n14 = 196608;
            int n15 = 131072;
            if ((n8 ^= n14) > n15 && (n8 = (int)(b30_02.J((Object)pg2_02) ? 1 : 0)) != 0 || (n4 &= n14) == n15) {
                n10 = 1;
            }
            Object object = b30_02.v();
            if ((n3 |= n10) != 0 || object == (b30$a$a = b30$a.a)) {
                n14 = bl2 ? 1 : 0;
                object = new cr1_1(er1, br1, bl2, bp1_02, pg2_02);
                b30_02.o(object);
            }
            object = (cr1_1)object;
            lP1 = lP1.then((LP1)object);
            b30_02.E();
        }
        return lP1;
    }
}

