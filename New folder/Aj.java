/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Aj {
    public static final void a(gx0_2 gx0_22, LP1 lP1, Function1 function1, b30_0 object, int n3) {
        int n4;
        object = object.g(-1985291610);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = ((j30_0)object).x(gx0_22) ? 1 : 0;
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        n7 |= 0x30;
        int n8 = n3 & 0x180;
        if (n8 == 0) {
            n8 = ((j30_0)object).x(function1) ? 1 : 0;
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x93) == (n4 = 146) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            lP1 = LP1$a.b;
            n8 = n7 & 0xE | 0x180;
            n4 = n7 & 0x70;
            n8 |= n4;
            n4 = 57344;
            n7 = n7 << 6 & n4;
            int n10 = n8 | n7;
            Aj.b(gx0_22, lP1, null, null, function1, (b30_0)object, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            sj_0 sj_02 = new sj_0(gx0_22, lP1, function1, n3);
            ((CF2)object).d = sj_02;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(gx0_2 gx0_22, LP1 lP1, Function1 function1, Function1 function12, Function1 function13, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        int n4;
        gx0_2 gx0_23 = gx0_22;
        Function1 function14 = function1;
        Function1 function15 = function13;
        int n7 = n3;
        int n8 = 509101952;
        Object object4 = b30_02.g(n8);
        int n10 = n3 & 6;
        int n14 = 4;
        if (n10 == 0) {
            n10 = ((j30_0)object4).x(gx0_22) ? 1 : 0;
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n15 = n7 & 0x30;
        if (n15 == 0) {
            n15 = ((j30_0)object4).J(lP1) ? 1 : 0;
            n15 = n15 != 0 ? 32 : 16;
            n10 |= n15;
        }
        if ((n15 = n7 & 0x180) == 0) {
            n15 = ((j30_0)object4).x(function14) ? 1 : 0;
            n15 = n15 != 0 ? 256 : 128;
            n10 |= n15;
        }
        n10 |= 0xC00;
        n15 = n7 & 0x6000;
        int n16 = 16384;
        if (n15 == 0) {
            n15 = ((j30_0)object4).x(function15) ? 1 : 0;
            n15 = n15 != 0 ? 16384 : 8192;
            n10 |= n15;
        }
        if ((n15 = n10 & 0x2493) == (n4 = 9362) && (n15 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object3 = function12;
        } else {
            Object object5;
            Object object6;
            tj_1 tj_12 = tj_1.c;
            object2 = AndroidCompositionLocals_androidKt.f;
            object2 = (View)((j30_0)object4).j((H30)object2);
            n4 = ((j30_0)object4).J(object2) ? 1 : 0;
            Object object7 = ((j30_0)object4).v();
            Object object8 = b30$a.a;
            if (n4 != 0 || object7 == object8) {
                try {
                    object6 = FragmentManager.F((View)object2);
                    if (object6 == null) {
                        String string2 = "View ";
                        object7 = new StringBuilder(string2);
                        ((StringBuilder)object7).append(object2);
                        object2 = " does not have a Fragment set";
                        ((StringBuilder)object7).append((String)object2);
                        object2 = ((StringBuilder)object7).toString();
                        object6 = new IllegalStateException((String)object2);
                        throw object6;
                    }
                    object7 = object6;
                }
                catch (IllegalStateException illegalStateException) {}
                object7 = null;
                ((j30_0)object4).o(object7);
            }
            object7 = (Fragment)object7;
            object2 = AndroidCompositionLocals_androidKt.b;
            object2 = (Context)((j30_0)object4).j((H30)object2);
            n4 = ((j30_0)object4).x(object7) ? 1 : 0;
            int n17 = n10 & 0xE;
            int n18 = 0;
            if (n17 == n14) {
                n14 = 1;
            } else {
                n14 = 0;
                object3 = null;
            }
            object6 = ((j30_0)object4).v();
            if ((n14 |= n4) != 0 || object6 == object8) {
                object6 = new uj_0((Fragment)object7, gx0_23);
                ((j30_0)object4).o(object6);
            }
            object3 = object6;
            object3 = (Function1)object6;
            if (function14 == null) {
                ((j30_0)object4).K(1526457000);
                ((j30_0)object4).T(false);
                n4 = 0;
                object6 = null;
            } else {
                ((j30_0)object4).K(1526457001);
                n4 = ((j30_0)object4).J(function14) ? 1 : 0;
                object5 = ((j30_0)object4).v();
                if (n4 != 0 || object5 == object8) {
                    object5 = new vj_1(function14);
                    ((j30_0)object4).o(object5);
                }
                object5 = (Function1)object5;
                ((j30_0)object4).T(false);
                object6 = object5;
            }
            n17 = n10 & 0x1C00;
            n18 = 2048;
            n18 = n17 == n18 ? 1 : 0;
            n17 = ((j30_0)object4).x(object7) ? 1 : 0;
            n18 |= n17;
            n17 = ((j30_0)object4).x(object2) ? 1 : 0;
            object5 = ((j30_0)object4).v();
            if ((n18 |= n17) != 0 || object5 == object8) {
                object5 = new xj_0(tj_12, (Fragment)object7, (Context)object2);
                ((j30_0)object4).o(object5);
            }
            object7 = object5;
            object7 = (Function1)object5;
            n15 = 0xE000 & n10;
            n18 = n15 == n16 ? 1 : 0;
            object2 = ((j30_0)object4).v();
            if (n18 != 0 || object2 == object8) {
                object2 = new yj_1(function15);
                ((j30_0)object4).o(object2);
            }
            object8 = object2;
            object8 = (Function1)object2;
            n17 = n10 & 0x70;
            n10 = 0;
            object2 = object3;
            object = lP1;
            object3 = tj_12;
            tj_12 = null;
            b.b((Function1)object2, lP1, (Function1)object6, (Function1)object7, (Function1)object8, (b30_0)object4, n17, 0);
        }
        object2 = ((j30_0)object4).X();
        if (object2 != null) {
            object4 = object;
            gx0_23 = gx0_22;
            function14 = function1;
            function15 = function13;
            n7 = n3;
            object = new zj_0(gx0_22, lP1, function1, (Function1)object3, function13, n3);
            ((CF2)object2).d = object;
        }
    }

    public static final void c(ViewGroup viewGroup, wj_1 wj_12) {
        int n3 = viewGroup instanceof FragmentContainerView;
        if (n3 != 0) {
            wj_12.invoke(viewGroup);
        } else {
            n3 = viewGroup.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view = viewGroup.getChildAt(i3);
                String string2 = "getChildAt(index)";
                Intrinsics.checkExpressionValueIsNotNull(view, string2);
                boolean bl2 = view instanceof ViewGroup;
                if (!bl2) continue;
                view = (ViewGroup)view;
                Aj.c((ViewGroup)view, wj_12);
            }
        }
    }
}

