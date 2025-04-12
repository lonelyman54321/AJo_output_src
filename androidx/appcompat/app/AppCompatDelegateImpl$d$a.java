/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$d;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;

public final class AppCompatDelegateImpl$d$a
extends ur3 {
    public final /* synthetic */ AppCompatDelegateImpl$d a;

    public AppCompatDelegateImpl$d$a(AppCompatDelegateImpl$d appCompatDelegateImpl$d) {
        this.a = appCompatDelegateImpl$d;
    }

    public final void onAnimationEnd() {
        Object object = this.a;
        Object object2 = ((AppCompatDelegateImpl$d)object).b.v;
        int n3 = 8;
        object2.setVisibility(n3);
        object = ((AppCompatDelegateImpl$d)object).b;
        object2 = ((AppCompatDelegateImpl)object).w;
        if (object2 != null) {
            object2.dismiss();
        } else {
            object2 = ((AppCompatDelegateImpl)object).v.getParent();
            boolean bl2 = object2 instanceof View;
            if (bl2) {
                object2 = (View)((AppCompatDelegateImpl)object).v.getParent();
                ViewCompat$b.c((View)object2);
            }
        }
        ((AppCompatDelegateImpl)object).v.h();
        ((AppCompatDelegateImpl)object).y.d(null);
        ((AppCompatDelegateImpl)object).y = null;
        object = ((AppCompatDelegateImpl)object).B;
        object2 = ViewCompat.a;
        ViewCompat$b.c((View)object);
    }
}

