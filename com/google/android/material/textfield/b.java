/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.ClearTextEndIconDelegate;

public final class b
implements View.OnFocusChangeListener {
    public final /* synthetic */ ClearTextEndIconDelegate a;

    public /* synthetic */ b(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.a = clearTextEndIconDelegate;
    }

    public final void onFocusChange(View view, boolean bl2) {
        ClearTextEndIconDelegate.b(this.a, view, bl2);
    }
}

