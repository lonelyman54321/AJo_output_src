/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 */
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.c;
import java.util.List;

/*
 * Renamed from bg
 */
public final class bg_0
implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ c a;

    public /* synthetic */ bg_0(c c2) {
        this.a = c2;
    }

    public final void onTouchExplorationStateChanged(boolean bl2) {
        List list;
        c c2 = this.a;
        c2.h = list = c2.d.getEnabledAccessibilityServiceList(-1);
    }
}

