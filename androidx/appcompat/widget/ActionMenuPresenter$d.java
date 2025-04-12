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
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.widget.ActionMenuPresenter;

public final class ActionMenuPresenter$d
extends g {
    public final /* synthetic */ ActionMenuPresenter m;

    public ActionMenuPresenter$d(ActionMenuPresenter object, Context object2, d d2, View view) {
        int n3;
        this.m = object;
        int n4 = R$attr.actionOverflowMenuStyle;
        boolean bl2 = true;
        super(n4, 0, (Context)object2, view, d2, bl2);
        this.g = n3 = 0x800005;
        this.i = object = ((ActionMenuPresenter)object).x;
        object2 = this.j;
        if (object2 != null) {
            object2.setCallback((h$a)object);
        }
    }

    public final void c() {
        ActionMenuPresenter actionMenuPresenter = this.m;
        d d2 = actionMenuPresenter.c;
        if (d2 != null) {
            d2.close();
        }
        actionMenuPresenter.t = null;
        super.c();
    }
}

