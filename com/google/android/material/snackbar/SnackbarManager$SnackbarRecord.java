/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import com.google.android.material.snackbar.SnackbarManager$Callback;
import java.lang.ref.WeakReference;

class SnackbarManager$SnackbarRecord {
    final WeakReference callback;
    int duration;
    boolean paused;

    public SnackbarManager$SnackbarRecord(int n3, SnackbarManager$Callback snackbarManager$Callback) {
        WeakReference<SnackbarManager$Callback> weakReference;
        this.callback = weakReference = new WeakReference<SnackbarManager$Callback>(snackbarManager$Callback);
        this.duration = n3;
    }

    public boolean isSnackbar(SnackbarManager$Callback snackbarManager$Callback) {
        boolean bl2;
        Object t3;
        if (snackbarManager$Callback != null && (t3 = this.callback.get()) == snackbarManager$Callback) {
            bl2 = true;
        } else {
            bl2 = false;
            snackbarManager$Callback = null;
        }
        return bl2;
    }
}

