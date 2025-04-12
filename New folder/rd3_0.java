/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 * Renamed from rD3
 */
public final class rd3_0 {
    public final LinkedHashMap a;

    public rd3_0() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final void a() {
        boolean bl2;
        LinkedHashMap linkedHashMap = this.a;
        Iterator iterator = linkedHashMap.values().iterator();
        while (bl2 = iterator.hasNext()) {
            jD3 jD32 = (jD3)iterator.next();
            jD32.clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}

