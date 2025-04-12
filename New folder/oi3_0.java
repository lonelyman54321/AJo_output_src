/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/*
 * Renamed from Oi3
 */
public final class oi3_0
implements ku1_0 {
    public final Set a;

    public oi3_0() {
        Object object = new WeakHashMap();
        this.a = object = Collections.newSetFromMap(object);
    }

    public final void onDestroy() {
        boolean bl2;
        Iterator iterator = dz3.e(this.a).iterator();
        while (bl2 = iterator.hasNext()) {
            ki3_1 ki3_12 = (ki3_1)iterator.next();
            ki3_12.onDestroy();
        }
    }

    public final void onStart() {
        boolean bl2;
        Iterator iterator = dz3.e(this.a).iterator();
        while (bl2 = iterator.hasNext()) {
            ki3_1 ki3_12 = (ki3_1)iterator.next();
            ki3_12.onStart();
        }
    }

    public final void onStop() {
        boolean bl2;
        Iterator iterator = dz3.e(this.a).iterator();
        while (bl2 = iterator.hasNext()) {
            ki3_1 ki3_12 = (ki3_1)iterator.next();
            ki3_12.onStop();
        }
    }
}

