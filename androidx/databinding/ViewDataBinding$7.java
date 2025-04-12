/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnAttachStateChangeListener
 */
package androidx.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;

class ViewDataBinding$7
implements Runnable {
    public final /* synthetic */ ViewDataBinding a;

    public ViewDataBinding$7(ViewDataBinding viewDataBinding) {
        this.a = viewDataBinding;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        ViewDataBinding viewDataBinding;
        synchronized (this) {
            viewDataBinding = this.a;
            onAttachStateChangeListener = null;
            ViewDataBinding.access$202(viewDataBinding, false);
        }
        ViewDataBinding.access$300();
        viewDataBinding = ViewDataBinding.access$400(this.a);
        boolean bl2 = viewDataBinding.isAttachedToWindow();
        if (!bl2) {
            viewDataBinding = ViewDataBinding.access$400(this.a);
            onAttachStateChangeListener = ViewDataBinding.access$500();
            viewDataBinding.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            viewDataBinding = ViewDataBinding.access$400(this.a);
            onAttachStateChangeListener = ViewDataBinding.access$500();
            viewDataBinding.addOnAttachStateChangeListener(onAttachStateChangeListener);
            return;
        }
        this.a.executePendingBindings();
    }
}

