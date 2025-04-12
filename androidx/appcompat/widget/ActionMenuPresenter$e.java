/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;

public final class ActionMenuPresenter$e
implements h$a {
    public final /* synthetic */ ActionMenuPresenter a;

    public ActionMenuPresenter$e(ActionMenuPresenter actionMenuPresenter) {
        this.a = actionMenuPresenter;
    }

    public final boolean a(d d2) {
        int n3;
        Object object = this.a;
        d d5 = ((a)object).c;
        boolean bl2 = false;
        if (d2 == d5) {
            return false;
        }
        d5 = d2;
        d5 = ((j)d2).getItem();
        ((ActionMenuPresenter)object).y = n3 = d5.getItemId();
        object = ((a)object).e;
        if (object != null) {
            bl2 = object.a(d2);
        }
        return bl2;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        Object object;
        boolean bl3 = d2 instanceof j;
        if (bl3) {
            object = d2.getRootMenu();
            ((d)object).close(false);
        }
        if ((object = this.a.e) != null) {
            object.onCloseMenu(d2, bl2);
        }
    }
}

