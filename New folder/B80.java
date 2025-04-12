/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class B80
implements Iterable {
    public final Object a;
    public final HashMap b;
    public Set c;
    public List d;

    public B80() {
        List list = new List();
        this.a = list;
        list = new List();
        this.b = list;
        list = Collections.emptySet();
        this.c = list;
        this.d = list = Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object set) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                Serializable serializable;
                try {
                    serializable = this.b;
                    serializable = ((HashMap)serializable).get(set);
                    serializable = (Integer)serializable;
                    if (serializable == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                List list = this.d;
                Object object2 = new ArrayList(list);
                ((ArrayList)object2).remove(set);
                object2 = Collections.unmodifiableList(object2);
                this.d = object2;
                int n3 = (Integer)serializable;
                int n4 = 1;
                if (n3 == n4) {
                    serializable = this.b;
                    ((HashMap)serializable).remove(set);
                    object2 = this.c;
                    serializable = new HashSet(object2);
                    ((HashSet)serializable).remove(set);
                    this.c = set = Collections.unmodifiableSet(serializable);
                } else {
                    object2 = this.b;
                    int n7 = (Integer)serializable - n4;
                    serializable = Integer.valueOf(n7);
                    ((HashMap)object2).put(set, serializable);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int count(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            try {
                HashMap hashMap = this.b;
                boolean bl2 = hashMap.containsKey(object);
                if (!bl2) return 0;
                hashMap = this.b;
                object = hashMap.get(object);
                object = (Integer)object;
                return (Integer)object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Iterator iterator() {
        Object object = this.a;
        synchronized (object) {
            List list = this.d;
            return list.iterator();
        }
    }
}

