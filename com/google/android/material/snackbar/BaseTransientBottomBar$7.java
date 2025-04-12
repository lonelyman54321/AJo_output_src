/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.snackbar.SnackbarManager$Callback;

class BaseTransientBottomBar$7
implements SwipeDismissBehavior$OnDismissListener {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$7(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onDismiss(View view) {
        ViewParent viewParent = view.getParent();
        if (viewParent != null) {
            int n3 = 8;
            view.setVisibility(n3);
        }
        this.this$0.dispatchDismiss(0);
    }

    public void onDragStateChanged(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4 || n3 == (n4 = 2)) {
                SnackbarManager snackbarManager = SnackbarManager.getInstance();
                SnackbarManager$Callback snackbarManager$Callback = this.this$0.managerCallback;
                snackbarManager.pauseTimeout(snackbarManager$Callback);
            }
        } else {
            SnackbarManager snackbarManager = SnackbarManager.getInstance();
            SnackbarManager$Callback snackbarManager$Callback = this.this$0.managerCallback;
            snackbarManager.restoreTimeoutIfPaused(snackbarManager$Callback);
        }
    }
}

