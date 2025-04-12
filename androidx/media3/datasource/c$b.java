/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c$b
extends ForwardingMap {
    public final Map a;

    public c$b(Map map2) {
        this.a = map2;
    }

    public final boolean containsKey(Object object) {
        boolean bl2;
        if (object != null && (bl2 = super.containsKey(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean containsValue(Object object) {
        return super.standardContainsValue(object);
    }

    public final Object delegate() {
        return this.a;
    }

    public final Map delegate() {
        return this.a;
    }

    public final Set entrySet() {
        Set set = super.entrySet();
        Xl0 xl0 = new Object();
        return Sets.filter(set, (Predicate)xl0);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object != null && (bl2 = super.standardEquals(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Object get(Object object) {
        object = object == null ? null : (List)super.get(object);
        return object;
    }

    public final int hashCode() {
        return super.standardHashCode();
    }

    public final boolean isEmpty() {
        int n3 = super.isEmpty();
        int n4 = 1;
        if (n3 == 0 && ((n3 = super.size()) != n4 || (n3 = (int)(super.containsKey(null) ? 1 : 0)) == 0)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final Set keySet() {
        Set set = super.keySet();
        yl0_0 yl0_02 = new Object();
        return Sets.filter(set, (Predicate)yl0_02);
    }

    public final int size() {
        int n3 = super.size();
        int n4 = super.containsKey(null);
        return n3 - n4;
    }
}

