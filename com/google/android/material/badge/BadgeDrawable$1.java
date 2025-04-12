/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.material.badge;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;

class BadgeDrawable$1
implements Runnable {
    final /* synthetic */ BadgeDrawable this$0;
    final /* synthetic */ View val$anchorView;
    final /* synthetic */ FrameLayout val$frameLayout;

    public BadgeDrawable$1(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        this.this$0 = badgeDrawable;
        this.val$anchorView = view;
        this.val$frameLayout = frameLayout;
    }

    public void run() {
        BadgeDrawable badgeDrawable = this.this$0;
        View view = this.val$anchorView;
        FrameLayout frameLayout = this.val$frameLayout;
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }
}

