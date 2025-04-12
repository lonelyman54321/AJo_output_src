/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityOptions
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.app.ActivityOptions;
import android.security.keystore.KeyGenParameterSpec;
import android.view.accessibility.AccessibilityNodeInfo;

public final class o2 {
    public static /* bridge */ /* synthetic */ ActivityOptions a() {
        return ActivityOptions.makeBasic();
    }

    public static /* synthetic */ KeyGenParameterSpec.Builder b(String string2) {
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(string2, 3);
        return builder;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
    }
}

