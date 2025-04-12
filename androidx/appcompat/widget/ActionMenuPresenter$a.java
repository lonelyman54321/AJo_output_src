/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;

public final class ActionMenuPresenter$a
extends g {
    public final /* synthetic */ ActionMenuPresenter m;

    public ActionMenuPresenter$a(ActionMenuPresenter object, Context object2, j j3, View view) {
        this.m = object;
        int n3 = R$attr.actionOverflowMenuStyle;
        super(n3, 0, (Context)object2, view, j3, false);
        object2 = (f)j3.getItem();
        boolean bl2 = ((f)object2).f();
        if (!bl2) {
            object2 = ((ActionMenuPresenter)object).j;
            if (object2 == null) {
                object2 = (View)((a)object).h;
            }
            this.f = object2;
        }
        this.i = object = ((ActionMenuPresenter)object).x;
        object2 = this.j;
        if (object2 != null) {
            object2.setCallback((h$a)object);
        }
    }

    public final void c() {
        ActionMenuPresenter actionMenuPresenter = this.m;
        actionMenuPresenter.u = null;
        actionMenuPresenter.y = 0;
        super.c();
    }
}

