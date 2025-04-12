/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cp1
 */
public final class cp1_2
extends LinkedHashMap {
    public final Function1 a;
    public final Function1 b;
    public final int c;

    public cp1_2(E72$b e72$b, c72_0 c72_02, int n3) {
        Intrinsics.checkNotNullParameter(e72$b, "supplier");
        Intrinsics.checkNotNullParameter(c72_02, "close");
        super(10, 0.75f, true);
        this.a = e72$b;
        this.b = c72_02;
        this.c = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object get(Object object) {
        int n3 = this.c;
        if (n3 == 0) {
            Function1 function1 = this.a;
            return function1.invoke(object);
        }
        synchronized (this) {
            Object object2;
            block7: {
                object2 = super.get(object);
                if (object2 == null) break block7;
                return object2;
            }
            object2 = this.a;
            object2 = object2.invoke(object);
            ((AbstractMap)this).put(object, object2);
            return object2;
        }
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        String string2 = "eldest";
        Intrinsics.checkNotNullParameter(entry, string2);
        int n3 = super.size();
        int n4 = this.c;
        if (n3 > n4) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        if (n3) {
            Function1 function1 = this.b;
            entry = entry.getValue();
            function1.invoke(entry);
        }
        return n3;
    }
}

