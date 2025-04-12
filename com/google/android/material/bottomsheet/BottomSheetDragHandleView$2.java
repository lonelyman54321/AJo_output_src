/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

class BottomSheetDragHandleView$2
extends a {
    final /* synthetic */ BottomSheetDragHandleView this$0;

    public BottomSheetDragHandleView$2(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.this$0 = bottomSheetDragHandleView;
    }

    public void onPopulateAccessibilityEvent(View object, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent((View)object, accessibilityEvent);
        int n3 = accessibilityEvent.getEventType();
        int n4 = 1;
        if (n3 == n4) {
            object = this.this$0;
            BottomSheetDragHandleView.access$100((BottomSheetDragHandleView)((Object)object));
        }
    }
}

