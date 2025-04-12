/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.animation;

import androidx.compose.animation.EnterExitTransitionElement;
import androidx.compose.ui.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(gr3 gr32, Function1 function1, LP1 lP1, yA0 yA02, JE0 jE0, Function2 function2, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        Object object3;
        Function2 function22;
        JE0 jE02;
        yA0 yA03;
        Object object4;
        Object object5;
        gr3 gr33;
        block68: {
            block72: {
                void var18_86;
                void var46_127;
                void var45_124;
                void var44_120;
                Object object6;
                void var18_81;
                int n7;
                OI0 oI0;
                BR bR;
                Object object7;
                Object object8;
                BR bR2;
                d73_0 d73_02;
                Xz0 xz0;
                Object object9;
                Object object10;
                void var18_27;
                int n8;
                int n10;
                Object object11;
                int n14;
                int n15;
                int n16;
                Object object12;
                Object object13;
                Object object14;
                int n17;
                int n18;
                Object object15;
                Object object16;
                float f5;
                int n19;
                int n20;
                int n21;
                int n22;
                block73: {
                    block70: {
                        block71: {
                            block69: {
                                int n24;
                                block67: {
                                    block66: {
                                        Object object17;
                                        Boolean bl2;
                                        block65: {
                                            gr33 = gr32;
                                            object5 = function1;
                                            object4 = lP1;
                                            yA03 = yA02;
                                            jE02 = jE0;
                                            function22 = function2;
                                            object3 = u102;
                                            n4 = n3;
                                            int n25 = -891967166;
                                            b30_0 b30_03 = b30_02;
                                            object2 = b30_02.g(n25);
                                            n22 = n3 & 6;
                                            n21 = 4;
                                            if (n22 == 0) {
                                                n22 = (int)(((j30_0)object2).J(gr32) ? 1 : 0);
                                                n22 = n22 != 0 ? 4 : 2;
                                                n22 |= n4;
                                            } else {
                                                n22 = n3;
                                            }
                                            n24 = n4 & 0x30;
                                            if (n24 == 0) {
                                                n24 = (int)(((j30_0)object2).x(object5) ? 1 : 0);
                                                n24 = n24 != 0 ? 32 : 16;
                                                n22 |= n24;
                                            }
                                            if ((n24 = n4 & 0x180) == 0) {
                                                n24 = (int)(((j30_0)object2).J(object4) ? 1 : 0);
                                                n24 = n24 != 0 ? 256 : 128;
                                                n22 |= n24;
                                            }
                                            if ((n24 = n4 & 0xC00) == 0) {
                                                n24 = (int)(((j30_0)object2).J(yA03) ? 1 : 0);
                                                n24 = n24 != 0 ? 2048 : 1024;
                                                n22 |= n24;
                                            }
                                            if ((n24 = n4 & 0x6000) == 0) {
                                                n24 = (int)(((j30_0)object2).J(jE02) ? 1 : 0);
                                                n24 = n24 != 0 ? 16384 : 8192;
                                                n22 |= n24;
                                            }
                                            if ((n24 = 0x30000 & n4) == 0) {
                                                n24 = (int)(((j30_0)object2).x(function22) ? 1 : 0);
                                                n24 = n24 != 0 ? 131072 : 65536;
                                                n22 |= n24;
                                            }
                                            n22 |= 0x180000;
                                            n24 = 0xC00000 & n4;
                                            if (n24 == 0) {
                                                n24 = (int)(((j30_0)object2).x(object3) ? 1 : 0);
                                                n24 = n24 != 0 ? 0x800000 : 0x400000;
                                                n22 |= n24;
                                            }
                                            n20 = n22;
                                            n24 = 0x492492;
                                            if ((n22 = 0x492493 & n22) != n24 || (n22 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block65;
                                            ((j30_0)object2).D();
                                            break block66;
                                        }
                                        Object object18 = gr33.d.getValue();
                                        Boolean bl3 = (Boolean)object5.invoke(object18);
                                        n22 = (int)(bl3.booleanValue() ? 1 : 0);
                                        n19 = 0;
                                        f5 = 0.0f;
                                        object16 = null;
                                        object15 = gr33.a;
                                        if (n22 != 0 || (n22 = (int)((bl2 = (Boolean)object5.invoke(object17 = ((Mr3)object15).a())).booleanValue() ? 1 : 0)) != 0 || (n22 = (int)(gr32.h() ? 1 : 0)) != 0 || (n22 = (int)(gr32.d() ? 1 : 0)) != 0) break block67;
                                        n22 = 1790262234;
                                        ((j30_0)object2).K(n22);
                                        ((j30_0)object2).T(false);
                                    }
                                    u10 u103 = object3;
                                    object3 = object4;
                                    break block68;
                                }
                                ((j30_0)object2).K(1787977937);
                                n22 = n20 & 0xE;
                                n18 = n22 | 0x30;
                                n17 = n18 & 0xE;
                                n19 = n17 ^ 6;
                                if (n19 > n21 && (n19 = (int)(((j30_0)object2).J(gr33) ? 1 : 0)) != 0 || (n18 &= 6) == n21) {
                                    n18 = 1;
                                } else {
                                    n18 = 0;
                                    object14 = null;
                                }
                                object16 = ((j30_0)object2).v();
                                object13 = b30$a.a;
                                if (n18 != 0 || object16 == object13) {
                                    object16 = ((Mr3)object15).a();
                                    ((j30_0)object2).o(object16);
                                }
                                if ((n18 = (int)(gr32.h() ? 1 : 0)) != 0) {
                                    object16 = ((Mr3)object15).a();
                                }
                                n24 = -466616829;
                                ((j30_0)object2).K(n24);
                                object14 = a.f(gr33, (Function1)object5, object16, (b30_0)object2);
                                object16 = null;
                                ((j30_0)object2).T(false);
                                object = gr33.d.getValue();
                                ((j30_0)object2).K(n24);
                                object = a.f(gr33, (Function1)object5, object, (b30_0)object2);
                                ((j30_0)object2).T(false);
                                n24 = n17 | 0xC00;
                                object12 = yr3.a;
                                n17 = n24 & 0xE ^ 6;
                                n19 = 4;
                                f5 = 5.6E-45f;
                                if (n17 > n19 && (n16 = ((j30_0)object2).J(gr33)) != 0 || (n15 = n24 & 6) == n19) {
                                    n19 = 1;
                                    f5 = Float.MIN_VALUE;
                                } else {
                                    n19 = 0;
                                    f5 = 0.0f;
                                    object16 = null;
                                }
                                object5 = ((j30_0)object2).v();
                                if (n19 == 0 && object5 != object13) {
                                    n14 = n20;
                                } else {
                                    object16 = new VR1(object14);
                                    object3 = new StringBuilder();
                                    n14 = n20;
                                    object11 = gr33.c;
                                    object4 = h30_0.a((StringBuilder)object3, (String)object11, " > EnterExitTransition");
                                    object5 = new gr3((Mr3)object16, gr33, (String)object4);
                                    ((j30_0)object2).o(object5);
                                }
                                object5 = (gr3)object5;
                                n10 = 4;
                                if (n17 > n10 && (n8 = ((j30_0)object2).J(gr33)) != 0 || (n8 = n24 & 6) == n10) {
                                    n19 = 1;
                                    f5 = Float.MIN_VALUE;
                                } else {
                                    n19 = 0;
                                    f5 = 0.0f;
                                    object16 = null;
                                }
                                n10 = ((j30_0)object2).J(object5) | n19;
                                object3 = ((j30_0)object2).v();
                                if (n10 != 0 || object3 == object13) {
                                    object3 = new Ar3(gr33, (gr3)object5);
                                    ((j30_0)object2).o(object3);
                                }
                                object3 = (Function1)object3;
                                ly0_0.b(object5, (Function1)object3, (b30_0)object2);
                                n10 = (int)(gr32.h() ? 1 : 0);
                                if (n10 != 0) {
                                    long l2 = gr33.l;
                                    ((gr3)object5).m(object14, l2, object);
                                } else {
                                    ((gr3)object5).r(object);
                                    object4 = Boolean.FALSE;
                                    object3 = ((gr3)object5).k;
                                    ((h83_0)object3).setValue(object4);
                                }
                                object4 = J83.j(function22, (b30_0)object2);
                                object3 = ((gr3)object5).a.a();
                                object = ((gr3)object5).d;
                                object15 = ((h83_0)object).getValue();
                                object3 = function22.invoke(object3, object15);
                                n24 = (int)(((j30_0)object2).J(object5) ? 1 : 0);
                                n18 = (int)(((j30_0)object2).J(object4) ? 1 : 0);
                                object14 = ((j30_0)object2).v();
                                n20 = 0;
                                object11 = null;
                                if ((n24 |= n18) != 0 || object14 == object13) {
                                    object14 = new zk_1((gr3)object5, (tr1_0)object4, null);
                                    ((j30_0)object2).o(object14);
                                }
                                object14 = (Function2)object14;
                                object4 = ((j30_0)object2).v();
                                if (object4 == object13) {
                                    object4 = J83.g(object3);
                                    ((j30_0)object2).o(object4);
                                }
                                object4 = (tr1_0)object4;
                                object3 = Unit.a;
                                n24 = (int)(((j30_0)object2).x(object14) ? 1 : 0);
                                object12 = ((j30_0)object2).v();
                                if (n24 != 0 || object12 == object13) {
                                    object12 = new l83_0((Function2)object14, (tr1_0)object4, null);
                                    ((j30_0)object2).o(object12);
                                }
                                object12 = (Function2)object12;
                                ly0_0.d((b30_0)object2, object3, (Function2)object12);
                                object3 = ((gr3)object5).a;
                                object15 = ((Mr3)object3).a();
                                object14 = Xz0.PostExit;
                                if (object15 == object14 && (object15 = ((h83_0)object).getValue()) == object14 && (n10 = (int)(((Boolean)(object4 = (Boolean)object4.getValue())).booleanValue() ? 1 : 0)) != 0) break block69;
                                n19 = 0;
                                f5 = 0.0f;
                                object16 = null;
                                ((j30_0)object2).K(1788869559);
                                n10 = 4;
                                if (n22 != n10) break block70;
                                break block71;
                            }
                            ((j30_0)object2).K(1790256282);
                            n19 = 0;
                            f5 = 0.0f;
                            object16 = null;
                            ((j30_0)object2).T(false);
                            object3 = lP1;
                            object13 = u102;
                            n15 = 0;
                            object5 = null;
                            break block72;
                        }
                        n10 = 1;
                        break block73;
                    }
                    n10 = 0;
                    object4 = null;
                }
                Object object19 = ((j30_0)object2).v();
                if (n10 != 0 || object19 == object13) {
                    ll_2 ll_22 = new ll_2();
                    ((j30_0)object2).o(ll_22);
                }
                object4 = var18_27;
                object4 = (ll_2)var18_27;
                Ws3 ws3 = zz0_0.a;
                object12 = hA0.c;
                n22 = (int)(((j30_0)object2).J(object5) ? 1 : 0);
                object15 = ((j30_0)object2).v();
                if (n22 != 0 || object15 == object13) {
                    object15 = J83.g(yA02);
                    ((j30_0)object2).o(object15);
                }
                object15 = (tr1_0)object15;
                Object object20 = ((Mr3)object3).a();
                if (object20 == (object14 = ((h83_0)object).getValue()) && (object10 = ((Mr3)object3).a()) == (object14 = Xz0.Visible)) {
                    n22 = (int)(((gr3)object5).h() ? 1 : 0);
                    if (n22 != 0) {
                        object15.setValue(yA03);
                    } else {
                        zA0 zA02 = yA0.a;
                        object15.setValue(zA02);
                    }
                } else {
                    Object object21 = ((h83_0)object).getValue();
                    if (object21 == (object14 = Xz0.Visible)) {
                        zA0 zA03 = ((yA0)object15.getValue()).b(yA03);
                        object15.setValue(zA03);
                    }
                }
                object14 = object9 = object15.getValue();
                object14 = (yA0)object9;
                n22 = (int)(((j30_0)object2).J(object5) ? 1 : 0);
                object15 = ((j30_0)object2).v();
                if (n22 != 0 || object15 == object13) {
                    object15 = J83.g(jE0);
                    ((j30_0)object2).o(object15);
                }
                object15 = (tr1_0)object15;
                Object object22 = ((Mr3)object3).a();
                if (object22 == (object16 = ((h83_0)object).getValue()) && (object3 = ((Mr3)object3).a()) == (xz0 = Xz0.Visible)) {
                    n8 = (int)(((gr3)object5).h() ? 1 : 0);
                    if (n8 != 0) {
                        object15.setValue(jE02);
                    } else {
                        object3 = JE0.a;
                        object15.setValue(object3);
                    }
                } else {
                    Xz0 xz02;
                    object3 = ((h83_0)object).getValue();
                    if (object3 != (xz02 = Xz0.Visible)) {
                        object3 = ((JE0)object15.getValue()).b(jE02);
                        object15.setValue(object3);
                    }
                }
                object3 = (JE0)object15.getValue();
                d73_0 d73_03 = ((yA0)object14).a().b;
                if (d73_03 == null && (d73_02 = ((JE0)object3).a().b) == null) {
                    n19 = 0;
                    f5 = 0.0f;
                    object16 = null;
                } else {
                    n19 = 1;
                    f5 = Float.MIN_VALUE;
                }
                BR bR3 = ((yA0)object14).a().c;
                n16 = bR3 == null && (bR2 = ((JE0)object3).a().c) == null ? 0 : 1;
                if (n19 != 0) {
                    void var18_50;
                    n22 = -821375963;
                    ((j30_0)object2).K(n22);
                    object = ya3_0.g;
                    Object object23 = ((j30_0)object2).v();
                    if (object23 == object13) {
                        String string2 = "Built-in slide";
                        ((j30_0)object2).o(string2);
                    }
                    object15 = var18_50;
                    object15 = (String)var18_50;
                    Object object24 = object5;
                    object8 = object14;
                    object14 = object2;
                    object7 = object12;
                    n17 = 384;
                    n20 = 0;
                    object11 = null;
                    n19 = 0;
                    object16 = null;
                    f5 = 0.0f;
                    gr3$a gr3$a = yr3.a((gr3)object5, (Ws3)object, (String)object15, (b30_0)object2, n17, 0);
                    ((j30_0)object2).T(false);
                    gr3$a gr3$a2 = gr3$a;
                } else {
                    object8 = object14;
                    object7 = object12;
                    n20 = 0;
                    object11 = null;
                    n22 = -821278096;
                    ((j30_0)object2).K(n22);
                    ((j30_0)object2).T(false);
                    Object var44_119 = null;
                }
                if (n16 != 0) {
                    void var18_56;
                    n22 = -821202177;
                    ((j30_0)object2).K(n22);
                    object = ya3_0.h;
                    Object object25 = ((j30_0)object2).v();
                    if (object25 == object13) {
                        String string3 = "Built-in shrink/expand";
                        ((j30_0)object2).o(string3);
                    }
                    object15 = var18_56;
                    object15 = (String)var18_56;
                    n17 = 384;
                    n19 = 0;
                    f5 = 0.0f;
                    object16 = null;
                    Object object26 = object5;
                    object14 = object2;
                    gr3$a gr3$a = yr3.a((gr3)object5, (Ws3)object, (String)object15, (b30_0)object2, n17, 0);
                    ((j30_0)object2).T(false);
                    gr3$a gr3$a3 = gr3$a;
                } else {
                    n22 = -821099041;
                    ((j30_0)object2).K(n22);
                    ((j30_0)object2).T(false);
                    Object var45_123 = null;
                }
                if (n16 != 0) {
                    void var18_62;
                    n22 = -821034002;
                    ((j30_0)object2).K(n22);
                    object = ya3_0.g;
                    Object object27 = ((j30_0)object2).v();
                    if (object27 == object13) {
                        String string4 = "Built-in InterruptionHandlingOffset";
                        ((j30_0)object2).o(string4);
                    }
                    object15 = var18_62;
                    object15 = (String)var18_62;
                    n17 = 384;
                    n19 = 0;
                    f5 = 0.0f;
                    object16 = null;
                    Object object28 = object5;
                    object14 = object2;
                    gr3$a gr3$a = yr3.a((gr3)object5, (Ws3)object, (String)object15, (b30_0)object2, n17, 0);
                    ((j30_0)object2).T(false);
                    gr3$a gr3$a4 = gr3$a;
                } else {
                    n22 = -820883777;
                    ((j30_0)object2).K(n22);
                    ((j30_0)object2).T(false);
                    Object var46_126 = null;
                }
                BR bR4 = ((yA0)object8).a().c;
                if (bR4 != null && (n22 = (int)(bR4.d ? 1 : 0)) == 0 || (bR = ((JE0)object3).a().c) != null && (n22 = (int)(bR.d ? 1 : 0)) == 0 || n16 == 0) {
                    n19 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    n19 = 0;
                    f5 = 0.0f;
                    object16 = null;
                }
                OI0 oI02 = ((yA0)object8).a().a;
                if (oI02 == null && (oI0 = ((JE0)object3).a().a) == null) {
                    n22 = 0;
                    Object var18_71 = null;
                } else {
                    n22 = 1;
                }
                ((yA0)object8).a().getClass();
                object = ((JE0)object3).a();
                object.getClass();
                if (n22 != 0) {
                    void var18_77;
                    n22 = -675389204;
                    ((j30_0)object2).K(n22);
                    FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                    object = ya3_0.a;
                    Object object29 = ((j30_0)object2).v();
                    if (object29 == object13) {
                        String string5 = "Built-in alpha";
                        ((j30_0)object2).o(string5);
                    }
                    object15 = var18_77;
                    object15 = (String)var18_77;
                    n17 = 384;
                    n16 = 0;
                    Object object30 = object5;
                    object14 = object2;
                    n7 = n19;
                    n19 = 0;
                    object16 = null;
                    f5 = 0.0f;
                    gr3$a gr3$a = yr3.a((gr3)object5, (Ws3)object, (String)object15, (b30_0)object2, n17, 0);
                    ((j30_0)object2).T(false);
                } else {
                    n7 = n19;
                    ((j30_0)object2).K(-675252433);
                    ((j30_0)object2).T(false);
                    n22 = 0;
                    Object var18_80 = null;
                }
                ((j30_0)object2).K(-675057009);
                ((j30_0)object2).T(false);
                ((j30_0)object2).K(-674835793);
                ((j30_0)object2).T(false);
                n21 = (int)(((j30_0)object2).x(var18_81) ? 1 : 0);
                object15 = object8;
                n18 = (int)(((j30_0)object2).J(object8) ? 1 : 0);
                n21 |= n18;
                n18 = (int)(((j30_0)object2).J(object3) ? 1 : 0);
                n21 |= n18;
                n18 = 0;
                object14 = null;
                n17 = (int)(((j30_0)object2).x(null) ? 1 : 0);
                n21 |= n17;
                n17 = (int)(((j30_0)object2).J(object5) ? 1 : 0);
                n21 |= n17;
                n17 = (int)(((j30_0)object2).x(null) ? 1 : 0);
                object12 = ((j30_0)object2).v();
                if ((n21 |= n17) != 0 || object12 == object13) {
                    object6 = object15;
                    object12 = new yz0_1((gr3$a)var18_81, null, (gr3)object5, (yA0)object15, (JE0)object3, null);
                    ((j30_0)object2).o(object12);
                }
                Object object31 = object12;
                X01 x01 = (X01)object12;
                object = LP1$a.b;
                n18 = n7;
                n17 = (int)(((j30_0)object2).a(n7 != 0) ? 1 : 0);
                object16 = object7;
                n16 = ((j30_0)object2).J(object7);
                object11 = ((j30_0)object2).v();
                if ((n17 |= n16) != 0 || object11 == object13) {
                    object11 = new iA0((Function0)object16, n18 != 0);
                    ((j30_0)object2).o(object11);
                }
                object11 = (Function1)object11;
                object14 = androidx.compose.ui.graphics.a.a((LP1)object, (Function1)object11);
                object6 = var44_120;
                object8 = object16;
                X01 x012 = x01;
                object12 = new EnterExitTransitionElement((gr3)object5, (gr3$a)var45_124, (gr3$a)var46_127, (gr3$a)object6, (yA0)object15, (JE0)object3, (Function0)object16, x01);
                object5 = object14.then((LP1)object12);
                ((j30_0)object2).K(1581766416);
                n8 = 0;
                ((j30_0)object2).T(false);
                object5 = object5.then((LP1)object);
                object3 = lP1;
                object5 = lP1.then((LP1)object5);
                Object object32 = ((j30_0)object2).v();
                if (object32 == object13) {
                    Ik ik = new Ik((ll_2)object4);
                    ((j30_0)object2).o(ik);
                }
                Ik ik = (Ik)var18_86;
                n4 = ((j30_0)object2).P;
                object = ((j30_0)object2).P();
                object5 = a30_0.c((b30_0)object2, (LP1)object5);
                N20.W.getClass();
                object15 = N20$a.b;
                object14 = ((j30_0)object2).a;
                n18 = object14 instanceof mp;
                if (n18 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object2).A();
                n18 = ((j30_0)object2).O;
                if (n18 != 0) {
                    ((j30_0)object2).C((Function0)object15);
                } else {
                    ((j30_0)object2).n();
                }
                object15 = N20$a.e;
                Ow3.a((b30_0)object2, ik, (Function2)object15);
                N20$a$d n20$a$d = N20$a.d;
                Ow3.a((b30_0)object2, object, n20$a$d);
                N20$a$a n20$a$a = N20$a.f;
                n21 = ((j30_0)object2).O;
                if (n21 != 0 || (n21 = Intrinsics.areEqual(object = ((j30_0)object2).v(), object15 = Integer.valueOf(n4))) == 0) {
                    rk_0.a(n4, (j30_0)object2, n4, n20$a$a);
                }
                object13 = N20$a.c;
                Ow3.a((b30_0)object2, object5, (Function2)object13);
                object5 = n14 >> 18 & 0x70;
                object13 = u102;
                u102.invoke(object4, object2, object5);
                ((j30_0)object2).T(true);
                n15 = 0;
                object5 = null;
                ((j30_0)object2).T(false);
            }
            ((j30_0)object2).T(false);
        }
        CF2 cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object2 = object;
            gr33 = gr32;
            object5 = function1;
            object4 = lP1;
            yA03 = yA02;
            jE02 = jE0;
            function22 = function2;
            object3 = u102;
            n4 = n3;
            object = new yk_0(gr32, function1, lP1, yA02, jE0, function2, u102, n3);
            cF2.d = object;
        }
    }

    public static final void b(boolean bl2, LP1 lP1, yA0 yA02, JE0 jE0, String string2, u10 u102, b30_0 b30_02, int n3) {
        Lambda lambda;
        Object object;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n7;
        int n8 = 3;
        int n10 = -1741346906;
        Object object6 = b30_02;
        j30_0 j30_02 = b30_02.g(n10);
        int n14 = n3 & 0x30;
        if (n14 == 0) {
            n14 = (int)(j30_02.a(bl2) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n14 = n3 | n14;
        } else {
            n14 = n3;
        }
        n14 |= 0x36D80;
        int n15 = n3 & 0x180000;
        if (n15 == 0) {
            n15 = (int)(j30_02.x(u102) ? 1 : 0);
            n15 = n15 != 0 ? 0x100000 : 524288;
            n14 |= n15;
        }
        if ((n15 = 0x92491 & n14) == (n7 = 599184) && (n15 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object6 = lP1;
            object5 = yA02;
            object4 = jE0;
            object3 = string2;
        } else {
            boolean bl3;
            LP1$a lP1$a = LP1$a.b;
            n15 = 0;
            object4 = zz0_0.d(null, n8);
            object3 = zz0_0.a(null, null, 15);
            zA0 zA02 = ((yA0)object4).b((yA0)object3);
            object5 = zz0_0.e(null, n8);
            object4 = vE3.a;
            n7 = 1;
            long l2 = dj1.a(n7, n7);
            Object object7 = new bj1(l2);
            int n16 = 1137180672;
            float f5 = 400.0f;
            object3 = Hl.b(f5, n7, object7);
            object2 = Nc$a.o;
            object7 = Nc$a.m;
            n4 = (int)(Intrinsics.areEqual(object2, object7) ? 1 : 0);
            object2 = n4 != 0 ? Nc$a.d : ((bl3 = Intrinsics.areEqual(object2, object2)) ? Nc$a.f : Nc$a.e);
            object = oA0.c;
            object7 = new pa0_0((Function1)object);
            object4 = zz0_0.f((Nc)object2, (un0_0)object3, (Function1)object7, n7 != 0);
            KE0 kE0 = ((JE0)object5).b((JE0)object4);
            object5 = bl2;
            n8 = n14 >> 3;
            n7 = n8 & 0xE;
            n16 = n14 >> 12 & 0x70;
            String string3 = "AnimatedVisibility";
            object5 = yr3.d(object5, string3, j30_02, n7 |= n16, 0);
            n7 = n14 & 0x380 | 0x30;
            n16 = n14 & 0x1C00;
            n7 |= n16;
            n16 = 57344;
            f5 = 8.0356E-41f;
            n14 = n14 & n16 | n7;
            n7 = 458752;
            int n17 = n14 | (n8 &= n7);
            lambda = cl_1.c;
            object6 = object5;
            object5 = lambda;
            object4 = lP1$a;
            object3 = zA02;
            object2 = kE0;
            object7 = u102;
            object = j30_02;
            a.e((gr3)object6, (Function1)((Object)lambda), lP1$a, zA02, kE0, u102, j30_02, n17);
            object6 = lP1$a;
            object5 = zA02;
            object4 = kE0;
            object3 = string3;
        }
        object = j30_02.X();
        if (object != null) {
            dl_1 dl_12;
            lambda = dl_12;
            n10 = (int)(bl2 ? 1 : 0);
            object2 = u102;
            n4 = n3;
            dl_12 = new dl_1(bl2, (LP1)object6, (yA0)object5, (JE0)object4, (String)object3, u102, n3);
            ((CF2)object).d = dl_12;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void c(boolean bl2, LP1 lP1, yA0 yA02, JE0 jE0, String string2, u10 u102, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        String string3;
        int n7;
        Object object4;
        int n8;
        int n10;
        Object object5;
        int n14;
        j30_0 j30_02;
        Object object6;
        int n15;
        int n16;
        int n17;
        block17: {
            block16: {
                int n18;
                n17 = n3;
                n16 = 3;
                n15 = 4;
                int n19 = 2088733774;
                object6 = b30_02;
                j30_02 = b30_02.g(n19);
                int n20 = n3 & 6;
                if (n20 == 0) {
                    n20 = (int)(bl2 ? 1 : 0);
                    n18 = (int)(j30_02.a(bl2) ? 1 : 0);
                    n18 = n18 != 0 ? 4 : 2;
                    n18 |= n17;
                } else {
                    n20 = (int)(bl2 ? 1 : 0);
                    n18 = n3;
                }
                n14 = n18 | 0x30;
                n15 = n4 & 4;
                if (n15 != 0) {
                    n14 = n18 | 0x1B0;
                } else {
                    n18 = n17 & 0x180;
                    if (n18 == 0) {
                        object5 = yA02;
                        n10 = (int)(j30_02.J(yA02) ? 1 : 0);
                        n10 = n10 != 0 ? 256 : 128;
                    }
                }
                object5 = yA02;
                break block16;
                n14 |= n10;
            }
            n10 = n4 & 8;
            if (n10 != 0) {
                n14 |= 0xC00;
            } else {
                n8 = n17 & 0xC00;
                if (n8 == 0) {
                    object4 = jE0;
                    n7 = j30_02.J(jE0);
                    n7 = n7 != 0 ? 2048 : 1024;
                }
            }
            object4 = jE0;
            break block17;
            n14 |= n7;
        }
        n14 |= 0x6000;
        n7 = 0x30000 & n17;
        if (n7 == 0) {
            n7 = (int)(j30_02.x(u102) ? 1 : 0);
            n7 = n7 != 0 ? 131072 : 65536;
            n14 |= n7;
        }
        n7 = 0x12493 & n14;
        int n21 = 74898;
        float f5 = 1.04954E-40f;
        if (n7 == n21 && (n7 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            LP1 lP12 = lP1;
            string3 = string2;
        } else {
            long l2;
            yA0 yA03;
            LP1$a lP1$a = LP1$a.b;
            object3 = Nc$a.i;
            n21 = 1137180672;
            f5 = 400.0f;
            boolean bl3 = true;
            if (n15 != 0) {
                yA03 = zz0_0.d(null, n16);
                object5 = vE3.a;
                l2 = dj1.a((int)(bl3 ? 1 : 0), (int)(bl3 ? 1 : 0));
                object5 = new bj1(l2);
                object5 = Hl.b(f5, (int)(bl3 ? 1 : 0), object5);
                lA0 lA02 = lA0.c;
                object5 = zz0_0.b((Nc)object3, (un0_0)object5, lA02, bl3);
                yA03 = yA03.b((yA0)object5);
            } else {
                yA03 = object5;
            }
            if (n10 != 0) {
                object5 = zz0_0.a;
                object5 = vE3.a;
                l2 = dj1.a((int)(bl3 ? 1 : 0), (int)(bl3 ? 1 : 0));
                object5 = new bj1(l2);
                object5 = Hl.b(f5, (int)(bl3 ? 1 : 0), object5);
                object2 = qa0_0.c;
                object5 = zz0_0.f((Nc)object3, (un0_0)object5, (Function1)object2, bl3);
                object2 = zz0_0.e(null, n16);
                object5 = ((JE0)object5).b((JE0)object2);
            } else {
                object5 = object4;
            }
            object2 = bl2;
            n8 = n14 & 0xE;
            n7 = n14 >> 9 & 0x70;
            Object object7 = "AnimatedVisibility";
            object4 = yr3.d(object2, (String)object7, j30_02, n8 |= n7, 0);
            n16 = n14 << 3;
            n10 = n16 & 0x380 | 0x30;
            n7 = n16 & 0x1C00;
            n10 |= n7;
            n7 = 57344;
            n16 = n16 & n7 | n10;
            n10 = 458752;
            n16 |= (n14 &= n10);
            object3 = al_2.d;
            object = lP1$a;
            u10 u103 = u102;
            string3 = object7;
            object7 = j30_02;
            a.e((gr3)object4, (Function1)object3, lP1$a, yA03, (JE0)object5, u102, j30_02, n16);
            object4 = object5;
            object5 = yA03;
        }
        object3 = j30_02.X();
        if (object3 != null) {
            void var25_27;
            n15 = (int)(bl2 ? 1 : 0);
            j30_02 = var25_27;
            object6 = object5;
            object5 = object4;
            object2 = u102;
            n17 = n3;
            n8 = n4;
            object = new bl_1(bl2, (LP1)var25_27, (yA0)object6, (JE0)object4, string3, u102, n3, n4);
            ((CF2)object3).d = object;
        }
    }

    public static final void d(boolean bl2, LP1 lP1, yA0 yA02, JE0 jE0, String string2, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n4;
        int n7 = 1766503102;
        Object object7 = b30_02;
        Object object8 = b30_02.g(n7);
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object8).a(bl2) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n8 = n3 | n8;
        } else {
            n8 = n3;
        }
        n8 |= 0x36D80;
        int n10 = n3 & 0x180000;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object8).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 0x100000 : 524288;
            n8 |= n10;
        }
        if ((n10 = 0x92491 & n8) == (n4 = 599184) && (n10 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            object6 = lP1;
            object5 = yA02;
            object4 = jE0;
            object3 = string2;
        } else {
            object2 = LP1$a.b;
            n10 = 0;
            n4 = 3;
            object4 = zz0_0.d(null, n4);
            int n14 = 15;
            object = zz0_0.c(null, null, n14);
            zA0 zA02 = ((yA0)object4).b((yA0)object);
            object5 = zz0_0.e(null, n4);
            object6 = zz0_0.g(null, null, n14);
            KE0 kE0 = ((JE0)object5).b((JE0)object6);
            object6 = bl2;
            n4 = n8 >> 3;
            int n15 = n4 & 0xE;
            n14 = n8 >> 12 & 0x70;
            String string3 = "AnimatedVisibility";
            object6 = yr3.d(object6, string3, (b30_0)object8, n15 |= n14, 0);
            n15 = n8 & 0x380 | 0x30;
            n14 = n8 & 0x1C00;
            n15 |= n14;
            n14 = 57344;
            n8 = n8 & n14 | n15;
            n15 = 458752;
            int n16 = n8 | (n4 &= n15);
            object5 = el_1.c;
            object7 = object6;
            object6 = object5;
            object5 = object2;
            object4 = zA02;
            object3 = kE0;
            object = u102;
            a.e((gr3)object7, (Function1)object6, (LP1)object2, zA02, kE0, u102, (b30_0)object8, n16);
            object6 = object2;
            object5 = zA02;
            object4 = kE0;
            object3 = string3;
        }
        CF2 cF2 = ((j30_0)object8).X();
        if (cF2 != null) {
            object8 = object2;
            n8 = (int)(bl2 ? 1 : 0);
            object = u102;
            cF2.d = object2 = new fl_2(bl2, (LP1)object6, (yA0)object5, (JE0)object4, (String)object3, u102, n3);
        }
    }

    public static final void e(gr3 gr32, Function1 function1, LP1 lP1, yA0 yA02, JE0 jE0, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        int n4;
        Object object2;
        Object object3;
        int n7;
        gr3 gr33 = gr32;
        Function1 function12 = function1;
        LP1 lP12 = lP1;
        int n8 = n3;
        Object object4 = b30_02;
        Object object5 = b30_02.g(429978603);
        int n10 = n3 & 6;
        int n14 = 4;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object5).J(gr32) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n8;
        } else {
            n10 = n3;
        }
        int n15 = n8 & 0x30;
        int n16 = 32;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object5).x(function12) ? 1 : 0);
            n15 = n15 != 0 ? 32 : 16;
            n10 |= n15;
        }
        if ((n15 = n8 & 0x180) == 0) {
            n15 = (int)(((j30_0)object5).J(lP12) ? 1 : 0);
            n15 = n15 != 0 ? 256 : 128;
            n10 |= n15;
        }
        if ((n15 = n8 & 0xC00) == 0) {
            n15 = (int)(((j30_0)object5).J(yA02) ? 1 : 0);
            n15 = n15 != 0 ? 2048 : 1024;
            n10 |= n15;
        }
        if ((n15 = n8 & 0x6000) == 0) {
            n15 = (int)(((j30_0)object5).J(jE0) ? 1 : 0);
            n15 = n15 != 0 ? 16384 : 8192;
            n10 |= n15;
        }
        n15 = 196608;
        int n17 = n8 & n15;
        Object object6 = u102;
        if (n17 == 0) {
            n17 = (int)(((j30_0)object5).x(u102) ? 1 : 0);
            n17 = n17 != 0 ? 131072 : 65536;
            n10 |= n17;
        }
        if ((n17 = 0x12493 & n10) == (n7 = 74898) && (n17 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
        } else {
            n17 = n10 & 0x70;
            n7 = 0;
            object3 = null;
            if (n17 == n16) {
                n16 = 1;
            } else {
                n16 = 0;
                object2 = null;
            }
            n4 = n10 & 0xE;
            if (n4 == n14) {
                n7 = 1;
            }
            n14 = n16 | n7;
            object2 = ((j30_0)object5).v();
            if (n14 != 0 || object2 == (object4 = b30$a.a)) {
                object2 = new hl_1(function12, gr33);
                ((j30_0)object5).o(object2);
            }
            object2 = (gx0_2)object2;
            object2 = b.a(lP12, (gx0_2)object2);
            n14 = n4 | n15 | n17;
            n15 = n10 & 0x1C00;
            n14 |= n15;
            n15 = 0xE000 & n10;
            n14 |= n15;
            n15 = 0x1C00000;
            n10 = n10 << 6 & n15;
            int n18 = n14 | n10;
            object3 = il_1.c;
            object4 = function1;
            object = object2;
            object2 = yA02;
            a.a(gr32, function1, (LP1)object, yA02, jE0, (Function2)object3, u102, (b30_0)object5, n18);
        }
        object6 = ((j30_0)object5).X();
        if (object6 != null) {
            object4 = gr32;
            object = function1;
            object2 = lP1;
            object3 = jE0;
            n4 = n3;
            ((CF2)object6).d = object5 = new jl_2(gr32, function1, lP1, yA02, jE0, u102, n3);
        }
    }

    public static final Xz0 f(gr3 object, Function1 function1, Object object2, b30_0 b30_02) {
        b30_02.z(-902048200, object);
        boolean n3 = ((gr3)object).h();
        object = ((gr3)object).a;
        if (n3) {
            int n4 = 2101296683;
            b30_02.K(n4);
            b30_02.E();
            object2 = (Boolean)function1.invoke(object2);
            boolean bl2 = (Boolean)object2;
            if (bl2) {
                object = Xz0.Visible;
            } else {
                object = ((Mr3)object).a();
                boolean bl3 = (Boolean)(object = (Boolean)function1.invoke(object));
                object = bl3 ? Xz0.PostExit : Xz0.PreEnter;
            }
        } else {
            int n7 = 2101530516;
            b30_02.K(n7);
            Object object3 = b30_02.v();
            b30$a$a b30$a$a = b30$a.a;
            if (object3 == b30$a$a) {
                object3 = J83.g(Boolean.FALSE);
                b30_02.o(object3);
            }
            object3 = (tr1_0)object3;
            object = ((Mr3)object).a();
            boolean bl4 = (Boolean)(object = (Boolean)function1.invoke(object));
            if (bl4) {
                object = Boolean.TRUE;
                object3.setValue(object);
            }
            object = (bl4 = ((Boolean)(object = (Boolean)function1.invoke(object2))).booleanValue()) ? Xz0.Visible : ((bl4 = ((Boolean)(object = (Boolean)object3.getValue())).booleanValue()) ? Xz0.PostExit : Xz0.PreEnter);
            b30_02.E();
        }
        b30_02.H();
        return object;
    }
}

