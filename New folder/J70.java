/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.primitives.ImmutableIntArray;

public final class J70 {
    public static final J70 a;
    public static final int[] b;

    static {
        Object object = new Object();
        a = object;
        Object object2 = object = (Object)new int[29];
        object2[0] = 1769172845;
        object2[1] = 1769172786;
        object2[2] = 1769172787;
        object2[3] = 1769172788;
        object2[4] = 1769172789;
        object2[5] = 1769172790;
        object2[6] = 1769172793;
        object2[7] = 1635148593;
        object2[8] = 1752589105;
        object2[9] = 1751479857;
        object2[10] = 1635135537;
        object2[11] = 1836069937;
        object2[12] = 1836069938;
        object2[13] = 862401121;
        object2[14] = 862401122;
        object2[15] = 862417462;
        object2[16] = 0x33677336;
        object2[17] = 862414134;
        object2[18] = 0x33676736;
        object2[19] = 1295275552;
        object2[20] = 1295270176;
        object2[21] = 1714714144;
        object2[22] = 1801741417;
        object2[23] = 1295275600;
        object2[24] = 1903435808;
        object2[25] = 1297305174;
        object2[26] = 1684175153;
        object2[27] = 1769172332;
        object2[28] = 1885955686;
        b = (int[])object;
    }

    public static boolean a(int n3, boolean bl2) {
        int n4;
        int n7 = n3 >>> 8;
        int n8 = 3368816;
        boolean bl3 = true;
        if (n7 == n8) {
            return bl3;
        }
        n7 = 1751476579;
        if (n3 == n7 && bl2) {
            return bl3;
        }
        int[] nArray = b;
        n7 = 0;
        for (n8 = 0; n8 < (n4 = 29); ++n8) {
            n4 = nArray[n8];
            if (n4 != n3) continue;
            return bl3;
        }
        return false;
    }

    public static W83 b(fi0_0 fi0_02, boolean bl2, boolean bl3) {
        int n3;
        long l2;
        Object object;
        block24: {
            object = fi0_02;
            boolean bl4 = bl3;
            long l3 = fi0_02.getLength();
            long l4 = 4096L;
            long l7 = -1;
            long l8 = l3 - l7;
            long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l12 != false && (l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) <= 0) {
                l4 = l3;
            }
            int n4 = (int)l4;
            Xm2 xm2 = new Xm2(64);
            l2 = 0;
            int n7 = 0;
            n3 = 0;
            float f5 = 0.0f;
            while (true) {
                long l14;
                int n8;
                long l15;
                long l16;
                int n10;
                float f6;
                int n14;
                block27: {
                    block26: {
                        long l17;
                        long l18;
                        long l19;
                        if (n7 >= n4) break block26;
                        int n15 = 8;
                        xm2.F(n15);
                        byte[] byArray = xm2.a;
                        n14 = 1;
                        f6 = Float.MIN_VALUE;
                        n10 = object.b(byArray, 0, n15, n14 != 0);
                        if (n10 == 0) break block26;
                        long l20 = xm2.y();
                        n10 = xm2.i();
                        long l21 = 1L;
                        long l22 = l20 - l21;
                        long l23 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                        if (l23 == false) {
                            byte[] byArray2 = xm2.a;
                            object.f(n15, byArray2, n15);
                            n14 = 16;
                            f6 = 2.2E-44f;
                            xm2.H(n14);
                            l7 = l20 = xm2.q();
                        } else {
                            long l24;
                            l16 = 0L;
                            long l25 = l20 - l16;
                            n14 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                            if (n14 == 0 && (n14 = (int)((l24 = (l16 = fi0_02.getLength()) - l7) == 0L ? 0 : (l24 < 0L ? -1 : 1))) != 0) {
                                long l26 = fi0_02.h();
                                l7 = n15;
                                l20 = (l16 -= l26) + l7;
                            }
                            l7 = l20;
                            n14 = 8;
                            f6 = 1.1E-44f;
                        }
                        l15 = n14;
                        long l27 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1);
                        if (l27 < 0) {
                            object = new Object();
                            return object;
                        }
                        n7 += n14;
                        n14 = 1836019574;
                        f6 = 4.631354E27f;
                        if (n10 == n14) {
                            long l28;
                            n8 = (int)l7;
                            if (l12 != false && (l14 = (l28 = (l7 = (long)(n4 += n8)) - l3) == 0L ? 0 : (l28 < 0L ? -1 : 1)) > 0) {
                                n4 = (int)l3;
                            }
                            l7 = -1;
                            continue;
                        }
                        n14 = 0x6D6F6F66;
                        f6 = 4.6313494E27f;
                        if (n10 == n14) break;
                        n14 = 1836475768;
                        f6 = 4.7659988E27f;
                        if (n10 == n14) break;
                        n14 = 1835295092;
                        f6 = 4.4175247E27f;
                        l16 = l3;
                        if (n10 == n14) {
                            n3 = 1;
                            f5 = Float.MIN_VALUE;
                        }
                        if ((l19 = (l18 = (l3 = (long)n7 + l7 - l15) - (l17 = (long)n4)) == 0L ? 0 : (l18 < 0L ? -1 : 1)) < 0) break block27;
                    }
                    l2 = 0;
                    break block24;
                }
                int n16 = (int)(l7 -= l15);
                n7 += n16;
                int n17 = 1718909296;
                if (n10 == n17) {
                    int[] nArray;
                    block25: {
                        n17 = 8;
                        if (n16 < n17) {
                            object = new Object();
                            return object;
                        }
                        xm2.F(n16);
                        byte[] byArray = xm2.a;
                        object.f(0, byArray, n16);
                        n16 = J70.a(xm2.i(), bl4) ? 1 : 0;
                        if (n16 != 0) {
                            n3 = 1;
                            f5 = Float.MIN_VALUE;
                        }
                        n16 = 4;
                        xm2.J(n16);
                        n17 = xm2.a() / n16;
                        if (n3 == 0 && n17 > 0) {
                            nArray = new int[n17];
                            for (n16 = 0; n16 < n17; ++n16) {
                                nArray[n16] = n8 = xm2.i();
                                if ((n8 = (int)(J70.a(n8, bl4) ? 1 : 0)) == 0) continue;
                                n14 = 1;
                                f6 = Float.MIN_VALUE;
                                break block25;
                            }
                            n14 = n3;
                            f6 = f5;
                        } else {
                            n14 = n3;
                            f6 = f5;
                            l14 = 0;
                            nArray = null;
                        }
                    }
                    if (n14 == 0) {
                        object = new Object();
                        if (nArray != null) {
                            ImmutableIntArray.copyOf(nArray);
                        } else {
                            ImmutableIntArray.of();
                        }
                        return object;
                    }
                    n3 = n14;
                    f5 = f6;
                } else if (n16 != 0) {
                    object.i(n16);
                }
                l3 = l16;
                l7 = -1;
                l2 = 0;
            }
            l2 = 1;
        }
        if (n3 == 0) {
            return LV0.a;
        }
        if (bl2 != l2) {
            object = l2 != false ? Vh.a : Vh.b;
            return object;
        }
        return null;
    }
}

