/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Jp
extends a53
implements Map {
    public Jp$a d;
    public Jp$c e;
    public Jp$e f;

    public final Set entrySet() {
        Jp$a jp$a = this.d;
        if (jp$a == null) {
            this.d = jp$a = new Jp$a(this);
        }
        return jp$a;
    }

    public final Set keySet() {
        Jp$c jp$c = this.e;
        if (jp$c == null) {
            this.e = jp$c = new Jp$c(this);
        }
        return jp$c;
    }

    public final boolean m(Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = super.containsKey(e2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final boolean n(Collection object) {
        boolean bl2;
        int n3 = this.c;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            super.remove(e2);
        }
        int n4 = this.c;
        if (n3 != n4) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final boolean o(Collection collection) {
        int n3 = this.c;
        for (int i3 = n3 + -1; i3 >= 0; i3 += -1) {
            Object object = this.h(i3);
            boolean bl2 = collection.contains(object);
            if (bl2) continue;
            this.j(i3);
        }
        int n4 = this.c;
        if (n3 != n4) {
            n4 = 1;
        } else {
            n4 = 0;
            collection = null;
        }
        return n4 != 0;
    }

    public final void putAll(Map object) {
        int n3 = this.c;
        int n4 = object.size() + n3;
        this.c(n4);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            this.put(k2, entry);
        }
    }

    public final Collection values() {
        Jp$e jp$e = this.f;
        if (jp$e == null) {
            this.f = jp$e = new Jp$e(this);
        }
        return jp$e;
    }
}

