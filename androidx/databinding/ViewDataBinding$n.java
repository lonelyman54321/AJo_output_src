/*
 * Decompiled with CFR 0.152.
 */
package androidx.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.c$a;
import java.lang.ref.ReferenceQueue;

public final class ViewDataBinding$n
extends c$a
implements z62_0 {
    public final if3_0 a;

    public ViewDataBinding$n(ViewDataBinding viewDataBinding, int n3, ReferenceQueue referenceQueue) {
        if3_0 if3_02;
        this.a = if3_02 = new if3_0(viewDataBinding, n3, this, referenceQueue);
    }

    public final void a(mu1_1 mu1_12) {
    }

    public final void c(Object object) {
        ((c)object).removeOnPropertyChangedCallback(this);
    }

    public final void d(Object object) {
        ((c)object).addOnPropertyChangedCallback(this);
    }

    public final void e(int n3, c c2) {
        if3_0 if3_02 = this.a;
        ViewDataBinding viewDataBinding = (ViewDataBinding)if3_02.get();
        if (viewDataBinding == null) {
            if3_02.a();
        }
        if (viewDataBinding == null) {
            return;
        }
        c c3 = (c)if3_02.c;
        if (c3 != c2) {
            return;
        }
        int n4 = if3_02.b;
        viewDataBinding.handleFieldChange(n4, c2, n3);
    }
}

