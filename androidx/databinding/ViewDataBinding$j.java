/*
 * Decompiled with CFR 0.152.
 */
package androidx.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$a;
import java.lang.ref.WeakReference;

public final class ViewDataBinding$j
implements lu1 {
    public final WeakReference a;

    private ViewDataBinding$j(ViewDataBinding viewDataBinding) {
        WeakReference<ViewDataBinding> weakReference;
        this.a = weakReference = new WeakReference<ViewDataBinding>(viewDataBinding);
    }

    public /* synthetic */ ViewDataBinding$j(ViewDataBinding viewDataBinding, ViewDataBinding$a viewDataBinding$a) {
        this(viewDataBinding);
    }

    public void onStart() {
        ViewDataBinding viewDataBinding = (ViewDataBinding)this.a.get();
        if (viewDataBinding != null) {
            viewDataBinding.executePendingBindings();
        }
    }
}

