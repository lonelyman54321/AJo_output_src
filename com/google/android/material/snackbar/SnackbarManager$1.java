/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.snackbar.SnackbarManager$SnackbarRecord;

class SnackbarManager$1
implements Handler.Callback {
    final /* synthetic */ SnackbarManager this$0;

    public SnackbarManager$1(SnackbarManager snackbarManager) {
        this.this$0 = snackbarManager;
    }

    public boolean handleMessage(Message object) {
        int n3 = object.what;
        if (n3 != 0) {
            return false;
        }
        SnackbarManager snackbarManager = this.this$0;
        object = (SnackbarManager$SnackbarRecord)object.obj;
        snackbarManager.handleTimeout((SnackbarManager$SnackbarRecord)object);
        return true;
    }
}

