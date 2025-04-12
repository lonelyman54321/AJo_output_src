/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.IBinder
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.Window
 */
package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import androidx.window.layout.SidecarCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$c
implements View.OnAttachStateChangeListener {
    public final SidecarCompat a;
    public final WeakReference b;

    public SidecarCompat$c(SidecarCompat weakReference, Activity activity) {
        Intrinsics.checkNotNullParameter(weakReference, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = weakReference;
        this.b = weakReference = new WeakReference<Activity>(activity);
    }

    public final void onViewAttachedToWindow(View view) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        view = (Activity)this.b.get();
        IBinder iBinder = null;
        if (view != null && (window = view.getWindow()) != null && (window = window.getAttributes()) != null) {
            iBinder = window.token;
        }
        if (view == null) {
            return;
        }
        if (iBinder == null) {
            return;
        }
        this.a.h(iBinder, (Activity)view);
    }

    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}

