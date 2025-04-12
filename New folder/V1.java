/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Named
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillValue
 */
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;

public final class V1 {
    public static /* bridge */ /* synthetic */ ColorSpace.Named a() {
        return ColorSpace.Named.SMPTE_C;
    }

    public static /* bridge */ /* synthetic */ void b(AccessibilityNodeInfo accessibilityNodeInfo, ArrayList arrayList) {
        accessibilityNodeInfo.setAvailableExtraData((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ boolean c(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }
}

