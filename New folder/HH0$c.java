/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

public final class HH0$c
extends D2 {
    public final /* synthetic */ HH0 b;

    public HH0$c(HH0 hH0) {
        this.b = hH0;
    }

    public final C2 b(int n3) {
        AccessibilityNodeInfo accessibilityNodeInfo = AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)this.b.obtainAccessibilityNodeInfo((int)n3).a);
        C2 c2 = new C2(accessibilityNodeInfo);
        return c2;
    }

    public final C2 c(int n3) {
        int n4 = 2;
        HH0 hH0 = this.b;
        if ((n3 = n3 == n4 ? hH0.mAccessibilityFocusedVirtualViewId : hH0.mKeyboardFocusedVirtualViewId) == (n4 = -1 << -1)) {
            return null;
        }
        return this.b(n3);
    }

    public final boolean d(int n3, int n4, Bundle bundle) {
        return this.b.performAction(n3, n4, bundle);
    }
}

