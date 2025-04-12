/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.security.keystore.KeyGenParameterSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Date;

/*
 * Renamed from l2
 */
public final class l2_0 {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, Date date) {
        return builder.setCertificateNotBefore(date);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
    }
}

