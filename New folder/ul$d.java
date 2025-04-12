/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ul$d
extends ul$j {
    public static M11 c(M11 object) {
        Object object2;
        boolean bl2;
        Object object3 = ((M11)object).c;
        Object object4 = null;
        if (object3 == null || !(bl2 = Intrinsics.areEqual(object2 = ((M11)object).b, object3 = "AnimatedContent"))) {
            object = null;
        }
        if (object != null) {
            object = ((Iterable)((M11)object).g).iterator();
            while (bl2 = object.hasNext()) {
                object2 = object3 = object.next();
                object2 = ((M11)object3).b;
                String string2 = "updateTransition";
                boolean bl3 = Intrinsics.areEqual(object2, string2);
                if (!bl3) continue;
                object4 = object3;
                break;
            }
            object4 = (M11)object4;
        }
        return object4;
    }

    public final void a(Collection arrayList) {
        boolean bl2;
        Object object;
        boolean bl3;
        Iterator iterator;
        boolean bl4;
        Object object2;
        boolean bl5;
        LinkedHashSet linkedHashSet = this.b;
        arrayList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList = arrayList.iterator();
        while (bl5 = arrayList.hasNext()) {
            object2 = ul$d.c((M11)arrayList.next());
            if (object2 == null) continue;
            arrayList2.add(object2);
        }
        arrayList = new ArrayList();
        object2 = arrayList2.iterator();
        while (true) {
            gr3 gr32;
            block8: {
                bl4 = object2.hasNext();
                gr32 = null;
                if (!bl4) break;
                iterator = ((Iterable)((M11)object2.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof gr3;
                    if (!bl2) continue;
                    break block8;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof gr3;
            if (bl4) {
                gr32 = (gr3)object;
            }
            if ((gr32 = (gr3)gr32) == null) continue;
            arrayList.add(gr32);
        }
        object2 = new ArrayList();
        arrayList2 = arrayList2.iterator();
        while (bl4 = arrayList2.hasNext()) {
            iterator = (M11)arrayList2.next();
            fl_1 fl_12 = fl_1.c;
            bl3 = true;
            if ((iterator = (M11)CollectionsKt.firstOrNull(uy2_0.a((M11)((Object)iterator), fl_12, bl3))) == null) continue;
            ((ArrayList)object2).add(iterator);
        }
        arrayList2 = new ArrayList();
        object2 = ((ArrayList)object2).iterator();
        while (bl4 = object2.hasNext()) {
            block9: {
                iterator = ((Iterable)((M11)object2.next()).f).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = iterator.next();
                    bl2 = object instanceof gr3;
                    if (!bl2) continue;
                    break block9;
                }
                bl3 = false;
                object = null;
            }
            bl4 = object instanceof gr3;
            if (!bl4) {
                bl3 = false;
                object = null;
            }
            if ((object = (gr3)object) == null) continue;
            arrayList2.add(object);
        }
        arrayList = CollectionsKt.W(arrayList2, arrayList);
        linkedHashSet.addAll(arrayList);
    }

    public final boolean b(M11 m11) {
        boolean bl2;
        if ((m11 = ul$d.c(m11)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            m11 = null;
        }
        return bl2;
    }
}

