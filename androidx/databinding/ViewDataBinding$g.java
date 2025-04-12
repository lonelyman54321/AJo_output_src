/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
package androidx.databinding;

import android.view.Choreographer;
import androidx.databinding.ViewDataBinding;

public final class ViewDataBinding$g
implements Choreographer.FrameCallback {
    public final /* synthetic */ ViewDataBinding a;

    public ViewDataBinding$g(ViewDataBinding viewDataBinding) {
        this.a = viewDataBinding;
    }

    public final void doFrame(long l2) {
        ViewDataBinding.access$100(this.a).run();
    }
}

