/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.ClearTextEndIconDelegate;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ ClearTextEndIconDelegate a;

    public /* synthetic */ a(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.a = clearTextEndIconDelegate;
    }

    public final void onClick(View view) {
        ClearTextEndIconDelegate.a(this.a, view);
    }
}

