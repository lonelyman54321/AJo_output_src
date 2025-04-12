/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public abstract class GW0 {
    public static void f(View view, List list) {
        int n3;
        int n4 = list.size();
        Object object = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Object e2 = list.get(n3);
            if (e2 != view) continue;
            return;
        }
        object = ViewCompat.a;
        object = ViewCompat$c.g(view);
        if (object != null) {
            list.add(view);
        }
        for (int i3 = n4; i3 < (n3 = list.size()); ++i3) {
            object = (View)list.get(i3);
            int n7 = object instanceof ViewGroup;
            if (n7 == 0) continue;
            object = (ViewGroup)object;
            n7 = object.getChildCount();
            block2: for (int i8 = 0; i8 < n7; ++i8) {
                View view2 = object.getChildAt(i8);
                String string2 = null;
                for (int i10 = 0; i10 < n4; ++i10) {
                    Object e5 = list.get(i10);
                    if (e5 == view2) continue block2;
                }
                string2 = ViewCompat$c.g(view2);
                if (string2 == null) continue;
                list.add(view2);
            }
        }
    }

    public static void j(Rect rect, View view) {
        int n3 = view.isAttachedToWindow();
        if (n3 == 0) {
            return;
        }
        RectF rectF = new RectF();
        float f5 = view.getWidth();
        float f6 = view.getHeight();
        int n4 = 0;
        float f7 = 0.0f;
        rectF.set(0.0f, 0.0f, f5, f6);
        view.getMatrix().mapRect(rectF);
        int n7 = view.getLeft();
        f5 = n7;
        int n8 = view.getTop();
        f6 = n8;
        rectF.offset(f5, f6);
        Object object = view.getParent();
        while ((n8 = object instanceof View) != 0) {
            object = (View)object;
            f6 = -object.getScrollX();
            f7 = -object.getScrollY();
            rectF.offset(f6, f7);
            Matrix matrix = object.getMatrix();
            matrix.mapRect(rectF);
            n8 = object.getLeft();
            f6 = n8;
            n4 = object.getTop();
            f7 = n4;
            rectF.offset(f6, f7);
            object = object.getParent();
        }
        object = new int[2];
        view.getRootView().getLocationOnScreen((int[])object);
        float f8 = (float)object[0];
        f5 = (float)object[1];
        rectF.offset(f8, f5);
        int n10 = Math.round(rectF.left);
        n7 = Math.round(rectF.top);
        n8 = Math.round(rectF.right);
        n3 = Math.round(rectF.bottom);
        rect.set(n10, n7, n8, n3);
    }

    public static boolean k(List list) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            bl2 = false;
            list = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public abstract void a(View var1, Object var2);

    public abstract void b(Object var1, ArrayList var2);

    public void c(Object object) {
    }

    public void d(Object object, gn0_0 gn0_02) {
    }

    public abstract void e(ViewGroup var1, Object var2);

    public abstract boolean g(Object var1);

    public abstract Object h(Object var1);

    public Object i(ViewGroup viewGroup, Object object) {
        return null;
    }

    public boolean l() {
        Log.isLoggable((String)"FragmentManager", (int)4);
        return false;
    }

    public boolean m(Object object) {
        return false;
    }

    public abstract Object n(Object var1, Object var2, Object var3);

    public abstract Object o(Object var1, Object var2);

    public abstract void p(Object var1, View var2, ArrayList var3);

    public abstract void q(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5);

    public void r(Object object, float f5) {
    }

    public abstract void s(View var1, Object var2);

    public abstract void t(Object var1, Rect var2);

    public void u(Fragment fragment, Object object, fl_0 fl_02, Runnable runnable2) {
        this.v(object, fl_02, null, runnable2);
    }

    public void v(Object object, fl_0 fl_02, an0_0 an0_02, Runnable runnable2) {
        runnable2.run();
    }

    public abstract void w(Object var1, View var2, ArrayList var3);

    public abstract void x(Object var1, ArrayList var2, ArrayList var3);

    public abstract Object y(Object var1);
}

