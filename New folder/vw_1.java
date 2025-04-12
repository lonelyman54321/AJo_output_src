/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VW
 */
public final class vw_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Function0 function0, LP1 lP1, Function2 function2, ke1_2 ke1_22, he1_2 he1_22, Function1 function1, im2 im22, hx0_2 hx0_22, ix0_2 ix0_22, hx0_2 hx0_23, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        float f5;
        Object object3 = function0;
        Object object4 = function2;
        he1_2 he1_23 = he1_22;
        Object object5 = im22;
        int n7 = n3;
        Object object6 = "imageRequest";
        Intrinsics.checkNotNullParameter(function0, (String)object6);
        Object object7 = b30_02.g(-306786261);
        int n8 = n3 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object7).x(function0) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n7;
        } else {
            n8 = n3;
        }
        int n10 = n7 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object7).J(lP1) ? 1 : 0);
            if (n10 != 0) {
                n10 = 32;
                f5 = 4.5E-44f;
            } else {
                n10 = 16;
                f5 = 2.2E-44f;
            }
            n8 |= n10;
        }
        if ((n10 = n7 & 0x180) == 0) {
            n10 = (int)(((j30_0)object7).x(object4) ? 1 : 0);
            if (n10 != 0) {
                n10 = 256;
                f5 = 3.59E-43f;
            } else {
                n10 = 128;
                f5 = 1.8E-43f;
            }
            n8 |= n10;
        }
        n10 = n7 & 0xC00;
        Object object8 = ke1_22;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object7).J(ke1_22) ? 1 : 0);
            if (n10 != 0) {
                n10 = 2048;
                f5 = 2.87E-42f;
            } else {
                n10 = 1024;
                f5 = 1.435E-42f;
            }
            n8 |= n10;
        }
        if ((n10 = n7 & 0x6000) == 0) {
            n10 = (int)(((j30_0)object7).J(he1_23) ? 1 : 0);
            if (n10 != 0) {
                n10 = 16384;
                f5 = 2.2959E-41f;
            } else {
                n10 = 8192;
                f5 = 1.148E-41f;
            }
            n8 |= n10;
        }
        f5 = 2.75506E-40f;
        n10 = 0x30000 & n7;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object7).x(function1) ? 1 : 0);
            if (n10 != 0) {
                n10 = 131072;
                f5 = 1.83671E-40f;
            } else {
                n10 = 65536;
                f5 = 9.1835E-41f;
            }
            n8 |= n10;
        }
        f5 = 2.204052E-39f;
        n10 = 0x180000 & n7;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object7).x(object5) ? 1 : 0);
            if (n10 != 0) {
                n10 = 0x100000;
                f5 = 1.469368E-39f;
            } else {
                n10 = 524288;
                f5 = 7.34684E-40f;
            }
            n8 |= n10;
        }
        f5 = 1.7632415E-38f;
        n10 = 0xC00000 & n7;
        Object object9 = hx0_22;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object7).x(hx0_22) ? 1 : 0);
            if (n10 != 0) {
                n10 = 0x800000;
                f5 = Float.MIN_NORMAL;
            } else {
                n10 = 0x400000;
                f5 = 5.877472E-39f;
            }
            n8 |= n10;
        }
        f5 = 2.4074124E-35f;
        n10 = 0x6000000 & n7;
        if (n10 == 0) {
            n4 = ((j30_0)object7).x(ix0_22);
            n4 = n4 != 0 ? 0x4000000 : 0x2000000;
            n8 |= n4;
        }
        if ((n4 = 0x30000000 & n7) == 0) {
            n4 = (int)(((j30_0)object7).x(hx0_23) ? 1 : 0);
            n4 = n4 != 0 ? 0x20000000 : 0x10000000;
            n8 |= n4;
        }
        n4 = n8;
        int n14 = 306783378;
        if ((n8 = 0x12492493 & n8) == n14 && (n8 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            ((j30_0)object7).D();
            object3 = object7;
        } else {
            ((j30_0)object7).r0();
            n8 = n7 & 1;
            if (n8 != 0 && (n8 = (int)(((j30_0)object7).c0() ? 1 : 0)) == 0) {
                ((j30_0)object7).D();
            }
            ((j30_0)object7).U();
            ((j30_0)object7).K(-1170611717);
            object6 = ki1.a;
            object6 = (Boolean)((j30_0)object7).j((H30)object6);
            n8 = (int)(((Boolean)object6).booleanValue() ? 1 : 0);
            Object object10 = null;
            if (n8 != 0 && object5 != null) {
                object6 = he1_23.a;
                n14 = n4 >> 18 & 0xE;
                n4 = n4 << 3 & 0x380;
                int n15 = n14 | n4;
                Object object11 = he1_23.c;
                Object object12 = he1_23.b;
                f5 = he1_23.e;
                object9 = he1_23.d;
                Object object13 = object12;
                object12 = im22;
                i70_0 i70_02 = object11;
                object11 = object13;
                object10 = lP1;
                object13 = i70_02;
                Pd1.a(im22, (String)object11, lP1, (Nc)object6, i70_02, f5, (TX)object9, (b30_0)object7, n15, 0);
                ((j30_0)object7).T(false);
                object12 = ((j30_0)object7).X();
                if (object12 == null) return;
                object6 = object11;
                object9 = lP1;
                object8 = ke1_22;
                object7 = function1;
                im2 im23 = im22;
                object5 = hx0_22;
                object3 = ix0_22;
                object4 = hx0_23;
                ((CF2)object12).d = object11 = new bx_1(function0, lP1, function2, ke1_22, he1_22, function1, im22, hx0_22, ix0_22, hx0_23, n3);
                return;
            }
            ((j30_0)object7).T(false);
            object6 = function0.invoke();
            object2 = new fb3_2(object6);
            int n16 = n4 >> 6;
            object6 = n16 & 0xE;
            object6 = object4.invoke(object7, object6);
            object10 = new fb3_2(object6);
            object6 = object;
            object9 = he1_22;
            object8 = hx0_23;
            object3 = object7;
            object7 = ix0_22;
            object4 = object;
            object = function1;
            object5 = function2;
            ((ix_2)object6)(ke1_22, he1_22, hx0_22, hx0_23, function0, ix0_22, function1, function2);
            object8 = v10.c(-299825609, (fx0_2)object6, (b30_0)object3);
            n8 = n4 & 0x70 | 0x6000;
            n10 = n16 & 0x380;
            int n17 = n8 | n10;
            n7 = 0;
            object = null;
            object6 = object2;
            kx_2.a((fb3_2)object2, lP1, he1_22, (fb3_2)object10, (u10)object8, (b30_0)object3, n17, 0);
        }
        CF2 cF2 = ((j30_0)object3).X();
        if (cF2 == null) return;
        object6 = object2;
        object9 = lP1;
        object8 = ke1_22;
        object7 = function1;
        object = im22;
        object5 = hx0_22;
        object3 = ix0_22;
        object4 = hx0_23;
        cF2.d = object2 = new cx_1(function0, lP1, function2, ke1_22, he1_22, function1, im22, hx0_22, ix0_22, hx0_23, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(Function0 function0, LP1 lP1, Function2 fx0_22, ke1_2 ke1_22, Function0 function02, he1_2 he1_22, Function1 function1, im2 im22, hx0_2 hx0_22, ix0_2 ix0_22, hx0_2 hx0_23, b30_0 b30_02, int n3, int n4, int n7) {
        Object object;
        im2 im23;
        Object object2;
        Object object3;
        void var7_10;
        Object object4;
        void var6_9;
        void var4_7;
        Object object5;
        void var3_6;
        int n8;
        Object object6;
        void var10_13;
        void var13_16;
        int n10;
        int n14;
        int n15;
        vc3_1 vc3_12;
        void var8_11;
        int n16;
        void var5_8;
        int n17;
        int n18;
        Object object7;
        int n19;
        Object object8;
        int n20;
        int n21;
        Object object9;
        Object object10;
        int n22;
        void var14_17;
        void var16_19;
        void var12_15;
        Function0 function03;
        block39: {
            void var9_12;
            block38: {
                block37: {
                    block33: {
                        block36: {
                            block35: {
                                block34: {
                                    void var11_14;
                                    function03 = function0;
                                    var16_19 = var12_15;
                                    n22 = var14_17;
                                    Intrinsics.checkNotNullParameter(function0, "imageModel");
                                    int n24 = 1978415671;
                                    object10 = var11_14;
                                    object9 = var11_14.g(n24);
                                    n21 = var12_15 & 6;
                                    if (n21 == 0) {
                                        n21 = (int)(((j30_0)object9).x(function0) ? 1 : 0);
                                        n21 = n21 != 0 ? 4 : 2;
                                        n21 |= var16_19;
                                    } else {
                                        n21 = var12_15;
                                    }
                                    n20 = var16_19 & 0x30;
                                    if (n20 == 0) {
                                        object8 = lP1;
                                        n19 = ((j30_0)object9).J(lP1);
                                        n19 = n19 != 0 ? 32 : 16;
                                        n21 |= n19;
                                    } else {
                                        object8 = lP1;
                                    }
                                    n19 = var16_19 & 0x180;
                                    if (n19 != 0) break block33;
                                    n19 = n22 & 4;
                                    if (n19 != 0) break block34;
                                    object7 = fx0_22;
                                    n18 = (int)(((j30_0)object9).x(fx0_22) ? 1 : 0);
                                    if (n18 == 0) break block35;
                                    n18 = 256;
                                    break block36;
                                }
                                object7 = fx0_22;
                            }
                            n18 = 128;
                        }
                        n21 |= n18;
                        break block37;
                    }
                    object7 = fx0_22;
                }
                n18 = var16_19 & 0xC00;
                if (n18 == 0) {
                    n21 |= 0x400;
                }
                n18 = n21 | 0x6000;
                n17 = n22 & 0x20;
                if (n17 != 0) {
                    n18 = 0x36000 | n21;
                } else {
                    n21 = 0x30000 & var16_19;
                    if (n21 == 0) {
                        object10 = var5_8;
                        n16 = ((j30_0)object9).J(var5_8);
                        n16 = n16 != 0 ? 131072 : 65536;
                    }
                }
                object10 = var5_8;
                break block38;
                n18 |= n16;
            }
            n18 |= 0xD80000;
            n16 = 0x6000000 & var16_19;
            if (n16 == 0) {
                vc3_12 = var8_11;
                n15 = ((j30_0)object9).x(var8_11);
                n15 = n15 != 0 ? 0x4000000 : 0x2000000;
                n18 |= n15;
            } else {
                vc3_12 = var8_11;
            }
            n15 = n22 & 0x200;
            n14 = 0x30000000;
            if (n15 != 0) {
                n18 |= n14;
            } else if ((n14 &= var16_19) == 0) {
                void var32_36 = var9_12;
                n10 = (int)(((j30_0)object9).x(var9_12) ? 1 : 0);
                n10 = n10 != 0 ? 0x20000000 : 0x10000000;
            }
            void var32_35 = var9_12;
            break block39;
            n18 |= n10;
        }
        n10 = var13_16 & 6;
        if (n10 == 0) {
            object6 = var10_13;
            n8 = ((j30_0)object9).x(var10_13);
            n8 = n8 != 0 ? 4 : 2;
            n8 = var13_16 | n8;
        } else {
            object6 = var10_13;
            n8 = var13_16;
        }
        int n25 = 306783379;
        int n26 = n18 & n25;
        int n27 = 306783378;
        if (n26 == n27 && (n26 = n8 & 3) == (n27 = 2) && (n26 = (int)(((j30_0)object9).h() ? 1 : 0)) != 0) {
            void var32_37;
            ((j30_0)object9).D();
            object5 = var3_6;
            object8 = var4_7;
            object4 = var6_9;
            object3 = var7_10;
            object2 = object7;
            im23 = var32_37;
            object7 = object10;
        } else {
            void var32_39;
            ((j30_0)object9).r0();
            n26 = var16_19 & 1;
            object5 = b30$a.a;
            if (n26 != 0 && (n26 = (int)(((j30_0)object9).c0() ? 1 : 0)) == 0) {
                ((j30_0)object9).D();
                n26 = n22 & 4;
                if (n26 != 0) {
                    n18 &= 0xFFFFFC7F;
                }
                n26 = n18 & 0xFFFFE3FF;
                object10 = var3_6;
                object4 = var5_8;
                object3 = var6_9;
                im23 = var7_10;
                n20 = n26;
                object2 = var4_7;
            } else {
                n26 = n22 & 4;
                if (n26 != 0) {
                    object2 = gx_1.a;
                    n18 &= 0xFFFFFC7F;
                } else {
                    object2 = object7;
                }
                object7 = g10_0.a;
                Intrinsics.checkNotNullParameter(object7, "block");
                object9.K(-212168686);
                object9.K(91457797);
                object10 = new ArrayList();
                fx0_2 fx0_23 = object2;
                Intrinsics.checkNotNullParameter(object10, "mutablePlugins");
                object10 = CollectionsKt.m0(object10);
                object2 = new ke1_2((List)object10);
                object10 = 48;
                ((u10)object7).invoke(object2, object9, object10);
                object9.E();
                n21 = -762480885;
                object9.K(n21);
                object10 = object9.v();
                object7 = b30$a.a;
                if (object10 == object7) {
                    object9.o(object2);
                } else {
                    object2 = object10;
                }
                object10 = object2;
                object10 = (ke1_2)object2;
                object9.E();
                object9.E();
                n26 = n18 & 0xFFFFE3FF;
                n19 = 0;
                object7 = null;
                if (n17 != 0) {
                    n17 = 127;
                    object4 = new he1_2(null, null, null, n17);
                } else {
                    object4 = var5_8;
                }
                n17 = -1170707610;
                ((j30_0)object9).K(n17);
                object3 = ((j30_0)object9).v();
                if (object3 == object5) {
                    object3 = new Object();
                    ((j30_0)object9).o(object3);
                }
                object3 = (Function1)object3;
                n19 = 0;
                object7 = null;
                ((j30_0)object9).T(false);
                if (n15 != 0) {
                    n14 = 0;
                    Object var32_38 = null;
                }
                object7 = fx0_23;
                n20 = n26;
                n26 = 0;
                object2 = null;
                n15 = 0;
                im23 = null;
            }
            ((j30_0)object9).U();
            vc3_12 = AndroidCompositionLocals_androidKt.b;
            vc3_12 = (Context)((j30_0)object9).j(vc3_12);
            Object object11 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            object11 = (mu1_1)((j30_0)object9).j((H30)object11);
            ((j30_0)object9).K(-1170692205);
            n10 = (int)(((j30_0)object9).x(vc3_12) ? 1 : 0);
            n22 = n20 & 0xE;
            int n28 = 1;
            void var2_5 = var32_39;
            n14 = 4;
            if (n22 == n14) {
                n14 = 1;
            } else {
                n14 = 0;
                Object var32_40 = null;
            }
            n14 |= n10;
            n22 = n20 & 0xE000;
            n10 = 16384;
            if (n22 != n10) {
                n28 = 0;
            }
            n14 |= n28;
            n10 = (int)(((j30_0)object9).x(object11) ? 1 : 0);
            object6 = ((j30_0)object9).v();
            if ((n14 |= n10) != 0 || object6 == object5) {
                object6 = new zw_2((Context)vc3_12, function03, (Function0)object2, (mu1_1)object11);
                ((j30_0)object9).o(object6);
            }
            object5 = object6;
            object5 = (Function0)object6;
            vc3_12 = null;
            ((j30_0)object9).T(false);
            n16 = n20 & 0x1FF0;
            n14 = 0xE000 & (n20 >>= 3);
            n16 |= n14;
            n14 = 0x70000 & n20;
            n16 |= n14;
            n14 = 0x380000 & n20;
            n16 |= n14;
            n14 = 0x1C00000 & n20;
            n20 = n20 & 0xE000000 | (n16 |= n14);
            n16 = n8 << 27;
            n14 = 0x70000000;
            int n29 = n20 | (n16 &= n14);
            object = object5;
            vw_1.a((Function0)object5, lP1, (Function2)object7, (ke1_2)object10, (he1_2)object4, (Function1)object3, im23, (hx0_2)var8_11, (ix0_2)var2_5, (hx0_2)var10_13, (b30_0)object9, n29);
            object5 = object10;
            object8 = object2;
            object2 = object7;
            object7 = object4;
            object4 = object3;
            object3 = im23;
            im23 = var2_5;
        }
        object = ((j30_0)object9).X();
        if (object != null) {
            ax_1 ax_12;
            object9 = ax_12;
            function03 = function0;
            object10 = lP1;
            vc3_12 = var8_11;
            void var32_41 = var10_13;
            var16_19 = var12_15;
            n10 = var13_16;
            n22 = var14_17;
            ax_12 = new ax_1(function0, lP1, (Function2)object2, (ke1_2)object5, (Function0)object8, (he1_2)object7, (Function1)object4, (im2)object3, (hx0_2)var8_11, (ix0_2)((Object)im23), (hx0_2)var10_13, (int)var12_15, (int)var13_16, (int)var14_17);
            ((CF2)object).d = ax_12;
        }
    }
}

