/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;

public final class Gq0 {
    public final zw2_0 a;
    public final a53 b;
    public final ArrayList c;
    public final HashSet d;

    public Gq0() {
        AbstractCollection abstractCollection = new AbstractCollection(10);
        this.a = abstractCollection;
        abstractCollection = new AbstractCollection();
        this.b = abstractCollection;
        this.c = abstractCollection = new AbstractCollection();
        this.d = abstractCollection;
    }

    public final void a(Object object, ArrayList arrayList, HashSet hashSet) {
        boolean bl2 = arrayList.contains(object);
        if (bl2) {
            return;
        }
        bl2 = hashSet.contains(object);
        if (!bl2) {
            hashSet.add(object);
            ArrayList arrayList2 = (ArrayList)this.b.get(object);
            if (arrayList2 != null) {
                int n3 = arrayList2.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object e2 = arrayList2.get(i3);
                    this.a(e2, arrayList, hashSet);
                }
            }
            hashSet.remove(object);
            arrayList.add(object);
            return;
        }
        object = new RuntimeException("This graph contains cyclic dependencies");
        throw object;
    }
}

