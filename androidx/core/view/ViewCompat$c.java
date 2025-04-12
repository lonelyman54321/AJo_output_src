/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.R$id;
import androidx.core.view.ViewCompat$c$a;
import androidx.core.view.f;
import androidx.core.view.f$a;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import androidx.core.view.f$k;
import java.lang.reflect.Field;

public final class ViewCompat$c {
    public static void a(WindowInsets windowInsets, View view) {
        int n3 = R$id.tag_window_insets_animation_callback;
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)view.getTag(n3);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static f b(View view, f f5, Rect rect) {
        WindowInsets windowInsets = f5.g();
        if (windowInsets != null) {
            f5 = view.computeSystemWindowInsets(windowInsets, rect);
            return f.h(view, (WindowInsets)f5);
        }
        rect.setEmpty();
        return f5;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f f(View view) {
        void var2_5;
        int n3 = f$a.d;
        Object var2_3 = null;
        if (n3 == 0) return var2_5;
        n3 = view.isAttachedToWindow();
        if (n3 == 0) {
            return var2_5;
        }
        View view2 = view.getRootView();
        try {
            Object object = f$a.a;
            Object object2 = ((Field)object).get(view2);
            if (object2 == null) return var2_5;
            object = f$a.b;
            object = ((Field)object).get(object2);
            object = (Rect)object;
            Object object3 = f$a.c;
            Object object4 = ((Field)object3).get(object2);
            Rect rect = (Rect)object4;
            if (object == null) return var2_5;
            if (rect == null) return var2_5;
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 30;
            object3 = n4 >= n7 ? new f$d() : (n4 >= (n7 = 29) ? new f$c() : new f$b());
            n7 = ((Rect)object).left;
            int n8 = ((Rect)object).top;
            int n10 = ((Rect)object).right;
            int n14 = ((Rect)object).bottom;
            object = ei1.b(n7, n8, n10, n14);
            ((f$e)object3).e((ei1)object);
            n14 = rect.left;
            n7 = rect.top;
            n8 = rect.right;
            n3 = rect.bottom;
            ei1 ei12 = ei1.b(n14, n7, n8, n3);
            ((f$e)object3).g(ei12);
            f f5 = ((f$e)object3).b();
            object = f5.a;
            ((f$k)object).q(f5);
            view = view.getRootView();
            object = f5.a;
            ((f$k)object).d(view);
            f f6 = f5;
            return var2_5;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.getMessage();
        }
        return var2_5;
    }

    public static String g(View view) {
        return view.getTransitionName();
    }

    public static float h(View view) {
        return view.getTranslationZ();
    }

    public static float i(View view) {
        return view.getZ();
    }

    public static boolean j(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void k(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void l(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void m(View view, float f5) {
        view.setElevation(f5);
    }

    public static void n(View view, boolean bl2) {
        view.setNestedScrollingEnabled(bl2);
    }

    public static void o(View view, T72 t72) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 < n4) {
            n3 = R$id.tag_on_apply_window_listener;
            view.setTag(n3, (Object)t72);
        }
        if (t72 == null) {
            int n7 = R$id.tag_window_insets_animation_callback;
            t72 = (View.OnApplyWindowInsetsListener)view.getTag(n7);
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)t72);
            return;
        }
        ViewCompat$c$a viewCompat$c$a = new ViewCompat$c$a(view, t72);
        view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)viewCompat$c$a);
    }

    public static void p(View view, String string2) {
        view.setTransitionName(string2);
    }

    public static void q(View view, float f5) {
        view.setTranslationZ(f5);
    }

    public static void r(View view, float f5) {
        view.setZ(f5);
    }

    public static void s(View view) {
        view.stopNestedScroll();
    }
}

