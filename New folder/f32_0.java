/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F32
 */
public final class f32_0
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Function0 b;

    public f32_0(View view, T t3) {
        this.a = view;
        this.b = t3;
    }

    public final void onViewAttachedToWindow(View object) {
        Intrinsics.checkNotNullParameter(object, "v");
        object = g32_0.Companion;
        T t3 = (T)this.b;
        object.getClass();
        object = this.a;
        ViewTreeObserver viewTreeObserver = object.getViewTreeObserver();
        g32_0 g32_02 = new g32_0((View)object, t3);
        viewTreeObserver.addOnDrawListener((ViewTreeObserver.OnDrawListener)g32_02);
        object.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }
}

