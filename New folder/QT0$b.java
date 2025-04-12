/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.FocusFinder
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class QT0$b
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        String string2;
        Object object2;
        block10: {
            block6: {
                sg2_0 sg2_02;
                int n3;
                block9: {
                    boolean bl2;
                    String string3;
                    bu0_1 bu0_12;
                    View view;
                    block7: {
                        block8: {
                            block5: {
                                object = (LT0)object;
                                n3 = ((LT0)object).a;
                                object2 = (qt0_0)this.receiver;
                                object2.getClass();
                                view = PT0.c((LP1$c)object2);
                                boolean bl3 = view.hasFocus();
                                if (bl3) break block5;
                                object = ou0_0.b;
                                break block6;
                            }
                            bu0_12 = go0.g((fo0)object2).getFocusOwner();
                            sg2_02 = go0.g((fo0)object2);
                            string3 = "null cannot be cast to non-null type android.view.View";
                            Intrinsics.checkNotNull(sg2_02, string3);
                            sg2_02 = (View)sg2_02;
                            boolean bl4 = view instanceof ViewGroup;
                            string2 = "host view did not take focus";
                            if (bl4) break block7;
                            n3 = (int)(sg2_02.requestFocus() ? 1 : 0);
                            if (n3 == 0) break block8;
                            object = ou0_0.b;
                            break block6;
                        }
                        object2 = string2.toString();
                        object = new IllegalStateException((String)object2);
                        throw object;
                    }
                    bu0_12 = PT0.b(bu0_12, (View)sg2_02, view);
                    object = WT0.c(n3);
                    n3 = object != null ? (Integer)object : 130;
                    string3 = FocusFinder.getInstance();
                    object2 = ((qt0_0)object2).n;
                    if (object2 != null) {
                        sg2_0 sg2_03 = sg2_02;
                        sg2_03 = (ViewGroup)sg2_02;
                        object2 = string3.findNextFocus((ViewGroup)sg2_03, (View)object2, n3);
                    } else {
                        object2 = sg2_02;
                        object2 = (ViewGroup)sg2_02;
                        object2 = string3.findNextFocusFromRect((ViewGroup)object2, (Rect)bu0_12, n3);
                    }
                    if (object2 == null || !(bl2 = PT0.a(view, (View)object2))) break block9;
                    object2.requestFocus(n3, (Rect)bu0_12);
                    object = ou0_0.c;
                    break block6;
                }
                n3 = (int)(sg2_02.requestFocus() ? 1 : 0);
                if (n3 == 0) break block10;
                object = ou0_0.b;
            }
            return object;
        }
        object2 = string2.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

