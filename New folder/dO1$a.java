/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionProvider
 *  android.view.ActionProvider$VisibilityListener
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f$a;
import androidx.appcompat.view.menu.j;

public final class dO1$a
extends Q2
implements ActionProvider.VisibilityListener {
    public Q2$b b;
    public final ActionProvider c;
    public final /* synthetic */ do1_1 d;

    public dO1$a(do1_1 do1_12, ActionProvider actionProvider) {
        this.d = do1_12;
        this.c = actionProvider;
    }

    public final boolean a() {
        return this.c.hasSubMenu();
    }

    public final boolean b() {
        return this.c.isVisible();
    }

    public final View c() {
        return this.c.onCreateActionView();
    }

    public final View d(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    public final void f(j j3) {
        j3 = this.d.d(j3);
        this.c.onPrepareSubMenu((SubMenu)j3);
    }

    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    public final void h(f$a f$a) {
        this.b = f$a;
        this.c.setVisibilityListener((ActionProvider.VisibilityListener)this);
    }

    public final void onActionProviderVisibilityChanged(boolean bl2) {
        Object object = this.b;
        if (object != null) {
            object = ((f$a)object).a;
            d d2 = ((f)object).n;
            d2.onItemVisibleChanged((f)object);
        }
    }
}

