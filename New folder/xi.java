/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 */
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupLayout;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class xi {
    public static final nw0_1 a = L30.c(xi$a.c);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(Lw2 lw2, Function0 object, Mw2 mw2, u10 u102, b30_0 b30_02, int n3, int n4) {
        int n7;
        int n8;
        j30_0 j30_02;
        block32: {
            Integer n10;
            Object object2;
            void var23_86;
            void var23_82;
            void var25_116;
            void var25_112;
            void var24_99;
            void var18_60;
            void var39_145;
            bp1_0 bp1_02;
            Object object3;
            int n14;
            PopupLayout popupLayout;
            boolean bl2;
            Object object4;
            Object object5;
            Object object6;
            int n15;
            int n16;
            int n17;
            int n18;
            Lw2 lw22;
            block34: {
                block35: {
                    void var37_140;
                    block33: {
                        void var10_26;
                        int n19;
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        Object object11;
                        void var14_37;
                        int n20;
                        u10 u103;
                        block31: {
                            int n21;
                            block30: {
                                lw22 = lw2;
                                u103 = u102;
                                n21 = n3;
                                b30_0 b30_03 = b30_02;
                                j30_02 = b30_02.g(-830247068);
                                n18 = n3 & 6;
                                if (n18 == 0) {
                                    n18 = (int)(j30_02.J(lw2) ? 1 : 0);
                                    n18 = n18 != 0 ? 4 : 2;
                                    n18 |= n21;
                                } else {
                                    n18 = n3;
                                }
                                n20 = n4 & 2;
                                if (n20 != 0) {
                                    n18 |= 0x30;
                                } else {
                                    n17 = n21 & 0x30;
                                    if (n17 == 0) {
                                        Object object12 = object;
                                        n16 = (int)(j30_02.x(object) ? 1 : 0);
                                        n16 = n16 != 0 ? 32 : 16;
                                    }
                                }
                                Object object13 = object;
                                break block30;
                                n18 |= n16;
                            }
                            n16 = n21 & 0x180;
                            if (n16 == 0) {
                                n16 = (int)(j30_02.J(mw2) ? 1 : 0);
                                n16 = n16 != 0 ? 256 : 128;
                                n18 |= n16;
                            }
                            if ((n16 = n21 & 0xC00) == 0) {
                                n16 = (int)(j30_02.x(u103) ? 1 : 0);
                                n16 = n16 != 0 ? 2048 : 1024;
                                n18 |= n16;
                            }
                            n15 = n18;
                            n16 = 1170;
                            if ((n18 &= 0x493) != n16 || (n18 = (int)(j30_02.h() ? 1 : 0)) == 0) break block31;
                            j30_02.D();
                            break block32;
                        }
                        n18 = 0;
                        Object var18_54 = null;
                        object6 = n20 != 0 ? null : var14_37;
                        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.f;
                        object5 = object11 = j30_02.j(vc3_12);
                        object5 = (View)object11;
                        vc3_1 vc3_13 = O30.f;
                        object4 = object10 = j30_02.j(vc3_13);
                        object4 = (Vo0)object10;
                        nw0_1 nw0_12 = a;
                        Object object14 = object9 = j30_02.j(nw0_12);
                        String string2 = (String)object9;
                        vc3_1 vc3_14 = O30.l;
                        Object object15 = object8 = j30_02.j(vc3_14);
                        bp1_0 bp1_03 = (bp1_0)((Object)object8);
                        j30$b j30$b = j30_02.G();
                        tr1_0 tr1_02 = J83.j(u103, j30_02);
                        Object[] objectArray = new Object[]{};
                        ii_0 ii_02 = ii_0.c;
                        int n22 = 3072;
                        int n24 = 6;
                        n17 = 0;
                        Object var14_38 = null;
                        tr1_0 tr1_03 = tr1_02;
                        ii_0 ii_03 = ii_02;
                        j30$b j30$b2 = j30$b;
                        j30_0 j30_03 = j30_02;
                        bp1_0 bp1_04 = bp1_03;
                        n8 = n22;
                        object = string2;
                        n7 = n24;
                        Object object16 = object7 = wi2_0.b(objectArray, null, ii_02, j30_02, n22, n24);
                        UUID uUID = (UUID)object7;
                        Object object17 = j30_02.v();
                        b30$a$a b30$a$a = b30$a.a;
                        n8 = 1;
                        if (object17 == b30$a$a) {
                            PopupLayout popupLayout2;
                            n16 = 0;
                            PopupLayout popupLayout3 = popupLayout2;
                            Function0 function0 = object6;
                            Mw2 mw22 = mw2;
                            Object object18 = object;
                            PopupLayout popupLayout4 = popupLayout2;
                            Object object19 = object5;
                            bl2 = true;
                            Object object20 = object4;
                            b30$a$a b30$a$a2 = b30$a$a;
                            Lw2 lw23 = lw2;
                            n19 = n15;
                            UUID uUID2 = uUID;
                            popupLayout3((Function0)object6, mw2, (String)object, (View)object5, (Vo0)object4, lw2, uUID);
                            mi_0 mi_02 = new mi_0(popupLayout4, tr1_03);
                            n17 = 1302892335;
                            u10 u104 = new u10(n17, mi_02, bl2);
                            popupLayout4.setContent(j30$b2, u104);
                            j30_02.o((Object)popupLayout4);
                            PopupLayout popupLayout5 = popupLayout4;
                        } else {
                            b30$a$a b30$a$a3 = b30$a$a;
                            n19 = n15;
                            bl2 = true;
                        }
                        popupLayout = (PopupLayout)var10_26;
                        n18 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
                        n17 = n19;
                        n16 = n19 & 0x70;
                        n14 = 32;
                        if (n16 == n14) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            Object var24_93 = null;
                        }
                        n18 |= n14;
                        n14 = n17 & 0x380;
                        n8 = 256;
                        if (n14 == n8) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            Object var23_77 = null;
                        }
                        n18 |= n8;
                        object3 = object;
                        n7 = (int)(j30_02.J(object) ? 1 : 0);
                        n18 |= n7;
                        bp1_02 = bp1_04;
                        n15 = (int)(j30_02.J((Object)bp1_04) ? 1 : 0);
                        Object object21 = j30_02.v();
                        if ((n18 |= n15) != 0) break block33;
                        void var18_58 = var37_140;
                        if (object21 != var37_140) break block34;
                        break block35;
                    }
                    void var18_59 = var37_140;
                }
                object5 = popupLayout;
                object4 = object6;
                Mw2 mw23 = mw2;
                Object object22 = object3;
                Ai ai2 = new Ai(popupLayout, (Function0)object6, mw2, (String)object3, bp1_02);
                j30_02.o(ai2);
            }
            Function1 function1 = (Function1)var39_145;
            ly0_0.b((Object)popupLayout, function1, j30_02);
            n15 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
            int n25 = 32;
            if (n16 == n25) {
                n16 = 1;
            } else {
                n16 = 0;
                Object var25_108 = null;
            }
            n16 |= n15;
            n15 = 256;
            if (n14 == n15) {
                n14 = 1;
            } else {
                n14 = 0;
                Object var24_95 = null;
            }
            n16 |= n14;
            n14 = (int)(j30_02.J(object3) ? 1 : 0);
            n16 |= n14;
            n14 = (int)(j30_02.J((Object)bp1_02) ? 1 : 0);
            Object object23 = j30_02.v();
            if ((n16 |= n14) != 0 || object23 == var18_60) {
                object5 = popupLayout;
                object4 = object6;
                Mw2 mw24 = mw2;
                Object object24 = object3;
                Bi bi2 = new Bi(popupLayout, (Function0)object6, mw2, (String)object3, bp1_02);
                j30_02.o(bi2);
            }
            Function0 function0 = (Function0)var24_99;
            j30_02.q(function0);
            n16 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
            n14 = 4;
            if ((n17 &= 0xE) == n14) {
                n17 = 1;
            } else {
                n17 = 0;
                Object var14_41 = null;
            }
            Object object25 = j30_02.v();
            if ((n17 |= n16) != 0 || object25 == var18_60) {
                di_0 di_02 = new di_0(popupLayout, lw22);
                j30_02.o(di_02);
            }
            Function1 function12 = (Function1)var25_112;
            ly0_0.b(lw22, function12, j30_02);
            n17 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
            Object object26 = j30_02.v();
            if (n17 == 0 && object26 != var18_60) {
                n17 = 0;
                Object var14_43 = null;
            } else {
                n17 = 0;
                Object var14_44 = null;
                ei_0 ei_02 = new ei_0(popupLayout, null);
                j30_02.o(ei_02);
            }
            Function2 function2 = (Function2)var25_116;
            ly0_0.d(j30_02, (Object)popupLayout, function2);
            LP1$a lP1$a = LP1$a.b;
            n14 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
            Object object27 = j30_02.v();
            if (n14 != 0 || object27 == var18_60) {
                fi_0 fi_02 = new fi_0(popupLayout);
                j30_02.o(fi_02);
            }
            Function1 function13 = (Function1)var23_82;
            LP1 lP1 = c.a(lP1$a, function13);
            n14 = (int)(j30_02.x((Object)popupLayout) ? 1 : 0);
            n8 = (int)(j30_02.J((Object)bp1_02) ? 1 : 0);
            Object object28 = j30_02.v();
            if ((n14 |= n8) != 0 || object28 == var18_60) {
                Gi gi = new Gi(popupLayout, bp1_02);
                j30_02.o(gi);
            }
            al1_1 al1_12 = (al1_1)var23_86;
            n18 = j30_02.P;
            rq2_1 rq2_12 = j30_02.P();
            LP1 lP12 = a30_0.c(j30_02, lP1);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = j30_02.a;
            n7 = mp2 instanceof mp;
            if (n7 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n17 = (int)(j30_02.O ? 1 : 0);
            if (n17 != 0) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a(j30_02, al1_12, n20$a$b);
            N20$a$d n20$a$d = N20$a.d;
            Ow3.a(j30_02, rq2_12, n20$a$d);
            N20$a$a n20$a$a = N20$a.f;
            n17 = (int)(j30_02.O ? 1 : 0);
            if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object2 = j30_02.v(), n10 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                rk_0.a(n18, j30_02, n18, n20$a$a);
            }
            N20$a$c n20$a$c = N20$a.c;
            Ow3.a(j30_02, lP12, n20$a$c);
            j30_02.T(bl2);
            Function0 function02 = object6;
        }
        CF2 cF2 = j30_02.X();
        if (cF2 != null) {
            void var14_51;
            hi_0 hi_02;
            hi_0 hi_03 = hi_02;
            Lw2 lw24 = lw2;
            Mw2 mw25 = mw2;
            u10 u105 = u102;
            n8 = n3;
            n7 = n4;
            hi_02 = new hi_0(lw2, (Function0)var14_51, mw2, u102, n3, n4);
            cF2.d = hi_02;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(Nc nc, long l2, Function0 function0, Mw2 mw2, u10 u102, b30_0 b30_02, int n3) {
        fx0_2 fx0_22;
        Object object;
        long l3;
        boolean bl2;
        int n4;
        int n7;
        int n8;
        int n10;
        Nc nc2 = nc;
        int n14 = n3;
        int n15 = 295309329;
        Object object2 = b30_02.g(n15);
        int n16 = n3 & 6;
        int n17 = 4;
        if (n16 == 0) {
            n16 = (int)(((j30_0)object2).J(nc) ? 1 : 0);
            n16 = n16 != 0 ? 4 : 2;
            n16 |= n14;
        } else {
            n16 = n3;
        }
        n16 |= 0x30;
        int n18 = n14 & 0x180;
        if (n18 == 0) {
            void var15_17;
            boolean n102 = ((j30_0)object2).x(function0);
            if (n102) {
                int n19 = 256;
            } else {
                int n20 = 128;
            }
            n16 |= var15_17;
        }
        if ((n10 = n14 & 0xC00) == 0) {
            void var16_22;
            boolean bl3 = ((j30_0)object2).J(mw2);
            if (bl3) {
                int n21 = 2048;
            } else {
                int n22 = 1024;
            }
            n16 |= var16_22;
        }
        if ((n8 = n14 & 0x6000) == 0) {
            void var17_27;
            boolean bl4 = ((j30_0)object2).x(u102);
            if (bl4) {
                int n24 = 16384;
            } else {
                int n25 = 8192;
            }
            n16 |= var17_27;
        }
        if ((n7 = n16 & 0x2493) == (n4 = 9362) && (bl2 = ((j30_0)object2).h())) {
            ((j30_0)object2).D();
            l3 = l2;
        } else {
            int n26;
            b30$a$a b30$a$a;
            boolean bl5 = false;
            object = null;
            long l4 = Ti1.a(0, 0);
            n4 = n16 & 0xE;
            if (n4 == n17) {
                n17 = 1;
            } else {
                n17 = 0;
                b30$a$a = null;
            }
            n4 = n16 & 0x70;
            int n27 = 32;
            if (n4 == n27) {
                n26 = 1;
            }
            object = ((j30_0)object2).v();
            if ((n17 |= n26) != 0 || object == (b30$a$a = b30$a.a)) {
                object = new Uc(nc2, l4);
                ((j30_0)object2).o(object);
            }
            object = (Uc)object;
            int n28 = n16 >> 3 & 0x1FF0;
            n16 = 0;
            fx0_22 = function0;
            xi.a((Lw2)object, function0, mw2, u102, (b30_0)object2, n28, 0);
            l3 = l4;
        }
        object = ((j30_0)object2).X();
        if (object != null) {
            object2 = fx0_22;
            nc2 = nc;
            n14 = n3;
            fx0_22 = new yi_0(nc, l3, function0, mw2, u102, n3);
            ((CF2)object).d = fx0_22;
        }
    }

    public static final boolean c(View view) {
        int n3;
        boolean bl2 = (view = view.getRootView().getLayoutParams()) instanceof WindowManager.LayoutParams;
        if (bl2) {
            view = (WindowManager.LayoutParams)view;
        } else {
            n3 = 0;
            view = null;
        }
        bl2 = false;
        if (view != null && (n3 = view.flags & 0x2000) != 0) {
            bl2 = true;
        }
        return bl2;
    }
}

