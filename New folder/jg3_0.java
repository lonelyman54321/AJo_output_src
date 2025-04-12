/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Jg3
 */
public final class jg3_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 mB2Array, i13 i132, long l2, long l3, nz nz4, float f5, u10 u102, b30_0 b30_02, int n3, int n4) {
        Object object;
        long l4;
        Object object2;
        Object object3;
        Object object4;
        float f6;
        float f7;
        int n7;
        int n8;
        Object object5;
        long l7;
        Object object6;
        int n10;
        int n14;
        int n15;
        Object object7;
        float f8;
        int n16;
        int n17;
        int n18;
        long l8;
        block36: {
            int n19;
            block35: {
                block31: {
                    int n20;
                    block34: {
                        block33: {
                            block32: {
                                int n21;
                                block30: {
                                    l8 = l2;
                                    n18 = n3;
                                    n17 = 16;
                                    n16 = 32;
                                    f8 = 4.5E-44f;
                                    n19 = 2;
                                    object7 = b30_02.g(1412203386);
                                    n15 = n4 & 1;
                                    if (n15 != 0) {
                                        int n22;
                                        n14 = n22 = n3 | 6;
                                        MB2[] mB2Array2 = mB2Array;
                                    } else {
                                        int n24 = n3 & 6;
                                        if (n24 == 0) {
                                            MB2[] mB2Array3 = mB2Array;
                                            n14 = ((j30_0)object7).J(mB2Array) ? 1 : 0;
                                            n14 = n14 != 0 ? 4 : 2;
                                            n14 |= n18;
                                        } else {
                                            MB2[] mB2Array4 = mB2Array;
                                            n14 = n3;
                                        }
                                    }
                                    n10 = n4 & 2;
                                    if (n10 != 0) {
                                        n14 |= 0x30;
                                    } else {
                                        int n25 = n18 & 0x30;
                                        if (n25 == 0) {
                                            object6 = i132;
                                            n21 = ((j30_0)object7).J(i132) ? 1 : 0;
                                            n21 = n21 != 0 ? 32 : 16;
                                        }
                                    }
                                    object6 = i132;
                                    break block30;
                                    n14 |= n21;
                                }
                                n21 = n18 & 0x180;
                                if (n21 == 0) {
                                    n21 = ((j30_0)object7).d(l8) ? 1 : 0;
                                    n21 = n21 != 0 ? 256 : 128;
                                    n14 |= n21;
                                }
                                if ((n21 = n18 & 0xC00) != 0) break block31;
                                n21 = n4 & 8;
                                if (n21 != 0) break block32;
                                l7 = l3;
                                n20 = ((j30_0)object7).d(l3) ? 1 : 0;
                                if (n20 == 0) break block33;
                                n20 = 2048;
                                break block34;
                            }
                            l7 = l3;
                        }
                        n20 = 1024;
                    }
                    n14 |= n20;
                    break block35;
                }
                l7 = l3;
            }
            n17 = n4 & 0x10;
            if (n17 != 0) {
                n14 |= 0x6000;
            } else {
                n19 = n18 & 0x6000;
                if (n19 == 0) {
                    object5 = nz4;
                    n8 = ((j30_0)object7).J(nz4);
                    n8 = n8 != 0 ? 16384 : 8192;
                }
            }
            object5 = nz4;
            break block36;
            n14 |= n8;
        }
        n16 = n4 & 0x20;
        n8 = 196608;
        if (n16 != 0) {
            n14 |= n8;
        } else if ((n8 = n18 & n8) == 0) {
            n7 = ((j30_0)object7).b(f5);
            if (n7 != 0) {
                n7 = 131072;
                f7 = 1.83671E-40f;
            } else {
                n7 = 65536;
                f7 = 9.1835E-41f;
            }
            n14 |= n7;
        }
        f7 = 2.204052E-39f;
        n7 = n18 & 0x180000;
        if (n7 == 0) {
            n7 = ((j30_0)object7).x(u102) ? 1 : 0;
            if (n7 != 0) {
                n7 = 0x100000;
                f7 = 1.469368E-39f;
            } else {
                n7 = 524288;
                f7 = 7.34684E-40f;
            }
            n14 |= n7;
        }
        n7 = 599187;
        f7 = 8.3964E-40f;
        int n26 = 599186;
        if ((n14 &= n7) == n26 && (n26 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            void var23_24;
            ((j30_0)object7).D();
            f6 = f5;
            object4 = object5;
            object3 = var23_24;
            object2 = object6;
            l4 = l7;
        } else {
            void var23_25;
            Object object8;
            long l12;
            ((j30_0)object7).r0();
            n26 = 1;
            n14 = n18 & 1;
            if (n14 != 0 && (n26 = (int)(((j30_0)object7).c0() ? 1 : 0)) == 0) {
                ((j30_0)object7).D();
                f7 = f5;
                l12 = l7;
                object8 = object5;
            } else {
                if (n15 != 0) {
                    object = LP1$a.b;
                    LP1$a lP1$a = object;
                }
                if (n10 != 0) {
                    object6 = object = fg2_1.a;
                }
                l12 = (n26 = n4 & 8) != 0 ? mz_0.b(l8, (b30_0)object7) : l7;
                if (n17 != 0) {
                    n26 = 0;
                    object = null;
                } else {
                    object = object5;
                }
                if (n16 != 0) {
                    n17 = 0;
                    object3 = null;
                    f8 = 0.0f;
                    object8 = object;
                    f7 = f8;
                } else {
                    f7 = f5;
                    object8 = object;
                }
            }
            Object object9 = object6;
            object6 = var23_25;
            ((j30_0)object7).U();
            object = ty0_0.b;
            float f11 = ((xs0_0)((j30_0)object7).j((H30)object)).a + f7;
            object3 = w60_0.a;
            object2 = new OX(l12);
            object3 = ((nw0_1)object3).c(object2);
            object2 = new xs0_0(f11);
            object = ((nw0_1)object).c(object2);
            MB2[] mB2Array5 = new MB2[2];
            n16 = 0;
            f8 = 0.0f;
            mB2Array5[0] = object3;
            mB2Array5[1] = object;
            object = object5;
            object3 = object6;
            object2 = object9;
            MB2[] mB2Array6 = mB2Array5;
            Object object10 = object8;
            object5 = new fg3_2((LP1)object6, (i13)object9, l2, f11, (nz)object8, f7, u102);
            n26 = -1822160838;
            object = v10.c(n26, (fx0_2)object5, (b30_0)object7);
            n17 = 56;
            L30.b(mB2Array6, (Function2)object, (b30_0)object7, n17);
            object4 = object8;
            l4 = l12;
            f6 = f7;
        }
        object7 = ((j30_0)object7).X();
        if (object7 != null) {
            object = object6;
            n18 = n4;
            ((CF2)object7).d = object6 = new gg3_2((LP1)object3, (i13)object2, l2, l4, (nz)object4, f6, u102, n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(Function0 function0, LP1 lP1, boolean bl2, i13 i132, long l2, long l3, nz nz4, float f5, wr1_1 wr1_12, u10 u102, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        int n7;
        int n8;
        int n10;
        Object object3;
        float f6;
        int n14;
        Object object4;
        int n15;
        int n16;
        j30_0 j30_02;
        MB2[] mB2Array;
        int n17;
        int n18;
        int n19;
        float f7;
        long l4;
        block30: {
            block29: {
                block28: {
                    block27: {
                        block26: {
                            l4 = l3;
                            f7 = f5;
                            n19 = n3;
                            n18 = 4;
                            n17 = 1560876237;
                            mB2Array = b30_02;
                            j30_02 = b30_02.g(n17);
                            int n20 = n3 & 6;
                            if (n20 == 0) {
                                mB2Array = function0;
                                n16 = j30_02.x(function0) ? 1 : 0;
                                n16 = n16 != 0 ? 4 : 2;
                                n16 |= n19;
                            } else {
                                mB2Array = function0;
                                n16 = n3;
                            }
                            n15 = n19 & 0x30;
                            object4 = lP1;
                            if (n15 == 0) {
                                n15 = j30_02.J(lP1) ? 1 : 0;
                                n15 = n15 != 0 ? 32 : 16;
                                n16 |= n15;
                            }
                            if ((n18 = n4 & 4) == 0) break block26;
                            n16 |= 0x180;
                            break block27;
                        }
                        n15 = n19 & 0x180;
                        if (n15 != 0) break block27;
                        n15 = bl2 ? 1 : 0;
                        n14 = j30_02.a(bl2) ? 1 : 0;
                        if (n14 == 0) break block28;
                        n14 = 256;
                        f6 = 3.59E-43f;
                        break block29;
                    }
                    n15 = bl2 ? 1 : 0;
                    break block30;
                }
                n14 = 128;
                f6 = 1.8E-43f;
            }
            n16 |= n14;
        }
        n14 = n19 & 0xC00;
        Object object5 = i132;
        if (n14 == 0) {
            n14 = j30_02.J(i132) ? 1 : 0;
            if (n14 != 0) {
                n14 = 2048;
                f6 = 2.87E-42f;
            } else {
                n14 = 1024;
                f6 = 1.435E-42f;
            }
            n16 |= n14;
        }
        if ((n14 = n19 & 0x6000) == 0) {
            n14 = j30_02.d(l2) ? 1 : 0;
            if (n14 != 0) {
                n14 = 16384;
                f6 = 2.2959E-41f;
            } else {
                n14 = 8192;
                f6 = 1.148E-41f;
            }
            n16 |= n14;
        }
        f6 = 2.75506E-40f;
        n14 = 0x30000 & n19;
        if (n14 == 0) {
            n14 = j30_02.d(l4) ? 1 : 0;
            if (n14 != 0) {
                n14 = 131072;
                f6 = 1.83671E-40f;
            } else {
                n14 = 65536;
                f6 = 9.1835E-41f;
            }
            n16 |= n14;
        }
        n14 = n4 & 0x40;
        int n21 = 0x180000;
        if (n14 != 0) {
            n16 |= n21;
            object3 = nz4;
        } else {
            n21 = n19 & n21;
            object3 = nz4;
            if (n21 == 0) {
                n10 = j30_02.J(nz4) ? 1 : 0;
                n10 = n10 != 0 ? 0x100000 : 524288;
                n16 |= n10;
            }
        }
        n10 = n19 & 0xC00000;
        if (n10 == 0) {
            n10 = j30_02.b(f7) ? 1 : 0;
            n10 = n10 != 0 ? 0x800000 : 0x400000;
            n16 |= n10;
        }
        n10 = n19 & 0x6000000;
        Object object6 = wr1_12;
        if (n10 == 0) {
            n8 = j30_02.J(wr1_12);
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n16 |= n8;
        }
        n8 = n19 & 0x30000000;
        mB2Array = u102;
        if (n8 == 0) {
            n8 = j30_02.x(u102) ? 1 : 0;
            n8 = n8 != 0 ? 0x20000000 : 0x10000000;
            n16 |= n8;
        }
        if ((n16 &= (n8 = 306783379)) == (n7 = 306783378) && (n7 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object2 = nz4;
        } else {
            j30_02.r0();
            n7 = 1;
            n16 = n19 & 1;
            if (n16 != 0 && (n7 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
                object = nz4;
            } else {
                if (n18 != 0) {
                    n15 = 1;
                }
                if (n14 != 0) {
                    n7 = 0;
                    object3 = null;
                } else {
                    object3 = nz4;
                }
                object = object3;
            }
            n7 = n15;
            j30_02.U();
            object2 = ty0_0.b;
            f6 = ((xs0_0)j30_02.j((H30)object2)).a + f7;
            nw0_1 nw0_12 = w60_0.a;
            object6 = new OX(l4);
            object6 = nw0_12.c(object6);
            xs0_0 xs0_02 = new xs0_0(f6);
            object2 = ((nw0_1)object2).c(xs0_02);
            MB2[] mB2Array2 = new MB2[2];
            n21 = 0;
            mB2Array2[0] = object6;
            int n22 = 1;
            mB2Array2[n22] = object2;
            object2 = object6;
            mB2Array = mB2Array2;
            LP1 lP12 = lP1;
            object4 = object;
            n8 = n15;
            object6 = new hg3_1(lP1, i132, l2, f6, (nz)object, f5, wr1_12, n15 != 0, function0, u102);
            object6 = v10.c(2031491085, (fx0_2)object6, j30_02);
            n16 = 56;
            L30.b(mB2Array, (Function2)object6, j30_02, n16);
            object2 = object;
        }
        object4 = j30_02.X();
        if (object4 != null) {
            object3 = object5;
            object = function0;
            object6 = lP1;
            n17 = n15;
            mB2Array = i132;
            l4 = l3;
            ((CF2)object4).d = object5 = new ig3_2(function0, lP1, n15 != 0, i132, l2, l3, (nz)object2, f5, wr1_12, u102, n3, n4);
        }
    }

    public static final LP1 c(LP1 lP1, i13 i132, long l2, nz object, float f5) {
        LP1 lP12;
        long l3 = 0L;
        int n3 = 24;
        long l4 = 0L;
        lP1 = c13_0.c(lP1, f5, i132, l4, l3, n3);
        if (object != null) {
            float f6 = ((nz)object).a;
            object = ((nz)object).b;
            lP12 = new BorderModifierNodeElement(f6, (ZD)object, i132);
        } else {
            lP12 = LP1$a.b;
        }
        return QV.a(a.b(lP1.then(lP12), l2, i132), i132);
    }

    public static final long d(long l2, sy0_1 sy0_12, float f5, b30_0 b30_02) {
        Object object = mz_0.a;
        long l3 = ((lZ)(object = (lZ)b30_02.j((H30)object))).h();
        int n3 = OX.c(l2, l3);
        if (n3 != 0 && sy0_12 != null) {
            n3 = 1082171732;
            b30_02.K(n3);
            l2 = sy0_12.a(l2, f5, b30_02, 0);
            b30_02.E();
        } else {
            int n4 = 1082239839;
            b30_02.K(n4);
            b30_02.E();
        }
        return l2;
    }
}

