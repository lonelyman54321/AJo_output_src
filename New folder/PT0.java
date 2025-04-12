/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewParent
 */
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

public final class PT0 {
    public static final boolean a(View view, View view2) {
        boolean bl2;
        block1: {
            for (view2 = view2.getParent(); view2 != null; view2 = view2.getParent()) {
                ViewParent viewParent = view.getParent();
                if (view2 != viewParent) continue;
                bl2 = true;
                break block1;
            }
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public static final Rect b(bu0_1 object, View object2, View view) {
        int n3 = 2;
        float f5 = 2.8E-45f;
        int[] nArray = new int[n3];
        object2.getLocationOnScreen(nArray);
        object2 = new int[n3];
        view.getLocationOnScreen((int[])object2);
        object = object.k();
        if (object == null) {
            boolean bl2 = false;
            float f6 = 0.0f;
            object = null;
        } else {
            f5 = ((aG2)object).a;
            n3 = (int)f5;
            int n4 = nArray[0];
            n3 += n4;
            View view2 = object2[0];
            n3 -= view2;
            float f7 = ((aG2)object).b;
            int n7 = (int)f7;
            int n8 = 1;
            int n10 = nArray[n8];
            n7 += n10;
            View view3 = object2[n8];
            float f8 = ((aG2)object).c;
            n8 = (int)f8 + n4 - view2;
            float f11 = ((aG2)object).d;
            int n14 = (int)f11 + n10 - view3;
            view = new Rect(n3, n7 -= view3, n8, n14);
            object = view;
        }
        return object;
    }

    public static final View c(LP1$c object) {
        object = go0.f((fo0)((LP1$c)object).a).j;
        object = object != null ? ((AndroidViewHolder)object).getInteropView() : null;
        if (object != null) {
            return object;
        }
        String string2 = "Could not fetch interop view".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

