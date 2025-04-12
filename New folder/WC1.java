/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class WC1 {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final uw1 lock;
    private final YC1 map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public WC1(int n3) {
        this.maxSize = n3;
        if (n3 > 0) {
            Object object = new YC1();
            this.map = object;
            this.lock = object = new Object();
            return;
        }
        iv2_2.c("maxSize <= 0");
        throw null;
    }

    private final int safeSizeOf(Object object, Object object2) {
        int n3 = this.sizeOf(object, object2);
        if (n3 >= 0) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder("Negative size: ");
        stringBuilder.append(object);
        stringBuilder.append('=');
        stringBuilder.append(object2);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullParameter(object, "message");
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public Object create(Object object) {
        Intrinsics.checkNotNullParameter(object, "key");
        return null;
    }

    public final int createCount() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.createCount;
            return n3;
        }
    }

    public void entryRemoved(boolean bl2, Object object, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "oldValue");
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.evictionCount;
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object get(Object object) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        block10: {
            Object object5;
            block9: {
                int n4;
                Intrinsics.checkNotNullParameter(object, "key");
                object4 = this.lock;
                // MONITORENTER : object4
                object3 = this.map;
                object3.getClass();
                object2 = "key";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object3 = ((YC1)object3).a;
                object3 = ((LinkedHashMap)object3).get(object);
                if (object3 != null) {
                    int n7;
                    this.hitCount = n7 = this.hitCount + 1;
                    // MONITOREXIT : object4
                    return object3;
                }
                this.missCount = n3 = this.missCount + 1;
                // MONITOREXIT : object4
                object4 = this.create(object);
                if (object4 == null) {
                    return null;
                }
                object3 = this.lock;
                // MONITORENTER : object3
                this.createCount = n4 = this.createCount + 1;
                object2 = this.map;
                object2.getClass();
                object5 = "key";
                Intrinsics.checkNotNullParameter(object, (String)object5);
                object5 = "value";
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                object2 = ((YC1)object2).a;
                object2 = ((AbstractMap)object2).put(object, object4);
                if (object2 == null) break block9;
                object5 = this.map;
                object5.getClass();
                String string2 = "key";
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = "value";
                Intrinsics.checkNotNullParameter(object2, string2);
                object5 = ((YC1)object5).a;
                ((AbstractMap)object5).put(object, object2);
                break block10;
            }
            int n8 = this.size;
            int n10 = this.safeSizeOf(object, object4);
            this.size = n8 += n10;
            object5 = Unit.a;
        }
        // MONITOREXIT : object3
        if (object2 != null) {
            n3 = 0;
            object3 = null;
            this.entryRemoved(false, object, object4, object2);
            return object2;
        }
        int n14 = this.maxSize;
        this.trimToSize(n14);
        return object4;
    }

    public final int hitCount() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.hitCount;
            return n3;
        }
    }

    public final int maxSize() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.maxSize;
            return n3;
        }
    }

    public final int missCount() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.missCount;
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object put(Object object, Object object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        uw1 uw12 = this.lock;
        // MONITORENTER : uw12
        this.putCount = n3 = this.putCount + 1;
        n3 = this.size;
        int n4 = this.safeSizeOf(object, object2);
        this.size = n3 += n4;
        Object object3 = this.map;
        object3.getClass();
        Object object4 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object4 = "value";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object3 = ((YC1)object3).a;
        object3 = ((AbstractMap)object3).put(object, object2);
        if (object3 != null) {
            n4 = this.size;
            int n7 = this.safeSizeOf(object, object3);
            this.size = n4 -= n7;
        }
        object4 = Unit.a;
        // MONITOREXIT : uw12
        if (object3 != null) {
            uw12 = null;
            this.entryRemoved(false, object, object3, object2);
        }
        int n8 = this.maxSize;
        this.trimToSize(n8);
        return object3;
    }

    public final int putCount() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.putCount;
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object remove(Object object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "key");
        uw1 uw12 = this.lock;
        // MONITORENTER : uw12
        Object object2 = this.map;
        object2.getClass();
        Object object3 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = ((YC1)object2).a;
        object2 = ((AbstractMap)object2).remove(object);
        if (object2 != null) {
            n3 = this.size;
            int n4 = this.safeSizeOf(object, object2);
            this.size = n3 -= n4;
        }
        object3 = Unit.a;
        // MONITOREXIT : uw12
        if (object2 == null) return object2;
        uw12 = null;
        n3 = 0;
        object3 = null;
        this.entryRemoved(false, object, object2, null);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void resize(int n3) {
        uw1 uw12;
        boolean bl2;
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            uw12 = null;
        }
        if (bl2) {
            uw12 = this.lock;
            synchronized (uw12) {
                this.maxSize = n3;
            }
            this.trimToSize(n3);
            return;
        }
        iv2_2.c("maxSize <= 0");
        throw null;
    }

    public final int size() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            int n3 = this.size;
            return n3;
        }
    }

    public int sizeOf(Object object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        return 1;
    }

    public final Map snapshot() {
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            Throwable throwable2;
            block20: {
                LinkedHashMap linkedHashMap;
                block19: {
                    Object object = this.map;
                    object = ((YC1)object).a;
                    object = ((LinkedHashMap)object).entrySet();
                    Object object2 = "map.entries";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    int n3 = object.size();
                    linkedHashMap = new LinkedHashMap(n3);
                    object = this.map;
                    object = ((YC1)object).a;
                    object = ((LinkedHashMap)object).entrySet();
                    object2 = "map.entries";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object = (Iterable)object;
                    try {
                        object = object.iterator();
                    }
                    catch (Throwable throwable2) {}
                    while (true) {
                        boolean bl2 = object.hasNext();
                        if (!bl2) break block19;
                        break;
                    }
                    {
                        object2 = object.next();
                        object2 = (Map.Entry)object2;
                        Object k2 = object2.getKey();
                        object2 = object2.getValue();
                        linkedHashMap.put(k2, object2);
                        continue;
                    }
                    break block20;
                }
                return linkedHashMap;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        String string2 = "LruCache[maxSize=";
        uw1 uw12 = this.lock;
        synchronized (uw12) {
            Throwable throwable2;
            block5: {
                int n3;
                block6: {
                    block4: {
                        int n4;
                        try {
                            n3 = this.hitCount;
                            n4 = this.missCount + n3;
                            if (n4 == 0) break block4;
                            n3 *= 100;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        n3 /= n4;
                        break block6;
                    }
                    n3 = 0;
                }
                StringBuilder stringBuilder = new StringBuilder(string2);
                int n7 = this.maxSize;
                stringBuilder.append(n7);
                string2 = ",hits=";
                stringBuilder.append(string2);
                n7 = this.hitCount;
                stringBuilder.append(n7);
                string2 = ",misses=";
                stringBuilder.append(string2);
                n7 = this.missCount;
                stringBuilder.append(n7);
                string2 = ",hitRate=";
                stringBuilder.append(string2);
                stringBuilder.append(n3);
                string2 = "%]";
                stringBuilder.append(string2);
                return stringBuilder.toString();
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void trimToSize(int var1_1) {
        block10: {
            while (true) {
                block11: {
                    var2_2 = this.lock;
                    // MONITORENTER : var2_2
                    var3_3 = this.size;
                    var4_4 = 1;
                    if (var3_3 < 0) ** GOTO lbl-1000
                    var5_5 = this.map;
                    var5_5 = var5_5.a;
                    var3_3 = (int)var5_5.isEmpty();
                    if (var3_3 == 0 || (var3_3 = this.size) == 0) {
                        var3_3 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_3 = 0;
                        var5_5 = null;
                    }
                    if (var3_3 == 0) break block10;
                    var3_3 = this.size;
                    if (var3_3 <= var1_1) break;
                    var5_5 = this.map;
                    var5_5 = var5_5.a;
                    var3_3 = (int)var5_5.isEmpty();
                    if (var3_3 != 0) {
                        return;
                    }
                    var5_5 = this.map;
                    var5_5 = var5_5.a;
                    var5_5 = var5_5.entrySet();
                    var7_6 /* !! */  = "map.entries";
                    Intrinsics.checkNotNullExpressionValue(var5_5, var7_6 /* !! */ );
                    var5_5 = (Iterable)var5_5;
                    var5_5 = CollectionsKt.M(var5_5);
                    var5_5 = (Map.Entry)var5_5;
                    if (var5_5 != null) break block11;
                    // MONITOREXIT : var2_2
                    return;
                }
                var7_6 /* !! */  = var5_5.getKey();
                var5_5 = var5_5.getValue();
                var8_7 = this.map;
                var8_7.getClass();
                var9_8 = "key";
                Intrinsics.checkNotNullParameter(var7_6 /* !! */ , var9_8);
                var8_7 = var8_7.a;
                var8_7.remove(var7_6 /* !! */ );
                var10_9 = this.size;
                var11_10 = this.safeSizeOf(var7_6 /* !! */ , var5_5);
                var10_9 -= var11_10;
                this.size = var10_9;
                this.evictionCount = var10_9 = this.evictionCount + var4_4;
                // MONITOREXIT : var2_2
                var2_2 = null;
                this.entryRemoved((boolean)var4_4, var7_6 /* !! */ , var5_5, null);
                continue;
                break;
            }
            // MONITOREXIT : var2_2
            return;
        }
        var6_12 = "LruCache.sizeOf() is reporting inconsistent results!";
        var5_5 = "message";
        Intrinsics.checkNotNullParameter(var6_12, (String)var5_5);
        var5_5 = new IllegalStateException(var6_12);
        throw var5_5;
    }
}

