/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
package com.google.android.material.badge;

import android.view.View;
import androidx.core.view.a;
import com.google.android.material.badge.BadgeDrawable;

class BadgeUtils$2
extends a {
    final /* synthetic */ BadgeDrawable val$badgeDrawable;

    public BadgeUtils$2(View.AccessibilityDelegate accessibilityDelegate, BadgeDrawable badgeDrawable) {
        this.val$badgeDrawable = badgeDrawable;
        super(accessibilityDelegate);
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = this.val$badgeDrawable.getContentDescription();
        c2.o((CharSequence)object);
    }
}

