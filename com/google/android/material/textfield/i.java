/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ DropdownMenuEndIconDelegate a;

    public /* synthetic */ i(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.a = dropdownMenuEndIconDelegate;
    }

    public final void onClick(View view) {
        DropdownMenuEndIconDelegate.g(this.a, view);
    }
}

