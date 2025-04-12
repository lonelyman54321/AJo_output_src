/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class g$a
implements xS2$a {
    public final void a(zs2_1 hashSet) {
        Object object = "owner";
        Intrinsics.checkNotNullParameter(hashSet, (String)object);
        boolean bl2 = hashSet instanceof sD3;
        if (bl2) {
            boolean bl3;
            object = hashSet;
            object = ((sD3)((Object)hashSet)).getViewModelStore();
            xs2_1 xs2_12 = ((zs2_1)((Object)hashSet)).getSavedStateRegistry();
            object.getClass();
            object = ((rd3_0)object).a;
            Object object2 = ((LinkedHashMap)object).keySet();
            Object object3 = new HashSet(object2);
            object3 = ((HashSet)object3).iterator();
            while (bl3 = object3.hasNext()) {
                object2 = (String)object3.next();
                Intrinsics.checkNotNullParameter(object2, "key");
                object2 = (jD3)((LinkedHashMap)object).get(object2);
                Intrinsics.checkNotNull(object2);
                i i3 = ((mu1_1)((Object)hashSet)).getLifecycle();
                g.a((jD3)object2, xs2_12, i3);
            }
            hashSet = new HashSet(object = (Collection)((LinkedHashMap)object).keySet());
            boolean bl4 = hashSet.isEmpty() ^ true;
            if (bl4) {
                xs2_12.d();
            }
            return;
        }
        object = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString();
        hashSet = new HashSet((String)object);
        throw hashSet;
    }
}

