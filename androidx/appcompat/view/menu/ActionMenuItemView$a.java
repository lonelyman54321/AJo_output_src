/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.view.menu;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d$b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionMenuPresenter$b;
import androidx.appcompat.widget.ForwardingListener;

public final class ActionMenuItemView$a
extends ForwardingListener {
    public final /* synthetic */ ActionMenuItemView j;

    public ActionMenuItemView$a(ActionMenuItemView actionMenuItemView) {
        this.j = actionMenuItemView;
        super((View)actionMenuItemView);
    }

    public final q43 b() {
        Object object = this.j.f;
        eo1_1 eo1_12 = null;
        if (object != null && (object = ((ActionMenuPresenter$b)object).a.u) != null) {
            eo1_12 = ((g)object).a();
        }
        return eo1_12;
    }

    public final boolean c() {
        boolean bl2;
        Object object = this.j;
        d$b d$b = ((ActionMenuItemView)object).d;
        boolean bl3 = false;
        if (d$b != null && (bl2 = d$b.b((f)(object = ((ActionMenuItemView)object).a))) && (object = this.b()) != null && (bl2 = object.a())) {
            bl3 = true;
        }
        return bl3;
    }
}

