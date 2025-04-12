/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$8
implements Runnable {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$8(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void run() {
        int n3;
        int n4;
        Object object = this.this$0.view;
        if (object == null) {
            return;
        }
        if ((object = object.getParent()) != null) {
            object = this.this$0.view;
            n4 = 0;
            object.setVisibility(0);
        }
        if ((n3 = (object = this.this$0.view).getAnimationMode()) == (n4 = 1)) {
            object = this.this$0;
            BaseTransientBottomBar.access$1200((BaseTransientBottomBar)object);
        } else {
            object = this.this$0;
            BaseTransientBottomBar.access$1300((BaseTransientBottomBar)object);
        }
    }
}

