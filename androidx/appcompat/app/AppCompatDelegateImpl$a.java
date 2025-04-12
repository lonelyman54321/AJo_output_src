/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a$a;

public final class AppCompatDelegateImpl$a
implements a$a {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public AppCompatDelegateImpl$a(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final Context a() {
        return this.a.M();
    }

    public final boolean b() {
        boolean bl2;
        Object object = this.a;
        ((AppCompatDelegateImpl)object).Q();
        object = ((AppCompatDelegateImpl)object).o;
        if (object != null && (bl2 = ((ActionBar)object).d() & 4)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void c(Drawable drawable2, int n3) {
        Object object = this.a;
        ((AppCompatDelegateImpl)object).Q();
        object = ((AppCompatDelegateImpl)object).o;
        if (object != null) {
            ((ActionBar)object).v(drawable2);
            ((ActionBar)object).s(n3);
        }
    }

    public final Drawable d() {
        Object object = this.a.M();
        int n3 = R$attr.homeAsUpIndicator;
        Object object2 = new int[]{n3};
        object = Tn3.e((Context)object, null, object2);
        object2 = ((Tn3)object).b(0);
        ((Tn3)object).g();
        return object2;
    }

    public final void e(int n3) {
        Object object = this.a;
        ((AppCompatDelegateImpl)object).Q();
        object = ((AppCompatDelegateImpl)object).o;
        if (object != null) {
            ((ActionBar)object).s(n3);
        }
    }
}

