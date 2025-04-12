/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup;
import androidx.appcompat.widget.AppCompatSpinner$d;
import androidx.appcompat.widget.ForwardingListener;

public final class a
extends ForwardingListener {
    public final /* synthetic */ AppCompatSpinner$DropdownPopup j;
    public final /* synthetic */ AppCompatSpinner k;

    public a(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner$DropdownPopup appCompatSpinner$DropdownPopup) {
        this.k = appCompatSpinner;
        this.j = appCompatSpinner$DropdownPopup;
        super(view);
    }

    public final q43 b() {
        return this.j;
    }

    public final boolean c() {
        Object object = this.k;
        AppCompatSpinner$d appCompatSpinner$d = object.getInternalPopup();
        int n3 = appCompatSpinner$d.a();
        if (n3 == 0) {
            n3 = object.getTextDirection();
            int n4 = object.getTextAlignment();
            object = object.f;
            object.j(n3, n4);
        }
        return true;
    }
}

