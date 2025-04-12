/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 */
package androidx.core.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$b;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.f;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import androidx.core.view.f$k;
import java.util.Objects;

public final class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener
implements View.OnApplyWindowInsetsListener {
    public final WindowInsetsAnimationCompat$b a;
    public f b;

    public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(View object, WindowInsetsAnimationCompat$b object2) {
        this.a = object2;
        object = ViewCompat.i(object);
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 30;
            object2 = n3 >= n4 ? new f$d((f)object) : (n3 >= (n4 = 29) ? new f$c((f)object) : new f$b((f)object));
            object = ((f$e)object2).b();
        } else {
            object = null;
        }
        this.b = object;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = this;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        int n4 = 8;
        int n7 = 1;
        int n8 = view.isLaidOut();
        if (n8 == 0) {
            f f5;
            this.b = f5 = f.h(view, windowInsets);
            return WindowInsetsAnimationCompat$Impl21.j(view, windowInsets);
        }
        f f6 = f.h(view, windowInsets);
        Object object6 = this.b;
        if (object6 == null) {
            object6 = ViewCompat.i(view);
            this.b = object6;
        }
        if ((object6 = ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener)object5).b) == null) {
            ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener)object5).b = f6;
            return WindowInsetsAnimationCompat$Impl21.j(view, windowInsets);
        }
        object6 = WindowInsetsAnimationCompat$Impl21.k(view);
        if (object6 != null && (n8 = Objects.equals(object6 = ((WindowInsetsAnimationCompat$b)object6).mDispachedInsets, windowInsets2)) != 0) {
            return WindowInsetsAnimationCompat$Impl21.j(view, windowInsets);
        }
        object6 = ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener)object5).b;
        int n10 = 0;
        int n14 = 1;
        while (true) {
            object4 = f6.a;
            int n15 = 256;
            if (n14 > n15) break;
            boolean n3 = ((ei1)(object4 = ((f$k)object4).f(n14))).equals(object3 = ((f)object6).a.f(n14));
            if (!n3) {
                n10 |= n14;
            }
            n14 <<= n7;
        }
        if (n10 == 0) {
            return WindowInsetsAnimationCompat$Impl21.j(view, windowInsets);
        }
        f f5 = ((WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener)object5).b;
        n7 = n10 & 8;
        if (n7 != 0) {
            object2 = ((f$k)object4).f(n4);
            n7 = ((ei1)object2).d;
            object6 = f5.a;
            object = ((f$k)object6).f(n4);
            n4 = object.d;
            object = n7 > n4 ? WindowInsetsAnimationCompat$Impl21.e : WindowInsetsAnimationCompat$Impl21.f;
        } else {
            object = WindowInsetsAnimationCompat$Impl21.g;
        }
        object3 = new WindowInsetsAnimationCompat(n10, (Interpolator)object, 160L);
        ((WindowInsetsAnimationCompat)object3).a.e(0.0f);
        Object object7 = object = (Object)new float[2];
        object7[0] = (DecelerateInterpolator)0.0f;
        object7[1] = (DecelerateInterpolator)1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        long l2 = ((WindowInsetsAnimationCompat)object3).a.a();
        ValueAnimator valueAnimator = object.setDuration(l2);
        object = ((f$k)object4).f(n10);
        object2 = f5.a.f(n10);
        n8 = object.a;
        int n3 = ((ei1)object2).a;
        n8 = Math.min(n8, n3);
        int n15 = object.b;
        int n16 = ((ei1)object2).b;
        int n17 = Math.min(n15, n16);
        int n18 = object.c;
        int n19 = ((ei1)object2).c;
        int n20 = Math.min(n18, n19);
        int n21 = object.d;
        int n22 = n10;
        n10 = ((ei1)object2).d;
        f f7 = f5;
        n14 = Math.min(n21, n10);
        object5 = ei1.b(n8, n17, n20, n14);
        n4 = object.a;
        n7 = ((ei1)object2).a;
        n4 = Math.max(n4, n7);
        n7 = Math.max(n15, n16);
        n8 = Math.max(n18, n19);
        n19 = Math.max(n21, n10);
        object = ei1.b(n4, n7, n8, n19);
        object4 = new WindowInsetsAnimationCompat$a((ei1)object5, (ei1)object);
        WindowInsetsAnimationCompat$Impl21.g(view2, (WindowInsetsAnimationCompat)object3, windowInsets2, false);
        object = object5;
        object2 = object3;
        object6 = f6;
        n10 = n22;
        f5 = view;
        object5 = new WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a((WindowInsetsAnimationCompat)object3, f6, f7, n22, view);
        object = valueAnimator;
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object5);
        object5 = new WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$b(view2, (WindowInsetsAnimationCompat)object3);
        valueAnimator.addListener((Animator.AnimatorListener)object5);
        object5 = new WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3(view2, (WindowInsetsAnimationCompat)object3, (WindowInsetsAnimationCompat$a)object4, valueAnimator);
        x92.a(view2, (Runnable)object5);
        object5 = this;
        this.b = f6;
        return WindowInsetsAnimationCompat$Impl21.j(view, windowInsets);
    }
}

