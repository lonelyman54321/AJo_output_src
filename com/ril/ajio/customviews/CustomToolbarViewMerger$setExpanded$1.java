/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior$DragCallback;
import kotlin.jvm.internal.Intrinsics;

public final class CustomToolbarViewMerger$setExpanded$1
extends AppBarLayout$Behavior$DragCallback {
    public boolean canDrag(AppBarLayout appBarLayout) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        return false;
    }
}

