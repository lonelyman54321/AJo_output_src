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
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$1
implements Handler.Callback {
    public boolean handleMessage(Message message) {
        boolean bl2 = message.what;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar)message.obj;
            int n3 = message.arg1;
            baseTransientBottomBar.hideView(n3);
            return bl3;
        }
        ((BaseTransientBottomBar)message.obj).showView();
        return bl3;
    }
}

