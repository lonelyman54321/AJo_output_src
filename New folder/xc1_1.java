/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LruCache
 */
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XC1
 */
public final class xc1_1
extends LruCache {
    public final Object create(Object object) {
        Intrinsics.checkNotNullParameter(object, "key");
        return null;
    }

    public final void entryRemoved(boolean bl2, Object object, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "oldValue");
    }

    public final int sizeOf(Object object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        object = (String)object;
        return zy_0.b(object2);
    }
}

