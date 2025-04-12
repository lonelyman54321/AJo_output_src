/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 */
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class Vx2 {
    public static final void a(boolean bl2, Function2 object, b30_0 object2, int n3) {
        block22: {
            Object object3;
            block21: {
                Function2 function2;
                b30$a$a b30$a$a;
                int n4;
                int n7;
                int n8;
                int n10;
                block20: {
                    object2 = object2.g(-642000585);
                    n10 = n3 & 6;
                    n8 = 4;
                    if (n10 == 0) {
                        n10 = (int)(((j30_0)object2).a(bl2) ? 1 : 0);
                        n10 = n10 != 0 ? 4 : 2;
                        n10 |= n3;
                    } else {
                        n10 = n3;
                    }
                    n7 = n3 & 0x30;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object2).x(object) ? 1 : 0);
                        n7 = n7 != 0 ? 32 : 16;
                        n10 |= n7;
                    }
                    if ((n7 = n10 & 0x13) != (n4 = 18) || (n7 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block20;
                    ((j30_0)object2).D();
                    break block21;
                }
                Object object4 = J83.j(object, (b30_0)object2);
                Object object5 = ((j30_0)object2).v();
                if (object5 == (b30$a$a = b30$a.a)) {
                    object5 = Qx2.a(ly0_0.f(f.a, (b30_0)object2), (j30_0)object2);
                }
                object5 = ((Q30)object5).a;
                Object object6 = ((j30_0)object2).v();
                if (object6 == b30$a$a) {
                    function2 = (Function2)object4.getValue();
                    object6 = new W72(bl2);
                    ((px2_0)object6).a = object5;
                    ((px2_0)object6).b = function2;
                    ((j30_0)object2).o(object6);
                }
                object6 = (px2_0)object6;
                function2 = (Function2)object4.getValue();
                boolean bl3 = ((j30_0)object2).J(function2);
                boolean bl4 = ((j30_0)object2).J(object5);
                Object object7 = ((j30_0)object2).v();
                if ((bl3 |= bl4) || object7 == b30$a$a) {
                    ((px2_0)object6).b = object4 = (Function2)object4.getValue();
                    ((px2_0)object6).a = object5;
                    object4 = Unit.a;
                    ((j30_0)object2).o(object4);
                }
                object4 = bl2;
                n4 = (int)(((j30_0)object2).x(object6) ? 1 : 0);
                bl3 = false;
                function2 = null;
                if ((n10 &= 0xE) == n8) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    object3 = null;
                }
                n10 |= n4;
                Object object8 = ((j30_0)object2).v();
                n4 = 0;
                object5 = null;
                if (n10 != 0 || object8 == b30$a$a) {
                    object8 = new rx2_0((px2_0)object6, bl2, null);
                    ((j30_0)object2).o(object8);
                }
                object8 = (Function2)object8;
                ly0_0.d((b30_0)object2, object4, (Function2)object8);
                object3 = ew1_0.a;
                object3 = (h82_0)((j30_0)object2).j((H30)object3);
                if (object3 == null) {
                    n10 = 544166745;
                    ((j30_0)object2).K(n10);
                    object3 = AndroidCompositionLocals_androidKt.f;
                    object3 = (View)((j30_0)object2).j((H30)object3);
                    Intrinsics.checkNotNullParameter(object3, "<this>");
                    object3 = ez2_1.d(wd3_0.c, object3);
                    object8 = xd3_1.c;
                    object3 = (h82_0)kz2_1.g(kz2_1.j((Sequence)object3, (Function1)object8));
                    ((j30_0)object2).T(false);
                } else {
                    n8 = 544164296;
                    ((j30_0)object2).K(n8);
                    ((j30_0)object2).T(false);
                }
                if (object3 == null) {
                    n10 = 544168748;
                    ((j30_0)object2).K(n10);
                    object3 = AndroidCompositionLocals_androidKt.b;
                    object3 = (Context)((j30_0)object2).j((H30)object3);
                    while ((n8 = object3 instanceof ContextWrapper) != 0) {
                        n8 = object3 instanceof h82_0;
                        if (n8 != 0) {
                            object5 = object3;
                            break;
                        }
                        object3 = ((ContextWrapper)object3).getBaseContext();
                    }
                    object3 = object5;
                    object3 = (h82_0)object5;
                    ((j30_0)object2).T(false);
                } else {
                    n8 = 544164377;
                    ((j30_0)object2).K(n8);
                    ((j30_0)object2).T(false);
                }
                if (object3 == null) break block22;
                object3 = object3.getOnBackPressedDispatcher();
                object8 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                object8 = (mu1_1)((j30_0)object2).j((H30)object8);
                n7 = (int)(((j30_0)object2).x(object3) ? 1 : 0);
                n4 = (int)(((j30_0)object2).x(object8) ? 1 : 0);
                n7 |= n4;
                n4 = (int)(((j30_0)object2).x(object6) ? 1 : 0);
                object5 = ((j30_0)object2).v();
                if ((n7 |= n4) != 0 || object5 == b30$a$a) {
                    object5 = new tx2_1((d82_0)object3, (mu1_1)object8, (px2_0)object6);
                    ((j30_0)object2).o(object5);
                }
                object5 = (Function1)object5;
                ly0_0.a(object8, object3, (Function1)object5, (b30_0)object2);
            }
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                object3 = new ux2_0(bl2, (Function2)object, n3);
                ((CF2)object2).d = object3;
            }
            return;
        }
        object = "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static Application b(Context object) {
        boolean bl2;
        boolean bl3 = object instanceof Application;
        if (bl3) {
            return (Application)object;
        }
        Object object2 = object;
        while (bl2 = object2 instanceof ContextWrapper) {
            bl2 = (object2 = ((ContextWrapper)object2).getBaseContext()) instanceof Application;
            if (!bl2) continue;
            return (Application)object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Could not find an Application in the given context: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

