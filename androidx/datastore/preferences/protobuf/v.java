/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p$a;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class v
extends LinkedHashMap {
    public static final v b;
    public boolean a = true;

    static {
        v v4;
        b = v4 = new v();
        v4.a = false;
    }

    public static int e(Object object) {
        int n3 = 1;
        int n4 = object instanceof byte[];
        if (n4 != 0) {
            object = (byte[])object;
            n4 = ((Object)object).length;
            int n7 = n4;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                n7 *= 31;
                Object object2 = object[i3];
                n7 += object2;
            }
            if (n7 != 0) {
                n3 = n7;
            }
            return n3;
        }
        n3 = object instanceof p$a;
        if (n3 == 0) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.f();
        super.clear();
    }

    public final Set entrySet() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        Set<Object> set = bl2 ? Collections.emptySet() : super.entrySet();
        return set;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        block8: {
            block7: {
                var2_2 = var1_1 instanceof Map;
                var3_3 = false;
                if (!var2_2) break block8;
                var1_1 = (Map)var1_1;
                var2_2 = true;
                if (this == var1_1) {
                    while (true) {
                        var4_4 = true;
                        break block7;
                        break;
                    }
                }
                var5_5 = this.size();
                if (var5_5 != (var6_6 = var1_1.size())) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var4_4 = false;
                        var1_1 = null;
                        break block7;
                        break;
                    }
                }
                var7_7 = this.entrySet().iterator();
                do {
                    if ((var6_6 = (int)var7_7.hasNext()) == 0) ** continue;
                    var8_8 = (Map.Entry)var7_7.next();
                    var9_9 /* !! */  = var8_8.getKey();
                    var10_10 = var1_1.containsKey(var9_9 /* !! */ );
                    if (!var10_10) ** GOTO lbl-1000
                    var9_9 /* !! */  = var8_8.getValue();
                    var8_8 = var8_8.getKey();
                    var8_8 = var1_1.get(var8_8);
                    var11_11 = var9_9 /* !! */  instanceof byte[];
                    if (var11_11 && (var11_11 = var8_8 instanceof byte[])) {
                        var9_9 /* !! */  = (K)((byte[])var9_9 /* !! */ );
                        var8_8 = (byte[])var8_8;
                        var6_6 = (int)Arrays.equals(var9_9 /* !! */ , (byte[])var8_8);
                        continue;
                    }
                    var6_6 = (int)var9_9 /* !! */ .equals(var8_8);
                } while (var6_6 != 0);
                ** while (true)
            }
            if (var4_4) {
                var3_3 = true;
            }
        }
        return var3_3;
    }

    public final void f() {
        boolean bl2 = this.a;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final v g() {
        v v4;
        boolean bl2 = ((AbstractMap)this).isEmpty();
        if (bl2) {
            v4 = new v();
        } else {
            boolean bl3;
            v4 = new LinkedHashMap(this);
            v4.a = bl3 = true;
        }
        return v4;
    }

    public final int hashCode() {
        int n3;
        Iterator iterator = this.entrySet().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object k2 = entry.getKey();
            int n7 = v.e(k2);
            entry = entry.getValue();
            n3 = v.e(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    public final Object put(Object object, Object object2) {
        this.f();
        object.getClass();
        object2.getClass();
        return super.put(object, object2);
    }

    public final void putAll(Map map2) {
        boolean bl2;
        this.f();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            object.getClass();
            object = map2.get(object);
            object.getClass();
        }
        super.putAll(map2);
    }

    public final Object remove(Object object) {
        this.f();
        return super.remove(object);
    }
}

