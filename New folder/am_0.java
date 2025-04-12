/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityManager
 */
import android.view.accessibility.AccessibilityManager;

/*
 * Renamed from am
 */
public final class am_0 {
    public static final am_0 a;

    static {
        am_0 am_02;
        a = am_02 = new Object();
    }

    public final int a(AccessibilityManager accessibilityManager, int n3, int n4) {
        return accessibilityManager.getRecommendedTimeoutMillis(n3, n4);
    }
}

