/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 */
import android.view.accessibility.AccessibilityNodeInfo;

public final class C2$f {
    public final Object a;

    public C2$f(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }

    public static C2$f a(int n3, int n4, int n7, int n8, boolean bl2, boolean bl3) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n3, (int)n4, (int)n7, (int)n8, (boolean)bl2, (boolean)bl3);
        C2$f c2$f = new C2$f(collectionItemInfo);
        return c2$f;
    }
}

