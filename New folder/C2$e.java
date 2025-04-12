/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
import android.view.accessibility.AccessibilityNodeInfo;

public final class C2$e {
    public final Object a;

    public C2$e(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.a = collectionInfo;
    }

    public static C2$e a(int n3, int n4, int n7, boolean bl2) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain((int)n3, (int)n4, (boolean)bl2, (int)n7);
        C2$e c2$e = new C2$e(collectionInfo);
        return c2$e;
    }
}

