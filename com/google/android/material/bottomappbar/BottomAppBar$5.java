/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.BottomAppBar$5$1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener;

class BottomAppBar$5
extends FloatingActionButton$OnVisibilityChangedListener {
    final /* synthetic */ BottomAppBar this$0;
    final /* synthetic */ int val$targetMode;

    public BottomAppBar$5(BottomAppBar bottomAppBar, int n3) {
        this.this$0 = bottomAppBar;
        this.val$targetMode = n3;
    }

    public void onHidden(FloatingActionButton floatingActionButton) {
        Object object = this.this$0;
        int n3 = this.val$targetMode;
        float f5 = BottomAppBar.access$1900((BottomAppBar)object, n3);
        floatingActionButton.setTranslationX(f5);
        object = new BottomAppBar$5$1(this);
        floatingActionButton.show((FloatingActionButton$OnVisibilityChangedListener)object);
    }
}

