/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable;
import androidx.appcompat.widget.ActionMenuPresenter$c;
import androidx.appcompat.widget.ActionMenuPresenter$d;
import androidx.appcompat.widget.ForwardingListener;

public final class ActionMenuPresenter$c$a
extends ForwardingListener {
    public final /* synthetic */ ActionMenuPresenter$c j;

    public ActionMenuPresenter$c$a(ActionMenuPresenter$c actionMenuPresenter$c, View view) {
        this.j = actionMenuPresenter$c;
        super(view);
    }

    public final q43 b() {
        ActionMenuPresenter$d actionMenuPresenter$d = this.j.a.t;
        if (actionMenuPresenter$d == null) {
            return null;
        }
        return actionMenuPresenter$d.a();
    }

    public final boolean c() {
        this.j.a.e();
        return true;
    }

    public final boolean d() {
        ActionMenuPresenter actionMenuPresenter = this.j.a;
        ActionMenuPresenter$OpenOverflowRunnable actionMenuPresenter$OpenOverflowRunnable = actionMenuPresenter.v;
        if (actionMenuPresenter$OpenOverflowRunnable != null) {
            return false;
        }
        actionMenuPresenter.b();
        return true;
    }
}

