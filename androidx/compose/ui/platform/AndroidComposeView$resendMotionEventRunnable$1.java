/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

public final class AndroidComposeView$resendMotionEventRunnable$1
implements Runnable {
    public final /* synthetic */ AndroidComposeView a;

    public AndroidComposeView$resendMotionEventRunnable$1(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void run() {
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.removeCallbacks(this);
        MotionEvent motionEvent = androidComposeView.F0;
        if (motionEvent != null) {
            int n3 = 0;
            androidComposeView = null;
            int n4 = motionEvent.getToolType(0);
            int n7 = 3;
            int n8 = 1;
            if (n4 == n7) {
                n3 = 1;
            }
            n4 = motionEvent.getActionMasked();
            if (n3 != 0 ? n4 != (n3 = 10) && n4 != n8 : n4 != n8) {
                n3 = 7;
                if (n4 != n3 && n4 != (n7 = 9)) {
                    n3 = 2;
                    n7 = 2;
                } else {
                    n7 = 7;
                }
                AndroidComposeView androidComposeView2 = this.a;
                long l2 = androidComposeView2.G0;
                androidComposeView2.W(motionEvent, n7, l2, false);
            }
        }
    }
}

