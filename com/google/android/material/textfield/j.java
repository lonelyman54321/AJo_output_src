/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

public final class j
implements View.OnFocusChangeListener {
    public final /* synthetic */ DropdownMenuEndIconDelegate a;

    public /* synthetic */ j(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.a = dropdownMenuEndIconDelegate;
    }

    public final void onFocusChange(View view, boolean bl2) {
        DropdownMenuEndIconDelegate.d(this.a, view, bl2);
    }
}

