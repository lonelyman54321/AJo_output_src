/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.textfield.IndicatorViewController;

class IndicatorViewController$2
extends View.AccessibilityDelegate {
    final /* synthetic */ IndicatorViewController this$0;

    public IndicatorViewController$2(IndicatorViewController indicatorViewController) {
        this.this$0 = indicatorViewController;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        view = IndicatorViewController.access$300(this.this$0).getEditText();
        if (view != null) {
            accessibilityNodeInfo.setLabeledBy(view);
        }
    }
}

