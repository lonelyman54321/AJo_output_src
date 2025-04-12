/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.BottomAppBar$5;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener;

class BottomAppBar$5$1
extends FloatingActionButton$OnVisibilityChangedListener {
    final /* synthetic */ BottomAppBar$5 this$1;

    public BottomAppBar$5$1(BottomAppBar$5 var1_1) {
        this.this$1 = var1_1;
    }

    public void onShown(FloatingActionButton floatingActionButton) {
        BottomAppBar.access$1700(this.this$1.this$0);
    }
}

