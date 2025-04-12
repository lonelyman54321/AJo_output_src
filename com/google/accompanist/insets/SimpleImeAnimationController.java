/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.os.CancellationSignal
 *  android.view.View
 *  android.view.WindowInsets
 *  android.view.WindowInsetsAnimationControlListener
 *  android.view.WindowInsetsAnimationController
 *  android.view.WindowInsetsController
 *  android.view.animation.LinearInterpolator
 */
package com.google.accompanist.insets;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.LinearInterpolator;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.d;
import com.google.accompanist.insets.SimpleImeAnimationController$animateImeToVisibility$1;
import com.google.accompanist.insets.SimpleImeAnimationController$animateImeToVisibility$2;
import com.google.accompanist.insets.SimpleImeAnimationController$animationControlListener$2;
import com.google.accompanist.insets.SimpleImeAnimationController$startAndFling$1;
import com.google.accompanist.insets.SimpleImeAnimationControllerKt;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class SimpleImeAnimationController {
    private final rq1_2 animationControlListener$delegate;
    private c currentSpringAnimation;
    private WindowInsetsAnimationController insetsAnimationController;
    private boolean isImeShownAtStart;
    private CancellationSignal pendingRequestCancellationSignal;
    private Function1 pendingRequestOnReady;

    public SimpleImeAnimationController() {
        Serializable serializable = new SimpleImeAnimationController$animationControlListener$2(this);
        serializable = yr1_2.b(serializable);
        this.animationControlListener$delegate = serializable;
    }

    public static /* synthetic */ void a(SimpleImeAnimationController simpleImeAnimationController, Function1 function1, b b2, boolean bl2, float f5, float f6) {
        SimpleImeAnimationController.animateImeToVisibility$lambda$3$lambda$2(simpleImeAnimationController, function1, b2, bl2, f5, f6);
    }

    public static final /* synthetic */ void access$onRequestReady(SimpleImeAnimationController simpleImeAnimationController, WindowInsetsAnimationController windowInsetsAnimationController) {
        simpleImeAnimationController.onRequestReady(windowInsetsAnimationController);
    }

    public static final /* synthetic */ void access$reset(SimpleImeAnimationController simpleImeAnimationController) {
        simpleImeAnimationController.reset();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void animateImeToVisibility(boolean bl2, Float object, Function1 object2) {
        ArrayList arrayList;
        s53 s532;
        boolean bl3;
        void var1_3;
        Object object3;
        Object object4 = this.insetsAnimationController;
        if (object4 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Controller should not be null");
            throw illegalStateException;
        }
        Object object5 = new SimpleImeAnimationController$animateImeToVisibility$1(this);
        SimpleImeAnimationController$animateImeToVisibility$2 simpleImeAnimationController$animateImeToVisibility$2 = new SimpleImeAnimationController$animateImeToVisibility$2((WindowInsetsAnimationController)object4);
        if (bl2) {
            object3 = k53_0.a((WindowInsetsAnimationController)object4);
            int n3 = su0_0.a((Insets)object3);
        } else {
            object3 = l53.a((WindowInsetsAnimationController)object4);
            int n4 = su0_0.a((Insets)object3);
        }
        float f5 = (float)var1_3;
        Intrinsics.checkParameterIsNotNull(object5, "setter");
        Intrinsics.checkParameterIsNotNull(simpleImeAnimationController$animateImeToVisibility$2, "getter");
        object4 = new ew0_0(simpleImeAnimationController$animateImeToVisibility$2, (Function1)object5);
        int n7 = Float.isNaN(f5);
        if (n7 != 0) {
            object3 = new c((pS0)object4);
        } else {
            object5 = new b((pS0)object4);
            ((c)object5).s = null;
            ((c)object5).t = Float.MAX_VALUE;
            bl3 = false;
            ((c)object5).u = false;
            ((c)object5).s = object4 = new d(f5);
            object3 = object5;
        }
        object4 = ((c)object3).s;
        if (object4 == null) {
            object4 = new d();
            ((c)object3).s = object4;
        }
        object4 = ((c)object3).s;
        object5 = "spring";
        Intrinsics.checkExpressionValueIsNotNull(object4, (String)object5);
        ((d)object4).a();
        n7 = 1153138688;
        float f6 = 1500.0f;
        ((d)object4).b(f6);
        if (s532 != null) {
            float f7;
            ((b)object3).a = f7 = ((Float)((Object)s532)).floatValue();
        }
        if (!(bl3 = (arrayList = ((b)object3).k).contains(s532 = new s53(this, (Function1)((Object)arrayList))))) {
            arrayList.add(s532);
        }
        ((c)object3).g();
        this.currentSpringAnimation = object3;
    }

    public static /* synthetic */ void animateImeToVisibility$default(SimpleImeAnimationController simpleImeAnimationController, boolean bl2, Float f5, Function1 function1, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n3 &= 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.animateImeToVisibility(bl2, f5, function1);
    }

    private static final void animateImeToVisibility$lambda$3$lambda$2(SimpleImeAnimationController object, Function1 function1, b b2, boolean bl2, float f5, float f6) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        c c2 = ((SimpleImeAnimationController)object).currentSpringAnimation;
        boolean bl3 = Intrinsics.areEqual(b2, c2);
        if (bl3) {
            bl3 = false;
            b2 = null;
            ((SimpleImeAnimationController)object).currentSpringAnimation = null;
        }
        ((SimpleImeAnimationController)object).finish();
        if (function1 != null) {
            object = Float.valueOf(f6);
            function1.invoke(object);
        }
    }

    public static /* synthetic */ void animateToFinish$default(SimpleImeAnimationController simpleImeAnimationController, Float f5, Function1 function1, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n3 &= 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.animateToFinish(f5, function1);
    }

    private final float calculateFlingDistance(float f5, float f6) {
        return f5 / (f6 *= -4.2f);
    }

    public static /* synthetic */ float calculateFlingDistance$default(SimpleImeAnimationController simpleImeAnimationController, float f5, float f6, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            f6 = 1.0f;
        }
        return simpleImeAnimationController.calculateFlingDistance(f5, f6);
    }

    private final WindowInsetsAnimationControlListener getAnimationControlListener() {
        return i53.a(this.animationControlListener$delegate.getValue());
    }

    private final void onRequestReady(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.pendingRequestCancellationSignal = null;
        this.insetsAnimationController = windowInsetsAnimationController;
        Function1 function1 = this.pendingRequestOnReady;
        if (function1 != null) {
            function1.invoke(windowInsetsAnimationController);
        }
        this.pendingRequestOnReady = null;
    }

    private final void reset() {
        this.insetsAnimationController = null;
        this.pendingRequestCancellationSignal = null;
        this.isImeShownAtStart = false;
        c c2 = this.currentSpringAnimation;
        if (c2 != null) {
            c2.e();
        }
        this.currentSpringAnimation = null;
        this.pendingRequestOnReady = null;
    }

    public static /* synthetic */ void startAndFling$default(SimpleImeAnimationController simpleImeAnimationController, View view, float f5, Function1 function1, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startAndFling(view, f5, function1);
    }

    public static /* synthetic */ void startControlRequest$default(SimpleImeAnimationController simpleImeAnimationController, View view, Function1 function1, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startControlRequest(view, function1);
    }

    public final void animateToFinish(Float f5, Function1 function1) {
        Object object;
        int n3;
        float f6;
        Object object2 = this.insetsAnimationController;
        if (object2 == null) {
            f5 = this.pendingRequestCancellationSignal;
            if (f5 != null) {
                f5.cancel();
            }
            return;
        }
        Insets insets = h53.a(object2);
        int n4 = su0_0.a(insets);
        Insets insets2 = k53_0.a(object2);
        int n7 = su0_0.a(insets2);
        Object object3 = l53.a(object2);
        int n8 = su0_0.a(object3);
        int n10 = 1;
        if (f5 != null) {
            float f7 = f5.floatValue();
            float f8 = (f7 = SimpleImeAnimationController.calculateFlingDistance$default(this, f7, 0.0f, 2, null)) - (f6 = (float)(n3 = Math.abs(n7 - n8)));
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object > 0) {
                float f11 = f5.floatValue();
                float f12 = f11 - 0.0f;
                Object object4 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (object4 < 0) {
                    object = true;
                    f7 = Float.MIN_VALUE;
                } else {
                    n10 = 0;
                    object = false;
                    f7 = 0.0f;
                }
                SimpleImeAnimationController.animateImeToVisibility$default(this, (boolean)object, f5, null, 4, null);
                return;
            }
        }
        if (n4 == n7) {
            m53.a(object2);
            if (function1 != null) {
                f5 = Float.valueOf(0.0f);
                function1.invoke(f5);
            }
        } else if (n4 == n8) {
            n53.a(object2);
            if (function1 != null) {
                f5 = Float.valueOf(0.0f);
                function1.invoke(f5);
            }
        } else {
            float f14;
            float f15 = o53.a(object2);
            float f16 = f15 - (f14 = 0.15f);
            Object object5 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            if (object5 >= 0) {
                object5 = this.isImeShownAtStart;
                object = object5 ^ 1;
                n3 = 0;
                f6 = 0.0f;
                int n14 = 2;
                SimpleImeAnimationController.animateImeToVisibility$default(this, (boolean)object, null, function1, n14, null);
            } else {
                n4 = (int)(this.isImeShownAtStart ? 1 : 0);
                n7 = 0;
                insets2 = null;
                n10 = 2;
                object2 = this;
                object3 = function1;
                SimpleImeAnimationController.animateImeToVisibility$default(this, n4 != 0, null, function1, n10, null);
            }
        }
    }

    public final void cancel() {
        Object object = this.insetsAnimationController;
        if (object != null) {
            boolean bl2 = this.isImeShownAtStart;
            j53.a((WindowInsetsAnimationController)object, bl2);
        }
        if ((object = this.pendingRequestCancellationSignal) != null) {
            object.cancel();
        }
        if ((object = this.currentSpringAnimation) != null) {
            ((c)object).e();
        }
        this.reset();
    }

    public final void finish() {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            windowInsetsAnimationController = this.pendingRequestCancellationSignal;
            if (windowInsetsAnimationController != null) {
                windowInsetsAnimationController.cancel();
            }
            return;
        }
        Insets insets = h53.a(windowInsetsAnimationController);
        int n3 = su0_0.a(insets);
        Insets insets2 = k53_0.a(windowInsetsAnimationController);
        int n4 = su0_0.a(insets2);
        Insets insets3 = l53.a(windowInsetsAnimationController);
        int n7 = su0_0.a(insets3);
        if (n3 == n4) {
            m53.a(windowInsetsAnimationController);
        } else if (n3 == n7) {
            n53.a(windowInsetsAnimationController);
        } else {
            float f5 = o53.a(windowInsetsAnimationController);
            n4 = 1041865114;
            float f6 = 0.15f;
            float f7 = f5 - f6;
            n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n3 >= 0) {
                n3 = this.isImeShownAtStart ^ true;
                j53.a(windowInsetsAnimationController, n3 != 0);
            } else {
                n3 = (int)(this.isImeShownAtStart ? 1 : 0);
                j53.a(windowInsetsAnimationController, n3 != 0);
            }
        }
    }

    public final int insetBy(int n3) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            int n4 = su0_0.a(h53.a(windowInsetsAnimationController)) - n3;
            return this.insetTo(n4);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        throw illegalStateException;
    }

    public final int insetTo(int n3) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            Insets insets = l53.a(windowInsetsAnimationController);
            int n4 = su0_0.a(insets);
            Insets insets2 = k53_0.a(windowInsetsAnimationController);
            int n7 = su0_0.a(insets2);
            int n8 = this.isImeShownAtStart;
            int n10 = n8 != 0 ? n7 : n4;
            n8 = n8 != 0 ? n4 : n7;
            n3 = f.g(n3, n4, n7);
            n4 = su0_0.a(h53.a(windowInsetsAnimationController)) - n3;
            insets2 = q53_0.a(n3);
            float f5 = n3 - n10;
            float f6 = n8 - n10;
            r53_0.a(windowInsetsAnimationController, insets2, f5 /= f6);
            return n4;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        throw illegalStateException;
    }

    public final boolean isInsetAnimationFinishing() {
        boolean bl2;
        c c2 = this.currentSpringAnimation;
        if (c2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            c2 = null;
        }
        return bl2;
    }

    public final boolean isInsetAnimationInProgress() {
        boolean bl2;
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            bl2 = true;
        } else {
            bl2 = false;
            windowInsetsAnimationController = null;
        }
        return bl2;
    }

    public final boolean isInsetAnimationRequestPending() {
        boolean bl2;
        CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
        if (cancellationSignal != null) {
            bl2 = true;
        } else {
            bl2 = false;
            cancellationSignal = null;
        }
        return bl2;
    }

    public final void startAndFling(View view, float f5, Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        SimpleImeAnimationController$startAndFling$1 simpleImeAnimationController$startAndFling$1 = new SimpleImeAnimationController$startAndFling$1(this, f5, function1);
        this.startControlRequest(view, simpleImeAnimationController$startAndFling$1);
    }

    public final void startControlRequest(View object, Function1 object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.isInsetAnimationInProgress() ^ true;
        if (bl2) {
            string2 = Re1.a(object);
            int n3 = e93.a();
            this.isImeShownAtStart = bl2 = MG3.a((WindowInsets)string2, n3);
            string2 = new CancellationSignal();
            this.pendingRequestCancellationSignal = string2;
            this.pendingRequestOnReady = object2;
            if ((object = d93.a(object)) != null) {
                int n4 = e93.a();
                string2 = SimpleImeAnimationControllerKt.access$getLinearInterpolator$p();
                CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
                WindowInsetsAnimationControlListener windowInsetsAnimationControlListener = this.getAnimationControlListener();
                p53.a((WindowInsetsController)object, n4, (LinearInterpolator)string2, cancellationSignal, windowInsetsAnimationControlListener);
            }
            return;
        }
        object2 = "Animation in progress. Can not start a new request to controlWindowInsetsAnimation()".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

