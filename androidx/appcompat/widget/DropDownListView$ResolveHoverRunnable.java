/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.DropDownListView;

class DropDownListView$ResolveHoverRunnable
implements Runnable {
    public final /* synthetic */ DropDownListView a;

    public DropDownListView$ResolveHoverRunnable(DropDownListView dropDownListView) {
        this.a = dropDownListView;
    }

    public final void run() {
        DropDownListView dropDownListView = this.a;
        dropDownListView.l = null;
        dropDownListView.drawableStateChanged();
    }
}

