/*
 * Decompiled with CFR 0.152.
 */
package androidx.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class ViewDataBinding$i
implements F62,
z62_0 {
    public final if3_0 a;
    public WeakReference b = null;

    public ViewDataBinding$i(ViewDataBinding viewDataBinding, int n3, ReferenceQueue referenceQueue) {
        if3_0 if3_02;
        this.a = if3_02 = new if3_0(viewDataBinding, n3, this, referenceQueue);
    }

    public final void a(mu1_1 mu1_12) {
        Object object = this.b;
        object = object == null ? null : (mu1_1)((Reference)object).get();
        LiveData liveData = (LiveData)this.a.c;
        if (liveData != null) {
            if (object != null) {
                liveData.j(this);
            }
            if (mu1_12 != null) {
                liveData.e(mu1_12, this);
            }
        }
        if (mu1_12 != null) {
            this.b = object = new Object(mu1_12);
        }
    }

    public final void c(Object object) {
        ((LiveData)object).j(this);
    }

    public final void d(Object object) {
        object = (LiveData)object;
        Object object2 = this.b;
        object2 = object2 == null ? null : (mu1_1)((Reference)object2).get();
        if (object2 != null) {
            ((LiveData)object).e((mu1_1)object2, this);
        }
    }

    public final void onChanged(Object object) {
        object = this.a;
        ViewDataBinding viewDataBinding = (ViewDataBinding)((Reference)object).get();
        if (viewDataBinding == null) {
            ((if3_0)object).a();
        }
        if (viewDataBinding != null) {
            Object object2 = ((if3_0)object).c;
            int n3 = ((if3_0)object).b;
            viewDataBinding.handleFieldChange(n3, object2, 0);
        }
    }
}

