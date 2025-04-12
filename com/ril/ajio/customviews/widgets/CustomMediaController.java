/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.widget.MediaController
 */
package com.ril.ajio.customviews.widgets;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.MediaController;

public class CustomMediaController
extends MediaController {
    public CustomMediaController(Context context) {
        super(context);
    }

    public CustomMediaController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomMediaController(Context context, boolean bl2) {
        super(context, bl2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        int n4;
        if (keyEvent != null && (n4 = keyEvent.getKeyCode()) == (n3 = 4)) {
            ((Activity)this.getContext()).finish();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}

