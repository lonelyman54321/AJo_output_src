/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener;

class FloatingActionButton$1
implements FloatingActionButtonImpl$InternalVisibilityChangedListener {
    final /* synthetic */ FloatingActionButton this$0;
    final /* synthetic */ FloatingActionButton$OnVisibilityChangedListener val$listener;

    public FloatingActionButton$1(FloatingActionButton floatingActionButton, FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener) {
        this.this$0 = floatingActionButton;
        this.val$listener = floatingActionButton$OnVisibilityChangedListener;
    }

    public void onHidden() {
        FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener = this.val$listener;
        FloatingActionButton floatingActionButton = this.this$0;
        floatingActionButton$OnVisibilityChangedListener.onHidden(floatingActionButton);
    }

    public void onShown() {
        FloatingActionButton$OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener = this.val$listener;
        FloatingActionButton floatingActionButton = this.this$0;
        floatingActionButton$OnVisibilityChangedListener.onShown(floatingActionButton);
    }
}

