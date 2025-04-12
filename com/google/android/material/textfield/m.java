/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.PasswordToggleEndIconDelegate;

public final class m
implements View.OnClickListener {
    public final /* synthetic */ PasswordToggleEndIconDelegate a;

    public /* synthetic */ m(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        this.a = passwordToggleEndIconDelegate;
    }

    public final void onClick(View view) {
        PasswordToggleEndIconDelegate.a(this.a, view);
    }
}

