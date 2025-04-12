/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;

public final class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$b
extends AnimatorListenerAdapter {
    public final /* synthetic */ WindowInsetsAnimationCompat a;
    public final /* synthetic */ View b;

    public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$b(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.a = windowInsetsAnimationCompat;
        this.b = view;
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        object.a.e(1.0f);
        WindowInsetsAnimationCompat$Impl21.f(this.b, (WindowInsetsAnimationCompat)object);
    }
}

