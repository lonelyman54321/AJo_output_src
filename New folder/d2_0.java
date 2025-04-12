/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Rgb
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillManager$AutofillCallback
 */
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;

/*
 * Renamed from d2
 */
public final class d2_0 {
    public static /* bridge */ /* synthetic */ AutofillManager.AutofillCallback a(Object object) {
        return (AutofillManager.AutofillCallback)object;
    }

    public static /* bridge */ /* synthetic */ void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static /* bridge */ /* synthetic */ boolean c(Object object) {
        return object instanceof ColorSpace.Rgb;
    }
}

