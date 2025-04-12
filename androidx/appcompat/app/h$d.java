/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.appcompat.app;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl$d;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

public final class h$d
extends P2
implements d$a {
    public final Context c;
    public final d d;
    public P2$a e;
    public WeakReference f;
    public final /* synthetic */ h g;

    public h$d(h object, Context context, AppCompatDelegateImpl$d appCompatDelegateImpl$d) {
        this.g = object;
        this.c = context;
        this.e = appCompatDelegateImpl$d;
        object = new d(context);
        this.d = object = ((d)object).setDefaultShowAsAction(1);
        ((d)object).setCallback(this);
    }

    public final void a() {
        h h3 = this.g;
        Object object = h3.i;
        if (object != this) {
            return;
        }
        boolean bl2 = h3.p;
        boolean bl3 = h3.q;
        if (!bl2 && !bl3) {
            object = this.e;
            object.b(this);
        } else {
            h3.j = this;
            h3.k = object = this.e;
        }
        bl2 = false;
        object = null;
        this.e = null;
        bl3 = false;
        h3.A(false);
        ViewGroup viewGroup = h3.f;
        View view = viewGroup.k;
        if (view == null) {
            viewGroup.h();
        }
        viewGroup = h3.c;
        boolean bl4 = h3.v;
        viewGroup.setHideOnContentScrollEnabled(bl4);
        h3.i = null;
    }

    public final View b() {
        WeakReference weakReference = this.f;
        weakReference = weakReference != null ? (View)weakReference.get() : null;
        return weakReference;
    }

    public final d c() {
        return this.d;
    }

    public final MenuInflater d() {
        Context context = this.c;
        vg3_1 vg3_12 = new vg3_1(context);
        return vg3_12;
    }

    public final CharSequence e() {
        return this.g.f.getSubtitle();
    }

    public final CharSequence f() {
        return this.g.f.getTitle();
    }

    public final void g() {
        Object object = this.g.i;
        if (object != this) {
            return;
        }
        object = this.d;
        ((d)object).stopDispatchingItemsChanged();
        try {
            P2$a p2$a = this.e;
            p2$a.d(this, (Menu)object);
            return;
        }
        finally {
            ((d)object).startDispatchingItemsChanged();
        }
    }

    public final boolean h() {
        return this.g.f.s;
    }

    public final void i(View view) {
        WeakReference<View> weakReference;
        this.g.f.setCustomView(view);
        this.f = weakReference = new WeakReference<View>(view);
    }

    public final void j(int n3) {
        String string2 = this.g.a.getResources().getString(n3);
        this.k(string2);
    }

    public final void k(CharSequence charSequence) {
        this.g.f.setSubtitle(charSequence);
    }

    public final void l(int n3) {
        String string2 = this.g.a.getResources().getString(n3);
        this.m(string2);
    }

    public final void m(CharSequence charSequence) {
        this.g.f.setTitle(charSequence);
    }

    public final void n(boolean bl2) {
        this.b = bl2;
        this.g.f.setTitleOptional(bl2);
    }

    public final boolean onMenuItemSelected(d object, MenuItem menuItem) {
        object = this.e;
        if (object != null) {
            return object.a(this, menuItem);
        }
        return false;
    }

    public final void onMenuModeChange(d object) {
        object = this.e;
        if (object == null) {
            return;
        }
        this.g();
        object = this.g.f.d;
        if (object != null) {
            ((ActionMenuPresenter)object).e();
        }
    }
}

