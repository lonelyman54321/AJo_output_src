/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G$b;
import androidx.datastore.preferences.protobuf.G$c;
import androidx.datastore.preferences.protobuf.G$d;
import androidx.datastore.preferences.protobuf.G$f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class G
extends AbstractMap {
    public static final /* synthetic */ int h;
    public final int a;
    public List b;
    public Map c;
    public boolean d;
    public volatile G$f e;
    public Map f;
    public volatile b g;

    public G(int n3) {
        this.a = n3;
        Map map2 = Collections.emptyList();
        this.b = map2;
        map2 = Collections.emptyMap();
        this.c = map2;
        this.f = map2 = Collections.emptyMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Comparable comparable) {
        int n3;
        List list = this.b;
        int n4 = list.size();
        int n7 = n4 + -1;
        if (n7 >= 0) {
            Comparable comparable2 = ((G$d)this.b.get((int)n7)).a;
            n3 = comparable.compareTo(comparable2);
            if (n3 > 0) {
                ++n4;
                return -n4;
            }
            if (n3 == 0) {
                return n7;
            }
        }
        n4 = 0;
        list = null;
        while (n4 <= n7) {
            n3 = (n4 + n7) / 2;
            Comparable comparable3 = ((G$d)this.b.get((int)n3)).a;
            int n8 = comparable.compareTo(comparable3);
            if (n8 < 0) {
                n7 = n3 += -1;
                continue;
            }
            if (n8 <= 0) return n3;
            n4 = ++n3;
        }
        ++n4;
        return -n4;
    }

    public final void c() {
        boolean bl2 = this.d;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        this.c();
        Object object = this.b;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.b;
            object.clear();
        }
        if (!(bl2 = (object = this.c).isEmpty())) {
            object = this.c;
            object.clear();
        }
    }

    public final boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.a((Comparable)(object = (Comparable)object));
        if (n3 < 0 && !(bl2 = (map2 = this.c).containsKey(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final Map.Entry e(int n3) {
        return (Map.Entry)this.b.get(n3);
    }

    public final Set entrySet() {
        G$f g$f = this.e;
        if (g$f == null) {
            this.e = g$f = new G$f(this);
        }
        return this.e;
    }

    public final boolean equals(Object object) {
        List list;
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof G;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (G)object;
        n7 = this.size();
        if (n7 != (n4 = ((G)object).size())) {
            return false;
        }
        List list2 = this.b;
        n4 = list2.size();
        if (n4 != (n3 = (list = ((G)object).b).size())) {
            Set set = this.entrySet();
            object = ((G)object).entrySet();
            return set.equals(object);
        }
        list = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry;
            Map.Entry entry2 = this.e(n3);
            boolean bl3 = entry2.equals(entry = ((G)object).e(n3));
            if (bl3) continue;
            return false;
        }
        if (n4 != n7) {
            Map map2 = this.c;
            object = ((G)object).c;
            return map2.equals(object);
        }
        return bl2;
    }

    public final Iterable f() {
        Object object = this.c;
        boolean bl2 = object.isEmpty();
        object = bl2 ? G$c.b : this.c.entrySet();
        return object;
    }

    public final SortedMap g() {
        this.c();
        NavigableMap navigableMap = this.c;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.c) instanceof TreeMap)) {
            this.c = navigableMap = new NavigableMap();
            this.f = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.c;
    }

    public final Object get(Object object) {
        int n3 = this.a((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((G$d)this.b.get((int)n3)).b;
        }
        return this.c.get(object);
    }

    public void h() {
        boolean bl2 = this.d;
        if (!bl2) {
            Map map2 = this.c;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.c = map2;
            map2 = this.f;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.f = map2;
            this.d = bl2 = true;
        }
    }

    public final int hashCode() {
        Object object = this.b;
        int n3 = object.size();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            G$d g$d = (G$d)this.b.get(i3);
            int n7 = g$d.hashCode();
            n4 += n7;
        }
        object = this.c;
        n3 = object.size();
        if (n3 > 0) {
            object = this.c;
            n3 = object.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public final Object i(Comparable comparable, Object object) {
        Object object2;
        this.c();
        int n3 = this.a(comparable);
        if (n3 >= 0) {
            return ((G$d)this.b.get(n3)).setValue(object);
        }
        this.c();
        Object object3 = this.b;
        int n4 = object3.isEmpty();
        int n7 = this.a;
        if (n4 != 0 && (n4 = (object3 = this.b) instanceof ArrayList) == 0) {
            object3 = new ArrayList(n7);
            this.b = object3;
        }
        if ((n3 = -(n3 + 1)) >= n7) {
            return this.g().put(comparable, object);
        }
        object3 = this.b;
        n4 = object3.size();
        if (n4 == n7) {
            object3 = this.b;
            object3 = (G$d)object3.remove(n7 += -1);
            object2 = this.g();
            Comparable comparable2 = ((G$d)object3).a;
            object3 = ((G$d)object3).b;
            object2.put(comparable2, object3);
        }
        object3 = this.b;
        object2 = new G$d(this, comparable, object);
        object3.add(n3, object2);
        return null;
    }

    public final Object j(int n3) {
        this.c();
        Object object = ((G$d)this.b.remove((int)n3)).b;
        Object object2 = this.c;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.g().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry)object2.next();
            Comparable comparable = (Comparable)entry.getKey();
            entry = entry.getValue();
            G$d g$d = new G$d(this, comparable, entry);
            list.add(g$d);
            object2.remove();
        }
        return object;
    }

    public final Object remove(Object object) {
        this.c();
        object = (Comparable)object;
        int n3 = this.a((Comparable)object);
        if (n3 >= 0) {
            return this.j(n3);
        }
        Map map2 = this.c;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.c.remove(object);
    }

    public final int size() {
        int n3 = this.b.size();
        return this.c.size() + n3;
    }
}

