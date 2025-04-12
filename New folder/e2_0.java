/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Rgb
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillManager
 *  android.view.autofill.AutofillManager$AutofillCallback
 */
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;

/*
 * Renamed from e2
 */
public final class e2_0 {
    public static /* bridge */ /* synthetic */ ColorSpace.Rgb a(Object object) {
        return (ColorSpace.Rgb)object;
    }

    public static /* bridge */ /* synthetic */ void b(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl2) {
        accessibilityNodeInfo.setShowingHintText(bl2);
    }

    public static /* bridge */ /* synthetic */ void c(AutofillManager autofillManager, AutofillManager.AutofillCallback autofillCallback) {
        autofillManager.unregisterCallback(autofillCallback);
    }
}

