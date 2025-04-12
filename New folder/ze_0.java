/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityManager
 */
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ze
 */
public final class ze_0
implements P1 {
    public final AccessibilityManager a;

    public ze_0(Context object) {
        object = object.getSystemService("accessibility");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        object = (AccessibilityManager)object;
        this.a = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long a(long l2, boolean bl2) {
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        int n3 = bl2 ? 7 : 3;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        long l7 = Long.MAX_VALUE;
        AccessibilityManager accessibilityManager = this.a;
        if (n4 >= n7) {
            am_0 am_02 = am_0.a;
            int n8 = (int)l2;
            int n10 = am_02.a(accessibilityManager, n8, n3);
            if (n10 != (n8 = -1 >>> 1)) return n10;
            return l7;
        }
        if (!bl2) return l2;
        bl2 = accessibilityManager.isTouchExplorationEnabled();
        if (!bl2) return l2;
        return l7;
    }
}

