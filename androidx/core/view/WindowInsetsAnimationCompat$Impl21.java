/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowInsets
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.PathInterpolator
 */
package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R$id;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import java.util.List;

public final class WindowInsetsAnimationCompat$Impl21
extends WindowInsetsAnimationCompat$d {
    public static final PathInterpolator e;
    public static final WI0 f;
    public static final DecelerateInterpolator g;

    static {
        Object object;
        e = object = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        object = new WI0();
        f = object;
        object = new DecelerateInterpolator();
        g = object;
    }

    public static void f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        int n3;
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = WindowInsetsAnimationCompat$Impl21.k(view);
        if (windowInsetsAnimationCompat$b != null) {
            windowInsetsAnimationCompat$b.onEnd(windowInsetsAnimationCompat);
            n3 = windowInsetsAnimationCompat$b.getDispatchMode();
            if (n3 == 0) {
                return;
            }
        }
        if ((n3 = view instanceof ViewGroup) != 0) {
            int n4;
            view = (ViewGroup)view;
            windowInsetsAnimationCompat$b = null;
            for (n3 = 0; n3 < (n4 = view.getChildCount()); ++n3) {
                View view2 = view.getChildAt(n3);
                WindowInsetsAnimationCompat$Impl21.f(view2, windowInsetsAnimationCompat);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void g(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean bl2) {
        int n3;
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = WindowInsetsAnimationCompat$Impl21.k(view);
        int n4 = 0;
        if (windowInsetsAnimationCompat$b != null) {
            windowInsetsAnimationCompat$b.mDispachedInsets = windowInsets;
            if (!bl2) {
                windowInsetsAnimationCompat$b.onPrepare(windowInsetsAnimationCompat);
                int n7 = windowInsetsAnimationCompat$b.getDispatchMode();
                if (n7 == 0) {
                    boolean bl3 = true;
                } else {
                    boolean bl4 = false;
                }
            }
        }
        if ((n3 = view instanceof ViewGroup) != 0) {
            view = (ViewGroup)view;
            while (n4 < (n3 = view.getChildCount())) {
                void var3_7;
                windowInsetsAnimationCompat$b = view.getChildAt(n4);
                WindowInsetsAnimationCompat$Impl21.g((View)windowInsetsAnimationCompat$b, windowInsetsAnimationCompat, windowInsets, (boolean)var3_7);
                ++n4;
            }
        }
    }

    public static void h(View view, f f5, List list) {
        int n3;
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = WindowInsetsAnimationCompat$Impl21.k(view);
        if (windowInsetsAnimationCompat$b != null) {
            f5 = windowInsetsAnimationCompat$b.onProgress(f5, list);
            n3 = windowInsetsAnimationCompat$b.getDispatchMode();
            if (n3 == 0) {
                return;
            }
        }
        if ((n3 = view instanceof ViewGroup) != 0) {
            int n4;
            view = (ViewGroup)view;
            windowInsetsAnimationCompat$b = null;
            for (n3 = 0; n3 < (n4 = view.getChildCount()); ++n3) {
                View view2 = view.getChildAt(n3);
                WindowInsetsAnimationCompat$Impl21.h(view2, f5, list);
            }
        }
    }

    public static void i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat$a windowInsetsAnimationCompat$a) {
        int n3;
        WindowInsetsAnimationCompat$b windowInsetsAnimationCompat$b = WindowInsetsAnimationCompat$Impl21.k(view);
        if (windowInsetsAnimationCompat$b != null) {
            windowInsetsAnimationCompat$b.onStart(windowInsetsAnimationCompat, windowInsetsAnimationCompat$a);
            n3 = windowInsetsAnimationCompat$b.getDispatchMode();
            if (n3 == 0) {
                return;
            }
        }
        if ((n3 = view instanceof ViewGroup) != 0) {
            int n4;
            view = (ViewGroup)view;
            windowInsetsAnimationCompat$b = null;
            for (n3 = 0; n3 < (n4 = view.getChildCount()); ++n3) {
                View view2 = view.getChildAt(n3);
                WindowInsetsAnimationCompat$Impl21.i(view2, windowInsetsAnimationCompat, windowInsetsAnimationCompat$a);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        int n3 = R$id.tag_on_apply_window_listener;
        Object object = view.getTag(n3);
        if (object != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static WindowInsetsAnimationCompat$b k(View object) {
        int n3 = R$id.tag_window_insets_animation_callback;
        object = (n3 = (object = object.getTag(n3)) instanceof WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener) != 0 ? ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener)object).a : null;
        return object;
    }
}

