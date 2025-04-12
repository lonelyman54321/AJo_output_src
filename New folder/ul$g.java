/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ul$g
extends ul$j {
    public static tr1_0 c(M11 iterator) {
        Collection<Object> collection;
        Collection<Object> collection2;
        block5: {
            boolean bl2;
            block4: {
                boolean bl3;
                boolean bl4;
                collection2 = ((M11)((Object)iterator)).f;
                iterator = ((M11)((Object)iterator)).g;
                collection = iterator;
                collection = (Iterable)((Object)iterator);
                Iterable iterable = new Iterable();
                collection = collection.iterator();
                while (bl4 = collection.hasNext()) {
                    Iterable iterable2 = ((M11)collection.next()).g;
                    cx_2.r(iterable2, iterable);
                }
                iterator = CollectionsKt.W(iterable, iterator);
                collection = new Collection<Object>();
                iterator = iterator.iterator();
                while (bl3 = iterator.hasNext()) {
                    iterable = ((M11)iterator.next()).f;
                    cx_2.r(iterable, collection);
                }
                iterator = CollectionsKt.W(collection, collection2).iterator();
                do {
                    bl2 = iterator.hasNext();
                    collection = null;
                    if (!bl2) break block4;
                } while (!(bl3 = (collection2 = iterator.next()) instanceof tr1_0));
                break block5;
            }
            bl2 = false;
            collection2 = null;
        }
        boolean bl5 = collection2 instanceof tr1_0;
        if (bl5) {
            collection = collection2;
        }
        return (tr1_0)((Object)collection);
    }

    public final void a(Collection arrayList) {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        LinkedHashSet linkedHashSet = this.b;
        arrayList = arrayList;
        Object object4 = new ArrayList();
        arrayList = arrayList.iterator();
        while (true) {
            bl3 = arrayList.hasNext();
            M11 m11 = null;
            if (!bl3) break;
            object3 = (M11)arrayList.next();
            object2 = ((M11)object3).c;
            if (object2 == null || !(bl2 = Intrinsics.areEqual(object = ((M11)object3).b, object2 = "rememberInfiniteTransition"))) {
                bl3 = false;
                object3 = null;
            }
            if (object3 != null && (bl2 = object3 instanceof nj_0)) {
                m11 = object3;
                m11 = (nj_0)object3;
            }
            if (m11 == null) continue;
            ((ArrayList)object4).add(m11);
        }
        arrayList = new ArrayList<Object>();
        object4 = ((ArrayList)object4).iterator();
        while (bl3 = object4.hasNext()) {
            boolean bl4;
            Serializable serializable;
            block13: {
                boolean bl5;
                object3 = (nj_0)object4.next();
                object2 = ((M11)object3).f;
                object = ((M11)object3).g;
                serializable = new Serializable();
                object = object.iterator();
                while (bl5 = object.hasNext()) {
                    Iterable iterable = ((M11)object.next()).f;
                    cx_2.r(iterable, serializable);
                }
                object2 = CollectionsKt.W(serializable, (Collection)object2).iterator();
                while (bl4 = object2.hasNext()) {
                    object = object2.next();
                    boolean bl6 = object instanceof vg1_0;
                    if (!bl6) continue;
                    break block13;
                }
                bl4 = false;
                object = null;
            }
            bl2 = object instanceof vg1_0;
            if (!bl2) {
                bl4 = false;
                object = null;
            }
            object = (vg1_0)object;
            object3 = ul$g.c((M11)object3);
            if (object != null && object3 != null) {
                boolean bl7;
                object2 = object3.getValue();
                long l2 = 0L;
                if (object2 == null) {
                    Long l3 = l2;
                    object2 = new to3(l3);
                    object3.setValue(object2);
                }
                if (bl7 = (object3 = object3.getValue()) instanceof to3) {
                    object3 = (to3)object3;
                } else {
                    bl3 = false;
                    object3 = null;
                }
                if (object3 == null) {
                    serializable = l2;
                    object3 = new to3(serializable);
                }
                object2 = new ul$h((vg1_0)object, (to3)object3);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) continue;
            arrayList.add(object2);
        }
        linkedHashSet.addAll(arrayList);
    }

    public final boolean b(M11 object) {
        boolean bl2;
        String string2;
        boolean bl3;
        Iterator iterator = ((M11)object).c;
        Object object2 = null;
        if (iterator != null && (bl3 = Intrinsics.areEqual(string2 = ((M11)object).b, iterator = "rememberInfiniteTransition"))) {
            iterator = object;
        } else {
            bl3 = false;
            iterator = null;
        }
        if (iterator != null && (bl2 = iterator instanceof nj_0)) {
            iterator = (nj_0)((Object)iterator);
        } else {
            bl3 = false;
            iterator = null;
        }
        bl2 = false;
        string2 = null;
        if (iterator != null) {
            ArrayList<Object> arrayList;
            block9: {
                boolean bl4;
                boolean bl5;
                iterator = ((M11)object).g;
                arrayList = new ArrayList<Object>();
                iterator = iterator.iterator();
                while (bl5 = iterator.hasNext()) {
                    Iterable iterable = ((M11)iterator.next()).f;
                    cx_2.r(iterable, arrayList);
                }
                iterator = ((M11)object).f;
                iterator = CollectionsKt.W(arrayList, (Collection)((Object)iterator)).iterator();
                while (bl4 = iterator.hasNext()) {
                    arrayList = iterator.next();
                    bl5 = arrayList instanceof vg1_0;
                    if (!bl5) continue;
                    break block9;
                }
                bl4 = false;
                arrayList = null;
            }
            bl3 = arrayList instanceof vg1_0;
            if (bl3) {
                object2 = arrayList;
            }
            object2 = (vg1_0)object2;
            if (object2 != null && (object = ul$g.c((M11)object)) != null) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

