/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package androidx.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;

public final class ViewDataBinding$f
implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        ViewDataBinding.access$100(ViewDataBinding.getBinding(view)).run();
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

