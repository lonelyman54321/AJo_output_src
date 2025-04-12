/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 */
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class D2$a
extends AccessibilityNodeProvider {
    public final D2 a;

    public D2$a(D2 d2) {
        this.a = d2;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int n3) {
        D2 d2 = this.a;
        C2 c2 = d2.b(n3);
        if (c2 == null) {
            return null;
        }
        return c2.a;
    }

    public final List findAccessibilityNodeInfosByText(String string2, int n3) {
        this.a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int n3) {
        D2 d2 = this.a;
        C2 c2 = d2.c(n3);
        if (c2 == null) {
            return null;
        }
        return c2.a;
    }

    public final boolean performAction(int n3, int n4, Bundle bundle) {
        return this.a.d(n3, n4, bundle);
    }
}

