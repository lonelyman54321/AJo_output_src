/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
 */
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.c;
import java.util.List;

/*
 * Renamed from ag
 */
public final class ag_0
implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ c a;

    public /* synthetic */ ag_0(c c2) {
        this.a = c2;
    }

    public final void onAccessibilityStateChanged(boolean bl2) {
        List list;
        c c2 = this.a;
        if (bl2) {
            list = c2.d;
            int n3 = -1;
            list = list.getEnabledAccessibilityServiceList(n3);
        } else {
            list = mz0_2.a;
        }
        c2.h = list;
    }
}

