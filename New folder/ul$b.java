/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class ul$b
extends ul$j {
    public static Lj c(nj_0 arrayList) {
        boolean bl2;
        Object object;
        boolean bl3;
        Iterator iterator;
        boolean bl4;
        Object object2;
        boolean bl5;
        Object object3;
        block10: {
            object3 = ((Iterable)((M11)((Object)arrayList)).f).iterator();
            while (bl5 = object3.hasNext()) {
                object2 = object3.next();
                boolean bl6 = object2 instanceof Lj;
                if (!bl6) continue;
                break block10;
            }
            bl5 = false;
            object2 = null;
        }
        boolean bl7 = object2 instanceof Lj;
        if (!bl7) {
            bl5 = false;
            object2 = null;
        }
        if ((object2 = (Lj)object2) == null || (object3 = kotlin.collections.a.b(object2)) == null) {
            object3 = mz0_2.a;
        }
        object3 = (Collection)object3;
        arrayList = ((M11)((Object)arrayList)).g;
        object2 = new ArrayList();
        Object object4 = arrayList.iterator();
        while (bl4 = object4.hasNext()) {
            block11: {
                iterator = ((Iterable)((M11)object4.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof Lj;
                    if (!bl2) continue;
                    break block11;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof Lj;
            if (!bl4) {
                bl3 = false;
                object = null;
            }
            if ((object = (Lj)object) == null) continue;
            ((ArrayList)object2).add(object);
        }
        object4 = new ArrayList();
        arrayList = arrayList.iterator();
        while (bl4 = arrayList.hasNext()) {
            iterator = (M11)arrayList.next();
            fl_1 fl_12 = fl_1.c;
            bl3 = true;
            if ((iterator = (M11)CollectionsKt.firstOrNull(uy2_0.a((M11)((Object)iterator), fl_12, bl3))) == null) continue;
            ((ArrayList)object4).add(iterator);
        }
        arrayList = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while (bl4 = object4.hasNext()) {
            block12: {
                iterator = ((Iterable)((M11)object4.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof Lj;
                    if (!bl2) continue;
                    break block12;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof Lj;
            if (!bl4) {
                bl3 = false;
                object = null;
            }
            if ((object = (Lj)object) == null) continue;
            arrayList.add(object);
        }
        return (Lj)CollectionsKt.firstOrNull(CollectionsKt.W(CollectionsKt.W(arrayList, object2), (Collection)object3));
    }

    public static Gl d(nj_0 arrayList) {
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        arrayList = ((M11)((Object)arrayList)).g;
        Object object3 = new ArrayList();
        arrayList = arrayList.iterator();
        while ((n3 = arrayList.hasNext()) != 0) {
            object = object2 = arrayList.next();
            object = ((M11)object2).b;
            String string2 = "rememberUpdatedState";
            bl2 = Intrinsics.areEqual(object, string2);
            if (!bl2) continue;
            ((ArrayList)object3).add(object2);
        }
        arrayList = new ArrayList();
        object2 = ((ArrayList)object3).iterator();
        while (bl2 = object2.hasNext()) {
            object = ((M11)object2.next()).g;
            cx_2.r(object, arrayList);
        }
        arrayList = CollectionsKt.W(arrayList, object3);
        object3 = new ArrayList();
        arrayList = arrayList.iterator();
        while ((n3 = arrayList.hasNext()) != 0) {
            object2 = ((M11)arrayList.next()).f;
            cx_2.r((Iterable)object2, (Collection)object3);
        }
        arrayList = new ArrayList();
        object3 = ((ArrayList)object3).iterator();
        while ((n3 = object3.hasNext()) != 0) {
            object2 = object3.next();
            bl2 = object2 instanceof ib3_0;
            if (!bl2) continue;
            arrayList.add(object2);
        }
        n3 = yx_2.o(arrayList, 10);
        object3 = new ArrayList(n3);
        arrayList = arrayList.iterator();
        while ((n3 = (int)(arrayList.hasNext() ? 1 : 0)) != 0) {
            object2 = ((ib3_0)arrayList.next()).getValue();
            ((ArrayList)object3).add(object2);
        }
        arrayList = new ArrayList();
        object3 = ((ArrayList)object3).iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object2 = object3.next();
            bl2 = object2 instanceof Gl;
            if (!bl2) continue;
            arrayList.add(object2);
        }
        return (Gl)CollectionsKt.firstOrNull(arrayList);
    }

    public static tr1_0 e(nj_0 arrayList) {
        boolean bl2;
        Object object;
        boolean bl3;
        Iterator iterator;
        boolean bl4;
        Object object2;
        boolean bl5;
        Object object3;
        block10: {
            object3 = ((Iterable)((M11)((Object)arrayList)).f).iterator();
            while (bl5 = object3.hasNext()) {
                object2 = object3.next();
                boolean bl6 = object2 instanceof tr1_0;
                if (!bl6) continue;
                break block10;
            }
            bl5 = false;
            object2 = null;
        }
        boolean bl7 = object2 instanceof tr1_0;
        if (!bl7) {
            bl5 = false;
            object2 = null;
        }
        if ((object2 = (tr1_0)object2) == null || (object3 = kotlin.collections.a.b(object2)) == null) {
            object3 = mz0_2.a;
        }
        object3 = (Collection)object3;
        arrayList = ((M11)((Object)arrayList)).g;
        object2 = new ArrayList();
        Object object4 = arrayList.iterator();
        while (bl4 = object4.hasNext()) {
            block11: {
                iterator = ((Iterable)((M11)object4.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof tr1_0;
                    if (!bl2) continue;
                    break block11;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof tr1_0;
            if (!bl4) {
                bl3 = false;
                object = null;
            }
            if ((object = (tr1_0)object) == null) continue;
            ((ArrayList)object2).add(object);
        }
        object4 = new ArrayList();
        arrayList = arrayList.iterator();
        while (bl4 = arrayList.hasNext()) {
            iterator = (M11)arrayList.next();
            fl_1 fl_12 = fl_1.c;
            bl3 = true;
            if ((iterator = (M11)CollectionsKt.firstOrNull(uy2_0.a((M11)((Object)iterator), fl_12, bl3))) == null) continue;
            ((ArrayList)object4).add(iterator);
        }
        arrayList = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while (bl4 = object4.hasNext()) {
            block12: {
                iterator = ((Iterable)((M11)object4.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof tr1_0;
                    if (!bl2) continue;
                    break block12;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof tr1_0;
            if (!bl4) {
                bl3 = false;
                object = null;
            }
            if ((object = (tr1_0)object) == null) continue;
            arrayList.add(object);
        }
        return (tr1_0)CollectionsKt.firstOrNull(CollectionsKt.W(CollectionsKt.W(arrayList, object2), (Collection)object3));
    }

    public final void a(Collection arrayList) {
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        LinkedHashSet linkedHashSet = this.b;
        arrayList = arrayList;
        Object object4 = new ArrayList();
        arrayList = arrayList.iterator();
        while (true) {
            boolean bl3;
            bl2 = arrayList.hasNext();
            M11 m11 = null;
            if (!bl2) break;
            object3 = (M11)arrayList.next();
            object2 = ((M11)object3).c;
            if (object2 == null || !(bl3 = Intrinsics.areEqual(object = ((M11)object3).b, object2 = "animateValueAsState"))) {
                bl2 = false;
                object3 = null;
            }
            if (object3 != null && (bl3 = object3 instanceof nj_0)) {
                m11 = object3;
                m11 = (nj_0)object3;
            }
            if (m11 == null) continue;
            ((ArrayList)object4).add(m11);
        }
        arrayList = new ArrayList<Object>();
        object4 = ((ArrayList)object4).iterator();
        while (bl2 = object4.hasNext()) {
            Object object5;
            object3 = (nj_0)object4.next();
            object2 = ul$b.c((nj_0)object3);
            object = ul$b.d((nj_0)object3);
            object3 = ul$b.e((nj_0)object3);
            if (object2 != null && object != null && object3 != null) {
                boolean bl4;
                Object object6;
                object5 = object3.getValue();
                if (object5 == null) {
                    object6 = ((Lj)object2).d();
                    object5 = new to3(object6);
                    object3.setValue(object5);
                }
                if (bl4 = (object3 = object3.getValue()) instanceof to3) {
                    object3 = (to3)object3;
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 == null) {
                    object6 = ((Lj)object2).d();
                    object3 = new to3(object6);
                }
                object5 = new ul$c((Lj)object2, (Gl)object, (to3)object3);
            } else {
                object5 = null;
            }
            if (object5 == null) continue;
            arrayList.add(object5);
        }
        linkedHashSet.addAll(arrayList);
    }

    public final boolean b(M11 m11) {
        boolean bl2;
        String string2;
        boolean bl3;
        Object object = m11.c;
        M11 m112 = null;
        if (object == null || !(bl3 = Intrinsics.areEqual(string2 = m11.b, object = "animateValueAsState"))) {
            bl2 = false;
            m11 = null;
        }
        if (m11 != null && (bl3 = m11 instanceof nj_0)) {
            m112 = m11;
            m112 = (nj_0)m11;
        }
        bl2 = false;
        m11 = null;
        if (m112 != null && (object = ul$b.c((nj_0)m112)) != null && (object = ul$b.d((nj_0)m112)) != null && (object = ul$b.e((nj_0)m112)) != null) {
            bl2 = true;
        }
        return bl2;
    }
}

