/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package com.google.accompanist.insets;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import androidx.core.view.f$k;
import com.google.accompanist.insets.InnerWindowInsetsAnimationCallback;
import com.google.accompanist.insets.InsetsKt;
import com.google.accompanist.insets.MutableInsets;
import com.google.accompanist.insets.MutableWindowInsetsType;
import com.google.accompanist.insets.RootWindowInsets;
import com.google.accompanist.insets.ViewWindowInsetObserver$attachListener$1;
import com.google.accompanist.insets.WindowInsets;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ViewWindowInsetObserver {
    public static final int $stable = 8;
    private final ViewWindowInsetObserver$attachListener$1 attachListener;
    private boolean isObserving;
    private final View view;

    public ViewWindowInsetObserver(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        this.view = object;
        this.attachListener = object;
    }

    public static /* synthetic */ f a(RootWindowInsets rootWindowInsets, boolean bl2, View view, f f5) {
        return ViewWindowInsetObserver.observeInto$lambda$7(rootWindowInsets, bl2, view, f5);
    }

    public static /* synthetic */ void isObserving$annotations() {
    }

    private static final f observeInto$lambda$7(RootWindowInsets object, boolean bl2, View object2, f f5) {
        Intrinsics.checkNotNullParameter(object, "$windowInsets");
        Intrinsics.checkNotNullParameter(object2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(f5, "wic");
        object2 = ((RootWindowInsets)object).getStatusBars();
        Object object3 = ((MutableWindowInsetsType)object2).getLayoutInsets();
        Object object4 = f5.a;
        int n3 = 1;
        object4 = ((f$k)object4).f(n3);
        Intrinsics.checkNotNullExpressionValue(object4, "wic.getInsets(WindowInse\u2026Compat.Type.statusBars())");
        InsetsKt.updateFrom((MutableInsets)object3, (ei1)object4);
        object3 = f5.a;
        boolean n4 = ((f$k)object3).o(n3);
        ((MutableWindowInsetsType)object2).setVisible(n4);
        object2 = ((RootWindowInsets)object).getNavigationBars();
        object4 = ((MutableWindowInsetsType)object2).getLayoutInsets();
        n3 = 2;
        Object object5 = ((f$k)object3).f(n3);
        Intrinsics.checkNotNullExpressionValue(object5, "wic.getInsets(WindowInse\u2026at.Type.navigationBars())");
        InsetsKt.updateFrom((MutableInsets)object4, (ei1)object5);
        boolean bl3 = ((f$k)object3).o(n3);
        ((MutableWindowInsetsType)object2).setVisible(bl3);
        object2 = ((RootWindowInsets)object).getSystemGestures();
        object4 = ((MutableWindowInsetsType)object2).getLayoutInsets();
        n3 = 16;
        object5 = ((f$k)object3).f(n3);
        Intrinsics.checkNotNullExpressionValue(object5, "wic.getInsets(WindowInse\u2026at.Type.systemGestures())");
        InsetsKt.updateFrom((MutableInsets)object4, (ei1)object5);
        boolean bl4 = ((f$k)object3).o(n3);
        ((MutableWindowInsetsType)object2).setVisible(bl4);
        object2 = ((RootWindowInsets)object).getIme();
        object4 = ((MutableWindowInsetsType)object2).getLayoutInsets();
        n3 = 8;
        object5 = ((f$k)object3).f(n3);
        String string2 = "wic.getInsets(WindowInsetsCompat.Type.ime())";
        Intrinsics.checkNotNullExpressionValue(object5, string2);
        InsetsKt.updateFrom((MutableInsets)object4, (ei1)object5);
        boolean bl5 = ((f$k)object3).o(n3);
        ((MutableWindowInsetsType)object2).setVisible(bl5);
        object = ((RootWindowInsets)object).getDisplayCutout();
        object2 = ((MutableWindowInsetsType)object).getLayoutInsets();
        int n7 = 128;
        ei1 ei12 = ((f$k)object3).f(n7);
        object5 = "wic.getInsets(WindowInse\u2026pat.Type.displayCutout())";
        Intrinsics.checkNotNullExpressionValue(ei12, (String)object5);
        InsetsKt.updateFrom((MutableInsets)object2, ei12);
        boolean bl6 = ((f$k)object3).o(n7);
        ((MutableWindowInsetsType)object).setVisible(bl6);
        if (bl2) {
            f5 = f.b;
        }
        return f5;
    }

    public static /* synthetic */ WindowInsets start$default(ViewWindowInsetObserver viewWindowInsetObserver, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 2) != 0) {
            bl3 = true;
        }
        return viewWindowInsetObserver.start(bl2, bl3);
    }

    public final boolean isObserving() {
        return this.isObserving;
    }

    public final void observeInto$insets_release(RootWindowInsets object, boolean bl2, boolean bl3) {
        Object object2 = "windowInsets";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl4 = this.isObserving;
        boolean bl5 = true;
        if (bl4 ^= bl5) {
            object2 = this.view;
            pe3_0 pe3_02 = new pe3_0((RootWindowInsets)object, bl2);
            WeakHashMap weakHashMap = ViewCompat.a;
            ViewCompat$c.o((View)object2, pe3_02);
            weakHashMap = this.view;
            object2 = this.attachListener;
            weakHashMap.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
            if (bl3) {
                weakHashMap = this.view;
                InnerWindowInsetsAnimationCallback innerWindowInsetsAnimationCallback = new InnerWindowInsetsAnimationCallback((RootWindowInsets)object);
                ViewCompat.w((View)weakHashMap, innerWindowInsetsAnimationCallback);
            } else {
                object = this.view;
                bl2 = false;
                weakHashMap = null;
                ViewCompat.w((View)object, null);
            }
            object = this.view;
            boolean bl6 = object.isAttachedToWindow();
            if (bl6) {
                object = this.view;
                object.requestApplyInsets();
            }
            this.isObserving = bl5;
            return;
        }
        String string2 = "start() called, but this ViewWindowInsetObserver is already observing".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final WindowInsets start(boolean bl2, boolean bl3) {
        RootWindowInsets rootWindowInsets = new RootWindowInsets();
        this.observeInto$insets_release(rootWindowInsets, bl2, bl3);
        return rootWindowInsets;
    }

    public final void stop() {
        boolean bl2 = this.isObserving;
        if (bl2) {
            View view = this.view;
            Object object = this.attachListener;
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
            view = this.view;
            object = ViewCompat.a;
            ViewCompat$c.o(view, null);
            this.isObserving = false;
            return;
        }
        String string2 = "stop() called, but this ViewWindowInsetObserver is not currently observing".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

