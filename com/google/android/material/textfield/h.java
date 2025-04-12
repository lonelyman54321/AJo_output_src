/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AutoCompleteTextView$OnDismissListener
 */
package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

public final class h
implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ DropdownMenuEndIconDelegate a;

    public /* synthetic */ h(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.a = dropdownMenuEndIconDelegate;
    }

    public final void onDismiss() {
        DropdownMenuEndIconDelegate.f(this.a);
    }
}

