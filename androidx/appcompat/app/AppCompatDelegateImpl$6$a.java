/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$6;

public final class AppCompatDelegateImpl$6$a
extends ur3 {
    public final /* synthetic */ AppCompatDelegateImpl$6 a;

    public AppCompatDelegateImpl$6$a(AppCompatDelegateImpl$6 appCompatDelegateImpl$6) {
        this.a = appCompatDelegateImpl$6;
    }

    public final void a() {
        this.a.a.v.setVisibility(0);
    }

    public final void onAnimationEnd() {
        Object object = this.a;
        ((AppCompatDelegateImpl$6)object).a.v.setAlpha(1.0f);
        object = ((AppCompatDelegateImpl$6)object).a;
        ((AppCompatDelegateImpl)object).y.d(null);
        ((AppCompatDelegateImpl)object).y = null;
    }
}

