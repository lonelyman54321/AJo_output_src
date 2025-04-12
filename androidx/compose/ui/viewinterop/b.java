/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.viewinterop.b$a;
import androidx.compose.ui.viewinterop.b$b;
import androidx.compose.ui.viewinterop.b$c;
import androidx.compose.ui.viewinterop.b$d;
import androidx.compose.ui.viewinterop.b$e;
import androidx.compose.ui.viewinterop.b$f;
import androidx.compose.ui.viewinterop.b$g;
import androidx.compose.ui.viewinterop.b$h;
import androidx.compose.ui.viewinterop.b$i;
import androidx.compose.ui.viewinterop.b$j;
import androidx.compose.ui.viewinterop.b$k;
import androidx.compose.ui.viewinterop.b$l;
import androidx.compose.ui.viewinterop.b$m;
import androidx.compose.ui.viewinterop.b$n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static final b$h a = b$h.c;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(Function1 function1, LP1 lP1, Function1 function12, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        void var15_18;
        LP1 lP12;
        int n7;
        int n8;
        int n10;
        Object object3;
        int n14;
        int n15;
        int n16;
        Object object4;
        int n17;
        block14: {
            block13: {
                n17 = n3;
                int n18 = -1783766393;
                object4 = b30_02.g(n18);
                int n19 = n3 & 6;
                if (n19 == 0) {
                    n16 = (int)(((j30_0)object4).x(function1) ? 1 : 0);
                    n16 = n16 != 0 ? 4 : 2;
                    n16 |= n17;
                } else {
                    n16 = n3;
                }
                n15 = n4 & 2;
                if (n15 != 0) {
                    n16 |= 0x30;
                } else {
                    n14 = n17 & 0x30;
                    if (n14 == 0) {
                        object3 = lP1;
                        n10 = (int)(((j30_0)object4).J(lP1) ? 1 : 0);
                        n10 = n10 != 0 ? 32 : 16;
                    }
                }
                object3 = lP1;
                break block13;
                n16 |= n10;
            }
            n10 = n4 & 4;
            if (n10 != 0) {
                n16 |= 0x180;
            } else {
                n8 = n17 & 0x180;
                if (n8 == 0) {
                    Function1 function13 = function12;
                    n7 = (int)(((j30_0)object4).x(function12) ? 1 : 0);
                    n7 = n7 != 0 ? 256 : 128;
                }
            }
            Function1 function14 = function12;
            break block14;
            n16 |= n7;
        }
        n7 = n16 & 0x93;
        int n20 = 146;
        if (n7 == n20 && (n7 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            lP12 = object3;
            object2 = var15_18;
        } else {
            void var22_29;
            object2 = n15 != 0 ? LP1$a.b : object3;
            b$h b$h = a;
            if (n10 != 0) {
                b$h b$h2 = b$h;
            } else {
                void var22_28 = var15_18;
            }
            n14 = n16 & 0xE | 0xC00;
            n10 = n16 & 0x70;
            n14 |= n10;
            n10 = 57344;
            n16 = n16 << 6 & n10;
            int n21 = n14 | n16;
            int n22 = 4;
            n8 = 0;
            Object var15_19 = null;
            object3 = function1;
            object = object2;
            b.b(function1, (LP1)object2, null, b$h, (Function1)var22_29, (b30_0)object4, n21, n22);
            lP12 = object2;
            object2 = var22_29;
        }
        object = ((j30_0)object4).X();
        if (object != null) {
            b$a b$a;
            object4 = b$a;
            n17 = n3;
            n14 = n4;
            b$a = new b$a(function1, lP12, (Function1)object2, n3, n4);
            ((CF2)object).d = b$a;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(Function1 function1, LP1 lP1, Function1 function12, Function1 function13, Function1 function14, b30_0 b30_02, int n3, int n4) {
        int n7;
        int n8;
        Object object;
        int n10;
        int n14;
        Object object2;
        Object object3;
        int n15;
        Function1 function15;
        Function1 function16;
        LP1 lP12;
        Function1 function17;
        block19: {
            function17 = function1;
            lP12 = lP1;
            function16 = function13;
            function15 = function14;
            n15 = n3;
            int n16 = -180024211;
            object3 = b30_02;
            object2 = b30_02.g(n16);
            n14 = n3 & 6;
            if (n14 == 0) {
                n14 = (int)(((j30_0)object2).x(function1) ? 1 : 0);
                n14 = n14 != 0 ? 4 : 2;
                n14 |= n15;
            } else {
                n14 = n3;
            }
            n10 = n15 & 0x30;
            if (n10 == 0) {
                n10 = (int)(((j30_0)object2).J(lP12) ? 1 : 0);
                n10 = n10 != 0 ? 32 : 16;
                n14 |= n10;
            }
            if ((n10 = n4 & 4) != 0) {
                n14 |= 0x180;
            } else {
                int n17 = n15 & 0x180;
                if (n17 == 0) {
                    object = function12;
                    n8 = (int)(((j30_0)object2).x(function12) ? 1 : 0);
                    n8 = n8 != 0 ? 256 : 128;
                }
            }
            object = function12;
            break block19;
            n14 |= n8;
        }
        n8 = n15 & 0xC00;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object2).x(function16) ? 1 : 0);
            n8 = n8 != 0 ? 2048 : 1024;
            n14 |= n8;
        }
        if ((n8 = n15 & 0x6000) == 0) {
            n8 = (int)(((j30_0)object2).x(function15) ? 1 : 0);
            n8 = n8 != 0 ? 16384 : 8192;
            n14 |= n8;
        }
        if ((n8 = n14 & 0x2493) == (n7 = 9362) && (n8 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
            object3 = object;
        } else {
            Object object4 = n10 != 0 ? null : object;
            n7 = ((j30_0)object2).P;
            Object object5 = FocusGroupPropertiesElement.b;
            object5 = lP12.then((LP1)object5);
            object = FocusTargetNode$FocusTargetElement.b;
            object5 = object5.then((LP1)object);
            Object object6 = FocusTargetPropertiesElement.b;
            object5 = object5.then((LP1)object6).then((LP1)object);
            object = a30_0.c((b30_0)object2, (LP1)object5);
            object5 = O30.f;
            object6 = object5 = ((j30_0)object2).j((H30)object5);
            object6 = (Vo0)object5;
            object5 = O30.l;
            Object object7 = object5 = ((j30_0)object2).j((H30)object5);
            bp1_0 bp1_02 = (bp1_0)((Object)object5);
            rq2_1 rq2_12 = ((j30_0)object2).P();
            object5 = dw1.a;
            Object object8 = object5 = ((j30_0)object2).j((H30)object5);
            object8 = (mu1_1)object5;
            object5 = AndroidCompositionLocals_androidKt.e;
            Object object9 = object5 = ((j30_0)object2).j((H30)object5);
            object9 = (zs2_1)object5;
            boolean bl2 = true;
            object5 = ((j30_0)object2).a;
            if (object4 != null) {
                n8 = 607871394;
                ((j30_0)object2).K(n8);
                object3 = b.d(function17, (b30_0)object2, n14 &= 0xE);
                n10 = object5 instanceof ru3;
                if (n10 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object2).A();
                n10 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n10 != 0) {
                    ((j30_0)object2).C((Function0)object3);
                } else {
                    ((j30_0)object2).n();
                }
                n14 = 0;
                object3 = null;
                object5 = object2;
                n8 = n7;
                Object object10 = object6;
                object6 = object8;
                object8 = object9;
                b.e((b30_0)object2, (LP1)object, n7, (Vo0)object10, (mu1_1)object6, (zs2_1)object9, bp1_02, rq2_12);
                object5 = b$b.c;
                Ow3.a((b30_0)object2, object4, (Function2)object5);
                object5 = b$c.c;
                Ow3.a((b30_0)object2, function15, (Function2)object5);
                object5 = b$d.c;
                Ow3.a((b30_0)object2, function16, (Function2)object5);
                ((j30_0)object2).T(bl2);
                ((j30_0)object2).T(false);
            } else {
                n8 = 608726777;
                ((j30_0)object2).K(n8);
                object3 = b.d(function17, (b30_0)object2, n14 &= 0xE);
                n10 = object5 instanceof ru3;
                if (n10 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object2).t0();
                n10 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n10 != 0) {
                    ((j30_0)object2).C((Function0)object3);
                } else {
                    ((j30_0)object2).n();
                }
                object5 = object2;
                n14 = 0;
                object3 = null;
                n8 = n7;
                Object object11 = object6;
                object6 = object8;
                object8 = object9;
                b.e((b30_0)object2, (LP1)object, n7, (Vo0)object11, (mu1_1)object6, (zs2_1)object9, bp1_02, rq2_12);
                object5 = b$e.c;
                Ow3.a((b30_0)object2, function15, (Function2)object5);
                object5 = b$f.c;
                Ow3.a((b30_0)object2, function16, (Function2)object5);
                ((j30_0)object2).T(bl2);
                ((j30_0)object2).T(false);
            }
            object3 = object4;
        }
        object = ((j30_0)object2).X();
        if (object != null) {
            b$g b$g;
            object2 = b$g;
            function17 = function1;
            lP12 = lP1;
            function16 = function13;
            function15 = function14;
            n15 = n3;
            n10 = n4;
            b$g = new b$g(function1, lP1, (Function1)object3, function13, function14, n3, n4);
            ((CF2)object).d = b$g;
        }
    }

    public static final ViewFactoryHolder c(xp1_0 c20) {
        c20 = c20.j;
        if (c20 != null) {
            return (ViewFactoryHolder)c20;
        }
        bh1_1.d("Required value was null.");
        throw null;
    }

    public static final Function0 d(Function1 function1, b30_0 b30_02, int n3) {
        Object object;
        int n4 = b30_02.F();
        Object object2 = AndroidCompositionLocals_androidKt.b;
        Object object3 = object2 = b30_02.j((H30)object2);
        object3 = (Context)object2;
        j30$b j30$b = b30_02.G();
        object2 = kS2.a;
        Object object4 = object2 = b30_02.j((H30)object2);
        object4 = (iS2)object2;
        object2 = AndroidCompositionLocals_androidKt.f;
        Object object5 = object2 = b30_02.j((H30)object2);
        object5 = (View)object2;
        int n7 = b30_02.x(object3);
        int n8 = n3 & 0xE ^ 6;
        int n10 = 4;
        if (n8 > n10 && (n8 = (int)(b30_02.J(function1) ? 1 : 0)) != 0 || (n3 &= 6) == n10) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        n3 |= n7;
        int n14 = b30_02.x(j30$b);
        n3 |= n14;
        int n15 = b30_02.x(object4);
        n3 |= n15;
        int n16 = b30_02.c(n4);
        n3 |= n16;
        int n17 = b30_02.x(object5);
        object2 = b30_02.v();
        if ((n3 |= n17) != 0 || object2 == (object = b30$a.a)) {
            object2 = object;
            object = new b$i((Context)object3, function1, j30$b, (iS2)object4, n4, (View)object5);
            b30_02.o(object);
        }
        return (Function0)object2;
    }

    public static final void e(b30_0 b30_02, LP1 object, int n3, Vo0 object2, mu1_1 object3, zs2_1 zs2_12, bp1_0 bp1_02, M30 object4) {
        N20.W.getClass();
        N20$a$d n20$a$d = N20$a.d;
        Ow3.a(b30_02, object4, n20$a$d);
        object4 = b$j.c;
        Ow3.a(b30_02, object, (Function2)object4);
        object = b$k.c;
        Ow3.a(b30_02, object2, (Function2)object);
        object = b$l.c;
        Ow3.a(b30_02, object3, (Function2)object);
        object = b$m.c;
        Ow3.a(b30_02, zs2_12, (Function2)object);
        object = b$n.c;
        Ow3.a(b30_02, (Object)bp1_02, (Function2)object);
        object = N20$a.f;
        boolean bl2 = b30_02.e();
        if (bl2 || !(bl2 = Intrinsics.areEqual(object2 = b30_02.v(), object3 = Integer.valueOf(n3)))) {
            re0_0.a(n3, b30_02, n3, (N20$a$a)object);
        }
    }
}

