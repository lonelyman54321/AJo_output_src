/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.slider;

import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.BaseSlider$1;
import com.google.android.material.slider.BaseSlider$AccessibilityHelper;

class BaseSlider$AccessibilityEventSender
implements Runnable {
    final /* synthetic */ BaseSlider this$0;
    int virtualViewId = -1;

    private BaseSlider$AccessibilityEventSender(BaseSlider baseSlider) {
        this.this$0 = baseSlider;
    }

    public /* synthetic */ BaseSlider$AccessibilityEventSender(BaseSlider baseSlider, BaseSlider$1 baseSlider$1) {
        this(baseSlider);
    }

    public void run() {
        BaseSlider$AccessibilityHelper baseSlider$AccessibilityHelper = BaseSlider.access$200(this.this$0);
        int n3 = this.virtualViewId;
        baseSlider$AccessibilityHelper.sendEventForVirtualView(n3, 4);
    }

    public void setVirtualViewId(int n3) {
        this.virtualViewId = n3;
    }
}

