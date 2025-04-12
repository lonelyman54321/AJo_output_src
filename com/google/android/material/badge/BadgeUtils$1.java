/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.material.badge;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ToolbarUtils;

class BadgeUtils$1
implements Runnable {
    final /* synthetic */ BadgeDrawable val$badgeDrawable;
    final /* synthetic */ FrameLayout val$customBadgeParent;
    final /* synthetic */ int val$menuItemId;
    final /* synthetic */ Toolbar val$toolbar;

    public BadgeUtils$1(Toolbar toolbar, int n3, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
        this.val$toolbar = toolbar;
        this.val$menuItemId = n3;
        this.val$badgeDrawable = badgeDrawable;
        this.val$customBadgeParent = frameLayout;
    }

    public void run() {
        Object object = this.val$toolbar;
        int n3 = this.val$menuItemId;
        if ((object = ToolbarUtils.getActionMenuItemView((Toolbar)object, n3)) != null) {
            BadgeDrawable badgeDrawable = this.val$badgeDrawable;
            Resources resources = this.val$toolbar.getResources();
            BadgeUtils.setToolbarOffset(badgeDrawable, resources);
            badgeDrawable = this.val$badgeDrawable;
            resources = this.val$customBadgeParent;
            BadgeUtils.attachBadgeDrawable(badgeDrawable, (View)object, (FrameLayout)resources);
            badgeDrawable = this.val$badgeDrawable;
            BadgeUtils.access$000(badgeDrawable, (View)object);
        }
    }
}

