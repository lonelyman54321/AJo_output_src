/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$d$a;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;

public final class AppCompatDelegateImpl$d
implements P2$a {
    public final P2$a a;
    public final /* synthetic */ AppCompatDelegateImpl b;

    public AppCompatDelegateImpl$d(AppCompatDelegateImpl appCompatDelegateImpl, P2$a p2$a) {
        this.b = appCompatDelegateImpl;
        this.a = p2$a;
    }

    public final boolean a(P2 p2, MenuItem menuItem) {
        return this.a.a(p2, menuItem);
    }

    public final void b(P2 object) {
        Object object2;
        this.a.b((P2)object);
        object = this.b;
        Object object3 = ((AppCompatDelegateImpl)object).w;
        if (object3 != null) {
            object3 = ((AppCompatDelegateImpl)object).l.getDecorView();
            object2 = ((AppCompatDelegateImpl)object).x;
            object3.removeCallbacks((Runnable)object2);
        }
        if ((object3 = ((AppCompatDelegateImpl)object).v) != null) {
            object3 = ((AppCompatDelegateImpl)object).y;
            if (object3 != null) {
                ((zd3_1)object3).b();
            }
            object3 = ViewCompat.a((View)((AppCompatDelegateImpl)object).v);
            ((zd3_1)object3).a(0.0f);
            ((AppCompatDelegateImpl)object).y = object3;
            object2 = new AppCompatDelegateImpl$d$a(this);
            ((zd3_1)object3).d((BD3)object2);
        }
        if ((object3 = ((AppCompatDelegateImpl)object).n) != null) {
            object2 = ((AppCompatDelegateImpl)object).u;
            object3.onSupportActionModeFinished((P2)object2);
        }
        ((AppCompatDelegateImpl)object).u = null;
        object3 = ((AppCompatDelegateImpl)object).B;
        object2 = ViewCompat.a;
        ViewCompat$b.c((View)object3);
        ((AppCompatDelegateImpl)object).Y();
    }

    public final boolean c(P2 p2, Menu menu2) {
        return this.a.c(p2, menu2);
    }

    public final boolean d(P2 p2, Menu menu2) {
        ViewGroup viewGroup = this.b.B;
        ViewCompat$b.c((View)viewGroup);
        return this.a.d(p2, menu2);
    }
}

