/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.view.accessibility.AccessibilityNodeInfo;

public final class C2$b {
    public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}

