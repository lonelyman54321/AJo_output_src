/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p$c;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class s$a
extends s {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static List d(Object object, long l2, int n3) {
        void var4_12;
        List list = (List)nw3.d.i(object, l2);
        boolean bl2 = list.isEmpty();
        if (bl2) {
            void var4_7;
            bl2 = list instanceof Dt1;
            if (bl2) {
                r r5 = new r(n3);
            } else {
                bl2 = list instanceof xz2;
                if (bl2 && (bl2 = list instanceof p$c)) {
                    p$c p$c;
                    p$c p$c2 = p$c = ((p$c)list).mutableCopyWithCapacity(n3);
                } else {
                    ArrayList arrayList = new ArrayList(n3);
                }
            }
            nw3.r(object, l2, var4_7);
            return (List)var4_12;
        }
        Class clazz = c;
        Object object2 = list.getClass();
        bl2 = clazz.isAssignableFrom((Class<?>)object2);
        if (bl2) {
            int n4 = list.size() + n3;
            object2 = new Object(n4);
            ((ArrayList)object2).addAll(list);
            nw3.r(object, l2, object2);
        } else {
            bl2 = list instanceof fw3;
            if (!bl2) {
                bl2 = list instanceof xz2;
                if (!bl2) return (List)var4_12;
                bl2 = list instanceof p$c;
                if (!bl2) return (List)var4_12;
                object2 = list;
                object2 = (p$c)list;
                boolean bl3 = object2.isModifiable();
                if (bl3) return (List)var4_12;
                int n7 = list.size() + n3;
                p$c p$c = object2.mutableCopyWithCapacity(n7);
                nw3.r(object, l2, p$c);
                return (List)var4_12;
            }
            int n8 = list.size() + n3;
            object2 = new Object(n8);
            fw3 fw32 = (fw3)list;
            ((r)object2).addAll((Collection)fw32);
            nw3.r(object, l2, object2);
        }
        List list2 = object2;
        return (List)var4_12;
    }

    public final void a(Object object, long l2) {
        p$c p$c = (p$c)nw3.d.i(object, l2);
        boolean bl2 = p$c instanceof Dt1;
        if (bl2) {
            p$c = ((Dt1)((Object)p$c)).getUnmodifiableView();
        } else {
            Class clazz = c;
            Class<?> clazz2 = p$c.getClass();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (bl2) {
                return;
            }
            bl2 = p$c instanceof xz2;
            if (bl2 && (bl2 = p$c instanceof p$c)) {
                boolean bl3 = (p$c = (p$c)p$c).isModifiable();
                if (bl3) {
                    p$c.makeImmutable();
                }
                return;
            }
            p$c = Collections.unmodifiableList(p$c);
        }
        nw3.r(object, l2, p$c);
    }

    public final void b(Object object, Object object2, long l2) {
        object2 = (List)nw3.d.i(object2, l2);
        int n3 = object2.size();
        List list = s$a.d(object, l2, n3);
        int n4 = list.size();
        int n7 = object2.size();
        if (n4 > 0 && n7 > 0) {
            list.addAll(object2);
        }
        if (n4 > 0) {
            object2 = list;
        }
        nw3.r(object, l2, object2);
    }

    public final List c(Object object, long l2) {
        return s$a.d(object, l2, 10);
    }
}

