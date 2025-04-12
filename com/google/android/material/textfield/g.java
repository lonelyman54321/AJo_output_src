/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

public final class g
implements View.OnTouchListener {
    public final /* synthetic */ DropdownMenuEndIconDelegate a;

    public /* synthetic */ g(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.a = dropdownMenuEndIconDelegate;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return DropdownMenuEndIconDelegate.e(this.a, view, motionEvent);
    }
}

