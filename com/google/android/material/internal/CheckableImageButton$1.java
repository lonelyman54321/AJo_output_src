/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import com.google.android.material.internal.CheckableImageButton;

class CheckableImageButton$1
extends a {
    final /* synthetic */ CheckableImageButton this$0;

    public CheckableImageButton$1(CheckableImageButton checkableImageButton) {
        this.this$0 = checkableImageButton;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        boolean bl2 = this.this$0.isChecked();
        accessibilityEvent.setChecked(bl2);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        boolean bl2 = this.this$0.isCheckable();
        c2.a.setCheckable(bl2);
        bl2 = this.this$0.isChecked();
        c2.a.setChecked(bl2);
    }
}

