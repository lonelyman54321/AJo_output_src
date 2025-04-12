/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.a;

class ClickActionDelegate
extends a {
    private final C2$a clickAction;

    public ClickActionDelegate(Context object, int n3) {
        C2$a c2$a;
        object = object.getString(n3);
        this.clickAction = c2$a = new C2$a(16, (CharSequence)object);
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = this.clickAction;
        c2.b((C2$a)object);
    }
}

