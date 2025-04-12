/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.security.keystore.KeyGenParameterSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import javax.security.auth.x500.X500Principal;

public final class j2 {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, X500Principal x500Principal) {
        return builder.setCertificateSubject(x500Principal);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }
}

