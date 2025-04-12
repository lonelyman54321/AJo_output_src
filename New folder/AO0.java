/*
 * Decompiled with CFR 0.152.
 */
public final class AO0 {
    public static boolean a(Xm2 xm2, EO0 eO0, int n3, AO0$a aO0$a) {
        int n4;
        block10: {
            block6: {
                int n7;
                int n8;
                int n10;
                int n14;
                int n15;
                Object object;
                block7: {
                    long l2;
                    block9: {
                        int n16;
                        EO0 eO02;
                        block8: {
                            int n17;
                            long l3;
                            block5: {
                                object = xm2;
                                eO02 = eO0;
                                n15 = 10;
                                n4 = 1;
                                n14 = xm2.b;
                                l3 = xm2.y();
                                int n18 = 16;
                                long l4 = l3 >>> n18;
                                int n19 = n3;
                                long l7 = n3;
                                int n20 = 0;
                                l2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                                if (l2 != false) {
                                    return false;
                                }
                                l7 = 1L;
                                long l8 = (l4 &= l7) - l7;
                                l2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                n18 = l2 == false ? 1 : 0;
                                n16 = 12;
                                long l12 = l3 >> n16;
                                long l14 = 15;
                                n17 = (int)(l12 &= l14);
                                long l15 = l3 >> 8 & l14;
                                l2 = (int)l15;
                                n20 = (int)(l3 >> 4 & l14);
                                l14 = l3 >> n4;
                                long l16 = 7;
                                int n21 = (int)(l14 &= l16);
                                long l17 = (l3 &= l7) - l7;
                                long l18 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                n10 = l18 == false ? 1 : 0;
                                n8 = 7;
                                if (!(n20 <= n8 ? n20 == (n8 = eO02.g - n4) : n20 <= n15 && (n8 = eO02.g) == (n19 = 2)) || n21 != 0 && n21 != (n8 = eO02.i) || n10 != 0) break block6;
                                try {
                                    l3 = xm2.D();
                                    if (n18 != 0) break block5;
                                }
                                catch (NumberFormatException numberFormatException) {}
                                n18 = eO02.b;
                                l7 = n18;
                                l3 *= l7;
                            }
                            aO0$a.a = l3;
                            n10 = AO0.b(n17, (Xm2)object);
                            n8 = -1;
                            if (n10 == n8 || n10 > (n8 = eO02.b)) break block6;
                            if (l2 == false) break block7;
                            n10 = 11;
                            if (l2 > n10) break block8;
                            n7 = eO02.f;
                            if (l2 != n7) break block6;
                            break block7;
                        }
                        n7 = eO02.e;
                        if (l2 != n16) break block9;
                        n15 = xm2.w() * 1000;
                        if (n15 != n7) break block6;
                        break block7;
                    }
                    n10 = 14;
                    if (l2 > n10) break block6;
                    n8 = xm2.C();
                    if (l2 == n10) {
                        n8 *= 10;
                    }
                    if (n8 != n7) break block6;
                }
                n7 = xm2.w();
                n15 = ((Xm2)object).b;
                object = ((Xm2)object).a;
                n15 -= n4;
                n10 = gz3.a;
                n10 = 0;
                while (n14 < n15) {
                    n8 = object[n14] & 0xFF;
                    n10 ^= n8;
                    int[] nArray = gz3.o;
                    n10 = nArray[n10];
                    n14 += n4;
                }
                if (n7 != n10) break block6;
                break block10;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public static int b(int n3, Xm2 xm2) {
        switch (n3) {
            default: {
                return -1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 256 << (n3 += -8);
            }
            case 7: {
                return xm2.C() + 1;
            }
            case 6: {
                return xm2.w() + 1;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 576 << (n3 += -2);
            }
            case 1: 
        }
        return 192;
    }
}

