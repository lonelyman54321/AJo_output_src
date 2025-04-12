/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ul$l
extends ul$j {
    public final void a(Collection arrayList) {
        boolean bl2;
        boolean bl3;
        Object object;
        boolean bl4;
        Object object2;
        Object object3;
        LinkedHashSet linkedHashSet = this.b;
        arrayList = arrayList;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        arrayList = arrayList.iterator();
        while (true) {
            boolean bl5 = arrayList.hasNext();
            ArrayList arrayList3 = null;
            if (!bl5) break;
            object3 = (M11)arrayList.next();
            object2 = ((M11)object3).c;
            if (object2 != null && (bl4 = Intrinsics.areEqual(object = ((M11)object3).b, object2 = "updateTransition"))) {
                arrayList3 = object3;
            }
            if (arrayList3 == null) continue;
            arrayList2.add(arrayList3);
        }
        arrayList = new ArrayList();
        object3 = arrayList2.iterator();
        while (bl4 = object3.hasNext()) {
            block9: {
                object2 = ((Iterable)((M11)object3.next()).f).iterator();
                while (bl3 = object2.hasNext()) {
                    object = object2.next();
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
            arrayList.add(object);
        }
        object3 = new ArrayList();
        arrayList2 = arrayList2.iterator();
        while (bl4 = arrayList2.hasNext()) {
            object2 = (M11)arrayList2.next();
            fl_1 fl_12 = fl_1.c;
            bl3 = true;
            if ((object2 = (M11)CollectionsKt.firstOrNull(uy2_0.a((M11)object2, fl_12, bl3))) == null) continue;
            ((ArrayList)object3).add(object2);
        }
        arrayList2 = new ArrayList<Object>();
        object3 = ((ArrayList)object3).iterator();
        while (bl4 = object3.hasNext()) {
            block10: {
                object2 = ((Iterable)((M11)object3.next()).f).iterator();
                while (bl3 = object2.hasNext()) {
                    object = object2.next();
                    bl2 = object instanceof gr3;
                    if (!bl2) continue;
                    break block10;
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
        String string2;
        boolean bl3;
        Object object = m11.c;
        if (object == null || !(bl3 = Intrinsics.areEqual(string2 = m11.b, object = "updateTransition"))) {
            bl2 = false;
            m11 = null;
        }
        if (m11 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            m11 = null;
        }
        return bl2;
    }
}

