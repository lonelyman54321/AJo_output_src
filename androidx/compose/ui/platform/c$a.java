/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 */
package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.c;

public final class c$a
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ c a;

    public c$a(c c2) {
        this.a = c2;
    }

    public final void onViewAttachedToWindow(View object) {
        object = this.a;
        AccessibilityManager accessibilityManager = object.d;
        ag_0 ag_02 = object.f;
        accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener)ag_02);
        object = object.g;
        accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)object);
    }

    public final void onViewDetachedFromWindow(View object) {
        object = this.a;
        Handler handler = object.i;
        Object object2 = object.H;
        handler.removeCallbacks((Runnable)object2);
        handler = object.d;
        object2 = object.f;
        handler.removeAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener)object2);
        object = object.g;
        handler.removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)object);
    }
}

