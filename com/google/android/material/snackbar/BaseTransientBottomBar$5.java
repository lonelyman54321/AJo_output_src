/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager$Callback;

class BaseTransientBottomBar$5
implements SnackbarManager$Callback {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$5(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void dismiss(int n3) {
        Handler handler = BaseTransientBottomBar.handler;
        BaseTransientBottomBar baseTransientBottomBar = this.this$0;
        Message message = handler.obtainMessage(1, n3, 0, (Object)baseTransientBottomBar);
        handler.sendMessage(message);
    }

    public void show() {
        Handler handler = BaseTransientBottomBar.handler;
        BaseTransientBottomBar baseTransientBottomBar = this.this$0;
        Message message = handler.obtainMessage(0, (Object)baseTransientBottomBar);
        handler.sendMessage(message);
    }
}

