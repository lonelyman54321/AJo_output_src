/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$6
implements Runnable {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$6(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void run() {
        this.this$0.onViewHidden(3);
    }
}

