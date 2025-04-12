/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.view.View
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView$b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class AndroidCompositionLocals_androidKt {
    public static final nw0_1 a;
    public static final vc3_1 b;
    public static final vc3_1 c;
    public static final vc3_1 d;
    public static final vc3_1 e;
    public static final vc3_1 f;

    static {
        vc3_1 vc3_12;
        a = L30.c(AndroidCompositionLocals_androidKt$a.c);
        Lambda lambda = AndroidCompositionLocals_androidKt$b.c;
        b = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = AndroidCompositionLocals_androidKt$c.c;
        c = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = AndroidCompositionLocals_androidKt$d.c;
        d = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = AndroidCompositionLocals_androidKt$e.c;
        e = vc3_12 = new H30((Function0)((Object)lambda));
        lambda = AndroidCompositionLocals_androidKt$f.c;
        f = vc3_12 = new H30((Function0)((Object)lambda));
    }

    public static final void a(AndroidComposeView androidComposeView, Function2 function2, b30_0 b30_02, int n3) {
        Object object;
        block31: {
            Object object2;
            Object object3;
            j30_0 j30_02;
            int n4;
            Function2 function22;
            block30: {
                int n7;
                boolean bl2;
                Object object4;
                MB2[] mB2Array;
                int n8;
                Object object5;
                Object object6;
                int n10;
                Object object7;
                block29: {
                    object = androidComposeView;
                    function22 = function2;
                    n4 = n3;
                    int n14 = 1396852028;
                    object7 = b30_02;
                    j30_02 = b30_02.g(n14);
                    n10 = 6;
                    int n15 = n3 & 6;
                    if (n15 == 0) {
                        n15 = (int)(j30_02.x(androidComposeView) ? 1 : 0);
                        n15 = n15 != 0 ? 4 : 2;
                        n15 |= n4;
                    } else {
                        n15 = n3;
                    }
                    int n16 = n4 & 0x30;
                    if (n16 == 0) {
                        n16 = (int)(j30_02.x(function22) ? 1 : 0);
                        n16 = n16 != 0 ? 32 : 16;
                        n15 |= n16;
                    }
                    if ((n15 &= 0x13) != (n16 = 18) || (n15 = (int)(j30_02.h() ? 1 : 0)) == 0) break block29;
                    j30_02.D();
                    break block30;
                }
                Object object8 = androidComposeView.getContext();
                Object object9 = j30_02.v();
                if (object9 == (object6 = b30$a.a)) {
                    object5 = object8.getResources().getConfiguration();
                    object9 = new Configuration(object5);
                    object9 = J83.g(object9);
                    j30_02.o(object9);
                }
                object9 = (tr1_0)object9;
                object5 = j30_02.v();
                if (object5 == object6) {
                    object5 = new AndroidCompositionLocals_androidKt$g((tr1_0)object9);
                    j30_02.o(object5);
                }
                object5 = (Function1)object5;
                ((AndroidComposeView)object).setConfigurationChangeObserver((Function1)object5);
                object5 = j30_02.v();
                if (object5 == object6) {
                    object5 = new pj((Context)object8);
                    j30_02.o(object5);
                }
                object5 = (pj)object5;
                Object object10 = androidComposeView.getViewTreeOwners();
                if (object10 == null) break block31;
                Object object11 = j30_02.v();
                zs2_1 zs2_12 = ((AndroidComposeView$b)object10).b;
                if (object11 == object6) {
                    object11 = androidComposeView.getParent();
                    Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type android.view.View");
                    object11 = (View)object11;
                    n10 = R$id.compose_view_saveable_id_tag;
                    object7 = object11.getTag(n10);
                    n8 = object7 instanceof String;
                    Iterator iterator = null;
                    if (n8 != 0) {
                        object7 = (String)object7;
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    if (object7 == null) {
                        n8 = object11.getId();
                        object7 = String.valueOf(n8);
                    }
                    mB2Array = new StringBuilder();
                    object11 = iS2.class.getSimpleName();
                    mB2Array.append((String)object11);
                    char c2 = ':';
                    mB2Array.append(c2);
                    mB2Array.append((String)object7);
                    mB2Array = mB2Array.toString();
                    object7 = zs2_12.getSavedStateRegistry();
                    object11 = ((xs2_1)object7).a((String)mB2Array);
                    if (object11 != null) {
                        boolean bl3;
                        object4 = new LinkedHashMap();
                        iterator = ((Iterable)object11.keySet()).iterator();
                        while (bl3 = iterator.hasNext()) {
                            Object t3 = iterator.next();
                            object3 = t3;
                            object3 = (String)t3;
                            object2 = object11.getParcelableArrayList((String)object3);
                            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            object4.put(object3, object2);
                        }
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    object2 = kS2.a;
                    object3 = kr0_0.c;
                    object2 = new jS2((Map)object4, (Function1)object3);
                    object3 = new Ir0((jS2)object2);
                    try {
                        ((xs2_1)object7).c((String)mB2Array, (xS2$b)object3);
                        n7 = 1;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n7 = 0;
                        object3 = null;
                    }
                    object4 = new jr0_0(n7 != 0, (xs2_1)object7, (String)mB2Array);
                    object11 = new hr0_0((jS2)object2, (jr0_0)object4);
                    j30_02.o(object11);
                }
                object11 = (hr0_0)object11;
                object2 = Unit.a;
                n7 = j30_02.x(object11);
                object4 = j30_02.v();
                if (n7 != 0 || object4 == object6) {
                    object4 = new AndroidCompositionLocals_androidKt$h((hr0_0)object11);
                    j30_02.o(object4);
                }
                object4 = (Function1)object4;
                ly0_0.b(object2, (Function1)object4, j30_02);
                object2 = (Configuration)object9.getValue();
                object3 = j30_02.v();
                if (object3 == object6) {
                    object3 = new Le1();
                    j30_02.o(object3);
                }
                object3 = (Le1)object3;
                object4 = j30_02.v();
                if (object4 == object6) {
                    object4 = new Configuration();
                    if (object2 != null) {
                        object4.setTo((Configuration)object2);
                    }
                    j30_02.o(object4);
                }
                object4 = (Configuration)object4;
                object2 = j30_02.v();
                if (object2 == object6) {
                    object2 = new Jg((Configuration)object4, (Le1)object3);
                    j30_02.o(object2);
                }
                object2 = (Jg)object2;
                bl2 = j30_02.x(object8);
                mB2Array = j30_02.v();
                if (bl2 || mB2Array == object6) {
                    mB2Array = new Ig((Context)object8, (Jg)object2);
                    j30_02.o(mB2Array);
                }
                mB2Array = (Function1)mB2Array;
                ly0_0.b(object3, (Function1)mB2Array, j30_02);
                object2 = j30_02.v();
                if (object2 == object6) {
                    object2 = new LK2();
                    j30_02.o(object2);
                }
                object2 = (LK2)object2;
                object4 = j30_02.v();
                if (object4 == object6) {
                    object4 = new Mg((LK2)object2);
                    j30_02.o(object4);
                }
                object4 = (Mg)object4;
                n8 = (int)(j30_02.x(object8) ? 1 : 0);
                object7 = j30_02.v();
                if (n8 != 0 || object7 == object6) {
                    object7 = new lg_0((Context)object8, (Mg)object4);
                    j30_02.o(object7);
                }
                object7 = (Function1)object7;
                ly0_0.b(object2, (Function1)object7, j30_02);
                object4 = O30.t;
                n8 = (int)(((Boolean)j30_02.j((H30)object4)).booleanValue() ? 1 : 0);
                n10 = (int)(androidComposeView.getScrollCaptureInProgress$ui_release() ? 1 : 0);
                n8 |= n10;
                object7 = (Configuration)object9.getValue();
                object7 = a.c(object7);
                object8 = b.c(object8);
                object9 = dw1.a;
                object6 = ((AndroidComposeView$b)object10).a;
                object9 = ((kb2_0)object9).c(object6);
                object6 = e.c(zs2_12);
                object10 = kS2.a.c(object11);
                object11 = androidComposeView.getView();
                object11 = f.c(object11);
                object3 = c.c(object3);
                object2 = d.c(object2);
                mB2Array = n8 != 0;
                object4 = ((nw0_1)object4).c(mB2Array);
                n8 = 9;
                mB2Array = new MB2[n8];
                zs2_12 = null;
                mB2Array[0] = object7;
                mB2Array[1] = object8;
                mB2Array[2] = object9;
                mB2Array[3] = object6;
                mB2Array[4] = object10;
                mB2Array[5] = object11;
                n10 = 6;
                mB2Array[n10] = object3;
                mB2Array[7] = object2;
                int n17 = 8;
                mB2Array[n17] = object4;
                object2 = new AndroidCompositionLocals_androidKt$i((AndroidComposeView)object, (pj)object5, function22);
                object2 = v10.c(1471621628, (fx0_2)object2, j30_02);
                n7 = 56;
                L30.b(mB2Array, (Function2)object2, j30_02, n7);
            }
            object2 = j30_02.X();
            if (object2 != null) {
                object3 = new AndroidCompositionLocals_androidKt$j((AndroidComposeView)object, function22, n4);
                ((CF2)object2).d = object3;
            }
            return;
        }
        object = new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        throw object;
    }

    public static final void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder("CompositionLocal ");
        stringBuilder.append(string2);
        stringBuilder.append(" not present");
        string2 = stringBuilder.toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static final kb2_0 getLocalLifecycleOwner() {
        return dw1.a;
    }
}

