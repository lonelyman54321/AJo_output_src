/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from Yw
 */
public final class yw_1
implements ug1_1 {
    public final Yw$a a;

    public yw_1() {
        Yw$a yw$a;
        new ThreadLocal();
        this.a = yw$a;
    }

    public final Map a() {
        Map map2 = (Map)this.a.get();
        if (map2 != null) {
            HashMap hashMap = new HashMap(map2);
            return hashMap;
        }
        return null;
    }

    public final void b(Map map2) {
        HashMap hashMap = map2 != null ? new HashMap(map2) : null;
        this.a.set(hashMap);
    }

    public final void clear() {
        Yw$a yw$a = this.a;
        Map map2 = (Map)yw$a.get();
        if (map2 != null) {
            map2.clear();
            yw$a.remove();
        }
    }
}

