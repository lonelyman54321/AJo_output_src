/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.webkit.WebView
 */
package androidx.media3.ui;

import android.view.MotionEvent;
import android.webkit.WebView;

public final class WebViewSubtitleOutput$a
extends WebView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean performClick() {
        super.performClick();
        return false;
    }
}

