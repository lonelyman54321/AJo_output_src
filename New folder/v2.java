/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Rgb
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.function.DoubleUnaryOperator;

public final class v2 {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static /* bridge */ /* synthetic */ DoubleUnaryOperator b(ColorSpace.Rgb rgb) {
        return rgb.getEotf();
    }
}

