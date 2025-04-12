/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 */
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/*
 * Renamed from lb3
 */
public final class lb3_0
extends P2
implements d$a {
    public Context c;
    public ActionBarContextView d;
    public P2$a e;
    public WeakReference f;
    public boolean g;
    public d h;

    public final void a() {
        boolean bl2 = this.g;
        if (bl2) {
            return;
        }
        this.g = true;
        this.e.b(this);
    }

    public final View b() {
        WeakReference weakReference = this.f;
        weakReference = weakReference != null ? (View)weakReference.get() : null;
        return weakReference;
    }

    public final d c() {
        return this.h;
    }

    public final MenuInflater d() {
        Context context = this.d.getContext();
        vg3_1 vg3_12 = new vg3_1(context);
        return vg3_12;
    }

    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    public final CharSequence f() {
        return this.d.getTitle();
    }

    public final void g() {
        P2$a p2$a = this.e;
        d d2 = this.h;
        p2$a.d(this, d2);
    }

    public final boolean h() {
        return this.d.s;
    }

    public final void i(View view) {
        Object object = this.d;
        object.setCustomView(view);
        object = view != null ? new WeakReference(view) : null;
        this.f = object;
    }

    public final void j(int n3) {
        String string2 = this.c.getString(n3);
        this.k(string2);
    }

    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    public final void l(int n3) {
        String string2 = this.c.getString(n3);
        this.m(string2);
    }

    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    public final void n(boolean bl2) {
        this.b = bl2;
        this.d.setTitleOptional(bl2);
    }

    public final boolean onMenuItemSelected(d d2, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    public final void onMenuModeChange(d object) {
        this.g();
        object = this.d.d;
        if (object != null) {
            ((ActionMenuPresenter)object).e();
        }
    }
}

