/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.h;
import androidx.fragment.app.n;

public final class e$a
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ e b;

    public e$a(e e2, h h3) {
        this.b = e2;
        this.a = h3;
    }

    public final void onViewAttachedToWindow(View object) {
        object = this.a;
        Object object2 = ((h)object).c;
        ((h)object).i();
        object = (ViewGroup)((Fragment)object2).mView.getParent();
        object2 = this.b.a;
        n.i((ViewGroup)object, (FragmentManager)object2).h();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

