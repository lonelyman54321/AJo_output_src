/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.internal.NavigationMenuPresenter;

class NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate
extends v {
    final /* synthetic */ NavigationMenuPresenter this$0;

    public NavigationMenuPresenter$NavigationMenuViewAccessibilityDelegate(NavigationMenuPresenter navigationMenuPresenter, RecyclerView recyclerView) {
        this.this$0 = navigationMenuPresenter;
        super(recyclerView);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        view = AccessibilityNodeInfo.CollectionInfo.obtain((int)this.this$0.adapter.getRowCount(), (int)1, (boolean)false);
        c2.getClass();
        c2.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)view);
    }
}

