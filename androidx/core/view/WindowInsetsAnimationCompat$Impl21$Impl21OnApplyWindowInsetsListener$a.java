/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build$VERSION
 *  android.view.View
 */
package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import java.util.Collections;
import java.util.List;

public final class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ WindowInsetsAnimationCompat a;
    public final /* synthetic */ f b;
    public final /* synthetic */ f c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, f f5, f f6, int n3, View view) {
        this.a = windowInsetsAnimationCompat;
        this.b = f5;
        this.c = f6;
        this.d = n3;
        this.e = view;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a = this;
        float f5 = valueAnimator.getAnimatedFraction();
        Object object = this.a;
        ((WindowInsetsAnimationCompat)object).a.e(f5);
        Object object2 = ((WindowInsetsAnimationCompat)object).a;
        f5 = ((WindowInsetsAnimationCompat$d)object2).c();
        Object object3 = WindowInsetsAnimationCompat$Impl21.e;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        f f6 = this.b;
        object3 = n3 >= n4 ? new f$d(f6) : (n3 >= (n4 = 29) ? new f$c(f6) : new f$b(f6));
        n4 = 1;
        while (true) {
            int n7;
            float f7;
            ei1 ei12;
            Object object4;
            Object object5;
            int n8;
            if (n4 > (n8 = 256)) {
                object5 = object;
                object4 = ((f$e)object3).b();
                object2 = Collections.singletonList(object);
                WindowInsetsAnimationCompat$Impl21.h(windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a.e, (f)object4, (List)object2);
                return;
            }
            n8 = windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a.d & n4;
            if (n8 == 0) {
                ei12 = f6.a.f(n4);
                ((f$e)object3).c(n4, ei12);
                f7 = f5;
                object5 = object;
            } else {
                ei12 = f6.a.f(n4);
                object5 = windowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$a.c.a.f(n4);
                int n10 = ei12.a;
                int n14 = ((ei1)object5).a;
                float f8 = n10 - n14;
                n14 = 1065353216;
                float f11 = 1.0f - f5;
                double d2 = f8 *= f11;
                double d5 = 0.5;
                n10 = (int)(d2 + d5);
                int n15 = ei12.b;
                int n16 = ((ei1)object5).b;
                float f12 = (float)(n15 - n16) * f11;
                d2 = (double)f12 + d5;
                n15 = (int)d2;
                n16 = ei12.c;
                int n17 = ((ei1)object5).c;
                float f14 = (float)(n16 -= n17) * f11;
                f7 = f5;
                double d7 = (double)f14 + d5;
                n7 = (int)d7;
                int n18 = ei12.d;
                int n19 = ((ei1)object5).d;
                f5 = (float)(n18 - n19) * f11;
                object5 = object;
                double d9 = (double)f5 + d5;
                n18 = (int)d9;
                object4 = f.e(ei12, n10, n15, n7, n18);
                ((f$e)object3).c(n4, (ei1)object4);
            }
            n7 = 1;
            n4 <<= n7;
            f5 = f7;
            object = object5;
        }
    }
}

