/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.View;
import android.view.ViewTreeObserver;

public final class x92
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public x92(View view, Runnable runnable2) {
        this.a = view;
        view = view.getViewTreeObserver();
        this.b = view;
        this.c = runnable2;
    }

    public static void a(View object, Runnable runnable2) {
        if (object != null) {
            if (runnable2 != null) {
                x92 x922 = new x92((View)object, runnable2);
                object.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)x922);
                object.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)x922);
                return;
            }
            object = new NullPointerException("runnable == null");
            throw object;
        }
        object = new NullPointerException("view == null");
        throw object;
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.b;
        boolean bl2 = viewTreeObserver.isAlive();
        View view = this.a;
        if (bl2) {
            viewTreeObserver = this.b;
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        } else {
            viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        }
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        view = view.getViewTreeObserver();
        this.b = view;
    }

    public final void onViewDetachedFromWindow(View view) {
        view = this.b;
        boolean bl2 = view.isAlive();
        View view2 = this.a;
        if (bl2) {
            view = this.b;
            view.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        } else {
            view = view2.getViewTreeObserver();
            view.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        }
        view2.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }
}

