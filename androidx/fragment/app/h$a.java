/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat$b;

public final class h$a
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;

    public h$a(View view) {
        this.a = view;
    }

    public final void onViewAttachedToWindow(View view) {
        view = this.a;
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        ViewCompat$b.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

