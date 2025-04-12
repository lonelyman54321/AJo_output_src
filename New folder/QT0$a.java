/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class QT0$a
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (LT0)object;
        int n3 = ((LT0)object).a;
        Object object2 = (qt0_0)this.receiver;
        object2.getClass();
        View view = PT0.c((LP1$c)object2);
        boolean bl2 = view.isFocused();
        if (!bl2 && !(bl2 = view.hasFocus())) {
            bu0_1 bu0_12 = go0.g((fo0)object2).getFocusOwner();
            object2 = go0.g((fo0)object2);
            String string2 = "null cannot be cast to non-null type android.view.View";
            Intrinsics.checkNotNull(object2, string2);
            object2 = (View)object2;
            object = WT0.c(n3);
            object2 = PT0.b(bu0_12, (View)object2, view);
            n3 = (int)(WT0.b(view, (Integer)object, (Rect)object2) ? 1 : 0);
            object = n3 != 0 ? ou0_0.b : ou0_0.c;
        } else {
            object = ou0_0.b;
        }
        return object;
    }
}

