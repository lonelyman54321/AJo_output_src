/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsets
 */
package com.google.accompanist.insets;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.accompanist.insets.ImeNestedScrollConnection$imeAnimController$2;
import com.google.accompanist.insets.ImeNestedScrollConnection$onPostFling$2$1;
import com.google.accompanist.insets.ImeNestedScrollConnection$onPostFling$2$2;
import com.google.accompanist.insets.ImeNestedScrollConnection$onPostFling$3$1;
import com.google.accompanist.insets.ImeNestedScrollConnection$onPostFling$3$2;
import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ImeNestedScrollConnection
implements oU1 {
    public static final int $stable = 8;
    private final rq1_2 imeAnimController$delegate;
    private final boolean scrollImeOffScreenWhenVisible;
    private final boolean scrollImeOnScreenWhenNotVisible;
    private final View view;

    public ImeNestedScrollConnection(View object, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "view");
        this.view = object;
        this.scrollImeOffScreenWhenVisible = bl2;
        this.scrollImeOnScreenWhenNotVisible = bl3;
        object = et1_2.NONE;
        ImeNestedScrollConnection$imeAnimController$2 imeNestedScrollConnection$imeAnimController$2 = ImeNestedScrollConnection$imeAnimController$2.INSTANCE;
        object = yr1_2.a((et1_2)((Object)object), imeNestedScrollConnection$imeAnimController$2);
        this.imeAnimController$delegate = object;
    }

    private final SimpleImeAnimationController getImeAnimController() {
        return (SimpleImeAnimationController)this.imeAnimController$delegate.getValue();
    }

    private final boolean getImeVisible() {
        WindowInsets windowInsets = Re1.a(this.view);
        int n3 = e93.a();
        return MG3.a(windowInsets, n3);
    }

    public Object onPostFling-RZ2iAVY(long l2, long l3, f80_0 f80_02) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        long l4 = 0L;
        if (n3 < n4) {
            WA3 wA3 = new WA3(l4);
            return wA3;
        }
        Object object = this.getImeAnimController();
        n3 = (int)(((SimpleImeAnimationController)object).isInsetAnimationInProgress() ? 1 : 0);
        String string2 = "frame";
        int n7 = 1;
        if (n3 != 0) {
            Object object2 = zj1_2.b(f80_02);
            object = new CancellableContinuationImpl(n7, (f80_0)object2);
            ((CancellableContinuationImpl)object).r();
            object2 = this.getImeAnimController();
            float f5 = WA3.c(l3);
            Float f6 = new Float(f5);
            Object object3 = new ImeNestedScrollConnection$onPostFling$2$1((bl_2)object, this);
            ((SimpleImeAnimationController)object2).animateToFinish(f6, (Function1)object3);
            object3 = new ImeNestedScrollConnection$onPostFling$2$2(this);
            object.x((Function1)object3);
            object = ((CancellableContinuationImpl)object).q();
            object3 = j90_0.COROUTINE_SUSPENDED;
            if (object == object3) {
                Intrinsics.checkNotNullParameter(f80_02, string2);
            }
            return object;
        }
        n3 = (int)(this.scrollImeOnScreenWhenNotVisible ? 1 : 0);
        if (n3 != 0) {
            float f7 = WA3.c(l3);
            int n8 = 0;
            float f8 = f7 - 0.0f;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                n3 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f7 = 0.0f;
                object = null;
            }
            n8 = this.getImeVisible();
            if (n3 == n8) {
                Object object4 = zj1_2.b(f80_02);
                object = new CancellableContinuationImpl(n7, (f80_0)object4);
                ((CancellableContinuationImpl)object).r();
                object4 = this.getImeAnimController();
                View view = this.view;
                float f11 = WA3.c(l3);
                ImeNestedScrollConnection$onPostFling$3$1 imeNestedScrollConnection$onPostFling$3$1 = new ImeNestedScrollConnection$onPostFling$3$1((bl_2)object, this);
                ((SimpleImeAnimationController)object4).startAndFling(view, f11, imeNestedScrollConnection$onPostFling$3$1);
                Object object5 = new ImeNestedScrollConnection$onPostFling$3$2(this);
                object.x((Function1)object5);
                object = ((CancellableContinuationImpl)object).q();
                object5 = j90_0.COROUTINE_SUSPENDED;
                if (object == object5) {
                    Intrinsics.checkNotNullParameter(f80_02, string2);
                }
                return object;
            }
        }
        object = new WA3(l4);
        return object;
    }

    public long onPostScroll-DzOQY0M(long l2, long l3, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        long l4 = 0L;
        if (n4 < n7) {
            return l4;
        }
        float f5 = e72.e(l3);
        n7 = 0;
        View view = null;
        float f6 = f5 - 0.0f;
        n4 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
        if (n4 < 0) {
            SimpleImeAnimationController simpleImeAnimationController = this.getImeAnimController();
            n4 = (int)(simpleImeAnimationController.isInsetAnimationInProgress() ? 1 : 0);
            if (n4 != 0) {
                simpleImeAnimationController = this.getImeAnimController();
                int n8 = ok1_1.b(e72.e(l3));
                f5 = simpleImeAnimationController.insetBy(n8);
                return h72.a(0.0f, f5);
            }
            n4 = (int)(this.scrollImeOnScreenWhenNotVisible ? 1 : 0);
            if (n4 != 0 && (n4 = (int)((simpleImeAnimationController = this.getImeAnimController()).isInsetAnimationRequestPending() ? 1 : 0)) == 0 && (n4 = (int)(this.getImeVisible() ? 1 : 0)) == 0) {
                simpleImeAnimationController = this.getImeAnimController();
                view = this.view;
                SimpleImeAnimationController.startControlRequest$default(simpleImeAnimationController, view, null, 2, null);
                return l3;
            }
        }
        return l4;
    }

    public Object onPreFling-QWom1Mo(long l2, f80_0 f80_02) {
        WA3 wA3 = new WA3(0L);
        return wA3;
    }

    public long onPreScroll-OzD1aCk(long l2, int n3) {
        n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        long l3 = 0L;
        if (n3 < n4) {
            return l3;
        }
        SimpleImeAnimationController simpleImeAnimationController = this.getImeAnimController();
        n3 = (int)(simpleImeAnimationController.isInsetAnimationRequestPending() ? 1 : 0);
        if (n3 != 0) {
            return l2;
        }
        float f5 = e72.e(l2);
        n4 = 0;
        View view = null;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 > 0) {
            simpleImeAnimationController = this.getImeAnimController();
            n3 = (int)(simpleImeAnimationController.isInsetAnimationInProgress() ? 1 : 0);
            if (n3 != 0) {
                simpleImeAnimationController = this.getImeAnimController();
                int n7 = ok1_1.b(e72.e(l2));
                float f7 = simpleImeAnimationController.insetBy(n7);
                return h72.a(0.0f, f7);
            }
            n3 = (int)(this.scrollImeOffScreenWhenVisible ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.getImeVisible() ? 1 : 0)) != 0) {
                simpleImeAnimationController = this.getImeAnimController();
                view = this.view;
                SimpleImeAnimationController.startControlRequest$default(simpleImeAnimationController, view, null, 2, null);
                return l2;
            }
        }
        return l3;
    }
}

