/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Ca1 {
    public final HashMap a;
    public Map b;

    public Ca1() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map a() {
        synchronized (this) {
            try {
                Map map2 = this.b;
                if (map2 != null) return this.b;
                HashMap hashMap = this.a;
                map2 = new Map(hashMap);
                this.b = map2 = Collections.unmodifiableMap(map2);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

