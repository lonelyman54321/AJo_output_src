/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Rgb
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillId
 */
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;

public final class g2 {
    public static /* bridge */ /* synthetic */ AutofillId a(Object object) {
        return (AutofillId)object;
    }

    public static /* bridge */ /* synthetic */ boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }

    public static /* bridge */ /* synthetic */ float[] c(ColorSpace.Rgb rgb) {
        return rgb.getWhitePoint();
    }
}

