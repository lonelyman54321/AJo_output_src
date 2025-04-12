/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class vb2 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(boolean bl2, String string2, LP1 lP1, ol0 ol02, Function0 function0, long l2, LP1 lP12, b30_0 b30_02, int n3, int n4) {
        CF2 cF2;
        Object object;
        Object object2;
        long l3;
        Object object3;
        j30_0 j30_02;
        int n7;
        Object object4;
        int n8;
        long l4;
        int n10;
        float f5;
        int n14;
        Object object5;
        int n15;
        int n16;
        j30_0 j30_03;
        Object object6;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        Function0 function02;
        String string3;
        block31: {
            block30: {
                block26: {
                    block29: {
                        block28: {
                            block27: {
                                string3 = string2;
                                LP1 lP13 = lP1;
                                function02 = function0;
                                n22 = n3;
                                n21 = 1;
                                n20 = 32;
                                n19 = 6;
                                n18 = 8;
                                Intrinsics.checkNotNullParameter(string2, "buttonText");
                                Intrinsics.checkNotNullParameter(lP1, "modifier");
                                Intrinsics.checkNotNullParameter(function0, "onButtonClicked");
                                n17 = -1250718000;
                                object6 = b30_02;
                                j30_03 = b30_02.g(n17);
                                n16 = n3 | 6;
                                n15 = n3 & 0x70;
                                if (n15 == 0) {
                                    n15 = (int)(j30_03.J(string2) ? 1 : 0);
                                    n15 = n15 != 0 ? 32 : 16;
                                    n16 |= n15;
                                }
                                if ((n15 = n22 & 0x380) == 0) {
                                    n15 = (int)(j30_03.J(lP13) ? 1 : 0);
                                    n15 = n15 != 0 ? 256 : 128;
                                    n16 |= n15;
                                }
                                if ((n15 = n22 & 0x1C00) != 0) break block26;
                                n15 = n4 & 8;
                                if (n15 != 0) break block27;
                                object5 = ol02;
                                n14 = (int)(j30_03.J(ol02) ? 1 : 0);
                                if (n14 == 0) break block28;
                                n14 = 2048;
                                f5 = 2.87E-42f;
                                break block29;
                            }
                            object5 = ol02;
                        }
                        n14 = 1024;
                        f5 = 1.435E-42f;
                    }
                    n16 |= n14;
                    break block30;
                }
                object5 = ol02;
            }
            n10 = 57344;
            n14 = n22 & n10;
            if (n14 == 0) {
                n14 = (int)(j30_03.x(function02) ? 1 : 0);
                if (n14 != 0) {
                    n14 = 16384;
                    f5 = 2.2959E-41f;
                } else {
                    n14 = 8192;
                    f5 = 1.148E-41f;
                }
                n16 |= n14;
            }
            if ((n20 = n4 & 0x20) != 0) {
                n14 = 196608;
                f5 = 2.75506E-40f;
                n16 |= n14;
                l4 = l2;
            } else {
                f5 = 6.42848E-40f;
                n14 = 0x70000 & n22;
                l4 = l2;
                if (n14 == 0) {
                    n14 = (int)(j30_03.d(l2) ? 1 : 0);
                    if (n14 != 0) {
                        n14 = 131072;
                        f5 = 1.83671E-40f;
                    } else {
                        n14 = 65536;
                        f5 = 9.1835E-41f;
                    }
                    n16 |= n14;
                }
            }
            n8 = n4 & 0x40;
            if (n8 != 0) {
                n14 = 0x180000;
                f5 = 2.204052E-39f;
                n16 |= n14;
            } else {
                f5 = 5.142788E-39f;
                n14 = 0x380000 & n22;
                if (n14 == 0) {
                    object4 = lP12;
                    n7 = (int)(j30_03.J(lP12) ? 1 : 0);
                    n7 = n7 != 0 ? 0x100000 : 524288;
                }
            }
            object4 = lP12;
            break block31;
            n16 |= n7;
        }
        n7 = n16;
        n16 = 0x2DB6DB & n16;
        int n24 = 599186;
        if (n16 == n24 && (n16 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            n8 = (int)(bl2 ? 1 : 0);
            j30_02 = j30_03;
            object3 = object5;
            object6 = object4;
            l3 = l4;
        } else {
            int n25;
            long l7;
            Object object7;
            j30_03.r0();
            n16 = n22 & 1;
            if (n16 != 0 && (n16 = (int)(j30_03.c0() ? 1 : 0)) == 0) {
                j30_03.D();
                n20 = n4 & 8;
                if (n20 != 0) {
                    n7 &= 0xFFFFE3FF;
                }
                n8 = (int)(bl2 ? 1 : 0);
                object7 = object5;
                l7 = l4;
                object2 = object4;
            } else {
                n16 = n4 & 8;
                if (n16 != 0) {
                    object6 = GE.a;
                    long l8 = xx_1.e;
                    n24 = 14;
                    long l12 = 0L;
                    n25 = 6;
                    n21 = n7;
                    object2 = j30_03;
                    object6 = GE.a(l8, l12, j30_03, n25, n24);
                    n7 &= 0xFFFFE3FF;
                } else {
                    n21 = n7;
                    object6 = object5;
                }
                long l14 = n20 != 0 ? OX.f : l2;
                if (n8 != 0) {
                    object5 = LP1$a.b;
                    f5 = n19;
                    object5 = h.e((LP1)object5, f5);
                    n14 = 1065353216;
                    f5 = 1.0f;
                    object5 = j.c((LP1)object5, f5);
                    l7 = l14;
                    object7 = object6;
                    object2 = object5;
                } else {
                    object2 = lP12;
                    l7 = l14;
                    object7 = object6;
                }
                n8 = 1;
            }
            j30_03.U();
            object6 = SP2.a(n18);
            j30_03.K(462397652);
            n21 = n7 & n10;
            n20 = 0;
            object3 = null;
            n18 = 16384;
            if (n21 == n18) {
                n21 = 1;
            } else {
                n21 = 0;
                object = null;
            }
            Object object8 = j30_03.v();
            if (n21 != 0 || object8 == (object = b30$a.a)) {
                object8 = new ub2_2(function02);
                j30_03.o(object8);
            }
            object = object8;
            object = (Function0)object8;
            j30_03.T(false);
            object3 = new vb2$a(string3, (LP1)object2, l7);
            u10 u102 = v10.c(852762848, (fx0_2)object3, j30_03);
            n20 = n7 >> 3 & 0x70 | 0x30000000;
            n19 = n7 << 6 & 0x380;
            n20 |= n19;
            n19 = n7 << 12 & 0x1C00000;
            int n26 = n20 | n19;
            n15 = 0;
            object5 = null;
            n7 = 0;
            cF2 = null;
            n18 = 0;
            object8 = null;
            n14 = 0;
            f5 = 0.0f;
            n25 = 344;
            object3 = lP1;
            n19 = n8;
            j30_02 = j30_03;
            n17 = 0;
            j30_03 = null;
            object4 = object7;
            Object object9 = object2;
            object2 = u102;
            n24 = n26;
            n22 = n25;
            ME.a((Function0)object, lP1, n8 != 0, null, null, (i13)object6, null, (ol0)object7, null, u102, j30_02, n26, n25);
            object3 = object7;
            object6 = object9;
            l3 = l7;
        }
        cF2 = j30_02.X();
        if (cF2 != null) {
            jb2_2 jb2_22 = object2;
            string3 = string2;
            object = lP1;
            n15 = n3;
            n14 = n4;
            cF2.d = object2 = new jb2_2(n8 != 0, string2, lP1, (ol0)object3, function0, l3, (LP1)object6, n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(Function0 function0, u10 u102, boolean bl2, String string2, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        Object object4;
        int n17;
        block16: {
            n17 = n3;
            Intrinsics.checkNotNullParameter(function0, "onCloseButtonClicked");
            Intrinsics.checkNotNullParameter(u102, "content");
            int n18 = -677686325;
            object4 = b30_02.g(n18);
            n16 = n3 & 0xE;
            n15 = 4;
            if (n16 == 0) {
                n16 = (int)(((j30_0)object4).x(function0) ? 1 : 0);
                n16 = n16 != 0 ? 4 : 2;
                n16 |= n17;
            } else {
                n16 = n3;
            }
            n14 = n17 & 0x70;
            if (n14 == 0) {
                n14 = (int)(((j30_0)object4).x(u102) ? 1 : 0);
                n14 = n14 != 0 ? 32 : 16;
                n16 |= n14;
            }
            if ((n14 = n4 & 4) != 0) {
                n16 |= 0x180;
            } else {
                n10 = n17 & 0x380;
                if (n10 == 0) {
                    n10 = (int)(bl2 ? 1 : 0);
                    n8 = (int)(((j30_0)object4).a(bl2) ? 1 : 0);
                    n8 = n8 != 0 ? 256 : 128;
                }
            }
            n10 = (int)(bl2 ? 1 : 0);
            break block16;
            n16 |= n8;
        }
        n8 = n17 & 0x1C00;
        if (n8 == 0) {
            n16 |= 0x400;
        }
        if ((n8 = n16 & 0x16DB) == (n7 = 1170) && (n8 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object3 = string2;
            n16 = n10;
        } else {
            Object object5;
            String string3;
            ((j30_0)object4).r0();
            n8 = n17 & 1;
            n7 = 0;
            u10 u103 = null;
            if (n8 != 0 && (n8 = (int)(((j30_0)object4).c0() ? 1 : 0)) == 0) {
                ((j30_0)object4).D();
                n16 &= 0xFFFFE3FF;
                string3 = string2;
            } else {
                if (n14 != 0) {
                    n10 = 0;
                    object2 = null;
                }
                n14 = R$string.close;
                object5 = nk_0.f((b30_0)object4, n14);
                n16 &= 0xFFFFE3FF;
                string3 = object5;
            }
            n14 = n16;
            n16 = n10;
            ((j30_0)object4).U();
            object2 = LP1$a.b;
            long l2 = xx_1.p;
            object = fg2_1.a;
            object2 = a.b((LP1)object2, l2, (i13)object);
            object = j.c;
            object2 = object2.then((LP1)object);
            n8 = 1392005922;
            ((j30_0)object4).K(n8);
            if ((n14 &= 0xE) == n15) {
                n15 = 1;
            } else {
                n15 = 0;
                object3 = null;
            }
            object5 = ((j30_0)object4).v();
            if (n15 != 0 || object5 == (object3 = b30$a.a)) {
                object5 = new ib2_1(function0);
                ((j30_0)object4).o(object5);
            }
            object5 = (Function0)object5;
            ((j30_0)object4).T(false);
            n15 = 7;
            object5 = d.b((LP1)object2, false, null, (Function0)object5, n15);
            object2 = Nc$a.h;
            object3 = new eb2_1(n16 != 0, string3, function0, u102);
            u103 = v10.c(186830901, (fx0_2)object3, (b30_0)object4);
            int n19 = 4;
            n8 = 0;
            object = null;
            int n20 = 3120;
            OA.a((LP1)object5, (Nc)object2, false, u103, (b30_0)object4, n20, n19);
            object3 = string3;
        }
        object2 = ((j30_0)object4).X();
        if (object2 != null) {
            object4 = object;
            n17 = n3;
            n14 = n4;
            object = new nb2_1(function0, u102, n16 != 0, (String)object3, n3, n4);
            ((CF2)object2).d = object;
        }
    }

    public static final void c(Function0 function0, Function0 function02, Function0 function03, u10 u102, boolean bl2, String string2, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n4;
        Function0 function04 = function02;
        Function0 function05 = function03;
        u10 u103 = u102;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(function0, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(function02, "onCtaButtonClicked");
        Intrinsics.checkNotNullParameter(function03, "onOutsideClicked");
        Object object5 = "content";
        Intrinsics.checkNotNullParameter(u102, (String)object5);
        Object object6 = b30_02;
        j30_0 j30_02 = b30_02.g(669721523);
        int n8 = n3 & 0xE;
        if (n8 == 0) {
            n8 = (int)(j30_02.x(function0) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n7;
        } else {
            n8 = n3;
        }
        int n10 = n7 & 0x70;
        if (n10 == 0) {
            n10 = (int)(j30_02.x(function04) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        n10 = n7 & 0x380;
        int n14 = 256;
        if (n10 == 0) {
            n10 = (int)(j30_02.x(function05) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n10 = n7 & 0x1C00) == 0) {
            n10 = (int)(j30_02.x(u103) ? 1 : 0);
            n10 = n10 != 0 ? 2048 : 1024;
            n8 |= n10;
        }
        if ((n10 = 0xE000 & n7) == 0) {
            n10 = (int)(j30_02.a(bl2) ? 1 : 0);
            n10 = n10 != 0 ? 16384 : 8192;
            n8 |= n10;
        }
        if ((n10 = 0x70000 & n7) == 0) {
            n10 = (int)(j30_02.J(string2) ? 1 : 0);
            n10 = n10 != 0 ? 131072 : 65536;
            n8 |= n10;
        }
        if ((n10 = 0x5B6DB & n8) == (n4 = 74898) && (n10 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object5 = j30_02;
        } else {
            j30_02.r0();
            n10 = n7 & 1;
            if (n10 != 0 && (n10 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
            }
            j30_02.U();
            object6 = LP1$a.b;
            long l2 = xx_1.p;
            Object object7 = fg2_1.a;
            object6 = a.b((LP1)object6, l2, (i13)object7);
            object4 = j.c;
            object6 = object6.then((LP1)object4);
            j30_02.K(1391931262);
            n4 = 0;
            object4 = null;
            if ((n8 &= 0x380) == n14) {
                n8 = 1;
            } else {
                n8 = 0;
                object5 = null;
            }
            object3 = j30_02.v();
            if (n8 != 0 || object3 == (object5 = b30$a.a)) {
                object3 = new ob2_1(function05);
                j30_02.o(object3);
            }
            object3 = (Function0)object3;
            j30_02.T(false);
            object2 = d.b((LP1)object6, false, null, (Function0)object3, 7);
            object = Nc$a.h;
            n10 = (int)(bl2 ? 1 : 0);
            object3 = string2;
            object4 = function0;
            object7 = function02;
            object5 = new yb2_2(bl2, string2, function0, u102, function02);
            n8 = -1607317731;
            object5 = v10.c(n8, (fx0_2)object5, j30_02);
            int n15 = 4;
            n10 = 0;
            object6 = null;
            int n16 = 3120;
            Object object8 = object5;
            object5 = j30_02;
            OA.a((LP1)object2, (Nc)object, false, (u10)object8, j30_02, n16, n15);
        }
        object2 = ((j30_0)object5).X();
        if (object2 != null) {
            object5 = object;
            object6 = function0;
            object3 = function02;
            object4 = function03;
            object = new pb2_2(function0, function02, function03, u102, bl2, string2, n3);
            ((CF2)object2).d = object;
        }
    }

    public static final void d(Function0 function0, u10 u102, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(function0, "closeButtonClick");
        Object object2 = "content";
        Intrinsics.checkNotNullParameter(u102, (String)object2);
        object = object.g(384159955);
        int n7 = n3 & 0xE;
        int n8 = 4;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n7 & 0x5B) == (n4 = 18) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object3 = LP1$a.b;
            long l2 = xx_1.p;
            Object object4 = fg2_1.a;
            object3 = a.b((LP1)object3, l2, (i13)object4);
            FillElement fillElement = j.c;
            object3 = object3.then(fillElement);
            ((j30_0)object).K(735845013);
            n4 = 0;
            fillElement = null;
            if ((n7 &= 0xE) == n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            Object object5 = ((j30_0)object).v();
            if (n7 != 0 || object5 == (object2 = b30$a.a)) {
                n7 = 1;
                object5 = new pz1_1(function0, n7);
                ((j30_0)object).o(object5);
            }
            object5 = (Function0)object5;
            ((j30_0)object).T(false);
            n7 = 7;
            object5 = d.b((LP1)object3, false, null, (Function0)object5, n7);
            object3 = Nc$a.e;
            object2 = new gb2_1(u102);
            u10 u103 = v10.c(-392531927, (fx0_2)object2, (b30_0)object);
            int n14 = 4;
            n4 = 0;
            fillElement = null;
            int n15 = 3120;
            object4 = object;
            OA.a((LP1)object5, (Nc)object3, false, u103, (b30_0)object, n15, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new kb2_2(function0, u102, n3);
        }
    }

    public static final void e(u10 u102, u10 u103, u10 u104, u10 u105, u10 u106, u10 u107, b30_0 objectArray, int n3) {
        Object object;
        int n4;
        Object object2;
        Object object3;
        u10 u108 = u102;
        Object object4 = u103;
        u10 u109 = u104;
        u10 u1010 = u105;
        u10 u1011 = u106;
        u10 u1012 = u107;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(u102, "callBackExecution");
        Intrinsics.checkNotNullParameter(u103, "alwaysVisibleContent");
        Intrinsics.checkNotNullParameter(u104, "expandableContent");
        Intrinsics.checkNotNullParameter(u105, "hiddenContentOnExpand");
        Intrinsics.checkNotNullParameter(u106, "replaceableContentOnExpand");
        Intrinsics.checkNotNullParameter(u107, "footedExpandedContent");
        int n8 = 1605967435;
        Object object5 = objectArray;
        Object object6 = objectArray.g(n8);
        int n10 = n3 & 0xE;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object6).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x70;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object6).x(object4) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x380) == 0) {
            n14 = (int)(((j30_0)object6).x(u109) ? 1 : 0);
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x1C00) == 0) {
            n14 = (int)(((j30_0)object6).x(u1010) ? 1 : 0);
            n14 = n14 != 0 ? 2048 : 1024;
            n10 |= n14;
        }
        if ((n14 = 0xE000 & n7) == 0) {
            n14 = (int)(((j30_0)object6).x(u1011) ? 1 : 0);
            n14 = n14 != 0 ? 16384 : 8192;
            n10 |= n14;
        }
        if ((n14 = 0x70000 & n7) == 0) {
            n14 = (int)(((j30_0)object6).x(u1012) ? 1 : 0);
            n14 = n14 != 0 ? 131072 : 65536;
            n10 |= n14;
        }
        int n15 = n10;
        n14 = 74898;
        if ((n10 &= 0x5B6DB) == n14 && (n10 = (int)(((j30_0)object6).h() ? 1 : 0)) != 0) {
            ((j30_0)object6).D();
        } else {
            object3 = null;
            object5 = new Object[]{};
            object2 = new fy1_1(1);
            Object object7 = object5 = wi2_0.b(object5, null, (Function0)object2, (b30_0)object6, 3080, 6);
            object7 = (tr1_0)object5;
            object5 = new Object[]{};
            object2 = new Object();
            n4 = 6;
            object = null;
            int n16 = 3080;
            Object object8 = object5 = wi2_0.b(object5, null, (Function0)object2, (b30_0)object6, n16, n4);
            object8 = (tr1_0)object5;
            object5 = LP1$a.b;
            ((j30_0)object6).K(863153898);
            n14 = (int)(((j30_0)object6).J(object8) ? 1 : 0);
            int n17 = ((j30_0)object6).J(object7);
            object2 = ((j30_0)object6).v();
            if ((n14 |= n17) != 0 || object2 == (object = b30$a.a)) {
                object2 = new rb2_2((tr1_0)object8, (tr1_0)object7);
                ((j30_0)object6).o(object2);
            }
            object2 = (Function0)object2;
            ((j30_0)object6).T(false);
            n14 = 7;
            LP1 lP1 = d.b((LP1)object5, false, null, (Function0)object2, n14);
            object5 = object3;
            object = u106;
            object2 = u103;
            object4 = object3;
            object3 = u104;
            object5(u106, u103, u105, u107, (tr1_0)object8, u104);
            u10 u1013 = v10.c(-1817811064, (fx0_2)object5, (b30_0)object6);
            long l2 = 0L;
            int n18 = 0x180000;
            int n19 = 62;
            object = object7;
            object7 = lP1;
            lP1 = null;
            JL.a((LP1)object7, null, l2, null, 0.0f, u1013, (b30_0)object6, n18, n19);
            n10 = (int)(vb2.g((tr1_0)object8) ? 1 : 0);
            object5 = n10 != 0;
            object = (Boolean)object.getValue();
            object.getClass();
            int n20 = n15 << 6 & 0x380;
            object2 = n20;
            u108.invoke(object5, object, object6, object2);
        }
        object3 = ((j30_0)object6).X();
        if (object3 != null) {
            object6 = object4;
            u108 = u102;
            object5 = u103;
            object = u104;
            object2 = u105;
            n4 = n3;
            object4 = new sb2_2(u102, u103, u104, u105, u106, u107, n3);
            ((CF2)object3).d = object4;
        }
    }

    public static final void f(u10 u102, u10 u103, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(u102, "alwaysVisibleContent");
        Object object2 = "expandableContent";
        Intrinsics.checkNotNullParameter(u103, (String)object2);
        object = object.g(2088403021);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(u103) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x5B) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n4 = 0;
            object2 = null;
            Object object3 = new Object[]{};
            Object object4 = new Object();
            int n8 = 6;
            int n10 = 3080;
            Object object5 = object;
            object3 = (tr1_0)wi2_0.b(object3, null, (Function0)object4, (b30_0)object, n10, n8);
            Object object6 = LP1$a.b;
            ((j30_0)object).K(863179502);
            boolean n14 = ((j30_0)object).J(object3);
            object5 = ((j30_0)object).v();
            if (n14 || object5 == (object4 = b30$a.a)) {
                int n15 = 1;
                object5 = new tz1_1(object3, n15);
                ((j30_0)object).o(object5);
            }
            object5 = (Function0)object5;
            ((j30_0)object).T(false);
            int n16 = 7;
            n10 = 0;
            object2 = d.b((LP1)object6, false, null, (Function0)object5, n16);
            object6 = new kb2_1(u102, (tr1_0)object3, u103);
            n7 = -968078454;
            u10 u104 = v10.c(n7, (fx0_2)object6, (b30_0)object);
            n8 = 0;
            object6 = null;
            long l2 = 0L;
            int n17 = 0x180000;
            int n18 = 62;
            object3 = object2;
            JL.a((LP1)object2, null, l2, null, 0.0f, u104, (b30_0)object, n17, n18);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new mb2_2(u102, u103, n3);
        }
    }

    public static final boolean g(tr1_0 tr1_02) {
        return (Boolean)tr1_02.getValue();
    }

    public static final void h(float f5, b30_0 object, int n3) {
        Object object2;
        object = object.g(-1114132888);
        int n4 = n3 & 0xE;
        int n7 = 2;
        float f6 = 2.8E-45f;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).b(f5) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 0xB) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = LP1$a.b;
            long l2 = xx_1.m;
            fG2$a fG2$a = fg2_1.a;
            object2 = a.b((LP1)object2, l2, fG2$a);
            n7 = 1065353216;
            f6 = 1.0f;
            object2 = j.d(j.c((LP1)object2, f6), f5);
            Q93.b((b30_0)object, (LP1)object2);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new tb2_2(f5, n3);
        }
    }
}

