/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$d;

class ActionMenuPresenter$OpenOverflowRunnable
implements Runnable {
    public final ActionMenuPresenter$d a;
    public final /* synthetic */ ActionMenuPresenter b;

    public ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter actionMenuPresenter, ActionMenuPresenter$d d2) {
        this.b = actionMenuPresenter;
        this.a = d2;
    }

    public final void run() {
        block4: {
            Object object;
            block5: {
                ActionMenuPresenter actionMenuPresenter = this.b;
                object = actionMenuPresenter.c;
                if (object != null) {
                    ((d)object).changeMenuMode();
                }
                if ((object = (View)actionMenuPresenter.h) == null || (object = object.getWindowToken()) == null) break block4;
                object = this.a;
                boolean bl2 = ((g)object).b();
                if (bl2) break block5;
                View view = ((g)object).f;
                if (view == null) break block4;
                bl2 = false;
                view = null;
                ((g)object).d(0, 0, false, false);
            }
            actionMenuPresenter.t = object;
        }
        actionMenuPresenter.v = null;
    }
}

