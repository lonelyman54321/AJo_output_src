/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

public final class U1 {
    public static /* bridge */ /* synthetic */ void a(AccessibilityNodeInfo accessibilityNodeInfo, AndroidViewHolder androidViewHolder) {
        accessibilityNodeInfo.setTraversalBefore((View)androidViewHolder);
    }
}

